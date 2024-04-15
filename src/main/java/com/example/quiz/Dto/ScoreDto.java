package com.example.quiz.Dto;

import java.util.Map;

public class ScoreDto {
    private Integer quizId;
    private Map<Integer, String> questionList;

    public Integer getQuizId() {
        return quizId;
    }

    public ScoreDto setQuizId(Integer quizId) {
        this.quizId = quizId;
        return this;
    }

    public Map<Integer, String> getQuestionList() {
        return questionList;
    }

    public ScoreDto setQuestionList(Map<Integer, String> questionList) {
        this.questionList = questionList;
        return this;
    }
}
