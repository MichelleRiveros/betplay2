package com.example.campus.modules.jugador.application;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.campus.modules.jugador.domain.Jugador;

public class RegistroJugador {
    
    public RegistroJugador(){};

    public Jugador registrarJugador(Scanner sc,  ArrayList<Jugador> listaJugador){

        System.out.println("Ingrese ID del jugador");
        int idJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese nombre del jugador");
        String nombreJugador = sc.nextLine();

        System.out.println("Ingrese apellido del jugador");
        String apellidoJugador = sc.nextLine();

        System.out.println("Ingrese edad del jugador");
        int edadJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese nacionalidad del jugador");
        String nacionalidadJugador = sc.nextLine();

        System.out.println("Ingrese dorsal del jugador");
        int dorsalJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese posicion de juego del jugador");
        String posicionDeJuegoJugador = sc.nextLine();

        System.out.println("Ingrese fecha de ingreso del jugador");
        String fechaDeingresoJugador = sc.nextLine();

        System.out.println("Ingrese goles anotados del jugador");
        int golesAnotadosJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese total tarjetas rojas del jugador");
        int tarjetasRojasJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese total tarjetas amarillas del jugador");
        int tarjetasAmarillasJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese precio del jugador");
        double precioJugador = Double.parseDouble(sc.nextLine());

        Jugador jugador1 = new Jugador(idJugador, nombreJugador, apellidoJugador, edadJugador, nacionalidadJugador, dorsalJugador, posicionDeJuegoJugador, fechaDeingresoJugador,golesAnotadosJugador,tarjetasRojasJugador, tarjetasAmarillasJugador,precioJugador);
        System.out.println("Jugador " + jugador1.getNombre() + " registrado con exito");
        return jugador1;
    }
}