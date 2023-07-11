package com.in28minutes.springBoot.firstWebApp.todo;

import java.time.LocalDate;

import javax.validation.constraints.Size;

public class Todo {
	private int id;
	private String name;
	@Size(min=10, message="Enter atleast 10 characters")
	private String description;
	private LocalDate target;
	private boolean done;
	public Todo(int id, String name, String description, LocalDate target, boolean done) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.target = target;
		this.done = done;
	}
	
	public Todo() {
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
	public LocalDate getTarget() {
		return target;
	}
	public void setTarget(LocalDate target) {
		this.target = target;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", target=" + target + ", done="
				+ done + "]";
	}
	
	
	
	

}
