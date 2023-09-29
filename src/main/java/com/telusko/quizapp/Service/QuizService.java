package com.telusko.quizapp.Service;

import com.telusko.quizapp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    ＠Autowired
    QuizDao quizDao;

    public ResponseEntity<String>createQuiz(String category, int numQ, String title){
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
    }
}
