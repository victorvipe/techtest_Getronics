package com.getronincs.techtest.models;

import java.util.ArrayList;
import java.util.List;


public class UserLogDB {

	private List<UserLog> userLogs;
	
	public UserLogDB() {
		userLogs = new ArrayList<>();
	}
	
	public void create(UserLog userLog) {
		userLogs.add(userLog);
	}
	
	public List<UserLog> getAll() {
		return userLogs;
	}
	
}
