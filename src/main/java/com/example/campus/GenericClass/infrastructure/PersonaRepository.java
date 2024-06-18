package com.example.campus.GenericClass.infrastructure;

import java.util.List;

public interface PersonaRepository<T> {
    void save(T entity); //agregar
    void delete(T entity); //eliminar
    T getById(T entity); //obtener por id
    List<T> getAll(T entity); //obtener todos
}
