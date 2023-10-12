package com.chileayuda.voluntariadobackend.Repositories;

import com.chileayuda.voluntariadobackend.Models.Institucion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;


@Repository
public class InstitucionRepositoryImpl implements InstitucionRepository {

    /* Métodos de la capa de repositorio de Emergencia */
    @Autowired
    private Sql2o sql2o;


    /* API endpoints - operaciones CRUD */

    /*--------------------------------------------------------------------------------------------------------
     * createInstitucion: método que guarda una institución en la BD;
     *
     * @param institucion - un objeto que contiene los datos de la institución;
     * @return - la institución creada y guardada en la base de datos;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Institucion createInstitucion (Institucion institucion) {
        try (Connection connection = sql2o.open()) {
            String sql = "INSERT TO institucion (idInstitucion,nombreInstitucion,telefono,ubicacionInstitucion)"+
                    "VALUES (:idInstitucion, :nombreInstitucion, :telefono, :ubicacionInstitucion)";
            connection.createQuery(sql, true)
                    .addParameter("idInstitucion", institucion.getIdInstitucion())
                    .addParameter("nombreInstitucion", institucion.getNombreInstitucion())
                    .addParameter("telefono", institucion.getTelefono())
                    .addParameter("ubicacionInstitucion", institucion.getUbicacionInstitucion())
                    .executeUpdate();
            return institucion;
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * getInstitucionById: método que obtiene una institución específica de la BD con su id;
     *
     * @param id - id de la institución;
     * @return - la institución buscada;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Institucion getInstitucionById(Long idInstitucion){
        try (Connection connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM Institucion WHERE idInstitucion = :idInstitucion")
                    .addParameter("idInstitucion", idInstitucion)
                    .executeAndFetch(Institucion.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
    /*--------------------------------------------------------------------------------------------------------
     * findAllInstituciones: método que obtiene todas las instituciones de la BD;
     *
     * @return - una lista con las instituciones presentes en la BD;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public List<Institucion> findAllInstituciones(){
        try(Connection connection = sql2o.open()){
            return connection.createQuery("SELECT * FROM Institucion ORDER BY idInstitucion ASC")
                    .executeAndFetch(Institucion.class);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
    /*--------------------------------------------------------------------------------------------------------
     * updateInstitucion: método que actualiza los datos de una institución en la BD;
     *
     * @param institucionUpdate - el objeto con el id de la institución y los nuevos datos;
     * @return - los datos de la institución actualizados;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Institucion updateInstitucion(Institucion institucionUpdate) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("UPDATE Institucion " +
                            "SET nombreInstitucion =:nombreInstitucion, telefono =:telefono, ubicacionInstitucion =:ubicacionInstitucion" +
                            "WHERE idInstitucion =:idInstitucion")
                    .addParameter("idInstitucion", institucionUpdate.getIdInstitucion())
                    .addParameter("nombreInstitucion", institucionUpdate.getNombreInstitucion())
                    .addParameter("telefono", institucionUpdate.getTelefono())
                    .addParameter("ubicacionInstitucion", institucionUpdate.getUbicacionInstitucion())
                    .executeUpdate();
            return Institucion;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
    /*--------------------------------------------------------------------------------------------------------
     * deleteInstitucionById: método que borra una institución de la BD;
     *
     * @param id - id de la institución a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public void deleteByIdInstitucion (Long idInstitucion) {
        try(Connection connection = sql2o.open()) {
            connection.createQuery("DELETE FROM Institucion WHERE idInstitucion =:idInstitucion")
                    .addParameter("idInstitucion", idInstitucion)
                    .executeUpdate();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

