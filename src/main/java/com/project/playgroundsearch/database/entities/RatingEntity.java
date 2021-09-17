package com.project.playgroundsearch.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "ratings")
public class RatingEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "playground", referencedColumnName = "id")
    private PlaygroundEntity playgroundEntity;

    @Column(name = "score")
    private Integer score;

    @Column(name = "comment")
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

    @Override
    public String toString() {
        return "RatingEntity{" +
                "id=" + id +
                ", playgroundEntity=" + playgroundEntity +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                '}';
    }
}
