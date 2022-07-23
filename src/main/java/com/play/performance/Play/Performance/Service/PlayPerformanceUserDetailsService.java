package com.play.performance.Play.Performance.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.play.performance.Play.Performance.Controller.UserController;
import com.play.performance.Play.Performance.Controller.UserDomainController;
import com.play.performance.Play.Performance.DataObjects.PlayPerformancePlayer;
import com.play.performance.Play.Performance.DataObjects.User;
import com.play.performance.Play.Performance.DataObjects.UserDomain;
import com.play.performance.Play.Performance.utils.PlayPerformanceUtils;

@Service
public class PlayPerformanceUserDetailsService implements UserDetailsService{
	@Autowired
	private UserDomainController userDomainController;
	@Autowired
	private UserController userController;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDomain userDomain = userDomainController.getUserDomainByUsername(username, 1);
		if(PlayPerformanceUtils.isEmpty(userDomain)) {
			throw new UsernameNotFoundException("cannot find user domain with username :" + username);
		}
		User user = userController.getUser(userDomain.getIdUtente());
		if(PlayPerformanceUtils.isEmpty(user)) {
			throw new UsernameNotFoundException("cannot find user with id:" + userDomain.getIdUtente());
		}
		PlayPerformancePlayer playPerformancePlayer = new PlayPerformancePlayer(user, userDomain);
		return playPerformancePlayer;
	}

}
