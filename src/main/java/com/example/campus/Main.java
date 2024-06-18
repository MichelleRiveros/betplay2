package com.example.campus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.campus.modules.integranteCuerpoTecnico.domain.IntegranteCuerpoTecnico;
import com.example.campus.modules.jugador.adapters.in.JugadorConsoleAdapter;
import com.example.campus.modules.jugador.adapters.out.MysqlJugadorRepository;
import com.example.campus.modules.jugador.application.JugadorService;
import com.example.campus.modules.jugador.domain.Jugador;
import com.example.campus.modules.registros.domain.Registrar;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Jugador> jugadoresDeFutbol = new ArrayList<>(); //Se crea una ArrayList Gobal para los jugadores
        ArrayList<IntegranteCuerpoTecnico> integrantesCuerpoTecnico = new ArrayList<>();
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        Registrar registrar = new Registrar();


        boolean flag = true;

        while (flag) {

            System.out.println("Bienvedio a BetPlay \nIngrese la opcion a la que desea ingresar: \n1. Registros \n2. "+
                            "\n3.  \n4.  \n5.  \n6. Salir");
            int opc = sc.nextInt();
            sc.nextLine();


            switch (opc) {
                case 1:
                    registrar.registrar(sc,jugadoresDeFutbol, integrantesCuerpoTecnico);
                    break;

                case 2:
                    MysqlJugadorRepository mysqlJugador = new MysqlJugadorRepository();
                    JugadorService jugadorService = new JugadorService(mysqlJugador);
                    JugadorConsoleAdapter consoleAdapter = new JugadorConsoleAdapter(jugadorService);
                    break;

                default:
                    System.out.println("Error de opcion");
            }
        }  
        
    }
}