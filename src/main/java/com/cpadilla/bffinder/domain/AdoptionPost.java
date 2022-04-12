package com.cpadilla.bffinder.domain;

import java.time.LocalDateTime;

public class AdoptionPost {
    private int AdoptionPostId;
    private LocalDateTime date;
    private String description;
    private String address;
    private Boolean active;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
