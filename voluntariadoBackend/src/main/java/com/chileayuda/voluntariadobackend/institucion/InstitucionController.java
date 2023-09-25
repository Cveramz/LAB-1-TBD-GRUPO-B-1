package com.chileayuda.voluntariadobackend.institucion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Institucion/")
public class InstitucionController {

    /* metodos de la capa de servicios de la institucion */
    @Autowired
    private InstitucionService institucionService;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createInstitucion: método que guarda una institución en la BD;
     *
     * @param institucion - un objeto que contiene los datos de la institución;
     * @return - la institución creada y guardada en la base de datos;
     *
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping
    public Institucion createInstitucion(@RequestBody Institucion institucion) {
        return institucionService.createInstitucion(institucion);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getInstitucionById: método que obtiene una institución específica de la BD con su id;
     *
     * @param id - id de la institución;
     * @return - la institución buscada;
     *
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/{id}")
    public Institucion getInstitucionById(@PathVariable Long id) {
        return institucionService.getInstitucionById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAllInstituciones: método que obtiene todas las instituciones de la BD;
     *
     * @return - una lista con las instituciones presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<Institucion> findAllInstituciones() {
        return institucionService.findAllInstituciones();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateInstitucion: método que actualiza los datos de una institución en la BD;
     *
     * @param institucionUpdate - el objeto con el id de la institución y los nuevos datos;
     * @return - los datos de la institución actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    @PutMapping
    public Institucion updateInstitucion(@RequestBody Institucion institucionUpdate) {
        return institucionService.updateInstitucion(institucionUpdate);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteInstitucionById: método que borra una institución de la BD;
     *
     * @param id - id de la institución a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/{id}")
    public void deleteInstitucionById(@PathVariable Long id) {
        institucionService.deleteInstitucionById(id);
    }
}

