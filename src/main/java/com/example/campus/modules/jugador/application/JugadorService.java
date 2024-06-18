package com.example.campus.modules.jugador.application;

import com.example.campus.modules.jugador.domain.Jugador;
import com.example.campus.modules.jugador.infrastrure.JugadorRepository;

public class JugadorService {

    private final JugadorRepository jugadorRepo; //instancia que funciona como un atributo

    public JugadorService(JugadorRepository jugadorRepo){
        this.jugadorRepo = jugadorRepo;
    }

    public void saveJugador(Jugador jugador){
        jugadorRepo.save(jugador);
    }

    


    
}
