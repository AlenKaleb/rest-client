package br.com.awka.rest;


import br.com.awka.pessoa.IPessoa;
import br.com.awka.pessoa.Pessoa;

import javax.ws.rs.core.Response;

public class PessoaRest implements IPessoa {

    @Override
    public Response buscarPessoas() {
        return null;
    }

    @Override
    public Response consultarPessoa(Long idPessoa) {
        return null;
    }

    @Override
    public Response inserirPessoa(Pessoa pessoa) {
        return null;
    }

    @Override
    public Response alterarPessoa(Pessoa pessoa, Long idPessoa) {
        return null;
    }

    @Override
    public Response excluirPessoa(Pessoa pessoa) {
        return null;
    }
}
