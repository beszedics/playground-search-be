package com.project.playgroundsearch.services.converters;

import com.project.playgroundsearch.database.entities.PlaygroundEntity;
import com.project.playgroundsearch.services.models.PlaygroundModel;
import org.springframework.stereotype.Component;

@Component
public class PlaygroundConverter {
    public PlaygroundModel entityToModel(PlaygroundEntity playgroundEntity) {
        PlaygroundModel playgroundModel = new PlaygroundModel();
        playgroundModel.setId(playgroundEntity.getId());
        playgroundModel.setName(playgroundEntity.getName());
        playgroundModel.setAddress(playgroundEntity.getAddress());
        playgroundModel.setLatitude(playgroundEntity.getLatitude());
        playgroundModel.setLongitude(playgroundEntity.getLongitude());
        playgroundModel.setHasSwing(playgroundEntity.getHasSwing());
        playgroundModel.setHasSlide(playgroundEntity.getHasSlide());
        playgroundModel.setHasCarousel(playgroundEntity.getHasCarousel());
        playgroundModel.setHasSandbox(playgroundEntity.getHasSandbox());
        playgroundModel.setHasBalancingBridge(playgroundEntity.getHasBalancingBridge());
        playgroundModel.setHasTeeter(playgroundEntity.getHasTeeter());
        playgroundModel.setHasRopePyramid(playgroundEntity.getHasRopePyramid());
        playgroundModel.setHasSquirrelWheel(playgroundEntity.getHasSquirrelWheel());
        playgroundModel.setHasHanging(playgroundEntity.getHasHanging());
        playgroundModel.setHasObstacleCourse(playgroundEntity.getHasObstacleCourse());
        playgroundModel.setHasRestHouse(playgroundEntity.getHasRestHouse());

        return playgroundModel;
    }
}
