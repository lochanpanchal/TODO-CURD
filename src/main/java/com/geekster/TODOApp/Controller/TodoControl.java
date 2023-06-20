package com.geekster.TODOApp.Controller;

import com.geekster.TODOApp.Entity.Todo;
import com.geekster.TODOApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TodoControl {



    @Autowired
    TodoService todo;

       @GetMapping("todos")
    public List<Todo> getAllTodos()
    {
        return todo.getAllTodos();
    }
    @GetMapping("Todo/done")
    public List<Todo> getDoneTodos()
    {
        return todo.getallDoneTodos();
    }

    @GetMapping("Todo/pending")
    public List<Todo> notDoneTodos()
    {
        return todo.getAllNotDoneTodos();
    }
    @PostMapping("Todo")
public String addTodo(@RequestBody Todo todo)
{
    this.todo.addTodos(todo);
    return"addTodos";
}

@PutMapping("todo/status/{id}/{status}")
public String todoDone(@PathVariable Integer id , @PathVariable boolean status)
{
    for(Todo i : todo.getAllTodos())
    {
        if(i.getTodoId().equals(id))
        {
            i.setTodoDoneStatus(status);
            return "Status updated for id: "+id;
        }
    }

    return  "Todo Id not Found";
}

    @DeleteMapping("todo/delete")
    public String todoDelete(@RequestParam Integer id)
    {
        for(Todo i : todo.getAllTodos())
        {
            if(i.getTodoId().equals(id))
            {
                todo.delTodos(i);
                return "Todo deleted";
            }
        }

        return  "The Todo u want to delete does not exist";
    }

}
