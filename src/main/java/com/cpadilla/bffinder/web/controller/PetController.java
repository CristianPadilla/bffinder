package com.cpadilla.bffinder.web.controller;

import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<List<Pet>> getByOwner(@PathVariable("ownerId") int ownerId) {
        return petService.getByOwner(ownerId).map(pets -> new ResponseEntity<>(pets, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pet>> getAll() {
        return petService.getAll().map(pets -> new ResponseEntity<>(pets, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
