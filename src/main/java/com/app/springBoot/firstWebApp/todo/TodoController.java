package com.in28minutes.springBoot.firstWebApp.todo;



import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class TodoController {
	
	@Autowired
	TodoService todoService;
	@RequestMapping("/list-todos")
	public String getAllUserTodos(ModelMap model) {
		List<Todo> todos=todoService.getAllTodos("in28minutes");
		model.addAttribute("todos",todos);
		return "ListTodos";
	}
	
	@RequestMapping("/delete-todo")
	public String deleteTodo(@RequestParam int id) {
		//delete todo and then redirect it to list-todo page
		todoService.deleteById(id);
		return "redirect:list-todos";
	}
	@RequestMapping("/update-todo")
	public String deleteTodo(@RequestParam int id,ModelMap model) {
		//delete todo and then redirect it to list-todo page
		Todo todo= todoService.findById(id);
		model.addAttribute("todo", todo);
		return "add-todo";
	}
	
	@RequestMapping("/add-todo")
	public String addTodos(ModelMap model) {
		String username = (String)model.get("name");
		Todo todo = new Todo(0, username, " ", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		//return "todo";
		return "add-todo";
	}
	
	@PostMapping("/update-todo")
	public String updateTodos( ModelMap model,@Valid Todo todo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "add-todo";
		}
		todoService.updateTodos(todo);
		return "redirect:list-todos";
	}
	
	@PostMapping("/add-todo")
	public String addAllTodos( ModelMap model,@Valid Todo todo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "add-todo";
		}
		todoService.addTodos((String)model.get("name"),todo.getDescription(),todo.getTarget(), false);
		return "redirect:list-todos";
	}


}
