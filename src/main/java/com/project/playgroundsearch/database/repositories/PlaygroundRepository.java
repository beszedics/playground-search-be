package com.project.playgroundsearch.database.repositories;

import com.project.playgroundsearch.database.entities.PlaygroundEntity;
import org.springframework.data.repository.CrudRepository;

public interface PlaygroundRepository extends CrudRepository<PlaygroundEntity, Integer> {
}
