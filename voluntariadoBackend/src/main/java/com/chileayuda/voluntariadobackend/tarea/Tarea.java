package com.chileayuda.voluntariadobackend.tarea;

import javax.persistence.*;

@Entity
@Table(name = "tarea")
public class Tarea {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_tarea")
    private Long id;

    //agregar ID_emergencia

    //agregar ID_estado_tarea

    @Column(name = "nombre")
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
