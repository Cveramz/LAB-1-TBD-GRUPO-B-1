package com.chileayuda.voluntariadobackend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingService {

    /* Capa de metodos del repositorio
    @Autowired
    private RankingRepository rankingRepo;
*/
    /* Servicios disponibles */


    /*--------------------------------------------------------------------------------------------------------
     * createRanking: método que guarda un ranking en la BD;
     *
     * @param ranking - un objeto que contiene los datos del ranking;
     * @return - el ranking creado y guardado en la base de datos;
     *
     ---------------------------------------------------------------------------------------------------
    public Ranking createRanking(Ranking ranking) {
        return rankingRepo.save(ranking);
    }-----*/

    /*--------------------------------------------------------------------------------------------------------
     * getRankingById: método que obtiene un ranking específico de la BD con su id;
     *
     * @param id - id del ranking;
     * @return - el ranking buscado;
     *
     ---------------------------------------------------------------------------------------------------
    public Ranking getRankingById(Long id) {
        return rankingRepo.getById(id);
    }-----*/

    /*--------------------------------------------------------------------------------------------------------
     * findAllRankings: método que obtiene todos los rankings de la BD;
     *
     * @return - una lista con los rankings presentes en la BD;
     *
     ---------------------------------------------------------------------------------------------------
    public List<Ranking> findAllRankings() {
        return rankingRepo.findAll();
    }-----*/

    /*--------------------------------------------------------------------------------------------------------
     * updateRanking: método que actualiza los datos de un ranking en la BD;
     *
     * @param rankingUpdate - el objeto con el id del ranking y los nuevos datos;
     * @return - los datos del ranking actualizados;
     *
     ----------------------------------------------------------------------------------------------------
    public Ranking updateRanking(Ranking rankingUpdate) {
        Ranking presente = rankingRepo.findById(rankingUpdate.getId()).orElse(null);
        if (presente != null) {
            presente.setLugar(rankingUpdate.getLugar());
            return rankingRepo.save(presente);
        } else {
            return null;
        }
    }----*/

    /*--------------------------------------------------------------------------------------------------------
     * deleteRankingById: método que borra un ranking de la BD;
     *
     * @param id - id del ranking a eliminar;
     *
     ---------------------------------------------------------------------------------------------------
    public void deleteRankingById(Long id) {
        rankingRepo.deleteById(id);
    }-----*/
}

