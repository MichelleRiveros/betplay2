package com.example.campus.modules.jugador.domain;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;


//Se define los metodos y funciones que se van a implementar con la clase jugador

public interface JugadorRepository {
        void agregar(Jugador persona,  ArrayList<Jugador> lista);   

}
