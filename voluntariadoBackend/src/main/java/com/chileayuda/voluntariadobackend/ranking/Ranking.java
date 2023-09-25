package com.chileayuda.voluntariadobackend.ranking;

import javax.persistence.*;

@Entity
@Table(name = "ranking")
public class Ranking {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ranking")
    private Long id;

    @Column(name = "lugar")
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
