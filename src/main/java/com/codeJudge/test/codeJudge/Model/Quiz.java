package com.codeJudge.test.codeJudge.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quiz {
	@Id
	int id;
	String name;
	String description;
	public Quiz(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
