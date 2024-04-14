package com.pinheiro.desafiotodolist.repositories;

import com.pinheiro.desafiotodolist.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
