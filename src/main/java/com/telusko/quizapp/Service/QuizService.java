package com.telusko.quizapp.Service;

import com.telusko.quizapp.dao.QuizDao;
import com.telusko.quizapp.model.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    ＠Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String>createQuiz(String category, int numQ, String title){
        List<Question> questions = questionDao.findRandomQuestionsByCategory();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions();
    }
}
