package com.example.todolist.service;

import com.example.todolist.model.Todo;
import com.example.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos()
    {
        return todoRepository.findAll();
    }

    public Todo addTodo(Todo todo)
    {
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id)
    {
        todoRepository.deleteById(id);
    }

    public Todo updateTodo(Todo todo)
    {
        return todoRepository.save(todo);
    }
}
