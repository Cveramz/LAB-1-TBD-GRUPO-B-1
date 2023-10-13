package com.chileayuda.voluntariadobackend.Models;

public class Tarea {
    //ATRIBUTOS
    private Long idTarea;
    private Integer idEmergencia;
    private Integer idEstado_Tarea;
    private String nombreTarea;

    //CONSTRUCTORES
    public Tarea(){}

    public Tarea(Long id, Integer idEmergencia, Integer idEstado_Tarea, String nombre) {
        this.idTarea = id;
        this.idEmergencia = idEmergencia;
        this.idEstado_Tarea = idEstado_Tarea;
        this.nombreTarea = nombre;
    }

    //GETTERS Y SETTERS

    public Long getIdTarea() {
        return id;
    }

    public void setIdTarea(Long id) {
        this.idTarea = id;
    }

    public String getNombreTarea() {
        return nombre;
    }

    public void setNombreTarea(String nombre) {
        this.nombreTarea = nombre;
    }

    public Integer getIdEmergencia() {
        return idEmergencia;
    }

    public void setIdEmergencia(Integer idEmergencia) {
        this.idEmergencia = idEmergencia;
    }

    public Integer getIdEstado_Tarea() {
        return idEstado_Tarea;
    }

    public void setIdEstado_Tarea(Integer idEstado_Tarea) {
        this.idEstado_Tarea = idEstado_Tarea;
    }
}
