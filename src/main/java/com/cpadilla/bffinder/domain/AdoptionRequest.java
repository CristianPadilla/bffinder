package com.cpadilla.bffinder.domain;

import java.time.LocalDateTime;

public class AdoptionRequest {

    private int AdoptionRequestId;
    private LocalDateTime date;
    private Boolean accepted;
    private User user;
    private AdoptionPost adoptionPost;

    public int getAdoptionRequestId() {
        return AdoptionRequestId;
    }

    public void setAdoptionRequestId(int adoptionRequestId) {
        AdoptionRequestId = adoptionRequestId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AdoptionPost getAdoptionPost() {
        return adoptionPost;
    }

    public void setAdoptionPost(AdoptionPost adoptionPost) {
        this.adoptionPost = adoptionPost;
    }
}
