package com.achievers.spingboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todosList = new ArrayList<>();

    static {
        Todo todo1 = new Todo(1, "Rahul", "Learn Docker", LocalDate.now().plusMonths(6), false);
        Todo todo2 = new Todo(2, "Rahul", "Learn AI", LocalDate.now().plusMonths(8), false);
        Todo todo3 = new Todo(3, "Rahul", "Learn Python", LocalDate.now().plusMonths(10), false);

        todosList.add(todo1);
        todosList.add(todo2);
        todosList.add(todo3);
    }

    public List<Todo> findByUsername(String username) {
        return todosList;
    }
}
