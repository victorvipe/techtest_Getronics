
package com.getronincs.techtest.models;

import java.util.Date;


public class UserLog {

	private User user;
	private Date date;
	
	public UserLog() {}
	
	public UserLog(User user, Date date) {
		this.user = user;
		this.date = date;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
}
