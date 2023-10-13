package com.chileayuda.voluntariadobackend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitucionService {

    /* Capa de metodos del repositorio
    @Autowired
    private InstitucionRepository institucionRepo;
 */
    /* Servicios disponibles */


    /*--------------------------------------------------------------------------------------------------------
     * createInstitucion: método que guarda una institución en la BD;
     *
     * @param institucion - un objeto que contiene los datos de la institución;
     * @return - la institución creada y guardada en la base de datos;
     *
     -----------------------------------------------------------------------------------------------------
    public Institucion createInstitucion(Institucion institucion) {
        return institucionRepo.save(institucion);
    }
---*/
    /*--------------------------------------------------------------------------------------------------------
     * getInstitucionById: método que obtiene una institución específica de la BD con su id;
     *
     * @param id - id de la institución;
     * @return - la institución buscada;
     *
     ---------------------------------------------------------------------------------------------------
    public Institucion getInstitucionById(Long id) {
        return institucionRepo.getById(id);
    }-----*/

    /*--------------------------------------------------------------------------------------------------------
     * findAllInstituciones: método que obtiene todas las instituciones de la BD;
     *
     * @return - una lista con las instituciones presentes en la BD;
     *
     ---------------------------------------------------------------------------------------------------
    public List<Institucion> findAllInstituciones() {
        return institucionRepo.findAll();
    }-----*/

    /*--------------------------------------------------------------------------------------------------------
     * updateInstitucion: método que actualiza los datos de una institución en la BD;
     *
     * @param institucionUpdate - el objeto con el id de la institución y los nuevos datos;
     * @return - los datos de la institución actualizados;
     *
     -------------------------------------------------------------------------------------------------
    public Institucion updateInstitucion(Institucion institucionUpdate) {
        Institucion presente = institucionRepo.findById(institucionUpdate.getId()).orElse(null);
        if (presente != null) {
            presente.setId(institucionUpdate.getId());
            presente.setNombre(institucionUpdate.getNombre());
            presente.setTelefono(institucionUpdate.getTelefono());
            presente.setUbicacion(institucionUpdate.getUbicacion());
            return institucionRepo.save(presente);
        } else {
            return null;
        }
    }
-------*/
    /*--------------------------------------------------------------------------------------------------------
     * deleteInstitucionById: método que borra una institución de la BD;
     *
     * @param id - id de la institución a eliminar;
     *
     --------------------------------------------------------------------------------------------
    public void deleteInstitucionById(Long id) {
        institucionRepo.deleteById(id);
    }------------*/
}

