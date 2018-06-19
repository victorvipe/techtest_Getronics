package com.getronincs.techtest.models;

import java.util.ArrayList;
import java.util.List;


public class UserDB {

	private List<User> users;
	
	public UserDB() {
		users = new ArrayList<>();
	}

	public void create(User user) {
		users.add(user);
	}
	
	public User getByMail(String mail) {
		
		for(User u : users) {
			if(u.getMail().equals(mail)) {
				return u;
			}
		}
		
		return null;
	}
	
	public List<User> getAll() {
		return users;
	}
	
	public boolean existsMail(String mail) {
		return getByMail(mail) != null;
	}
	
	public boolean isValid(User user) {
		
		String mail = user.getMail();
		
		if(user.getName().equals("") || mail.equals("") || this.existsMail(mail)) {
			return false;
		}
		
		return true;
	}
	
}
