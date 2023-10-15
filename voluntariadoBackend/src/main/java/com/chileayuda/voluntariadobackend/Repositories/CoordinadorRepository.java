package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Coordinador;
import java.util.List;

public interface CoordinadorRepository {

    /* metodos abstractos declarados */
    public Coordinador createCoordinador(Coordinador coordinador);
    public List<Coordinador> getCoordinadorById(Long id);
    public List<Coordinador> findAllCoordinadores();
    public Coordinador updateCoordinador(Coordinador coordinadorUpdate);
    public void deleteByIdCoordinador(Long id);
}
