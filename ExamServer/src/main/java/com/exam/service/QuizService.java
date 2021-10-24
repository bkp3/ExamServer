package com.exam.service;

import java.util.Set;

import com.exam.model.test.Quiz;

public interface QuizService {

	public Quiz addQuiz(Quiz quiz);

	public Quiz updateQuiz(Quiz quiz);

	public Set<Quiz> getQuizzes();

	public Quiz getQuiz(Long QuizId);

	public void deleteQuiz(Long QuizId);

}