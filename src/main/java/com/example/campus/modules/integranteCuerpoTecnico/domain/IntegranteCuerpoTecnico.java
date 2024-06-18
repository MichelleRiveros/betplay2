package com.example.campus.modules.integranteCuerpoTecnico.domain;

import com.example.campus.GenericClass.domain.Persona;

public class IntegranteCuerpoTecnico extends Persona {
    private String rol;

    public IntegranteCuerpoTecnico(){}

    public IntegranteCuerpoTecnico(int id, String nombre, String apellido, int edad, String nacionalidad, String rol){
        super(id, nombre, apellido, edad, nacionalidad);
        this.rol = rol;
   }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}