package com.example.quiz.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "quiz", schema = "quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private List<Integer> questions;

    public Quiz() {

    }

    public Quiz(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public Quiz setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Quiz setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<Integer> getQuestions() {
        return questions;
    }

    public Quiz setQuestions(List<Integer> questions
    ) {
        this.questions = questions;
        return this;
    }
}
