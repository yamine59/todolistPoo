package org.example.model;

import java.util.Arrays;

public class PriorityTodo extends Todo{
    private String[] priority = {"basse","moyenne","haute"}; ;
    public PriorityTodo(int id, String name, String description) {
        super(id, name, description);
        priority = new String[]{priority[1]};

    }

    public String[] getPriority() {
        return priority;
    }

    public void setPriority(String[] priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return priority +super.toString();
    }
}
