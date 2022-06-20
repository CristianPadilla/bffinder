package com.cpadilla.bffinder.web.controller;

import com.cpadilla.bffinder.domain.AdoptionPost;
import com.cpadilla.bffinder.domain.service.AdoptionPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class AdoptionPostController {

    @Autowired
    private AdoptionPostService service;

    @GetMapping
    public ResponseEntity<List<AdoptionPost>> getAllRecomendations() {
        return new ResponseEntity<>(service.getHomePosts(), HttpStatus.OK);
    }

    @GetMapping("/{PostId}")
    public ResponseEntity<AdoptionPost> getById(@PathVariable("PostId") int adopionPostId) {
        return service.getById(adopionPostId).map(adoptionPost -> new ResponseEntity<>(adoptionPost, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("save")
    public ResponseEntity<AdoptionPost> create(@RequestBody AdoptionPost adoptionPost) {
        return new ResponseEntity<>(service.save(adoptionPost), HttpStatus.OK);
    }
}
