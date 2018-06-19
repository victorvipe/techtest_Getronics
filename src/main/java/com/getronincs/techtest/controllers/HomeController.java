package com.getronincs.techtest.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.getronincs.techtest.models.User;
import com.getronincs.techtest.models.UserDB;
import com.getronincs.techtest.models.UserLog;
import com.getronincs.techtest.models.UserLogDB;


@Controller
public class HomeController {

	private UserDB userDB;
	private UserLogDB userLogDB;
	
	public HomeController() {
		userDB = new UserDB();
		userLogDB = new UserLogDB();
	}
	
	@GetMapping("/")
    public String signInForm() {
        return "signIn";
    }
	
	@PostMapping("/")
	public String action(@RequestParam(name="action", required=true) String action, 
			@RequestParam(name="name", required=false) String name,
			@RequestParam(name="mail", required=true) String mail, Model model) {
				
		switch(action) {
			case "signIn":
				return signIn(mail, model);
			case "signUp":
				return signUp(name, mail, model);
			default:
				return "signIn";
		}
		
	}
	
	private String signIn(String mail, Model model) {
		
		if(!userDB.existsMail(mail)) {
			return "signUp";
		}
		
		User u = userDB.getByMail(mail);
		userLogDB.create(new UserLog(u, new Date()));
		
		model.addAttribute("logs", userLogDB.getAll());

		return "list";
	}
	
	private String signUp(String name, String mail, Model model) {
		
		User u = new User(name, mail, new Date());
		
		if(!userDB.isValid(u)) {
			return "signUp";
		}
		
		userDB.create(u);
		userLogDB.create(new UserLog(u, new Date()));

		model.addAttribute("logs", userLogDB.getAll());
		
		return "list";
	}
	
}
