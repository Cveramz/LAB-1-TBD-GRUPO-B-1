package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Habilidad;

import java.util.List;
public interface HabilidadRepository {

    /* metodos abstractos declarados */
    public Habilidad createHabilidad(Habilidad habilidad);
    public Habilidad getHabilidadById(Long id);
    public List<Habilidad> findAllHabilidades();
    public Habilidad updateHabilidad(Habilidad habilidadUpdate);
    public void deleteHabilidadById(Long id);

}
