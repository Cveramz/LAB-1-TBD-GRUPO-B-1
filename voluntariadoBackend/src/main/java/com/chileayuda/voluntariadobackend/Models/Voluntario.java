package com.chileayuda.voluntariadobackend.Models;


public class Voluntario {
    //ATRIBUTOS

    private Long idVoluntario;
    private String nombreVoluntario;
    private int edad;
    private String equipamiento;
    private Boolean estado_salud;
    private Boolean disponibilidad;
    private String emailVoluntario;
    private String passwordVoluntario;

    //CONSTRUCTORES
    public Voluntario(){}

    public Voluntario(Long id, String nombre, int edad, String equipamiento, Boolean estado_salud, Boolean disponibilidad, String email, String password) {
        this.idVoluntario = id;
        this.nombreVoluntario = nombre;
        this.edad = edad;
        this.equipamiento = equipamiento;
        this.estado_salud = estado_salud;
        this.disponibilidad = disponibilidad;
        this.emailVoluntario = email;
        this.passwordVoluntario = password;
    }

    //GETTERS Y SETTERS
    public Long getIdVoluntario() {
        return id;
    }

    public void setIdVoluntario(Long id) {
        this.idVoluntario = id;
    }

    public String getNombreVoluntario() {
        return nombre;
    }

    public void setNombreVoluntario(String nombre) {
        this.nombreVoluntario = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public Boolean getEstado_salud() {
        return estado_salud;
    }

    public void setEstado_salud(Boolean estado_salud) {
        this.estado_salud = estado_salud;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEmailVoluntario() {
        return email;
    }

    public void setEmailVoluntario(String email) {
        this.emailVoluntario = email;
    }

    public String getPasswordVoluntario() {
        return password;
    }

    public void setPasswordVoluntario(String password) {
        this.passwordVoluntario = password;
    }
}

