package org.example.model;

public class Todo {


    private String name;
    private String description;
    private boolean done;
    private static int id;
    public Todo(String name, String description) {
        id++;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return id+"- Todo :"+name+"\nStatus :"+ done+"\n"+description;
    }
}
