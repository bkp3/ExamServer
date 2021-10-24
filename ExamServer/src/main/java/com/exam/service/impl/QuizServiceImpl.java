package com.exam.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.test.Quiz;
import com.exam.repo.QuizRepository;
import com.exam.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizRepository quizRepository;

	@Override
	public Quiz addQuiz(Quiz quiz) {
		return this.quizRepository.save(quiz);

	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {

		return this.quizRepository.save(quiz);
	}

	@Override
	public Set<Quiz> getQuizzes() {
		return new HashSet(this.quizRepository.findAll());
	}

	@Override
	public Quiz getQuiz(Long QuizId) {
		return this.quizRepository.getById(QuizId);
	}

	@Override
	public void deleteQuiz(Long QuizId) {
		this.quizRepository.deleteById(QuizId);
	}

}
