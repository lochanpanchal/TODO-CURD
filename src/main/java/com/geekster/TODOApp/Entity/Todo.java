package com.geekster.TODOApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todo {

    private Integer todoId; //we can use int too
    private String name;

    private boolean isTodoDoneStatus;


    }

