package com.kundan.SpringSecurityLearnF.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kundan.SpringSecurityLearnF.model.User;

@Service
public class Dbclass {

	List<User> userlist=new ArrayList<>();
	
	public List<User> getAllUser()
	{
		userlist.add(new User("abc","abc","abc@gmail.com","User"));
		userlist.add(new User("kundan","abc","kd@gmail.com","Admin"));
		userlist.add(new User("swek","abc","sd@gmail.com","User"));
		
		return userlist;
	}
	
}
