package com.example.campus.modules.jugador.adapters.in;

import java.util.Scanner;

import com.example.campus.modules.jugador.application.JugadorService;

public class JugadorConsoleAdapter {

    private final JugadorService jugadorService; //instancia de la clase jugador

    public JugadorConsoleAdapter(JugadorService jugadorService){
        this.jugadorService = jugadorService;
    };

    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Actu juga 2. eliminar juga");

        jugadorService.saveJugador(null);
    }

    // * 

    
}
