package com.beerproject.projectbeer.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beerproject.projectbeer.domain.Pub;

public interface PubRepository extends MongoRepository<Pub, String> {

}
