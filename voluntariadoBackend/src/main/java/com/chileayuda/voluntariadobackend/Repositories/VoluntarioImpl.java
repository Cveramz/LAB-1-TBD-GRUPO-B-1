package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Voluntario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;


@Repository
public class VoluntarioRepositoryImpl implements VoluntarioRepository {

    /* Métodos de la capa de repositorio de Emergencia */
    @Autowired
    private Sql2o sql2o;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createVol: metodo que guarda un voluntario en la BD;
     *
     * @param vol_in - un objeto que contiene los datos del voluntario;
     * * @return - el voluntario creado y guardado en la base de datos;
     *
      --------------------------------------------------------------------------------------------------------*/
    @Override
    public Voluntario createVol (Voluntario voluntario) {
        try (Connection connection = sql2o.open()) {
            String sql = "INSERT TO voluntario (idVoluntario,nombreVoluntario,edad,equipamiento,estado_salud,disponibilidad,emailVoluntario,passwordVoluntario)"+
                    "VALUES (:idVoluntario, :nombreVoluntario, :edad, :estado_salud, :disponibilidad, :emailVoluntario, :passwordVoluntario)";
            connection.createQuery(sql, true)
                    .addParameter("idVoluntario", voluntario.getIdVoluntario())
                    .addParameter("nombreVoluntario", voluntario.getNombreVoluntario())
                    .addParameter("edad",voluntario.getEdad())
                    .addParameter("estado_salud", voluntario.getEstado_salud())
                    .addParameter("Disponibilidad", voluntario.getDisponibilidad())
                    .addParameter("emailVoluntario", voluntario.getEmailVoluntario())
                    .addParameter("passwordVoluntario", voluntario.getPasswordVoluntario())
                    .executeUpdate();
            return voluntario;
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * getVolById: metodod que obtiene un voluntario especifico de la BD con su id;
     *
     * @param id_inst - id del voluntario;
     * @return - el voluntario buscado;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Voluntario getVolById(Long idVoluntario){
        try (Connection connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM Voluntario WHERE idVoluntario = :idVoluntario")
                    .addParameter("idVoluntario", idVoluntario)
                    .executeAndFetch(Voluntario.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAll: metodo que obtiene todos los voluntarios de la BD;
     *
     * @return - una lista con los voluntarios presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public List<Voluntario> findAllVoluntarios(){
        try(Connection connection = sql2o.open()){
            return connection.createQuery("SELECT * FROM Voluntario ORDER BY idVoluntario ASC")
                    .executeAndFetch(Voluntario.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }


    }

    /*--------------------------------------------------------------------------------------------------------
     * updateVol: metodo que actualiza los datos de un voluntario en la BD;
     *
     * @param instUpdate - el objeto con el id del voluntario y los nuevos datos;
     * @return - los datos del voluntario actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Voluntario updateVol(Voluntario voluntarioUpdate) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("UPDATE Voluntario " +
                            "SET nombreVoluntario =:nombreVoluntario, edad =:edad, estado_salud =:estado_salud, disponibilidad =:disponibilidad, emailVoluntario =:emailVoluntario, passwordVoluntario =:passwordVoluntario" +
                            "WHERE idVoluntario =:idVoluntario")
                    .addParameter("idVoluntario", voluntario.getIdVoluntario())
                    .addParameter("nombreVoluntario", voluntario.getNombreVoluntario())
                    .addParameter("edad",voluntario.getEdad())
                    .addParameter("estado_salud", voluntario.getEstado_salud())
                    .addParameter("Disponibilidad", voluntario.getDisponibilidad())
                    .addParameter("emailVoluntario", voluntario.getEmailVoluntario())
                    .addParameter("passwordVoluntario", voluntario.getPasswordVoluntario())
                    .executeUpdate();
            return voluntario;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }


    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdVol: metodo que borra un voluntario de la BD;
     *
     * @param id - id del voluntario a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public void deleteByIdVol(Long idVoluntario) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("DELETE FROM Voluntario WHERE idVoluntario =:idVoluntario")
                    .addParameter("idVoluntario", idVoluntario)
                    .executeUpdate();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
