package com.project.playgroundsearch.services.models;

import com.project.playgroundsearch.database.entities.PlaygroundEntity;

public class RatingModel {

    private Integer id;
    private PlaygroundEntity playgroundEntity;
    private Integer score;
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PlaygroundEntity getPlaygroundEntity() {
        return playgroundEntity;
    }

    public void setPlaygroundEntity(PlaygroundEntity playgroundEntity) {
        this.playgroundEntity = playgroundEntity;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
