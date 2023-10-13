package com.chileayuda.voluntariadobackend.Models;

public class Tarea {
    //ATRIBUTOS
    private Long id_tarea;
    private Integer id_emergencia;
    private Integer id_estado_Tarea;
    private String nombre_tarea;

    public Tarea(Long id_tarea, Integer id_emergencia, Integer id_estado_Tarea, String nombre_tarea) {
        this.id_tarea = id_tarea;
        this.id_emergencia = id_emergencia;
        this.id_estado_Tarea = id_estado_Tarea;
        this.nombre_tarea = nombre_tarea;
    }

    public Long getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(Long id_tarea) {
        this.id_tarea = id_tarea;
    }

    public Integer getId_emergencia() {
        return id_emergencia;
    }

    public void setId_emergencia(Integer id_emergencia) {
        this.id_emergencia = id_emergencia;
    }

    public Integer getId_estado_Tarea() {
        return id_estado_Tarea;
    }

    public void setId_estado_Tarea(Integer id_estado_Tarea) {
        this.id_estado_Tarea = id_estado_Tarea;
    }

    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }
}
