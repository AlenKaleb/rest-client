package br.com.awka.rest.pessoa;


import br.com.awka.dto.PessoaDTO;
import br.com.awka.rest.BaseApi;
import br.com.awka.service.PessoaService;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Response;

public class PessoaRest extends BaseApi implements IPessoa {

    @Inject
    private PessoaService pessoaService;

    @Override
    public Response buscarPessoas() {
        return Response.ok(pessoaService.buscarPessoas()).build();
    }

    @Override
    public Response consultarPessoa(Integer idPessoa){
        PessoaDTO pessoaDTO = pessoaService.buscarPessoa(idPessoa);
        return Response.ok(pessoaDTO).build();
    }

    @Override
    public Response inserirPessoa(PessoaDTO pessoaDTO) throws Exception {
        pessoaService.cadastrar(pessoaDTO);
        return Response.ok("Cadastro realizado com sucesso.").build();
    }

    @Override
    public Response alterarPessoa(PessoaDTO pessoaDTO, Integer idPessoa) throws Exception {
        PessoaDTO pessoaDTOUpdate = pessoaService.alterar(idPessoa,pessoaDTO);
        return Response.ok(pessoaDTOUpdate).build();
    }

    @Override
    public Response excluirPessoa(Integer id) throws Exception {
        pessoaService.excluir(id);
        return Response.ok().build();
    }
}
