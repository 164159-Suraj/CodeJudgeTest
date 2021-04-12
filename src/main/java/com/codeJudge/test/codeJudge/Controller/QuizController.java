package com.codeJudge.test.codeJudge.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeJudge.test.codeJudge.Model.Quetsions;
import com.codeJudge.test.codeJudge.Model.Quiz;
import com.codeJudge.test.codeJudge.Service.QuestionService;
import com.codeJudge.test.codeJudge.Service.QuizQuestionService;

@RestController
public class QuizController {
	@Autowired
	private QuizQuestionService quizQuestion;
	
	@PostMapping("/api/quiz/")
	public Quiz addingQuiz(@RequestBody Quiz quiz) {
		return quizQuestion.addQuiz(quiz);
	}
	
	@GetMapping("/api/quiz/{quizid}")
	public Optional<Quiz> getOneQuiz(@PathVariable int quizid) {
		return quizQuestion.getQuiz(quizid);
	}
	/*
	 * @GetMapping("/api/quiz") public List<Quiz> getAllQuizes() { return
	 * quizQuestion.getAll(); }
	 */
	
@Autowired	
private QuestionService questionService;
	
	@PostMapping("/api/question")
	public Quetsions saveQuestion(@RequestBody Quetsions question) {
		return this.questionService.createQuestion(question);
		
	}
	@GetMapping("/api/question/{questionid}")
	public Optional<Quetsions> getOne(@PathVariable int questionid) {
		return this.questionService.findQuestion(questionid);
	}
	@GetMapping("/api/quiz-questions/{quiz_id}")
	public List findQuizQuestion(@PathVariable int quiz_id) {
		return quizQuestion.getallQuestion(quiz_id);
		
	}
	

}
