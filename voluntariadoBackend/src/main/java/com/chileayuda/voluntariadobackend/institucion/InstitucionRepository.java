package com.chileayuda.voluntariadobackend.institucion;

import com.chileayuda.voluntariadobackend.habilidad.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitucionRepository extends JpaRepository<Institucion, Long> {

    /* metodos abstractos declarados */
    public Institucion getById(Long id);
}
