package com.project.playgroundsearch.services.converters;

import com.project.playgroundsearch.database.entities.RatingEntity;
import com.project.playgroundsearch.services.models.RatingModel;

public class RatingConverter {

    public RatingModel entityToModel(RatingEntity ratingEntity) {
        RatingModel ratingModel = new RatingModel();
        ratingModel.setId(ratingEntity.getId());
        ratingModel.setPlaygroundEntity(ratingEntity.getPlaygroundEntity());
        ratingModel.setScore(ratingEntity.getScore());
        ratingModel.setComment(ratingEntity.getComment());

        return ratingModel;
    }
}
