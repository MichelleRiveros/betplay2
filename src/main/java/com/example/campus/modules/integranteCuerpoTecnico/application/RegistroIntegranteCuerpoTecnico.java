package com.example.campus.modules.integranteCuerpoTecnico.application;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.campus.modules.integranteCuerpoTecnico.domain.IntegranteCuerpoTecnico;
import com.example.campus.modules.jugador.domain.Jugador;

public class RegistroIntegranteCuerpoTecnico {

    public RegistroIntegranteCuerpoTecnico(){}

    public IntegranteCuerpoTecnico registrarIntegranteCuerpoTecnico(Scanner sc, ArrayList<IntegranteCuerpoTecnico> lista){

        System.out.println("Ingrese ID del integrante del Cuerpo Tecnico");
        int idIntegrante = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese nombre del integrante del Cuerpo Tecnico");
        String nombreIntegrante = sc.nextLine();

        System.out.println("Ingrese apellido del integrante del Cuerpo Tecnico");
        String apellidoIntegrante = sc.nextLine();

        System.out.println("Ingrese edad del integrante del Cuerpo Tecnico");
        int edadIntegrante = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese nacionalidad del integrante del Cuerpo Tecnico");
        String nacionalidadIntegrante = sc.nextLine();

        System.out.println("Ingrese rol del integrante del Cuerpo Tecnico");
        String rolIntegrante =sc.nextLine();

        IntegranteCuerpoTecnico integranteCuerpoTecnico1 = new IntegranteCuerpoTecnico(idIntegrante, nombreIntegrante, apellidoIntegrante, edadIntegrante, nacionalidadIntegrante, rolIntegrante);
        System.out.println("Integrante " + integranteCuerpoTecnico1.getNombre() + " registrado con exito");
        return integranteCuerpoTecnico1;


    }
    
}
