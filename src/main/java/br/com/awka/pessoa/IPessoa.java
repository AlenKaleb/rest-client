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
    public Response buscarPessoas();

    @GET
    @Path("/{id}")
    public Response consultarPessoa(@QueryParam("id") Long idPessoa);

    @POST
    public Response inserirPessoa(Pessoa pessoa);

    @PUT
    @Path("/{id}")
    public Response alterarPessoa(Pessoa pessoa, @PathParam("id") Long idPessoa);

    @DELETE
    public Response excluirPessoa(Pessoa pessoa);
}
