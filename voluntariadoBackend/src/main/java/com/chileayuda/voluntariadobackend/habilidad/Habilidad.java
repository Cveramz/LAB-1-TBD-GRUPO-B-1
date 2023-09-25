package com.chileayuda.voluntariadobackend.habilidad;

import javax.persistence.*;

@Entity
@Table(name = "habilidad")
public class Habilidad {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_habilidad")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    //CONSTRUCTORES
    public Habilidad(){}
    public Habilidad(Long id, String nombre) {
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
