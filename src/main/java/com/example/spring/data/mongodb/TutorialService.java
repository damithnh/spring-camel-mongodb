package com.example.spring.data.mongodb;

import com.example.spring.data.mongodb.model.Tutorial;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialService {

    @Autowired
    private ProducerTemplate producerTemplate;

    public List<Tutorial> getAllTutorials () {
        List tutorials = (List) producerTemplate.sendBody("direct:getTutorials", null, List.class);
        return tutorials;
    }

    public Tutorial saveTutorial(Tutorial tutorial) {
        producerTemplate.sendBody("direct:saveTutorial", tutorial);
        return tutorial;
    }
}
