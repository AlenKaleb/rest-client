package br.com.awka.pessoa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/pessoas")
public interface IPessoa {

    @GET
    @Path("/")
    Response buscarPessoas();

    @GET
    @Path("/{id}")
    Response consultarPessoa(@QueryParam("id") Long idPessoa);

    @POST
    Response inserirPessoa(Pessoa pessoa);

    @PUT
    @Path("/{id}")
    Response alterarPessoa(Pessoa pessoa, @PathParam("id") Long idPessoa);

    @DELETE
    Response excluirPessoa(Pessoa pessoa);
}
