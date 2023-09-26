package com.chileayuda.voluntariadobackend.voluntario;

import javax.persistence.*;

@Entity
@Table(name = "voluntario")
public class Voluntario {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_voluntario")
    private Long id;

    //AGREGAR LA FK DE RANKING

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name = "equipamiento")
    private String equipamiento;

    @Column(name = "estado_salud")
    private Boolean estado_salud;

    @Column(name = "disponibilidad")
    private Boolean disponibilidad;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    //CONSTRUCTORES
    public Voluntario(){}

    public Voluntario(Long id, String nombre, int edad, String equipamiento, Boolean estado_salud, Boolean disponibilidad, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.equipamiento = equipamiento;
        this.estado_salud = estado_salud;
        this.disponibilidad = disponibilidad;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

