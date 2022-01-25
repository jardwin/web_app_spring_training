package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {
    private TodoRepository repository;

    public TodoListController(TodoRepository todoRepository){
        repository = todoRepository;
    }

    @GetMapping("/api/todo")
    public Iterable<TodoEntity> GetTodoList() {
        return repository.findAll();
    }

    @PostMapping("/api/todo")
    public void PostTodo(@RequestBody TodoEntity todo){
        repository.save(todo);
    }
}


