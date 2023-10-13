package com.chileayuda.voluntariadobackend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    /* Capa de métodos del repositorio
    @Autowired
    private TareaRepository tareaRepo;
 */
    /* Servicios disponibles */

    /*--------------------------------------------------------------------------------------------------------
     * createTarea: método que guarda una tarea en la BD;
     *
     * @param tarea_in - un objeto que contiene los datos de la tarea;
     * @return - la tarea creada y guardada en la base de datos;
     *
    ----------------------------------------------------------------------------------------------------
    public Tarea createTarea(Tarea tarea_in) {
        return tareaRepo.save(tarea_in);
    }----*/

    /*--------------------------------------------------------------------------------------------------------
     * getTareaById: método que obtiene una tarea específica de la BD con su id;
     *
     * @param id_tarea - id de la tarea;
     * @return - la tarea buscada;
     *
    ----------------------------------------------------------------------------------------------------
    public Tarea getTareaById(Long id_tarea) {
        return tareaRepo.getById(id_tarea);
    }----*/

    /*--------------------------------------------------------------------------------------------------------
     * findAll: método que obtiene todas las tareas de la BD;
     *
     * @return - una lista con las tareas presentes en la BD;
     *
    ----------------------------------------------------------------------------------------------------
    public List<Tarea> findAll() {
        return tareaRepo.findAll();
    }----*/

    /*--------------------------------------------------------------------------------------------------------
     * updateTarea: método que actualiza los datos de una tarea en la BD;
     *
     * @param tareaUpdate - el objeto con el id de la tarea y los nuevos datos;
     * @return - los datos de la tarea actualizados;
     *
    --------------------------------------------------------------------------------------------------
    public Tarea updateTarea(Tarea tareaUpdate) {
        Tarea presente = tareaRepo.findById(tareaUpdate.getId()).orElse(null);
        if (presente != null) {
            presente.setId(tareaUpdate.getId());
            presente.setNombre(tareaUpdate.getNombre());
            // Agregar código para actualizar otros atributos si es necesario
            return tareaRepo.save(presente);
        } else {
            return null;
        }
    }------*/

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdTarea: método que borra una tarea de la BD;
     *
     * @param id_tarea - id de la tarea a eliminar;
     *
    ----------------------------------------------------------------------------------------------------
    public void deleteByIdTarea(Long id_tarea) {
        tareaRepo.deleteById(id_tarea);
    }----*/
}

