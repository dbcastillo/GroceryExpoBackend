package com.groceries.restservice;

import java.util.UUID;

public class TodoItem {
    private UUID id;
    private String text;

    public TodoItem(String text) {
        this.id = UUID.randomUUID();
        this.text = text;
    }

    // Getters and setters
    public UUID getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
