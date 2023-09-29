package com.telusko.quizapp.Service;

import com.telusko.quizapp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    ＠Autowired
    QuizDao quizDao;
}
