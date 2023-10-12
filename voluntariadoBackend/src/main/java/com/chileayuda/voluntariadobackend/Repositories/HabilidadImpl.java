package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Habilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;


@Repository
public class HabilidadRepositoryImpl implements HabilidadRepository {

    /* Métodos de la capa de repositorio de Emergencia */
    @Autowired
    private Sql2o sql2o;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createHabilidad: método que guarda una habilidad en la BD;
     *
     * @param habilidad - un objeto que contiene los datos de la habilidad;
     * @return - la habilidad creada y guardada en la base de datos;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Habilidad createHabilidad (Habilidad habilidad) {
        try (Connection connection = sql2o.open()) {
            String sql = "INSERT TO habilidad (idHabilidad,nombreHabilidad)"+
                    "VALUES (:idHabilidad, :nombreHabilidad)";
            connection.createQuery(sql, true)
                    .addParameter("idHabilidad", habilidad.getIdHabilidad())
                    .addParameter("nombreHabilidad", habilidad.getNombreHabilidad())
                    .executeUpdate();
            return habilidad;
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * getHabilidadById: método que obtiene una habilidad específica de la BD con su id;
     *
     * @param id - id de la habilidad;
     * @return - la habilidad buscada;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Habilidad getHabilidadById(Long idHabilidad){
        try (Connection connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM Habilidad WHERE idHabilidad = :idHabilidad")
                    .addParameter("idHabilidad", idHabilidad)
                    .executeAndFetch(Habilidad.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAllHabilidades: método que obtiene todas las habilidades de la BD;
     *
     * @return - una lista con las habilidades presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public List<Habilidad> findAllHabilidades(){
        try(Connection connection = sql2o.open()){
            return connection.createQuery("SELECT * FROM Habilidad ORDER BY idHabilidad ASC")
                    .executeAndFetch(Habilidad.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateHabilidad: método que actualiza los datos de una habilidad en la BD;
     *
     * @param habilidadUpdate - el objeto con el id de la habilidad y los nuevos datos;
     * @return - los datos de la habilidad actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Habilidad updateHabilidad(Habilidad habilidadUpdate) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("UPDATE Habilidad " +
                            "SET nombreHabilidad =:nombreHabilidad" +
                            "WHERE idHabilidad =:idHabilidad")
                    .addParameter("idHabilidad", habilidadUpdate.getIdHabilidad())
                    .addParameter("nombreHabilidad", habilidadUpdate.getNombreHabilidad())
                    .executeUpdate();
            return Habilidad;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteHabilidadById: método que borra una habilidad de la BD;
     *
     * @param id - id de la habilidad a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public void deleteByIdHabilidad(Long idHabilidad) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("DELETE FROM Habilidad WHERE idHabilidad =:idHabilidad")
                    .addParameter("idHabilidad", idHabilidad)
                    .executeUpdate();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

