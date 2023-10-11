package com.chileayuda.voluntariadobackend.Models;

public class Tarea {
    //ATRIBUTOS
    private Long id;

    //agregar ID_emergencia

    //agregar ID_estado_tarea
    private String nombre;

    //CONSTRUCTORES
    public Tarea(){}

    public Tarea(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //GETTERS Y SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
