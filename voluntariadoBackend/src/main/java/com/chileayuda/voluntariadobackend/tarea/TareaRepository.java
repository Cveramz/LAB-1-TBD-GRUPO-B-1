package com.chileayuda.voluntariadobackend.tarea;

import com.chileayuda.voluntariadobackend.voluntario.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {

    /* metodos abstractos declarados */
    public Tarea getById(Long id);
}
