package com.beerproject.projectbeer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beerproject.projectbeer.domain.Beer;
import com.beerproject.projectbeer.repositories.BeerRepository;

@Service
public class BeerService {

    @Autowired
    private BeerRepository repository;

    public List<Beer> findAll() {

        return repository.findAll();
    }

    public Beer insert(Beer obj) {

        return repository.insert(obj);
    }
}
