package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Coordinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;


@Repository
public class CoordinadorRepositoryImpl implements CoordinadorRepository {

    /* Métodos de la capa de repositorio de Emergencia */
    @Autowired
    private Sql2o sql2o;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createCoordinador: método que guarda un coordinador en la BD;
     *
     * @param coordinador_in - un objeto que contiene los datos del coordinador;
     * * @return - el coordinador creado y guardado en la base de datos;
     *
    --------------------------------------------------------------------------------------------------------*/
    @Override
    public Coordinador createCoordinador (Coordinador coordinador_in) {
        try (Connection connection = sql2o.open()) {
            String sql = "INSERT TO coordinador_in (id,nombre,email,password)"+
                    "VALUES (:id, :nombre, :email, :password)";
            connection.createQuery(sql, true)
                    .addParameter("id", coordinador_in.getId())
                    .addParameter("nombre", coordinador_in.getNombre())
                    .addParameter("email", coordinador_in.getEmail())
                    .addParameter("password", coordinador_in.getPassword())
                    .executeUpdate();
            return coordinador_in;
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * getCoordinadorById: método que obtiene un coordinador específico de la BD con su id;
     *
     * @param id - id del coordinador;
     * @return - el coordinador buscado;
     *
    --------------------------------------------------------------------------------------------------------*/
    @Override
    public Coordinador getCoordinadorById(Long id){
        try (Connection connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM Coordinador WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetch(Coordinador.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAll: método que obtiene todos los coordinadores de la BD;
     *
     * @return - una lista con los coordinadores presentes en la BD;
     *
    --------------------------------------------------------------------------------------------------------*/
    @Override
    public List<Coordinador> findAll(){
        try(Connection connection = sql2o.open()){
            return connection.createQuery("SELECT * FROM Coordinador ORDER BY id ASC")
                    .executeAndFetch(Coordinador.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }


    }

    /*--------------------------------------------------------------------------------------------------------
     * updateCoordinador: método que actualiza los datos de un coordinador en la BD;
     *
     * @param coordinadorUpdate - el objeto con el id del coordinador y los nuevos datos;
     * @return - los datos del coordinador actualizados;
     *
    --------------------------------------------------------------------------------------------------------*/
    @Override
    public Coordinador updateCoordinador(Coordinador coordinadorUpdate) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("UPDATE Coordinador " +
                                    "SET nombre =:nombre, email =:email, password =:password" +
                                    "WHERE id =:id")
                    .addParameter("id", coordinador_in.getId())
                    .addParameter("nombre", coordinador_in.getNombre())
                    .addParameter("email", coordinador_in.getEmail())
                    .addParameter("password", coordinador_in.getPassword())
                    .executeUpdate();
            return Coordinador;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdCoordinador: método que borra un coordinador de la BD;
     *
     * @param id - id del coordinador a eliminar;
     *
    --------------------------------------------------------------------------------------------------------*/
    @Override
    public void deleteByIdCoordinador(Long id) {
       try(Connection connection = sql2o.open()) {
           connection.createQuery("DELETE FROM Coordinador WHERE id =:id")
                   .addParameter("id", id)
                   .executeUpdate();
       } catch (Exception exception) {
           System.out.println(exception.getMessage());
       }
    }
}

