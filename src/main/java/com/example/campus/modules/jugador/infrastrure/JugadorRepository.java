package com.example.campus.modules.jugador.infrastrure;
import java.util.List;

import com.example.campus.GenericClass.infrastructure.PersonaRepository;
import com.example.campus.modules.jugador.domain.Jugador;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;




//Se define los metodos y funciones que se van a implementar con la clase jugador

public interface JugadorRepository extends PersonaRepository<Jugador>{

}