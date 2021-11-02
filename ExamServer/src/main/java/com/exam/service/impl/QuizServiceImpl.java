package com.exam.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.test.Category;
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
	public Quiz getQuiz(Long quizId) {
		return this.quizRepository.findById(quizId).get();
	}

	@Override
	public void deleteQuiz(Long quizId) {

		this.quizRepository.deleteById(quizId);
	}

	@Override
	public List<Quiz> getQuizzesOfCategory(Category c) {

		return this.quizRepository.findByCategory(c);
	}

}
