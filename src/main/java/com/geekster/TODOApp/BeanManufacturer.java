package com.geekster.TODOApp;

import com.geekster.TODOApp.Entity.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration //Multiple beans
public class BeanManufacturer {

    @Bean
    public List<Todo> getTodos( ){
        return new ArrayList<>();
    }
}
