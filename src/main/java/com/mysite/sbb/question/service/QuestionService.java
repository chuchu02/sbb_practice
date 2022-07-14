package com.mysite.sbb.question.service;

import com.mysite.sbb.question.dao.QuestionRepository;
import com.mysite.sbb.question.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getList() {
        return questionRepository.findAll();
    }
}
