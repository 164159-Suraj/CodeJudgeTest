package com.codeJudge.test.codeJudge.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.codeJudge.test.codeJudge.Model.Quetsions;

public interface QuestionRepo extends JpaRepository<Quetsions, Integer> {

	

}
