package com.chileayuda.voluntariadobackend.Models;

public class Emergencia {
    //ATRIBUTOS
    private Long idEmergencia;
    private String tipo;
    private String ubicacion;
    private String equipamiento_necesario;

    //CONSTRUCTORES
    public Emergencia(){}

    public Emergencia(Long id, String tipo, String ubicacion, String equipamiento_necesario) {
        this.idEmergencia = id;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.equipamiento_necesario = equipamiento_necesario;
    }

    //GETTERS Y SETTERS
    public Long getIdEmergencia() {
        return id;
    }

    public void setIdEmergencia(Long id) {
        this.idEmergencia = id;
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
