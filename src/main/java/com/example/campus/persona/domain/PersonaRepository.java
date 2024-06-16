package com.example.campus.persona.domain;

import java.util.ArrayList;


public interface PersonaRepository<T> {
    void agregar(T persona,  ArrayList<T> lista);   
}
