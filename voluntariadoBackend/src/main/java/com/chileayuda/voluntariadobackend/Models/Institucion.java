package com.chileayuda.voluntariadobackend.Models;



public class Institucion {
    //ATRIBUTOS
    private Long idInstitucion;
    private String nombreInstitucion;
    private int telefono;
    private String ubicacionInstitucion;


    //CONSTRUCTORES
    public Institucion(){}
    public Institucion(Long id, String nombre, int telefono, String ubicacion) {
        this.idInstitucion = id;
        this.nombreInstitucion = nombre;
        this.telefono = telefono;
        this.ubicacionInstitucion = ubicacion;
    }

    //GETTERS Y SETTERS

    public Long getIdInstitucion() {
        return id;
    }

    public void setIdInstitucion(Long id) {
        this.idInstitucion = id;
    }

    public String getNombreInstitucion() {
        return nombre;
    }

    public void setNombreInstitucion(String nombre) {
        this.nombreInstitucion = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUbicacionInstitucion() {
        return ubicacion;
    }

    public void setUbicacionInstitucion(String ubicacion) {
        this.ubicacionInstitucion = ubicacion;
    }
}
