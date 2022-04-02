package com.cpadilla.bffinder.domain;

public class Breed {
    private int breedId;
    private String name;
    private int specieId;
//    private Specie specie;

    public int getBreedId() {
        return breedId;
    }

    public void setBreedId(int breedId) {
        this.breedId = breedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpecieId() {
        return specieId;
    }

    public void setSpecieId(int specieId) {
        this.specieId = specieId;
    }

//    public Specie getSpecie() {
//        return specie;
//    }
//
//    public void setSpecie(Specie specie) {
//        this.specie = specie;
//    }
}
