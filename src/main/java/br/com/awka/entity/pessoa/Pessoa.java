package br.com.awka.entity.pessoa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NotNull
    private Integer id;

    @NotNull
    @NotBlank(message = "O campo nome é obrigatório")
    @Column(name = "nome")
    private String nome;

    @NotNull
    @NotBlank(message =  "O campo cpf é obrigatório")
    @Column(name = "cpf")
    private String cpf;

    @Transient
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
