package com.pinheiro.desafiotodolist.controllers;

import com.pinheiro.desafiotodolist.entities.Todo;
import com.pinheiro.desafiotodolist.entities.TodoDTO;
import com.pinheiro.desafiotodolist.services.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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


    @GetMapping(value = "/{id}")
    Todo findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    List<Todo> create(@RequestBody @Valid TodoDTO obj){
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
