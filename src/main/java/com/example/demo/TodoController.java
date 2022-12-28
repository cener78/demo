package com.example.demo;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class TodoController {

    private final TodoRepository todoRepository;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @GetMapping("/")
    public Iterable<Todo> getTodos() {
        return todoRepository.findAll();
    }

}
