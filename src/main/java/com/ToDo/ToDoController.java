package com.ToDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {

	@Autowired
	ToDoService todoservice;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String listToDos(ModelMap model) {
		
		String name=(String)model.get("name");
		model.put("todos", todoservice.retrieveToDo(name));
		
		return "list-todos.jsp";
		
	}
	
	
	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
	public String addMethod() {
		return "add-todo.jsp";
	}
	

	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
	public String addToDo(@RequestParam String desc, ModelMap model) {

				
			todoservice.todos.add(new ToDo(3,"Bhaina",desc,false));
			System.out.println("Added");
			return "redirect:/list-todos";
		
	}
	
	
	
}
