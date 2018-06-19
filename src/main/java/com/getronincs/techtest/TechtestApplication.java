package com.getronincs.techtest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.getronincs.techtest.models.User;
import com.getronincs.techtest.models.UserRepository;


@SpringBootApplication
public class TechtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechtestApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner demo(UserRepository repository) {
//		return (args) -> {
//			
//			repository.save(new User("Victor", "victorvipe@vipe.com"));
//			repository.save(new User("Alber", "albert@flykube.com"));
//			
//			for(User user : repository.findAll()) {
//				System.out.println(user.getName() + " - " + user.getMail());
//			}
//			
//			System.out.println(repository.findByMail("victorvipe@vipe.com").getName());
//			
//		};		
//	}
	
}
