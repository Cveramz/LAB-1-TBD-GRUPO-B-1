package com.chileayuda.voluntariadobackend.coordinador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Coordinador/")
public class CoordinadorController {

    /* Métodos de la capa de servicios de Coordinador */
    @Autowired
    private CoordinadorService coordinadorService;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createCoordinador: método que guarda un coordinador en la BD;
     *
     * @param coordinador_in - un objeto que contiene los datos del coordinador;
     * * @return - el coordinador creado y guardado en la base de datos;
     *
    --------------------------------------------------------------------------------------------------------*/
    @PostMapping
    public Coordinador createCoordinador(@RequestBody Coordinador coordinador_in) {
        return coordinadorService.createCoordinador(coordinador_in);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getCoordinadorById: método que obtiene un coordinador específico de la BD con su id;
     *
     * @param id - id del coordinador;
     * @return - el coordinador buscado;
     *
    --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/{id}")
    public Coordinador getCoordinadorById(@PathVariable Long id){
        return coordinadorService.getCoordinadorById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAll: método que obtiene todos los coordinadores de la BD;
     *
     * @return - una lista con los coordinadores presentes en la BD;
     *
    --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<Coordinador> findAll(){
        return coordinadorService.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateCoordinador: método que actualiza los datos de un coordinador en la BD;
     *
     * @param coordinadorUpdate - el objeto con el id del coordinador y los nuevos datos;
     * @return - los datos del coordinador actualizados;
     *
    --------------------------------------------------------------------------------------------------------*/
    @PutMapping
    public Coordinador updateCoordinador(@RequestBody Coordinador coordinadorUpdate) {
        return coordinadorService.updateCoordinador(coordinadorUpdate);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdCoordinador: método que borra un coordinador de la BD;
     *
     * @param id - id del coordinador a eliminar;
     *
    --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/{id}")
    public void deleteByIdCoordinador(@PathVariable Long id) {
        coordinadorService.deleteByIdCoordinador(id);
    }
}

