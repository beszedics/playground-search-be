package com.project.playgroundsearch.services;

import com.project.playgroundsearch.database.entities.PlaygroundEntity;
import com.project.playgroundsearch.database.repositories.PlaygroundRepository;
import com.project.playgroundsearch.services.converters.PlaygroundConverter;
import com.project.playgroundsearch.services.models.PlaygroundModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaygroundServiceImpl implements PlaygroundService {

    @Autowired
    private PlaygroundRepository playgroundRepository;

    @Autowired
    private PlaygroundConverter playgroundConverter;

    @Override
    public List<PlaygroundModel> getPlaygrounds() {

        Iterable<PlaygroundEntity> iterablePlaygrounds = playgroundRepository.findAll();

        List<PlaygroundModel> playgrounds = new ArrayList<>();

        for (PlaygroundEntity playground : iterablePlaygrounds) {
            playgrounds.add(playgroundConverter.entityToModel(playground));
        }

        return playgrounds;
    }
}
