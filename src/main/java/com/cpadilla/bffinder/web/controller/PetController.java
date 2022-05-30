package com.cpadilla.bffinder.web.controller;

import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService service;

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<List<Pet>> getByOwner(@PathVariable("ownerId") int ownerId) {
        return service.getByOwner(ownerId).map(pets -> new ResponseEntity<>(pets, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pet> getPet(@PathVariable("id") int petId) {
        return service.getById(petId).map(pet -> new ResponseEntity<>(pet, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pet>> getAll() {
        return service.getAll().map(pets -> new ResponseEntity<>(pets, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/breed/{breedId}")
    public ResponseEntity<List<Pet>> getByBreed(@PathVariable("breedId") int breedId) {
        return service.getByBreed(breedId).map(pets -> new ResponseEntity<>(pets, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Pet> save(@RequestBody Pet pet) {
        return new ResponseEntity<>(service.save(pet), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{petId}")
    public ResponseEntity delete(@PathVariable("petId") int petId) {
        if (service.delete(petId)) {
            System.out.println("HOLAAAAAA");
            return new ResponseEntity<>(HttpStatus.OK);
        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Pet pet) {
        return service.update(pet).map(pet1 -> new ResponseEntity<>(HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
