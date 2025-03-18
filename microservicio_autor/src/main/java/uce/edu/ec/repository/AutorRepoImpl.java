package uce.edu.ec.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import uce.edu.ec.repository.model.Autor;

@ApplicationScoped
@Transactional
public class AutorRepoImpl implements IAutorRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertarAutor(Autor autor) {
     
            this.entityManager.persist(autor);
       
    }

    @Override
    public Autor buscarAutorPorId(Integer id) {
        try {
            Autor autor = this.entityManager.find(Autor.class, id);
            if (autor == null) {
                throw new EntityNotFoundException("No se encontró el autor con id: " + id);
            }
            return autor;
        } catch (EntityNotFoundException e) {
            // Manejar o registrar la excepción si es necesario
            System.err.println("EntityNotFoundException: " + e.getMessage());
            throw e;  // o lanzar una excepción más genérica si quieres encapsularla
        } catch (Exception e) {
            System.err.println("Error al buscar autor: " + e.getMessage());
            e.printStackTrace();
            // Manejar otras excepciones
            throw new RuntimeException("Error al buscar autor", e);
        }
    }

}
