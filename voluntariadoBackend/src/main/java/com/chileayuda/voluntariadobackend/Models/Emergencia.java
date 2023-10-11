package com.chileayuda.voluntariadobackend.Models;

public class Emergencia {
    //ATRIBUTOS
    private Long id;
    private String tipo;
    private String ubicacion;
    private String equipamiento_necesario;

    //CONSTRUCTORES
    public Emergencia(){}

    public Emergencia(Long id, String tipo, String ubicacion, String equipamiento_necesario) {
        this.id = id;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.equipamiento_necesario = equipamiento_necesario;
    }

    //GETTERS Y SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEquipamiento_necesario() {
        return equipamiento_necesario;
    }

    public void setEquipamiento_necesario(String equipamiento_necesario) {
        this.equipamiento_necesario = equipamiento_necesario;
    }
}
