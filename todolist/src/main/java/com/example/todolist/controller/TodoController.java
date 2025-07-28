package com.example.todolist.controller;

import com.example.todolist.model.Todo;
import com.example.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from react frontend
@RequestMapping("/api/todos")
public class TodoController {
    
    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getTodos()
    {
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo)
    {
        return todoService.addTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id)
    {
        todoService.deleteTodo(id);
    }

    @PutMapping
    public Todo updateTodo(@RequestBody Todo todo)
    {
        return todoService.updateTodo(todo);
    }

}
