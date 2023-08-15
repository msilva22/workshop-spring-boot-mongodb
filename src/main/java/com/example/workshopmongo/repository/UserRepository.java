package com.example.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.workshopmongo.domain.User;

@RequestMapping
public interface UserRepository extends MongoRepository<User, String> {
	

}
