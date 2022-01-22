package com.ToDo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	public static List<ToDo> todos = new ArrayList<>();
	
	public static int todoCounter=2;
	
	static {
		
		todos.add(new ToDo(1,"Abhishek","SpringBoot",false));
		todos.add(new ToDo(2,"Paandu","DA",false));
		//todos.add(new ToDo(3,"Bhaina","ETL",false));
		
	}
	
	
	
	public List<ToDo> retrieveToDo(String name)
	{
		
		List<ToDo> filteredToDo=new ArrayList<>();
		for( ToDo todo:todos ) {
			if(todo.getName().equals(name))
			{
				filteredToDo.add(todo);
			}
		}
		
		return filteredToDo;
	}
	
	
	public void addToDo(int id, String name, String desc, boolean isDone) {
		
		if(todoCounter==3) {
			System.out.println("ToDo Overflow");
			return;
		}
		
		else {
			todos.add(new ToDo(id,name,desc,isDone));
			++todoCounter;
		}
		
	}
	
	

}
