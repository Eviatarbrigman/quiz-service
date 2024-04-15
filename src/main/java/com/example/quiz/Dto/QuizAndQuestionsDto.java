package com.example.quiz.Dto;

import java.util.List;

public class QuizAndQuestionsDto {
    private Integer id;
    private List<QuestionDto> questionDtos;

    public Integer getId() {
        return id;
    }

    public QuizAndQuestionsDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public List<QuestionDto> getQuestionDtos() {
        return questionDtos;
    }

    public QuizAndQuestionsDto setQuestionDtos(List<QuestionDto> questionDtos) {
        this.questionDtos = questionDtos;
        return this;
    }
}
