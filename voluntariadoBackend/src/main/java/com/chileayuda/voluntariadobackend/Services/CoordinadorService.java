package com.chileayuda.voluntariadobackend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoordinadorService {

    /* Capa de métodos del repositorio
    @Autowired
    private CoordinadorRepository coordinadorRepo;*/

    /* Servicios disponibles */

    /*--------------------------------------------------------------------------------------------------------
     * createCoordinador: método que guarda un coordinador en la BD;
     *
     * @param coordinador_in - un objeto que contiene los datos del coordinador;
     * @return - el coordinador creado y guardado en la base de datos;
     *
    ------------------------------------------------------------------------------------------------------
    public Coordinador createCoordinador(Coordinador coordinador_in) {
        return coordinadorRepo.save(coordinador_in);
    }
--*/
    /*--------------------------------------------------------------------------------------------------------
     * getCoordinadorById: método que obtiene un coordinador específico de la BD con su id;
     *
     * @param id_coordinador - id del coordinador;
     * @return - el coordinador buscado;
     *
    ------------------------------------------------------------------------------------------------------
    public Coordinador getCoordinadorById(Long id_coordinador) {
        return coordinadorRepo.getById(id_coordinador);
    }
--*/
    /*--------------------------------------------------------------------------------------------------------
     * findAll: método que obtiene todos los coordinadores de la BD;
     *
     * @return - una lista con los coordinadores presentes en la BD;
     *
    ----------------------------------------------------------------------------------------------------
    public List<Coordinador> findAll() {
        return coordinadorRepo.findAll();
    }----*/

    /*--------------------------------------------------------------------------------------------------------
     * updateCoordinador: método que actualiza los datos de un coordinador en la BD;
     *
     * @param coordinadorUpdate - el objeto con el id del coordinador y los nuevos datos;
     * @return - los datos del coordinador actualizados;
     *
    ---------------------------------------------------------------------------------------------------
    public Coordinador updateCoordinador(Coordinador coordinadorUpdate) {
        Coordinador presente = coordinadorRepo.findById(coordinadorUpdate.getId()).orElse(null);
        if (presente != null) {
            presente.setId(coordinadorUpdate.getId());
            presente.setNombre(coordinadorUpdate.getNombre());
            presente.setEmail(coordinadorUpdate.getEmail());
            presente.setPassword(coordinadorUpdate.getPassword());
            // Agregar código para actualizar otros atributos si es necesario
            return coordinadorRepo.save(presente);
        } else {
            return null;
        }
    }
-----*/
    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdCoordinador: método que borra un coordinador de la BD;
     *
     * @param id_coordinador - id del coordinador a eliminar;
     *
    --------------------------------------------------------------------------------------------------
    public void deleteByIdCoordinador(Long id_coordinador) {
        coordinadorRepo.deleteById(id_coordinador);
    }------*/
}

