package br.com.awka.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class PessoaDTO implements Serializable {

    @Id
    private Integer id;
    @NotNull
    private String nome;
    @NotNull
    private String cpf;

}
