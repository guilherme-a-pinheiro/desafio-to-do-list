package com.pinheiro.desafiotodolist.services;

import com.pinheiro.desafiotodolist.entities.Todo;
import com.pinheiro.desafiotodolist.entities.TodoDTO;
import com.pinheiro.desafiotodolist.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> findAll(){
        Sort sort = Sort.by("priority").descending().and(
                Sort.by("name").ascending()
        );
        return repository.findAll(sort);
    }

    public Todo findById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public List<Todo> create(TodoDTO dto){
        Todo t1 = new Todo(dto);
        repository.save(t1);
        return findAll();
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
