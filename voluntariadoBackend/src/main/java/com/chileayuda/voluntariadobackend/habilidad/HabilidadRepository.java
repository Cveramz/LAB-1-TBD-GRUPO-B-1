package com.chileayuda.voluntariadobackend.habilidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Long> {

    /* metodos abstractos declarados */
    public Habilidad getById(Long id);
}
