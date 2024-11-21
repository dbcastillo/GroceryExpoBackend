package com.groceries.restservice;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoItemService {
    private List<TodoItem> todos = new ArrayList<>();

    public TodoItemService() {
        todos.add(new TodoItem("Milk"));
        todos.add(new TodoItem("Eggs"));
        todos.add(new TodoItem("Bread"));
        todos.add(new TodoItem("Whatever"));
    }

    public List<TodoItem> getAllTodos() {
        return todos;
    }

    public void addTodo(String text) {
        todos.add(new TodoItem(text));
    }

}
