package com.example.spring.data.mongodb.controller;

import com.example.spring.data.mongodb.TutorialService;
import com.example.spring.data.mongodb.model.Tutorial;
import com.example.spring.data.mongodb.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/camel")
public class TestController {
    @Autowired
    TutorialService tutorialService;
    @Autowired
    private TutorialRepository tutorialRepository;


    @GetMapping
    public ResponseEntity getAllTutorials(@RequestParam(required = false) String title) {

        return new ResponseEntity<>(tutorialService.getAllTutorials(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveTutorial(@RequestBody Tutorial tutorial){
        return new ResponseEntity<>(tutorialService.saveTutorial(tutorial), HttpStatus.OK);
    }
}
