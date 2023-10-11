package com.chileayuda.voluntariadobackend.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Tarea/")
public class TareaController {

    /* Métodos de la capa de servicios de Tarea */
    @Autowired
    private TareaService tareaService;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createTarea: método que guarda una tarea en la BD;
     *
     * @param tarea_in - un objeto que contiene los datos de la tarea;
     * * @return - la tarea creada y guardada en la base de datos;
     *
    --------------------------------------------------------------------------------------------------------*/
    @PostMapping
    public Tarea createTarea(@RequestBody Tarea tarea_in) {
        return tareaService.createTarea(tarea_in);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getTareaById: método que obtiene una tarea específica de la BD con su id;
     *
     * @param id - id de la tarea;
     * @return - la tarea buscada;
     *
    --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/{id}")
    public Tarea getTareaById(@PathVariable Long id){
        return tareaService.getTareaById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAll: método que obtiene todas las tareas de la BD;
     *
     * @return - una lista con las tareas presentes en la BD;
     *
    --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<Tarea> findAll(){
        return tareaService.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateTarea: método que actualiza los datos de una tarea en la BD;
     *
     * @param tareaUpdate - el objeto con el id de la tarea y los nuevos datos;
     * @return - los datos de la tarea actualizados;
     *
    --------------------------------------------------------------------------------------------------------*/
    @PutMapping
    public Tarea updateTarea(@RequestBody Tarea tareaUpdate) {
        return tareaService.updateTarea(tareaUpdate);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdTarea: método que borra una tarea de la BD;
     *
     * @param id - id de la tarea a eliminar;
     *
    --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/{id}")
    public void deleteByIdTarea(@PathVariable Long id) {
        tareaService.deleteByIdTarea(id);
    }
}
