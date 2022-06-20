package com.cpadilla.bffinder.domain;

import java.util.List;

public class Pet {

    private int petId;
    private String name;
    private double weight;
    private int age;
    private boolean vaccinated;
    private boolean dangerous;
    private String size;
    private String sex;
    private boolean sterilized;
    private boolean active;
    private int breedId;
    private int ownerId;
    private int adoptionPostId;

    private List<Photo> photos;
    private Breed breed;
    private User owner;
    private AdoptionPost adoptionPost;

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getBreedId() {
        return breedId;
    }

    public void setBreedId(int breedId) {
        this.breedId = breedId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public AdoptionPost getAdoptionPost() {
        return adoptionPost;
    }

    public void setAdoptionPost(AdoptionPost adoptionPost) {
        this.adoptionPost = adoptionPost;
    }

    public int getAdoptionPostId() {
        return adoptionPostId;
    }

    public void setAdoptionPostId(int adoptionPostId) {
        this.adoptionPostId = adoptionPostId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("petId=").append(petId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", age=").append(age);
        sb.append(", vaccinated=").append(vaccinated);
        sb.append(", dangerous=").append(dangerous);
        sb.append(", size='").append(size).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", sterilized=").append(sterilized);
        sb.append(", active=").append(active);
        sb.append(", breedId=").append(breedId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", photos=").append(photos);
        sb.append(", breed=").append(breed);
        sb.append(", owner=").append(owner);
        sb.append('}');
        return sb.toString();
    }
}
