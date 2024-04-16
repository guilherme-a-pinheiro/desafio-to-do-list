package com.pinheiro.desafiotodolist.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TodoDTO(
        String name,
        String description,
        boolean done,
        int priority
) {
}
