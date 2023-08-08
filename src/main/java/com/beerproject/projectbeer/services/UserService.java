package com.beerproject.projectbeer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beerproject.projectbeer.domain.User;
import com.beerproject.projectbeer.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {

        return repository.findAll();
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);

        return obj.orElseThrow();
    }

    public void deleteById(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    public void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
        newObj.setPassword(obj.getPassword());
    }
}
