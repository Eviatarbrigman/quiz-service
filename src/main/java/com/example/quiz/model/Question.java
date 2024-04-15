package com.example.quiz.model;

import com.example.quiz.enums.QuestionType;


public class Question {

    private Integer id;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;
    private QuestionType questionType;

    public Integer getId() {
        return id;
    }

    public Question setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public Question setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getAnswer1() {
        return answer1;
    }

    public Question setAnswer1(String answer1) {
        this.answer1 = answer1;
        return this;
    }

    public String getAnswer2() {
        return answer2;
    }

    public Question setAnswer2(String answer2) {
        this.answer2 = answer2;
        return this;
    }

    public String getAnswer3() {
        return answer3;
    }

    public Question setAnswer3(String answer3) {
        this.answer3 = answer3;
        return this;
    }

    public String getAnswer4() {
        return answer4;
    }

    public Question setAnswer4(String answer4) {
        this.answer4 = answer4;
        return this;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public Question setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
        return this;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public Question setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
        return this;
    }
}
