package com.todo.crud.repository;

import com.todo.crud.entity.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo , Integer> {
}
