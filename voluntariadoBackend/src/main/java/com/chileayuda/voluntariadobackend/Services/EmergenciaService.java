package com.chileayuda.voluntariadobackend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergenciaService {

    /* Capa de métodos del repositorio
    @Autowired
    private EmergenciaRepository emergenciaRepo;
 */
    /* Servicios disponibles */

    /*--------------------------------------------------------------------------------------------------------
     * createEmergencia: método que guarda una emergencia en la BD;
     *
     * @param emergencia_in - un objeto que contiene los datos de la emergencia;
     * @return - la emergencia creada y guardada en la base de datos;
     *
    ------------------------------------------------------------------------------------------------------
    public Emergencia createEmergencia(Emergencia emergencia_in) {
        return emergenciaRepo.save(emergencia_in);
    }--*/

    /*--------------------------------------------------------------------------------------------------------
     * getEmergenciaById: método que obtiene una emergencia específica de la BD con su id;
     *
     * @param id_emergencia - id de la emergencia;
     * @return - la emergencia buscada;
     *
    -------------------------------------------------------------------------------------------------------
    public Emergencia getEmergenciaById(Long id_emergencia) {
        return emergenciaRepo.getById(id_emergencia);
    }-*/

    /*--------------------------------------------------------------------------------------------------------
     * findAll: método que obtiene todas las emergencias de la BD;
     *
     * @return - una lista con las emergencias presentes en la BD;
     *
    ------------------------------------------------------------------------------------------------------
    public List<Emergencia> findAll() {
        return emergenciaRepo.findAll();
    }
--*/
    /*--------------------------------------------------------------------------------------------------------
     * updateEmergencia: método que actualiza los datos de una emergencia en la BD;
     *
     * @param emergenciaUpdate - el objeto con el id de la emergencia y los nuevos datos;
     * @return - los datos de la emergencia actualizados;
     *
    ------------------------------------------------------------------------------------------------------
    public Emergencia updateEmergencia(Emergencia emergenciaUpdate) {
        Emergencia presente = emergenciaRepo.findById(emergenciaUpdate.getId()).orElse(null);
        if (presente != null) {
            presente.setId(emergenciaUpdate.getId());
            presente.setTipo(emergenciaUpdate.getTipo());
            presente.setUbicacion(emergenciaUpdate.getUbicacion());
            presente.setEquipamiento_necesario(emergenciaUpdate.getEquipamiento_necesario());
            // Agregar código para actualizar otros atributos si es necesario
            return emergenciaRepo.save(presente);
        } else {
            return null;
        }
    }
--*/
    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdEmergencia: método que borra una emergencia de la BD;
     *
     * @param id_emergencia - id de la emergencia a eliminar;
     *
    --------------------------------------------------------------------------------------------------
    public void deleteByIdEmergencia(Long id_emergencia) {
        emergenciaRepo.deleteById(id_emergencia);
    }------*/
}
