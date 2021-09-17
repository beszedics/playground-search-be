package com.project.playgroundsearch.services.models;

import com.project.playgroundsearch.database.entities.PlaygroundEntity;
import com.project.playgroundsearch.database.entities.RatingEntity;

import java.util.List;

public class UserModel {

    private Integer id;
    private String name;
    private String email;
    private String username;
    private String password;
    private List<PlaygroundEntity> favouritePlaygrounds;
    private List<RatingEntity> ratings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<PlaygroundEntity> getFavouritePlaygrounds() {
        return favouritePlaygrounds;
    }

    public void setFavouritePlaygrounds(List<PlaygroundEntity> favouritePlaygrounds) {
        this.favouritePlaygrounds = favouritePlaygrounds;
    }

    public List<RatingEntity> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingEntity> ratings) {
        this.ratings = ratings;
    }
}
