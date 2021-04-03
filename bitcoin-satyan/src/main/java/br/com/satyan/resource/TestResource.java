package br.com.satyan.resource;

import br.com.satyan.model.Bitcoin;
import br.com.satyan.service.TesteService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("teste")
public class TestResource {

    @Inject
    TesteService testeService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String testar(){
        return testeService.teste();
    }

}
