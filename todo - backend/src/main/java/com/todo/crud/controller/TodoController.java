package com.todo.crud.controller;

import com.todo.crud.entity.Todo;
import com.todo.crud.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("all")
    public Iterable<Todo> allData() {
        return service.all();
    }

    @GetMapping("get/{id}")
    public Todo get(@PathVariable Integer id) {
        return service.get(id);
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PostMapping("save")
    public String save(@Valid @RequestBody Todo todo){
        return service.addOrUpdate(todo);
    }

}
