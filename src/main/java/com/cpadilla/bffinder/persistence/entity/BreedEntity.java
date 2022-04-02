package com.cpadilla.bffinder.persistence.entity;

import jdk.jfr.Name;

import javax.persistence.*;

@Entity
@Table(name = "breed")
public class BreedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "breed_id")
    private Integer breedId;

    private String name;

    @Column(name = "specie_id")
    private Integer specieId;

    @ManyToOne
    @JoinColumn(name = "specie_id", insertable = false, updatable = false)
    private SpecieEntity specieEntity;

    public Integer getSpecieId() {
        return specieId;
    }

    public void setSpecieId(Integer specieId) {
        this.specieId = specieId;
    }

    public Integer getBreedId() {
        return breedId;
    }

    public void setBreedId(Integer breedId) {
        this.breedId = breedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpecieEntity getSpecieEntity() {
        return specieEntity;
    }


    public void setSpecieEntity(SpecieEntity specieEntity) {
        this.specieEntity = specieEntity;
    }
}
