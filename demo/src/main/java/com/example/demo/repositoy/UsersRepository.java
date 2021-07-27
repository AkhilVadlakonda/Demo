package com.example.demo.repositoy;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.data;

public interface UsersRepository extends MongoRepository<data , String> {
	
	data findBy(String id);

}
