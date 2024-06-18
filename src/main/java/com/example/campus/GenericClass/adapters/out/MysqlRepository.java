package com.example.campus.GenericClass.adapters.out;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement; //Lo que vamos a mandarle al sql lo que queremos ejecutar (LA CONSULTA) -> "SELECT * FROM pais;"
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.campus.GenericClass.infrastructure.PersonaRepository;

public abstract class MysqlRepository<T> implements PersonaRepository<T> {

    private final String url = "jdbc:mysql://localhost/betplaydb"; //LOCAL -> LA BASE DE DATOS DONDE VOY A MANDAR LOS DATOS
    private final String user = "campus2023"; //credenciales -> usuario de la base de datos
    private final String password = "campus2023";
    
    protected abstract T mapResultSetToEntity(ResultSet resultSet) throws SQLException; 
    protected abstract PreparedStatement createSavPreparedStatement(Connection connection, T entity) throws SQLException;

    /*protected -> quiere decir que solamente los elementos de su mismo paquete o paquetes inferiores pueden acceder a el metodo
      abstract -> aglo que no se instancia, si no 
      T -> tipo de dato que va a retornar
      mapResultSetToEntity -> Buscar coincidencias entre los campos para convertir a objetos
      throws -> cuando hay errores que nos va a lanzar (SQLException)
      
      
     executeUpdate() - dml (data managment lenguage) -> Actualizar, borrar y guardar

      Select id, nombre from pais -> result 1, colombia -> */

    @Override

    public void save(T entity){
        try (Connection connection = DriverManager.getConnection(url, user, password)){
            PreparedStatement statement = createSavPreparedStatement(connection, entity);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); //imprimir la excepcion
        }
    }    

    
}


