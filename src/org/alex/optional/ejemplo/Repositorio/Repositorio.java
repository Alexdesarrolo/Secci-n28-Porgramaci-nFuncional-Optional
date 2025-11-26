package org.alex.optional.ejemplo.Repositorio;

import org.alex.optional.ejemplo.model.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);
}
