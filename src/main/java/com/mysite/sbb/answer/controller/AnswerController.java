package com.mysite.sbb.answer.controller;

import com.mysite.sbb.answer.dao.AnswerRepository;
import com.mysite.sbb.answer.domain.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerRepository answerRepository;

    @RequestMapping("/list")
    @ResponseBody
    public List<Answer> showAnswers() {
        return answerRepository.findAll();
    }
}