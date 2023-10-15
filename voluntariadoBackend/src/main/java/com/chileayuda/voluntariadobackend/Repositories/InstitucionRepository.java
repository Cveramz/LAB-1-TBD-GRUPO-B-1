package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Institucion;
import java.util.List;
public interface InstitucionRepository {

    /* metodos abstractos declarados*/
    public Institucion createInstitucion(Institucion institucion);
    public List<Institucion> getInstitucionById(Long id);
    public List<Institucion> findAllInstituciones();
    public Institucion updateInstitucion(Institucion institucionUpdate);
    public void deleteInstitucionById(Long id);
}
