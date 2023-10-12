package com.chileayuda.voluntariadobackend.Models;

public class Ranking {
    //ATRIBUTOS
    private Long idRanking;


    //CONSTRUCTORES
    public Ranking(){}
    public Ranking(Long id) {
        this.idRanking = id;
    }

    //GETTERS Y SETTERS
    public Long getIdRanking() {
        return id;
    }

    public void setIdRanking(Long id) {
        this.idRanking = id;
    }

}
