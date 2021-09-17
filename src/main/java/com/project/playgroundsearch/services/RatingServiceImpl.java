package com.project.playgroundsearch.services;

import com.project.playgroundsearch.database.entities.RatingEntity;
import com.project.playgroundsearch.database.repositories.RatingRepository;
import com.project.playgroundsearch.services.converters.RatingConverter;
import com.project.playgroundsearch.services.models.RatingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private RatingConverter ratingConverter;

    @Override
    public List<RatingModel> getRatings() {
        Iterable<RatingEntity> iterableRatings = ratingRepository.findAll();

        List<RatingModel> ratings = new ArrayList<>();

        for (RatingEntity rating : iterableRatings) {
            ratings.add(ratingConverter.entityToModel(rating));
        }

        return ratings;
    }
}
