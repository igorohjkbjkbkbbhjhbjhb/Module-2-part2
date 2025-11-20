package com.example.TestModul2.Controller;

import com.example.TestModul2.model.Question;
import com.example.TestModul2.service.JavaQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private final JavaQuestionService javaQuestionService;

    @Autowired
    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @PostMapping("/")
    Question addQuestion(@RequestParam String question, @RequestParam String answer){
        return javaQuestionService.add(question, answer);
    }

    
}
