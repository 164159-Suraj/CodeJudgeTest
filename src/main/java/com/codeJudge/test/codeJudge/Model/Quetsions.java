package com.codeJudge.test.codeJudge.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quetsions {
	@Id
	int id;
	String name, options,correct_option;
	int quiz;
	int points;
	public Quetsions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Quetsions(int id, String name, String options, String correct_option, int quiz, int points) {
		super();
		this.id = id;
		this.name = name;
		this.options = options;
		this.correct_option = correct_option;
		this.quiz = quiz;
		this.points = points;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public String getCorrect_option() {
		return correct_option;
	}
	public void setCorrect_option(String correct_option) {
		this.correct_option = correct_option;
	}
	public int getQuiz() {
		return quiz;
	}
	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Quetsion [id=" + id + ", name=" + name + ", options=" + options + ", correct_option=" + correct_option
				+ ", quiz=" + quiz + ", points=" + points + "]";
	}
	

}
