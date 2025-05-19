package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl implements TodoService{

    private static int c =1;

    List<Todo> todos = new ArrayList<>();
    @Override
    public List<Todo> getAll() {
        return todos;
    }

    @Override
    public Todo getById(int id) {
        return todos.get(id);
    }

    @Override
    public void add(String name, String description) {
        todos.add(new Todo(c++,name,description));


    }

    @Override
    public void update(int id, String name, String description, boolean done) {
        todos.set(id,new Todo(id,name,description));


    }

    @Override
    public void remove(int id) {
        todos.remove(id);
    }

    @Override
    public void toggleDone(int id) {
        for (Todo todo:todos){
            if (todo.getId() == id){
                todo.setDone(!todo.isDone());
            }

        }

    }
}
