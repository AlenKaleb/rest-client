package br.com.awka.rest.pessoa;

import br.com.awka.dto.PessoaDTO;

import javax.validation.constraints.NotNull;
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
    Response consultarPessoa(@NotNull @PathParam("id") Integer idPessoa);

    @POST
    Response inserirPessoa(@NotNull PessoaDTO pessoaDTO) throws Exception;

    @PUT
    @Path("/{id}")
    Response alterarPessoa(@NotNull PessoaDTO pessoaDTO, @NotNull @PathParam("id") Integer idPessoa) throws Exception;

    @DELETE
    @Path("/{id}")
    Response excluirPessoa(@NotNull @PathParam("id") Integer id) throws Exception;
}
