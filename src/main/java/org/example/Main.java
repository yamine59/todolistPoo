package org.example;


import org.example.ihm.Ihm;
import org.example.service.TodoService;
import org.example.service.TodoServiceImpl;
import org.example.service.TodoServiceImplV2;


public class Main {
    public static void main(String[] args) {
        TodoService service = new TodoServiceImplV2(); // remplacer null par une instanciation d'une classe respectant l'interface TodoService
        Ihm ihm = new Ihm(service);
        ihm.start();

    }
}