package com.beerproject.projectbeer.services;

import java.util.List;
import java.util.Optional;

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

    public Pub insert(Pub obj) {

        return repository.insert(obj);

    }

    public Pub findById(String id) {

        Optional<Pub> obj = repository.findById(id);
        return obj.orElseThrow();
    }

    public void deleteById(String id) {
        findById(id);
        repository.deleteById(id);
    }
}
