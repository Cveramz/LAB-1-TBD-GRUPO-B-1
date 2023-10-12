package com.chileayuda.voluntariadobackend.Models;

public class Tarea {
    //ATRIBUTOS
    private Long idTarea;

    //agregar ID_emergencia

    //agregar ID_estado_tarea
    private String nombreTarea;

    //CONSTRUCTORES
    public Tarea(){}

    public Tarea(Long id, String nombre) {
        this.idTarea = id;
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
}
