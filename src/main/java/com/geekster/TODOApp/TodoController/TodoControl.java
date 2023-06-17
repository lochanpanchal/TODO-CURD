package com.geekster.TODOApp.TodoController;

import com.geekster.TODOApp.Entity.TOdo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TodoControl {

    private List<TOdo> myTodos;

       public TodoControl(){
           myTodos = new ArrayList<>();
       }

       @GetMapping("todos")
    public List<TOdo> getAllTodos()
    {
        return myTodos;
    }
    @GetMapping("Todo/done")
    public List<TOdo> getDoneTodos()
    {
        List<TOdo> done = new ArrayList<>();
        for(TOdo i : myTodos)
        {
            if(i.isTodoDoneStatus())
            {
                done.add(i);
            }
        }

        return done;
    }

    @GetMapping("Todo/pending")
    public List<TOdo> notDoneTodos()
    {
        List<TOdo> done = new ArrayList<>();
        for(TOdo i : myTodos)
        {
            if(!i.isTodoDoneStatus())
            {
                done.add(i);
            }
        }

        return done;
    }
    @PostMapping("Todo")
public String addTodo(@RequestBody TOdo todo)
{
    myTodos.add(todo);
    return"addTodos";
}

@PutMapping("todo/status/{id}/{status}")
public String todoDone(@PathVariable Integer id , @PathVariable boolean status)
{
    for(TOdo i : myTodos)
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
        for(TOdo i : myTodos)
        {
            if(i.getTodoId().equals(id))
            {
                myTodos.remove(i);
                return "Todo deleted";
            }
        }

        return  "The Todo u want to delete does not exist";
    }

}
