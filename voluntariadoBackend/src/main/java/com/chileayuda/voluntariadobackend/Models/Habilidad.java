package com.chileayuda.voluntariadobackend.Models;


public class Habilidad {
    //ATRIBUTOS
    private Long idHabilidad;
    private String nombreHabilidad;

    //CONSTRUCTORES
    public Habilidad(){}
    public Habilidad(Long id, String nombre) {
        this.idHabilidad = id;
        this.nombreHabilidad = nombre;
    }

    //GETTERS Y SETTERS

    public Long getIdHabilidad() {
        return id;
    }

    public void setIdHabilidad(Long id) {
        this.idHabilidad = id;
    }

    public String getNombreHabilidad() {
        return nombre;
    }

    public void setNombreHabilidad(String nombre) {
        this.nombreHabilidad = nombre;
    }
}
