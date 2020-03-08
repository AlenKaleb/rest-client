package br.com.awka.pessoa;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Getter
@Setter
public class Telefone {

    @NotNull
    private String telefone;
    private String tipo;

    public Telefone(){

    }

    public Telefone(String telefone, Optional<String> tipo){
        this.telefone =  telefone;
        tipo.ifPresent(tipo1 -> this.tipo = tipo1);
    }

}
