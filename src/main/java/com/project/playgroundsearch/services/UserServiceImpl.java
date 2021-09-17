package com.project.playgroundsearch.services;

import com.project.playgroundsearch.database.entities.UserEntity;
import com.project.playgroundsearch.database.repositories.UserRepository;
import com.project.playgroundsearch.services.converters.UserConverter;
import com.project.playgroundsearch.services.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public List<UserModel> getUsers() {

        Iterable<UserEntity> iterableUsers = userRepository.findAll();

        List<UserModel> users = new ArrayList<>();

        for (UserEntity user : iterableUsers) {
            users.add(userConverter.entityToModel(user));
        }

        return users;
    }
}
