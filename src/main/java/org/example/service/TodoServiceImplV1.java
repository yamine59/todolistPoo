package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImplV1 implements TodoService{

    private static int c =1;

    List<Todo> todos = new ArrayList<>();
    @Override
    public List<Todo> getAll() {
        return todos;
    }

    @Override
    public Todo getById(int id) {
        for (Todo todo:todos){
            if (todo.getId() == id){
                return todo;
            }
        }
        return null;
    }

    @Override
    public void add(String name, String description) {
        todos.add(new Todo(c++,name,description));

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
