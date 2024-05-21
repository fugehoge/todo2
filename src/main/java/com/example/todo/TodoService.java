package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private final TodoRepository repository;
	
	@Autowired
	public TodoService(TodoRepository repository) {
		this.repository = repository;
	}
	
	public Iterable<Todo> getAllTodos(){
		return repository.findAll();
	}
	
    public Todo saveToDo(Todo title) {
        return repository.save(title);
    }
    
    public void displayTodos() {
    	Iterable<Todo> todos =getAllTodos();
    	
    	for(Todo todo:todos) {
    		System.out.println(todo.getTitle());
    	}
    }

}