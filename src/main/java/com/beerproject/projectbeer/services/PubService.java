package com.beerproject.projectbeer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beerproject.projectbeer.domain.Pub;
import com.beerproject.projectbeer.repositories.PubRepository;

@Service
public class PubService {

    @Autowired
    private PubRepository repository;

    public List<Pub> findAll() {

        return repository.findAll();
    }
}
