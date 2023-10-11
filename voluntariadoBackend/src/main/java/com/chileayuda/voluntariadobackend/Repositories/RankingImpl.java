package com.chileayuda.voluntariadobackend.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Ranking/")
public class RankingController {

    /* metodos de la capa de servicios de la ranking */
    @Autowired
    private RankingService rankingService;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createRanking: método que guarda un ranking en la BD;
     *
     * @param ranking - un objeto que contiene los datos del ranking;
     * @return - el ranking creado y guardado en la base de datos;
     *
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping
    public Ranking createRanking(@RequestBody Ranking ranking) {
        return rankingService.createRanking(ranking);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getRankingById: método que obtiene un ranking específico de la BD con su id;
     *
     * @param id - id del ranking;
     * @return - el ranking buscado;
     *
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/{id}")
    public Ranking getRankingById(@PathVariable Long id) {
        return rankingService.getRankingById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAllRankings: método que obtiene todos los rankings de la BD;
     *
     * @return - una lista con los rankings presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<Ranking> findAllRankings() {
        return rankingService.findAllRankings();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateRanking: método que actualiza los datos de un ranking en la BD;
     *
     * @param rankingUpdate - el objeto con el id del ranking y los nuevos datos;
     * @return - los datos del ranking actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    @PutMapping
    public Ranking updateRanking(@RequestBody Ranking rankingUpdate) {
        return rankingService.updateRanking(rankingUpdate);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteRankingById: método que borra un ranking de la BD;
     *
     * @param id - id del ranking a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/{id}")
    public void deleteRankingById(@PathVariable Long id) {
        rankingService.deleteRankingById(id);
    }
}

