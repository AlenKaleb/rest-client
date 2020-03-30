package br.com.awka.parser;

import br.com.awka.dto.PessoaDTO;
import br.com.awka.entity.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaParser extends AbstractParser<PessoaDTO, Pessoa> {

    @Override
    public Pessoa toEntity(PessoaDTO pessoaDTO){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(pessoaDTO.getId());
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setCpf(pessoaDTO.getCpf());
        return pessoa;
    }

    @Override
    public PessoaDTO toDTO(Pessoa pessoa){
        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setId(pessoa.getId());
        pessoaDTO.setNome(pessoa.getNome());
        pessoaDTO.setCpf(pessoa.getCpf());
        return pessoaDTO;
    }
}
