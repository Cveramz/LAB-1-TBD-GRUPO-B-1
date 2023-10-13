package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;


@Repository
public class TareaImpl implements TareaRepository {

    /* Métodos de la capa de repositorio de Emergencia */
    @Autowired
    private Sql2o sql2o;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createTarea: método que guarda una tarea en la BD;
     *
     * @param tarea_in - un objeto que contiene los datos de la tarea;
     * * @return - la tarea creada y guardada en la base de datos;
     *
    -----------------------------------------------------------------------------------------------------
    @Override
    public Tarea createTarea (Tarea tarea) {
        try (Connection connection = sql2o.open()) {
            String sql = "INSERT TO tarea (idTarea,idEmergencia,idEstado_tarea,nombreTarea)"+
                    "VALUES (:idTarea, :idEmergencia, :idEstado_tarea, :nombreTarea)";
            connection.createQuery(sql, true)
                    .addParameter("idTarea", tarea.getIdTarea())
                    .addParameter("idEmergencia", tarea.getIdEmergencia())
                    .addParameter("idEstado_tarea", tarea.getIdEstado_tarea())
                    .addParameter("nombreTarea", tarea.getNombreTarea())
                    .executeUpdate();
            return tarea;
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }
---*/
    /*--------------------------------------------------------------------------------------------------------
     * getTareaById: método que obtiene una tarea específica de la BD con su id;
     *
     * @param id - id de la tarea;
     * @return - la tarea buscada;
     *
    ------------------------------------------------------------------------------------------------
    @Override
    public Tarea getTareaById(Long idTarea){
        try (Connection connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM Tarea WHERE idTarea = :idTarea")
                    .addParameter("idTarea", idTarea)
                    .executeAndFetch(Tarea.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
--------*/
    /*--------------------------------------------------------------------------------------------------------
     * findAll: método que obtiene todas las tareas de la BD;
     *
     * @return - una lista con las tareas presentes en la BD;
     *
    ------------------------------------------------------------------------------------------------
    @Override
    public List<Tarea> findAllTareas(){
        try(Connection connection = sql2o.open()){
            return connection.createQuery("SELECT * FROM Tarea ORDER BY idTarea ASC")
                    .executeAndFetch(Tarea.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }


    }
--------*/
    /*--------------------------------------------------------------------------------------------------------
     * updateTarea: método que actualiza los datos de una tarea en la BD;
     *
     * @param tareaUpdate - el objeto con el id de la tarea y los nuevos datos;
     * @return - los datos de la tarea actualizados;
     *
    ------------------------------------------------------------------------------------------------
    @Override
    public Tarea updateTarea(Tarea tareaUpdate) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("UPDATE Tarea " +
                            "SET idEmergencia =:idEmergencia, idEstado_tarea =:idEstado_tarea, nombreTarea =:nombreTarea" +
                            "WHERE idTarea =:idTarea")
                    .addParameter("idTarea", tarea.getIdTarea())
                    .addParameter("idEmergencia", tarea.getIdEmergencia())
                    .addParameter("idEstado_tarea", tarea.getIdEstado_tarea())
                    .addParameter("nombreTarea", tarea.getNombreTarea())
                    .executeUpdate();
            return Tarea;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
--------*/
    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdTarea: método que borra una tarea de la BD;
     *
     * @param id - id de la tarea a eliminar;
     *
    ---------------------------------------------------------------------------------------------------
    @Override
    public void deleteByIdTarea(Long idTarea) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("DELETE FROM Tarea WHERE idTarea =:idTarea")
                    .addParameter("idTarea", idTarea)
                    .executeUpdate();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }-----*/
}
