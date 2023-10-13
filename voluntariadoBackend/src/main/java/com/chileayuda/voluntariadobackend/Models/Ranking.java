package com.chileayuda.voluntariadobackend.Models;

public class Ranking {
    //ATRIBUTOS
    private Long idRanking;
    private Integer idVoluntario;
    private Integer idTarea;
    private int puntos_requisito;


    //CONSTRUCTORES
    public Ranking(){}
    public Ranking(Long id, Integer idVoluntario, Integer idTarea, int puntos_requisito) {
        this.idRanking = id;
        this.idVoluntario = idVoluntario;
        this.idTarea = idTarea;
        this.puntos_requisito = puntos_requisito;
    }

    //GETTERS Y SETTERS
    public Long getIdRanking() {
        return id;
    }

    public void setIdRanking(Long id) {
        this.idRanking = id;
    }

    public Integer getIdVoluntario() {
        return idVoluntario;
    }

    public void setIdVoluntario(Integer idVoluntario) {
        this.idVoluntario = idVoluntario;
    }

    public Integer getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }

    public int getPuntos_requisito() {
        return puntos_requisito;
    }

    public void setPuntos_requisito(int puntos_requisito) {
        this.puntos_requisito = puntos_requisito;
    }
}
