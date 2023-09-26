package com.chileayuda.voluntariadobackend.emergencia;

import com.chileayuda.voluntariadobackend.voluntario.Voluntario;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergenciaRepository extends JpaRepository<Emergencia, Long> {

    /* metodos abstractos declarados */
    public Emergencia getById(Long id);
}
