package com.getronincs.techtest.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String name;
	private String mail;
	private Date registerDate;
	
	public User() {}
	
	public User(String name, String mail, Date registerDate) {
		this.name = name;
		this.mail = mail;
		this.registerDate = registerDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Date getRegisterDate() {
		return registerDate;
	}
	
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
}
