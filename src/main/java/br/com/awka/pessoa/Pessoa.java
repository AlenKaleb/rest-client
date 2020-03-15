package br.com.awka.pessoa;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
public class Pessoa implements Serializable {

    @NotNull
    private Long id;

    @NotNull
    @NotBlank(message = "O campo nome é obrigatório")
    private String nome;

    @NotNull
    @NotBlank(message =  "O campo cpf é obrigatório")
    private String cpf;

    private List<Telefone> telefones;

    public Pessoa(){
        telefones = new ArrayList<>();
    }

    public Pessoa(Pessoa pessoa, Optional<Telefone> telefone) {
        this.nome = pessoa.nome;
        this.cpf = pessoa.cpf;
        telefone.ifPresent(telefone1 -> telefones.add(telefone1));
    }

    public Pessoa(String nome, String cpf, Optional<Telefone> telefone){
        this.nome = nome;
        this.cpf = cpf;
        telefone.ifPresent(telefone1 -> telefones.add(telefone1));
    }

}
