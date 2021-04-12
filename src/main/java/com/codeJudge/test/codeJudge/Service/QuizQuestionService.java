package com.codeJudge.test.codeJudge.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeJudge.test.codeJudge.Model.Quiz;
import com.codeJudge.test.codeJudge.Model.Quetsions;
import com.codeJudge.test.codeJudge.Repository.QuestionRepo;
import com.codeJudge.test.codeJudge.Repository.QuizRepo;


@Service
public class QuizQuestionService {
	@Autowired
	public QuizRepo quizRepo;
	@Autowired
	public QuestionRepo questionRepo;
	/*
	 * @Autowired public QuestionRepo questionRepo;
	 */
	
	//Save a Quiz
	public Quiz addQuiz(Quiz quiz) {
		/*
		 * int x = quiz.getId(); if(x==0) {
		 * 
		 * quiz.setId(1); } else { x++; quiz.setId(x); }
		 */
		return quizRepo.save(quiz);
	}
	
	//Get a Quiz
	public Optional<Quiz> getQuiz(int id) {
		return quizRepo.findById(id);
	}
	
	
	
	//Get all quiz
	public List<Quiz> getAll() {
		return quizRepo.findAll();
	}
	
	
	  
	 
	  Optional<Quiz> x = Optional.empty(); 
	 public ArrayList<Object> list = new ArrayList<Object>();
	  
	  //Get all questions associated with the quiz 
	  public List getallQuestion(int id){ 
		  x = quizRepo.findById(id); 
		  list.add(x); 
	  java.util.List<Quetsions> y = questionRepo.findAll(); 
	  for(Quetsions c: y) {
		  if(c.getQuiz() == id) { 
			  list.add(c);
	        } 
		  } 
	  return list;
	 
	  
	  }
	 
	

}
