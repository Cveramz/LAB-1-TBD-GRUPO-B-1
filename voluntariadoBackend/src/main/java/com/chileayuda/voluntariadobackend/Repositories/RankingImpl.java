package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Ranking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;


@Repository
public class RankingRepositoryImpl implements RankingRepository {

    /* Métodos de la capa de repositorio de Emergencia */
    @Autowired
    private Sql2o sql2o;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createRanking: método que guarda un ranking en la BD;
     *
     * @param ranking - un objeto que contiene los datos del ranking;
     * @return - el ranking creado y guardado en la base de datos;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Ranking createRanking (Ranking ranking) {
        try (Connection connection = sql2o.open()) {
            String sql = "INSERT TO ranking (idRanking, idVoluntario, idTarea, puntos_requisito)"+
                    "VALUES (:idRanking, :idVoluntario, :idTarea, :puntos_requisito)";
            connection.createQuery(sql, true)
                    .addParameter("idRanking", ranking.getIdRanking())
                    .addParameter("idVoluntario", ranking.getIdVoluntario())
                    .addParameter("idTarea", ranking.getIdTarea())
                    .addParameter("puntos_requisito", ranking.getPuntos_requisito())
                    .executeUpdate();
            return ranking;
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * getRankingById: método que obtiene un ranking específico de la BD con su id;
     *
     * @param id - id del ranking;
     * @return - el ranking buscado;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Ranking getRankingById(Long idRanking){
        try (Connection connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM Ranking WHERE idRanking = :idRanking")
                    .addParameter("idRanking", idRanking)
                    .executeAndFetch(Ranking.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAllRankings: método que obtiene todos los rankings de la BD;
     *
     * @return - una lista con los rankings presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public List<Ranking> findAllRankings(){
        try(Connection connection = sql2o.open()){
            return connection.createQuery("SELECT * FROM Ranking ORDER BY idRanking ASC")
                    .executeAndFetch(Ranking.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }


    }

    /*--------------------------------------------------------------------------------------------------------
     * updateRanking: método que actualiza los datos de un ranking en la BD;
     *
     * @param rankingUpdate - el objeto con el id del ranking y los nuevos datos;
     * @return - los datos del ranking actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Ranking updateRanking(Ranking rankingUpdate) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("UPDATE Ranking " +
                            "SET idVoluntario =:idVoluntario, idTarea =:idTarea, puntos_requisito =:puntos_requisitos" +
                            "WHERE idRanking =:idRanking")
                    .addParameter("idRanking", ranking.getIdRanking())
                    .addParameter("idVoluntario", ranking.getIdVoluntario())
                    .addParameter("idTarea", ranking.getIdTarea())
                    .addParameter("puntos_requisito", ranking.getPuntos_requisito())
                    .executeUpdate();
            return Ranking;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteRankingById: método que borra un ranking de la BD;
     *
     * @param id - id del ranking a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public void deleteByIdRanking(Long idRanking) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("DELETE FROM Ranking WHERE idRanking =:idRanking")
                    .addParameter("idRanking", idRanking)
                    .executeUpdate();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

