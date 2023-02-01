package com.kundan.SpringSecurityLearnF.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kundan.SpringSecurityLearnF.model.User;

public interface UserRepo extends JpaRepository<User, String>{

	public User findByName(String username);

}
