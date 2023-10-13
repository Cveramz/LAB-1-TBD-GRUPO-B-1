package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Emergencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
@Repository
public class EmergenciaImpl implements EmergenciaRepository {

    /* Métodos de la capa de repositorio de Emergencia */
    @Autowired
    private Sql2o sql2o;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createEmergencia: método que guarda una emergencia en la BD;
     *
     * @param emergencia_in - un objeto que contiene los datos de la emergencia;
     * * @return - la emergencia creada y guardada en la base de datos;
     *
    --------------------------------------------------------------------------------------------------------
    @Override
    public Emergencia createEmergencia (Emergencia emergencia_in) {
        try (Connection connection = sql2o.open()) {
            String sql = "INSERT TO emergencia_in (idEmergencia,idInstitucion, tipo,ubicacion,equipamiento_necesario)" +
                    "VALUES (:idEmergencia, :idInstitucion, :tipo, :ubicacion, :equipamiento_necesario)";
            connection.createQuery(sql, true)
                    .addParameter("idEmergencia", emergencia_in.getIdEmergencia())
                    .addParameter("idInstitucion", emergencia_in.getIdInstitucion())
                    .addParameter("tipo", emergencia_in.getTipo())
                    .addParameter("ubicacion", emergencia_in.getUbicacion())
                    .addParameter("equipamiento_necesario", emergencia_in.getEquipamiento_necesario())
                    .executeUpdate();
            return coordinador_in;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
*/
    /*--------------------------------------------------------------------------------------------------------
     * getEmergenciaById: método que obtiene una emergencia específica de la BD con su id;
     *
     * @param id - id de la emergencia;
     * @return - la emergencia buscada;
     *
    --------------------------------------------------------------------------------------------------------

    @Override
    public Emergecia getEmergenciaById(Long idEmergencia){
        try (Connection connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM Emergencia WHERE idEmergencia = :idEmergencia")
                    .addParameter("idEmergencia", idEmergencia)
                    .executeAndFetch(Emergencia.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
*/
    /*--------------------------------------------------------------------------------------------------------
     * findAll: método que obtiene todas las emergencias de la BD;
     *
     * @return - una lista con las emergencias presentes en la BD;
     *
    -------------------------------------------------------------------------------------------------------
    @Override
    public List<Emergencia> findAllEmergency(){
        try(Connection connection = sql2o.open()){
            return connection.createQuery("SELECT * FROM Emergencia ORDER BY idEmergencia ASC")
                    .executeAndFetch(Emergencia.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }


    }
-*/
    /*--------------------------------------------------------------------------------------------------------
     * updateEmergencia: método que actualiza los datos de una emergencia en la BD;
     *
     * @param emergenciaUpdate - el objeto con el id de la emergencia y los nuevos datos;
     * @return - los datos de la emergencia actualizados;
     *
    ------------------------------------------------------------------------------------------------------
    @Override
    public Emergencia updateEmergencia(Emergencia emergenciaUpdate) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("UPDATE Emergencia " +
                            "SET idInstitucion =:idInstitucion, tipo =:tipo, ubicacion =:ubicacion, equipamiento_necesario =:equipamiento_necesario" +
                            "WHERE idEmergencia =:idEmergencia")
                    .addParameter("idEmergencia", emergenciaUpdate.getIdEmergencia())
                    .addParameter("idInstitucion", emergenciaUpdate.getIdInstitucion())
                    .addParameter("tipo", emergenciaUpdate.getTipo())
                    .addParameter("emergencia", emergenciaUpdate.getUbicacion())
                    .addParameter("equipamiento_necesario", emergenciaUpdate.getEquipamiento_necesario())
                    .executeUpdate();
            return Emergencia;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
--*/
    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdEmergencia: método que borra una emergencia de la BD;
     *
     * @param id - id de la emergencia a eliminar;
     *
    ------------------------------------------------------------------------------------------------------
    @Override
    public void deleteByIdEmergencia(Long idEmergencia) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("DELETE FROM Emergencia WHERE idEmergencia =:idEmergencia")
                    .addParameter("idEmergencia", idEmergencia)
                    .executeUpdate();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }--*/
}

