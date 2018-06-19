package com.getronincs.techtest.models;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

	User findByMail(String mail);
	
}
