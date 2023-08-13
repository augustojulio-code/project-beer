package com.beerproject.projectbeer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
