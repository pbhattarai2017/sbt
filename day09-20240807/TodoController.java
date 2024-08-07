package com.example.sbtraining;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TodoController {

	List<String> todoList = new ArrayList<>();

	@GetMapping("/")
	public String showTodos(Model model) {
		model.addAttribute("todos", todoList);
		return "todo";
	}

	@GetMapping("/add/{newtodo}")
	public String addTodo(@PathVariable("newtodo") String newtodo, Model model) {
		todoList.add(newtodo);

		return showTodos(model);
	}

}
