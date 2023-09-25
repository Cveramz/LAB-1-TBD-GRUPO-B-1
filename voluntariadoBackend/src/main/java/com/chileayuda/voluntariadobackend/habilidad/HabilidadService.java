package com.chileayuda.voluntariadobackend.habilidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadService {

    /* Capa de metodos del repositorio */
    @Autowired
    private HabilidadRepository habilidadRepo;

    /* Servicios disponibles */


    /*--------------------------------------------------------------------------------------------------------
     * createHabilidad: método que guarda una habilidad en la BD;
     *
     * @param habilidad - un objeto que contiene los datos de la habilidad;
     * @return - la habilidad creada y guardada en la base de datos;
     *
     --------------------------------------------------------------------------------------------------------*/
    public Habilidad createHabilidad(Habilidad habilidad) {
        return habilidadRepo.save(habilidad);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getHabilidadById: método que obtiene una habilidad específica de la BD con su id;
     *
     * @param id - id de la habilidad;
     * @return - la habilidad buscada;
     *
     --------------------------------------------------------------------------------------------------------*/
    public Habilidad getHabilidadById(Long id) {
        return habilidadRepo.getById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAllHabilidades: método que obtiene todas las habilidades de la BD;
     *
     * @return - una lista con las habilidades presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    public List<Habilidad> findAllHabilidades() {
        return habilidadRepo.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateHabilidad: método que actualiza los datos de una habilidad en la BD;
     *
     * @param habilidadUpdate - el objeto con el id de la habilidad y los nuevos datos;
     * @return - los datos de la habilidad actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    public Habilidad updateHabilidad(Habilidad habilidadUpdate) {
        Habilidad presente = habilidadRepo.findById(habilidadUpdate.getId()).orElse(null);
        if (presente != null) {
            presente.setNombre(habilidadUpdate.getNombre());
            return habilidadRepo.save(presente);
        } else {
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteHabilidadById: método que borra una habilidad de la BD;
     *
     * @param id - id de la habilidad a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    public void deleteHabilidadById(Long id) {
        habilidadRepo.deleteById(id);
    }
}

