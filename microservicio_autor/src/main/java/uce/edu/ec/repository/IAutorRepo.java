package uce.edu.ec.repository;

import uce.edu.ec.repository.model.Autor;

public interface IAutorRepo {

    public void insertarAutor(Autor autor);

    public Autor buscarAutorPorId(Integer id);

}
