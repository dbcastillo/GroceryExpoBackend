package com.groceries.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoItemController {

    @Autowired
    private TodoItemService todoItemService;

    @GetMapping
    public List<TodoItem> getTodos() {
        return todoItemService.getAllTodos();
    }

    @PostMapping
    public void addTodo(@RequestBody String text) {

    }
}
