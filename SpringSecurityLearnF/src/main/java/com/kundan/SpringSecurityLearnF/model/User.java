package com.kundan.SpringSecurityLearnF.model;


import javax.persistence.Entity;


import javax.persistence.Id;

@Entity
public class User {

	@Id
	private String name;
	private String password;
	private String mail;
	private String role;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String password, String mail, String role) {
		super();
		this.name = name;
		this.password = password;
		this.mail = mail;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", mail=" + mail + ", role=" + role + "]";
	}
	
	
	
	
	
}
