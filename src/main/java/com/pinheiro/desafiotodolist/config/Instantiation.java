package com.pinheiro.desafiotodolist.config;

import com.pinheiro.desafiotodolist.entities.Todo;
import com.pinheiro.desafiotodolist.entities.TodoDTO;
import com.pinheiro.desafiotodolist.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {


    @Autowired
    private TodoRepository repository;

    public void run(String... args) {
        repository.deleteAll();

        TodoDTO dto1 = new TodoDTO("Ir ao mercado", "Fazer a compra da semana no mercado perto de casa", false, 2);
        Todo t1 = new Todo(dto1);
        repository.save(t1);
    }
}
