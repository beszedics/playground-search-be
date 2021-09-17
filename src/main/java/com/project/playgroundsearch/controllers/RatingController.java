package com.project.playgroundsearch.controllers;

import com.project.playgroundsearch.services.RatingServiceImpl;
import com.project.playgroundsearch.services.models.RatingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ratings")
public class RatingController {

    @Autowired
    private RatingServiceImpl ratingService;

    @GetMapping
    public List<RatingModel> getRating() {
        return ratingService.getRatings();
    }
}
