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

        List<Jugador> loadJugadores(); //Metodo para leer la lista del tipo Jugador
        void saveJugador(List<Jugador> elementos); //elementos es una lista (List<Jugador>) de todos los objetos que se desean guardar.
        void createJugador(Jugador elemento); //elemento es el objeto de tipo Jugador que se desea agregar.
        void updateJugador(Jugador elemento); //actualizar
        void delateJugador(int id); //eliminar
        Jugador getById(int id);

}
