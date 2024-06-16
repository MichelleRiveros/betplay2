package com.example.campus.modules.registros.domain;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.campus.modules.integranteCuerpoTecnico.application.RegistroIntegranteCuerpoTecnico;
import com.example.campus.modules.integranteCuerpoTecnico.domain.IntegranteCuerpoTecnico;
import com.example.campus.modules.jugador.application.RegistroJugador;
import com.example.campus.modules.jugador.domain.Jugador;
import com.example.campus.persona.application.CRUDPersona;

public class Registrar {

    RegistroJugador jugadores = new RegistroJugador();
    RegistroIntegranteCuerpoTecnico cuerpoTecnico = new RegistroIntegranteCuerpoTecnico();
    CRUDPersona<Jugador> agregarJugador = new CRUDPersona<Jugador>(); //Se instancia la clase Agregar persona con el parametro de jugador
    CRUDPersona<IntegranteCuerpoTecnico> agregarIntegrateCuerpoTecnico = new CRUDPersona<IntegranteCuerpoTecnico>(); 
    
    public Registrar(){};

    public void registrar(Scanner sc,  ArrayList<Jugador> listaJugador, ArrayList<IntegranteCuerpoTecnico> listaCuerpoTecnico){

        boolean flag = true;
        while (flag){

            System.out.println("1. Registrar equipo \n2. Registrar jugador \n3. Registrar integrante de cuerpo tecnico" + 
                    "\n4. Registrar integrante de cuerpo tecnico \n5. Registrar partido \n6. Salir");

            
            switch (Integer.parseInt(sc.nextLine())) {

                case 1: 
                    break;
                
                case 2:     
                    agregarJugador.agregarPersona(jugadores.registrarJugador(sc, listaJugador), listaJugador);
                    break;
                
                case 3:
                    agregarIntegrateCuerpoTecnico.agregarPersona(cuerpoTecnico.registrarIntegranteCuerpoTecnico(sc, listaCuerpoTecnico), listaCuerpoTecnico);
                    break;
                
                case 4:  
                    System.out.println("holi");
                    break;
                
                case 5:
                    System.out.println("holi");
                    break;
                
                case 6:
                    flag = false;
                    break;
            
                default:
                    break;
            }
        }
    } 

    public void hola(){
        System.out.println("lol");
    }
}