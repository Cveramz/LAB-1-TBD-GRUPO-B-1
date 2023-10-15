package com.chileayuda.voluntariadobackend.Models;

public class Emergencia {
    //ATRIBUTOS
    private Integer id_emergencia;
    private Integer id_institucion;
    private String tipo;
    private String ubicacion;
    private String equipamiento_necesario;


    //CONSTRUCTORES
    public Emergencia(){}

    public Emergencia(Integer id, Integer idInstitucion, String tipo, String ubicacion, String equipamiento_necesario ) {
        this.id_emergencia = id;
        this.id_institucion = idInstitucion;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.equipamiento_necesario = equipamiento_necesario;

    }

    //GETTERS Y SETTERS
    public Integer getIdEmergencia() {
        return id_emergencia;
    }

    public void setIdEmergencia(Integer id) {
        this.id_emergencia = id;
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

    public Integer getIdInstitucion() {
        return id_institucion;
    }

    public void setIdInstitucion(Integer idnstitucion) {
        this.id_institucion = id_institucion;
    }
}
