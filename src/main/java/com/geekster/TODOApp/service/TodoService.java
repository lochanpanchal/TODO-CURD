package com.geekster.TODOApp.service;

import com.geekster.TODOApp.Entity.Todo;
import com.geekster.TODOApp.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //This is also  a component for the Business logic
public class TodoService {
    @Autowired
    TodoRepo todoRepo;

    public List<Todo> getAllTodos() {
        return todoRepo.getMyTodos();
    }

    public List<Todo> getallDoneTodos(){
        List<Todo> done = new ArrayList<>();
        for(Todo i : todoRepo.getMyTodos())
        {
            if(i.isTodoDoneStatus())
            {
                done.add(i);
            }
        }

        return done;
    }

    public List<Todo> getAllNotDoneTodos(){
        List<Todo> done = new ArrayList<>();
        for(Todo i : todoRepo.getMyTodos())
        {
            if(!i.isTodoDoneStatus())
            {
                done.add(i);
            }
        }

        return done;
    }

    public String addTodos(Todo t)
    {
        todoRepo.addTodos(t);
        return "New Todo Added";
    }

    public void delTodos(Todo t)
    {
        todoRepo.deleteTodos(t);
    }


    public String updateTodoStatus(Integer id, boolean status) {

        for(Todo i : getAllTodos())
        {
            if(i.getTodoId().equals(id))
            {
                i.setTodoDoneStatus(status);
                return "Status updated for id: "+id;
            }
        }

        return  "Todo Id not Found";
    }

    public String removeTodo(Integer id) {
        for(Todo i : getAllTodos())
        {
            if(i.getTodoId().equals(id))
            {
                delTodos(i);
                return "Todo deleted";
            }
        }

        return  "The Todo u want to delete does not exist";
    }
}
