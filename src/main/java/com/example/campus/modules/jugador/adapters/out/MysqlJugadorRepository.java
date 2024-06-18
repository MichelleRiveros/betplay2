package com.example.campus.modules.jugador.adapters.out;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement; //Lo que vamos a mandarle al sql lo que queremos ejecutar (LA CONSULTA) -> "SELECT * FROM pais;"
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.campus.GenericClass.adapters.out.MysqlRepository;
import com.example.campus.modules.jugador.domain.Jugador;
import com.example.campus.modules.jugador.infrastrure.JugadorRepository;


public class MysqlJugadorRepository extends MysqlRepository<Jugador> implements JugadorRepository {
    private final String url = "jdbc:mysql://localhost/betplaydb"; //LOCAL -> LA BASE DE DATOS DONDE VOY A MANDAR LOS DATOS
    private final String user = "campus2023"; //credenciales -> usuario de la base de datos
    private final String password = "campus2023";




    @Override
    public void delete(Jugador entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


    @Override
    public Jugador getById(Jugador entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }


    @Override
    public List<Jugador> getAll(Jugador entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }


    @Override
    protected Jugador mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mapResultSetToEntity'");
    }


    @Override
    protected PreparedStatement createSavPreparedStatement(Connection connection, Jugador entity) throws SQLException {
        String query = "INSERT INTO jugador (id, nombre) VALUES (?,?) "; //-> ? - Valores que se pasaran
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, entity.getId());
        preparedStatement.setString(2, entity.getNombre());
        return preparedStatement;
    }    

    
}
