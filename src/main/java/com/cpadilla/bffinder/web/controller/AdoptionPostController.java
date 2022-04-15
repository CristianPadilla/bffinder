package com.cpadilla.bffinder.web.controller;

import com.cpadilla.bffinder.domain.AdoptionPost;
import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.service.AdoptionPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class AdoptionPostController {

    @Autowired
    private AdoptionPostService service;

    @GetMapping
    public ResponseEntity<List<AdoptionPost>> getAllRecomendations() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
