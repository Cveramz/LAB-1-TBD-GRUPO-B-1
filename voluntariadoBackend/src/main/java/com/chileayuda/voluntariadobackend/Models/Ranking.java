package com.chileayuda.voluntariadobackend.Models;

public class Ranking {
    //ATRIBUTOS
    private Long id;

    private int lugar;

    //CONSTRUCTORES
    public Ranking(){}
    public Ranking(Long id, int lugar) {
        this.id = id;
        this.lugar = lugar;
    }

    //GETTERS Y SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }
}
