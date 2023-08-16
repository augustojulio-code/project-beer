package com.beerproject.projectbeer.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.beerproject.projectbeer.domain.Pub;
import com.beerproject.projectbeer.services.PubService;

@RestController
@RequestMapping("/pub")
public class PubController {

    @Autowired
    private PubService service;

    @GetMapping
    public ResponseEntity<List<Pub>> findAll() {
        List<Pub> list = service.findAll();

        return ResponseEntity.ok().body(list);

    }

    @PostMapping
    public ResponseEntity<Pub> insert(@RequestBody Pub obj) {

        obj = service.insert(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
