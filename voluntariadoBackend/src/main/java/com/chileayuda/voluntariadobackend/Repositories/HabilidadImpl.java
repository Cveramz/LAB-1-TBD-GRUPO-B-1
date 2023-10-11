package com.chileayuda.voluntariadobackend.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Habilidad/")
public class HabilidadController {

    /* metodos de la capa de servicios de la habilidad */
    @Autowired
    private HabilidadService habilidadService;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createHabilidad: método que guarda una habilidad en la BD;
     *
     * @param habilidad - un objeto que contiene los datos de la habilidad;
     * @return - la habilidad creada y guardada en la base de datos;
     *
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping
    public Habilidad createHabilidad(@RequestBody Habilidad habilidad) {
        return habilidadService.createHabilidad(habilidad);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getHabilidadById: método que obtiene una habilidad específica de la BD con su id;
     *
     * @param id - id de la habilidad;
     * @return - la habilidad buscada;
     *
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/{id}")
    public Habilidad getHabilidadById(@PathVariable Long id) {
        return habilidadService.getHabilidadById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAllHabilidades: método que obtiene todas las habilidades de la BD;
     *
     * @return - una lista con las habilidades presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<Habilidad> findAllHabilidades() {
        return habilidadService.findAllHabilidades();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateHabilidad: método que actualiza los datos de una habilidad en la BD;
     *
     * @param habilidadUpdate - el objeto con el id de la habilidad y los nuevos datos;
     * @return - los datos de la habilidad actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    @PutMapping
    public Habilidad updateHabilidad(@RequestBody Habilidad habilidadUpdate) {
        return habilidadService.updateHabilidad(habilidadUpdate);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteHabilidadById: método que borra una habilidad de la BD;
     *
     * @param id - id de la habilidad a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/{id}")
    public void deleteHabilidadById(@PathVariable Long id) {
        habilidadService.deleteHabilidadById(id);
    }
}

