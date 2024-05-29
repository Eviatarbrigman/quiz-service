package com.example.quiz.feign;

import com.example.quiz.Dto.QuizDto;
import com.example.quiz.Dto.ScoreDto;
import com.example.quiz.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {

    @PostMapping("questions/generate")
    public ResponseEntity<List<Question>> getQuestionsForQuiz(@RequestBody QuizDto quizDto);

    @PostMapping("questions/score")
    public ResponseEntity<Integer> getScoreForQuiz(@RequestBody ScoreDto scoreDto);

    @PostMapping("questions/getQuestionsById")
    public ResponseEntity<List<Question>> getQuestionsById(@RequestBody List<Integer> questionsIds);

}
