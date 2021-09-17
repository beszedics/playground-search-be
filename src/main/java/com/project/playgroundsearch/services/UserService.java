package com.project.playgroundsearch.services;

import com.project.playgroundsearch.services.models.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getUsers();
}
