package com.project.playgroundsearch.services.converters;

import com.project.playgroundsearch.database.entities.UserEntity;
import com.project.playgroundsearch.services.models.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserModel entityToModel(UserEntity userEntity) {
        UserModel userModel = new UserModel();
        userModel.setId(userEntity.getId());
        userModel.setName(userEntity.getName());
        userModel.setEmail(userEntity.getEmail());
        userModel.setUsername(userEntity.getUsername());
        userModel.setPassword(userEntity.getPassword());
        userModel.setFavouritePlaygrounds(userEntity.getFavouritePlaygrounds());
        userModel.setRatings(userEntity.getRatings());

        return userModel;
    }
}
