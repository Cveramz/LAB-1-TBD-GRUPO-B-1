package com.chileayuda.voluntariadobackend.coordinador;

import com.chileayuda.voluntariadobackend.voluntario.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinadorRepository extends JpaRepository<Coordinador, Long> {

    /* metodos abstractos declarados */
    public Coordinador getById(Long id);
}
