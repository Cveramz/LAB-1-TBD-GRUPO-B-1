package com.chileayuda.voluntariadobackend.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Emergencia/")
public class EmergenciaController {

    /* Métodos de la capa de servicios de Emergencia */
    @Autowired
    private EmergenciaService emergenciaService;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createEmergencia: método que guarda una emergencia en la BD;
     *
     * @param emergencia_in - un objeto que contiene los datos de la emergencia;
     * * @return - la emergencia creada y guardada en la base de datos;
     *
    --------------------------------------------------------------------------------------------------------*/
    @PostMapping
    public Emergencia createEmergencia(@RequestBody Emergencia emergencia_in) {
        return emergenciaService.createEmergencia(emergencia_in);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getEmergenciaById: método que obtiene una emergencia específica de la BD con su id;
     *
     * @param id - id de la emergencia;
     * @return - la emergencia buscada;
     *
    --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/{id}")
    public Emergencia getEmergenciaById(@PathVariable Long id){
        return emergenciaService.getEmergenciaById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAll: método que obtiene todas las emergencias de la BD;
     *
     * @return - una lista con las emergencias presentes en la BD;
     *
    --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<Emergencia> findAll(){
        return emergenciaService.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateEmergencia: método que actualiza los datos de una emergencia en la BD;
     *
     * @param emergenciaUpdate - el objeto con el id de la emergencia y los nuevos datos;
     * @return - los datos de la emergencia actualizados;
     *
    --------------------------------------------------------------------------------------------------------*/
    @PutMapping
    public Emergencia updateEmergencia(@RequestBody Emergencia emergenciaUpdate) {
        return emergenciaService.updateEmergencia(emergenciaUpdate);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdEmergencia: método que borra una emergencia de la BD;
     *
     * @param id - id de la emergencia a eliminar;
     *
    --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/{id}")
    public void deleteByIdEmergencia(@PathVariable Long id) {
        emergenciaService.deleteByIdEmergencia(id);
    }
}

