package com.codeJudge.test.codeJudge.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeJudge.test.codeJudge.Model.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
