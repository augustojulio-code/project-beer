package com.beerproject.projectbeer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beer")
public class BeerController {

    @GetMapping
    public String apiTest() {
        return "Olá imbecil";
    }
}
