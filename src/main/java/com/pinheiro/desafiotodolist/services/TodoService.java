package com.pinheiro.desafiotodolist.services;

import com.pinheiro.desafiotodolist.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;
    
}
