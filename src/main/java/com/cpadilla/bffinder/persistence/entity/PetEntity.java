package com.cpadilla.bffinder.persistence.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pet")
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private Integer petId;

    private String name;

    private Double weight;

    private Integer age;

    private Boolean vaccinated;

    private Boolean dangerous;

    private String size;

    private String sex;

    private Boolean sterilized;

    private Boolean status;

    @Column(name = "breed_id")
    private Integer breedId;

    @Column(name = "owner_id")
    private Integer ownerId;

    @Column(name = "adoption_post_id", insertable = false, updatable = false)
    private Integer adoptionPostId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adoption_post_id")
    private AdoptionPostEntity adoptionPostEntity;

    @OneToMany(mappedBy = "petEntity", cascade = CascadeType.ALL)
    private List<ImageEntity> imageEntities;

    @ManyToOne
    @JoinColumn(name = "breed_id", insertable = false, updatable = false)
    private BreedEntity breedEntity;

    @ManyToOne
    @JoinColumn(name = "owner_id", insertable = false, updatable = false)
    private UserEntity userEntity;

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public Boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(Boolean dangerous) {
        this.dangerous = dangerous;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(Boolean sterilized) {
        this.sterilized = sterilized;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getBreedId() {
        return breedId;
    }

    public void setBreedId(Integer breedId) {
        this.breedId = breedId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public List<ImageEntity> getImageEntities() {
        return imageEntities;
    }

    public void setImageEntities(List<ImageEntity> imageEntities) {
        this.imageEntities = imageEntities;
    }

    public BreedEntity getBreedEntity() {
        return breedEntity;
    }

    public void setBreedEntity(BreedEntity breedEntity) {
        this.breedEntity = breedEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public Boolean getDangerous() {
        return dangerous;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getSterilized() {
        return sterilized;
    }

    public AdoptionPostEntity getAdoptionPostEntity() {
        return adoptionPostEntity;
    }

    public void setAdoptionPostEntity(AdoptionPostEntity adoptionPostEntity) {
        this.adoptionPostEntity = adoptionPostEntity;
    }

    public Integer getAdoptionPostId() {
        return adoptionPostId;
    }

    public void setAdoptionPostId(Integer adoptionPostId) {
        this.adoptionPostId = adoptionPostId;
    }
}
