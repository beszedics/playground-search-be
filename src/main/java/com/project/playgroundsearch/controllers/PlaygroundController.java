package com.project.playgroundsearch.controllers;

import com.project.playgroundsearch.services.PlaygroundServiceImpl;
import com.project.playgroundsearch.services.models.PlaygroundModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/playgrounds")
public class PlaygroundController {

    @Autowired
    private PlaygroundServiceImpl playgroundService;

    @GetMapping
    private List<PlaygroundModel> getPlaygrounds() {
        return playgroundService.getPlaygrounds();
    }
}
