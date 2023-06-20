package com.geekster.TODOApp.repository;

import com.geekster.TODOApp.Entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //This is also A component but for the Data source
public class TodoRepo {

    @Autowired
    private List<Todo> myTodos;

    public List<Todo> getMyTodos() {
        return myTodos;
    }

    public void addTodos(Todo t){myTodos.add(t);}

    public void deleteTodos(Todo t){
        myTodos.remove(t);
    }
}
