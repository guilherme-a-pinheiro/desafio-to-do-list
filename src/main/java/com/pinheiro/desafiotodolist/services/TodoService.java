package com.pinheiro.desafiotodolist.services;

import com.pinheiro.desafiotodolist.entities.Todo;
import com.pinheiro.desafiotodolist.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> create(Todo todo){
        repository.save(todo);
        return findAll();
    }

    public List<Todo> findAll(){
        Sort sort = Sort.by("prority").descending().and(
                Sort.by("name").ascending()
        );
        return repository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        repository.save(todo);
        return findAll();
    }

    public List<Todo> delete(Long id){
        repository.deleteById(id);
        return findAll();
    }
}
