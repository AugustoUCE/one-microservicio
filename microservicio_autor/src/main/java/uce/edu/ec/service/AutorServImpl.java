package uce.edu.ec.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.ec.repository.IAutorRepo;
import uce.edu.ec.repository.model.Autor;

@ApplicationScoped
public class AutorServImpl implements  IAutorServ {

    @Inject
    private IAutorRepo autorRepo;

    @Override
    public void insertarAutor(Autor autor) {
      
            this.autorRepo.insertarAutor(autor);
       
    }

    @Override
    public Autor buscarAutorPorId(Integer id) {

        try {
            return this.autorRepo.buscarAutorPorId(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    
}
