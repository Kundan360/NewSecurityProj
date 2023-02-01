package com.kundan.SpringSecurityLearnF.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kundan.SpringSecurityLearnF.DAO.UserRepo;
import com.kundan.SpringSecurityLearnF.model.CustomUserDetails;
import com.kundan.SpringSecurityLearnF.model.User;

@Service
public class CustomeUserDetailService implements UserDetailsService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=this.userRepo.findByName(username);
		if(user==null)
			throw new UsernameNotFoundException("User not exists:");
		
		return new CustomUserDetails(user);
	}

}
