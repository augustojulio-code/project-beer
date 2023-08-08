package com.beerproject.projectbeer.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beerproject.projectbeer.domain.Beer;

public interface BeerRepository extends MongoRepository<Beer, String> {

}
