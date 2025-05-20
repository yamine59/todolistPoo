package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoServiceImplV2 implements TodoService{

    private static int c =0;

    private Map<Integer, Todo> todos = new HashMap<>();
    @Override
    public List<Todo> getAll() {
        return new ArrayList<>(todos.values());

    }

    @Override
    public Todo getById(int id) {
        return todos.get(id);
    }

    @Override
    public void add(String name, String description) {
        todos.put(c,new Todo(c,name,description));
        c++;
    }

    @Override
    public void update(int id, String name, String description, boolean done) {
        Todo todoToUpdate = getById(id);
        todoToUpdate.setName(name);
        todoToUpdate.setDescription(description);
        todoToUpdate.setDone(done);

    }

    @Override
    public void remove(int id) {
        todos.remove(id);
    }

    @Override
    public void toggleDone(int id) {
        getById(id).setDone(!getById(id).isDone());

    }
}
