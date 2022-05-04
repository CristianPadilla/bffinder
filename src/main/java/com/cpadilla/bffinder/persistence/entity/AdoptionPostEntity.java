package com.cpadilla.bffinder.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "adoption_post")
public class AdoptionPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adoption_post_id")
    private Integer AdoptionPostId;

    private LocalDateTime date;

    private String description;

    private Boolean status;

//    @Column(name = "pet_id")
//    private Integer petId;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "adoptionPostEntity")
    private PetEntity petEntity;

    public Integer getAdoptionPostId() {
        return AdoptionPostId;
    }

    public void setAdoptionPostId(Integer adoptionPostId) {
        AdoptionPostId = adoptionPostId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

//    public Integer getPetId() {
//        return petId;
//    }
//
//    public void setPetId(Integer petId) {
//        this.petId = petId;
//    }

    public PetEntity getPetEntity() {
        return petEntity;
    }

    public void setPetEntity(PetEntity petEntity) {
        this.petEntity = petEntity;
    }
}
