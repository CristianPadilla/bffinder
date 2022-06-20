package com.cpadilla.bffinder.domain;

import java.time.LocalDateTime;

public class AdoptionPost {

    private int AdoptionPostId;
    private LocalDateTime date;
    private String details;
    private boolean active;
    private int petId;

    private Pet pet;

    public int getAdoptionPostId() {
        return AdoptionPostId;
    }

    public void setAdoptionPostId(int adoptionPostId) {
        AdoptionPostId = adoptionPostId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }
}
