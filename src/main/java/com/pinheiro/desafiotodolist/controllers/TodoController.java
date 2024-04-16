package com.pinheiro.desafiotodolist.controllers;

import com.pinheiro.desafiotodolist.entities.Todo;
import com.pinheiro.desafiotodolist.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping
    List<Todo> findAll(){
        return service.findAll();
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo obj){
        service.create(obj);
        return findAll();
    }

    @DeleteMapping(value = "/{id}")
    List<Todo> delete(@PathVariable Long id){
        service.delete(id);
        return findAll();
    }

    @PutMapping()
    List<Todo> update(@RequestBody Todo obj){
        service.update(obj);
        return findAll();
    }

}
