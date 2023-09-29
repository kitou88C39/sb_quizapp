package com.telusko.quizapp.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class QuizController {

    @PostMapping("create")
    public ResponseEntity<String> createQuiz() {

    }

}
