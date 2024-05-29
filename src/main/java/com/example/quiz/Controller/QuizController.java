package com.example.quiz.Controller;

import com.example.quiz.Dto.QuizAndQuestionsDto;
import com.example.quiz.Dto.QuizDto;
import com.example.quiz.Dto.ScoreDto;
import com.example.quiz.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.quiz.service.QuizService;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizService quizService;


    @GetMapping("")
    public ResponseEntity<List<Quiz>> getQuiz() {
        List<Quiz> quizList = quizService.getAllQuiz();
        return new ResponseEntity<>(quizList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuizAndQuestionsDto> getQuizById(@PathVariable Integer id) {
        QuizAndQuestionsDto quizAndQuestionsDto = quizService.getQuizById(id);
        return new ResponseEntity<>(quizAndQuestionsDto, HttpStatus.OK);
    }

    @PostMapping("/generate")
    public Quiz createQuiz(@RequestBody QuizDto quizDto) {
        Quiz quiz = quizService.createQuiz(quizDto);
        return quiz;
    }

    @PostMapping("/getScore")
    public Integer getScore(@RequestBody ScoreDto scoreDto) {
        Integer score = quizService.getScore(scoreDto);
        return score;
    }
}
