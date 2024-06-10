package com.achievers.spingboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
    private static List<Todo> todosList = new ArrayList<>();

    private static int todosCount = 0;

    static {
        Todo todo1 = new Todo(++todosCount, "Rahul", "Learn Docker", LocalDate.now().plusMonths(6), false);
        Todo todo2 = new Todo(++todosCount, "Rahul", "Learn AI", LocalDate.now().plusMonths(8), false);
        Todo todo3 = new Todo(++todosCount, "Rahul", "Learn Python", LocalDate.now().plusMonths(10), false);

        todosList.add(todo1);
        todosList.add(todo2);
        todosList.add(todo3);
    }

    public List<Todo> findByUsername(String username) {
        return todosList;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo newTodo = new Todo(++todosCount, username, description, targetDate, done);
        todosList.add(newTodo);
    }

    public void deleteById(int id) {
        Predicate<Todo> predicate = todo -> todo.getId() == id;
        todosList.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<Todo> predicate = todo -> todo.getId() == id;
        return todosList.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todosList.add(todo);
    }
}
