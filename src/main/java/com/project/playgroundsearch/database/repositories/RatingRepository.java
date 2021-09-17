package com.project.playgroundsearch.database.repositories;

import com.project.playgroundsearch.database.entities.RatingEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends CrudRepository<RatingEntity, Integer> {
}
