package com.mysite.sbb.question.controller;

import com.mysite.sbb.question.dao.QuestionRepository;
import com.mysite.sbb.question.domain.Question;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
@AllArgsConstructor
public class QuestionController {

    private final QuestionRepository questionRepository;

    @RequestMapping("/list")
    public String showQuestion(Model model) {
        List<Question> questionList =  this.questionRepository.findAll();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }
}

