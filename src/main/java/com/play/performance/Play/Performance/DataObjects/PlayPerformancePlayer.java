package com.play.performance.Play.Performance.DataObjects;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.play.performance.Play.Performance.Constants.PlayPerformanceConstants;

public class PlayPerformancePlayer implements UserDetails{

	private static final long serialVersionUID = PlayPerformanceConstants.SERIALIZATION_KEY;
	private User user;
	private UserDomain userDomain;
	
	public PlayPerformancePlayer() {
		super();
	}
	
	public PlayPerformancePlayer(User user, UserDomain userDomain) {
		super();
		this.user = user;
		this.userDomain = userDomain;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		return userDomain.getPassword();
	}

	@Override
	public String getUsername() {
		return userDomain.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !userDomain.isLocked();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return !userDomain.isCredentialExpired();
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDomain getUserDomain() {
		return userDomain;
	}

	public void setUserDomain(UserDomain userDomain) {
		this.userDomain = userDomain;
	}

}
