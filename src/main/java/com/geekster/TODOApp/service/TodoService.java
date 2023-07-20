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
    TodoRepo myTodos;

    public List<Todo> getAllTodos() {
        return myTodos.getMyTodos();
    }

    public List<Todo> getallDoneTodos(){
        List<Todo> done = new ArrayList<>();
        for(Todo i : myTodos.getMyTodos())
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
        for(Todo i : myTodos.getMyTodos())
        {
            if(!i.isTodoDoneStatus())
            {
                done.add(i);
            }
        }

        return done;
    }

    public void addTodos(Todo t)
    {
        myTodos.addTodos(t);
    }

    public void delTodos(Todo t)
    {
        myTodos.deleteTodos(t);
    }




}
