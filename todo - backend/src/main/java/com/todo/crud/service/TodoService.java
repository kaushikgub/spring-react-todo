package com.todo.crud.service;

import com.todo.crud.entity.Todo;
import com.todo.crud.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    public String addOrUpdate(Todo todo){
    	if(todo.getDescription() == null) {
    		todo.setDescription("No Description");
    	}
        repository.save(todo);
        return "Saved Successfully";
    }

    public Iterable<Todo> all() {
        return repository.findAll();
    }

    public Todo get(Integer id) {
        return repository.findById(id).get();
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
