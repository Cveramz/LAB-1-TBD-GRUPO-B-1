package com.chileayuda.voluntariadobackend.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Voluntario/")
public class VoluntarioController {

    /* metodos de la capa de servicios del voluntario */
    @Autowired
    private VoluntarioService volService;

    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createVol: metodo que guarda un voluntario en la BD;
     *
     * @param vol_in - un objeto que contiene los datos del voluntario;
     * * @return - el voluntario creado y guardado en la base de datos;
     *
      --------------------------------------------------------------------------------------------------------*/
    @PostMapping
    public Voluntario createVol(@RequestBody Voluntario vol_in) {
        return volService.createVol(vol_in);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getVolById: metodod que obtiene un voluntario especifico de la BD con su id;
     *
     * @param id_inst - id del voluntario;
     * @return - el voluntario buscado;
     *
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/{id}")
    public Voluntario getVolById(@PathVariable Long id){
        return volService.getVolById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAll: metodo que obtiene todos los voluntarios de la BD;
     *
     * @return - una lista con los voluntarios presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<Voluntario> findAll(){
        return volService.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateVol: metodo que actualiza los datos de un voluntario en la BD;
     *
     * @param instUpdate - el objeto con el id del voluntario y los nuevos datos;
     * @return - los datos del voluntario actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    @PutMapping
    public Voluntario updateVol(@RequestBody Voluntario volUpdate) {
        return volService.updateVol(volUpdate);
    }


    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdVol: metodo que borra un voluntario de la BD;
     *
     * @param id - id del voluntario a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/{id}")
    public void deleteByIdVol(@PathVariable Long id) {
        volService.deleteByIdVol(id);
    }
}
