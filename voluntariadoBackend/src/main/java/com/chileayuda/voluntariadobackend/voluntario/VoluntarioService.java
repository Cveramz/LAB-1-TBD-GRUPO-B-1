package com.chileayuda.voluntariadobackend.voluntario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@Service
public class VoluntarioService{

    /* Capa de metodos del repositorio */
    @Autowired
    private VoluntarioRepository volRepo;

    /* Servicios disponibles */


    /*--------------------------------------------------------------------------------------------------------
     * createVol: metodo que guarda un voluntario en la BD;
     *
     * @param vol_in - un objeto que contiene los datos del voluntario;
     * * @return - el voluntario creado y guardado en la base de datos;
     *
      --------------------------------------------------------------------------------------------------------*/
    public Voluntario createVol(Voluntario vol_in) {
        return volRepo.save(vol_in);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getVolById: metodod que obtiene un voluntario especifico de la BD con su id;
     *
     * @param id_inst - id del voluntario;
     * @return - el voluntario buscado;
     *
     --------------------------------------------------------------------------------------------------------*/
    public Voluntario getVolById(Long id_vol){
        return volRepo.getById(id_vol);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findAll: metodo que obtiene todos los voluntarios de la BD;
     *
     * @return - una lista con los voluntarios presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    public List<Voluntario> findAll(){
        return volRepo.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateVol: metodo que actualiza los datos de un voluntario en la BD;
     *
     * @param instUpdate - el objeto con el id del voluntario y los nuevos datos;
     * @return - los datos del voluntario actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    public Voluntario updateVol(Voluntario volUpdate) {
        Voluntario presente = volRepo.findById(volUpdate.getId()).orElse(null);
        if (presente != null) {
            presente.setId(volUpdate.getId());
            presente.setNombre(volUpdate.getNombre());
            presente.setEdad(volUpdate.getEdad());
            presente.setEquipamiento(volUpdate.getEquipamiento());
            presente.setEstado_salud(volUpdate.getEstado_salud());
            return volRepo.save(presente);
        } else {
            return null;
        }
    }


    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdVol: metodo que borra un voluntario de la BD;
     *
     * @param id - id del voluntario a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    public void deleteByIdVol(Long id) {
        volRepo.deleteById(id);
    }
}
