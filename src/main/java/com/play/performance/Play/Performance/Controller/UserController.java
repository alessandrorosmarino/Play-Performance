package com.play.performance.Play.Performance.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.play.performance.Play.Performance.DataObjects.PlayPerformancePlayer;
import com.play.performance.Play.Performance.DataObjects.User;
import com.play.performance.Play.Performance.DataObjects.UserDomain;
import com.play.performance.Play.Performance.Expressions.UserDomainExpressions;
import com.play.performance.Play.Performance.Expressions.UserExpressions;
import com.play.performance.Play.Performance.Repository.UserDomainRepository;
import com.play.performance.Play.Performance.Repository.UserRepository;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;

@RestController
public class UserController {
	@PersistenceContext
	private EntityManager entityManager;

	private UserRepository userRepository;
	private UserDomainRepository userDomainRepository;

	@Autowired
	public UserController(UserRepository userRepository, UserDomainRepository userDomainRepository){
		super();
		this.userRepository = userRepository;
		this.userDomainRepository = userDomainRepository;
	}

	@GetMapping("/")
	public @ResponseBody boolean verify() {
		return true;
	}
	
	@GetMapping("/logout")
	public @ResponseBody boolean logout() {
		return true;
	}

	@GetMapping("/user")
	public @ResponseBody User getUser(@RequestParam(value = "idUtente") long userId) {
		return PlayPerformanceUtils.processOptionalEntity(userRepository.findById(userId));
	}
	
	@GetMapping("/users")
	public @ResponseBody Iterable<User> getAll() {
		return userRepository.findAll();
	}
	
	@PostMapping("/register")
	public @ResponseBody boolean registerUser(@RequestBody String body) {
		try{
			PlayPerformancePlayer player = new ObjectMapper().readValue(body, PlayPerformancePlayer.class);
			User userToSave = findUser(player.getUser());
			if(PlayPerformanceUtils.isEmpty(userToSave)) {
				userToSave = userRepository.save(player.getUser());
			}
			UserDomain userDomainToSave = player.getUserDomain();
			userDomainToSave.setIdUtente(userToSave.getIdUtente());
			userDomainToSave.setPassword(new BCryptPasswordEncoder(11).encode(userDomainToSave.getPassword()));
			player.setUserDomain(userDomainToSave);
			if(PlayPerformanceUtils.isEmpty(userDomainRepository.findUserDomain(player.getUserDomain()))) {
				userDomainRepository.save(player.getUserDomain());
			}
		}catch(Exception e) {
			return false;
		}
		return true;
	}

	public User findUser(User user) {
		return null;
	}
	
	public Iterable<User> findAllUsersByUserDomainList(Iterable<UserDomain> userDomainList){
		ArrayList<User> userList = new ArrayList<>();
		for(UserDomain userDomain : userDomainList) {
			User user = PlayPerformanceUtils.processOptionalEntity(userRepository.findById(userDomain.getIdUtente()));
			userList.add(user);
		}
		return userList;
	}

	@GetMapping("/search-users")
	public @ResponseBody Iterable<User> findUserBySearchFields(@RequestParam(value = "nome") String name,
		   @RequestParam(value = "cognome") String surname, @RequestParam(value = "username") String username,
		   @RequestParam(value = "idDominio") long domainId){
		//prova con JPAQuery
		JPAQuery<User> query = new JPAQuery<>(entityManager);
		return query.distinct().from(UserExpressions.TABLE).
				leftJoin(UserDomainExpressions.TABLE).
				on(UserExpressions.hasIdUtenteEq(UserDomainExpressions.TABLE.idUtente)).
				where(domainId > 0 ? UserDomainExpressions.hasIdDominioEq(domainId) : null,
						UserDomainExpressions.hasUsernameEq(username),
						UserExpressions.hasNomeEq(name),
						UserExpressions.hasCognomeEq(surname)).fetch();
	}
}
