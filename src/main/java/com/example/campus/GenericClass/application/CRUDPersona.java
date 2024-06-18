package com.example.campus.GenericClass.application;

import java.util.ArrayList;

import com.example.campus.modules.jugador.domain.Jugador;

public class CRUDPersona<T> {

    public CRUDPersona(){};
    
    public void agregarPersona(T jugador,  ArrayList<T> listaJugador){
        listaJugador.add(jugador);
    }
}
