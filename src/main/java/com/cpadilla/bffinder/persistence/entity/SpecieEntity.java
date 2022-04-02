package com.cpadilla.bffinder.persistence.entity;

import com.cpadilla.bffinder.domain.Breed;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "specie")
public class SpecieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "specie_id")
    private Integer specieId;

    private String name;

    private String description;

    @OneToMany(mappedBy = "specieEntity")
    private List<BreedEntity> breedEntities;


    public Integer getSpecieId() {
        return specieId;
    }

    public void setSpecieId(Integer specieId) {
        this.specieId = specieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BreedEntity> getBreedEntities() {
        return breedEntities;
    }



    public void setBreedEntities(List<BreedEntity> breedEntities) {
        this.breedEntities = breedEntities;
    }
}
