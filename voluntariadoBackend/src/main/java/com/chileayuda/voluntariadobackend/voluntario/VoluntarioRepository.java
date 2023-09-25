package com.chileayuda.voluntariadobackend.voluntario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario, Long> {

    /* metodos abstractos declarados */
    public Voluntario getById(Long id);

}
