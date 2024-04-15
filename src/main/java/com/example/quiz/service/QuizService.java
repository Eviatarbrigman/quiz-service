package com.example.quiz.service;

import com.example.quiz.Dto.QuestionDto;
import com.example.quiz.Dto.QuizAndQuestionsDto;
import com.example.quiz.Dto.QuizDto;
import com.example.quiz.Dto.ScoreDto;
import com.example.quiz.feign.QuizInterface;
import com.example.quiz.model.Question;
import com.example.quiz.model.Quiz;
import com.example.quiz.repository.QuizRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    QuizInterface quizInterface;


    public Quiz createQuiz(QuizDto quizDto) {
        List<Integer> questions = quizInterface.getQuestionsForQuiz(quizDto).getBody()
                .stream().map(Question::getId).toList();
//
//        if (CollectionUtils.isEmpty(questionList)){
//            throw new IllegalStateException("no questions were found");
//        }
//        List<QuestionDto> questionDtoList = questionList.stream()
//                .map(question -> modelMapper.map(question, QuestionDto.class))
//                .collect(Collectors.toList());


        Quiz quiz = new Quiz();
        quiz.setTitle(quizDto.getTitle());
        quiz.setQuestions(questions);
        quizRepository.save(quiz);
        return quiz;
    }

    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }

    public QuizAndQuestionsDto getQuizById(Integer id) {
        Quiz quiz = quizRepository.findById(id).get();
        List<Question> questions = quizInterface.getQuestionsById(quiz.getQuestions()).getBody();
        List<QuestionDto> listOfQuestionsDtos = questions.stream().map(question -> modelMapper.map(question, QuestionDto.class)).toList();

        QuizAndQuestionsDto quizAndQuestionsDto = new QuizAndQuestionsDto();
        quizAndQuestionsDto.setId(quiz.getId())
                .setQuestionDtos(listOfQuestionsDtos);
        return quizAndQuestionsDto;
    }

    public Integer getScore(ScoreDto scoreDto) {
        return quizInterface.getScoreForQuiz(scoreDto).getBody();
    }
}
