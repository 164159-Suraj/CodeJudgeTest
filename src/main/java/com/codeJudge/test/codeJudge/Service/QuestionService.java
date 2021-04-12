package com.codeJudge.test.codeJudge.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeJudge.test.codeJudge.Model.Quetsions;
import com.codeJudge.test.codeJudge.Repository.QuestionRepo;
@Service
public class QuestionService {
	@Autowired
	QuestionRepo questionRepo;
	
	public Quetsions createQuestion(Quetsions question) {
		return this.questionRepo.save(question);
	}
	public Optional<Quetsions> findQuestion(int id) {
		return this.questionRepo.findById(id);
	}

}
