package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Emergencia;
import java.util.List;


public interface EmergenciaRepository {

    /* metodos abstractos declarados */

    public Emergencia createEmergencia(Emergencia emergencia_in);
    public Emergencia getEmergenciaById(Long id);
    public List<Emergencia> findAllEmergency();
    public Emergencia updateEmergencia(Emergencia emergenciaUpdate);
    public void deleteByIdEmergencia(Long id);
}
