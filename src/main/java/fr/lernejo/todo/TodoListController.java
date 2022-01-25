package fr.lernejo.todo;

import fr.lernejo.todo.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {
    private ArrayList<Todo> repository = new ArrayList<Todo>();

    @GetMapping("/api/todo")
    public ArrayList<Todo> GetTodoList() {
        return repository;
    }

    @PostMapping("/api/todo")
    public void PostTodo(@RequestBody Todo todo){
        repository.add(todo);
    }
}


