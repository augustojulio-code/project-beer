package com.beerproject.projectbeer.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.beerproject.projectbeer.domain.User;
import com.beerproject.projectbeer.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {

        List<User> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj) {
        obj = service.insert(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id) {

        User obj = service.findById(id);

        return ResponseEntity.ok().body(obj);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        service.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestBody User obj, @PathVariable String id) {
        obj.setId(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();

    }

}
