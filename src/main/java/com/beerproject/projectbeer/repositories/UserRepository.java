package com.beerproject.projectbeer.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beerproject.projectbeer.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
