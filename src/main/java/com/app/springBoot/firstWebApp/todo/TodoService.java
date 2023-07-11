package com.in28minutes.springBoot.firstWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount=0;
	static {
		todos.add(new Todo(++todoCount, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "in28minutes", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCount, "in28minutes", "Full Stack Development", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(++todoCount, "in28minutes", "AZURE", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "in28minutes", "KEFKA", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCount, "in28minutes", "MEAN STACK", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(++todoCount, "in28minutes", "KUBERNETES", LocalDate.now().plusYears(3), false));
	}
	public List<Todo> getAllTodos(String username){
		return todos;
	}
	public void addTodos(String name,String Description,LocalDate target,boolean done) {
		Todo todo=new Todo(++todoCount,name,Description,target,done);
		todos.add(todo);
		}
	public void deleteById(int id) {
		Predicate<? super Todo> predicate =todo->todo.getId()==id;
		todos.removeIf(predicate);
	}
	public Todo findById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate =todo->todo.getId()==id;
		Todo todo= todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
	public void updateTodos(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteById(todo.getId());
		todos.add(todo);
		
	}

}
