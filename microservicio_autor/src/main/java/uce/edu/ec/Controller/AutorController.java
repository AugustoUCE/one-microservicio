package uce.edu.ec.Controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import uce.edu.ec.repository.model.Autor;
import uce.edu.ec.service.IAutorServ;

@Path("/autores")
public class AutorController {

    @Inject
    private IAutorServ autorService;

    @POST
    @Path(" ")
    public void insertarAutor(Autor autor) {
        
            this.autorService.insertarAutor(autor);
      
    }

    @GET
    @Path("/{id}")
    public Autor buscarAutorPorId(@PathParam("id")  Integer id) {
        try {
            return this.autorService.buscarAutorPorId(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
