package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.test.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
