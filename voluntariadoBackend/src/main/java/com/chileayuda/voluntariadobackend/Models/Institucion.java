package com.chileayuda.voluntariadobackend.Models;



public class Institucion {
    //ATRIBUTOS
    private Long id;
    private String nombre;
    private int telefono;
    private String ubicacion;


    //CONSTRUCTORES
    public Institucion(){}
    public Institucion(Long id, String nombre, int telefono, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
