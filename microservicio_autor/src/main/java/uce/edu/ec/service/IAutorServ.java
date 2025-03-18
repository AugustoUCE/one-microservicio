package uce.edu.ec.service;

import uce.edu.ec.repository.model.Autor;

public interface IAutorServ {

    public void insertarAutor(Autor autor);

    public Autor buscarAutorPorId(Integer id);

}
