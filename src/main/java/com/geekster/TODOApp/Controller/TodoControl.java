package com.geekster.TODOApp.Controller;

import com.geekster.TODOApp.Entity.Todo;
import com.geekster.TODOApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TodoControl {



    @Autowired
    TodoService todoService;

    @GetMapping("todos")
    public List<Todo> getAllTodos()
    {
        return todoService.getAllTodos();
    }
    @GetMapping("Todo/done")
    public List<Todo> getDoneTodos()
    {
        return todoService.getallDoneTodos();
    }

    @GetMapping("Todo/pending")
    public List<Todo> notDoneTodos()
    {
        return todoService.getAllNotDoneTodos();
    }

    @PostMapping("Todo")
    public String addTodo(@RequestBody Todo todo) {return todoService.addTodos(todo);}

    @PutMapping("todo/status/{id}/{status}")
    public String updateTodoStatus(@PathVariable Integer id , @PathVariable boolean status)
    {
     return todoService.updateTodoStatus(id,status);
    }
    @DeleteMapping("todo/delete")
    public String removeTodo(@RequestParam Integer id)
    {
        return todoService.removeTodo(id);
    }

}
