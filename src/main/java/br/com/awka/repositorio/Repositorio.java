package br.com.awka.repositorio;

import br.com.awka.pessoa.Pessoa;

import javax.inject.Inject;
import java.util.List;

public class Repositorio {

    @Inject
    private List<Pessoa> pessoas;

    /**public List<Pessoa> listaPessoas(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alen Kaleb");
        pessoa.setCpf("324.562.342.23");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Alen Kaleb");
        pessoa2.setCpf("324.562.342.23");
        pessoas.add(pessoa2);

        return pessoas;
    }

    public void inserirPessoa(Pessoa novaPessoa){
        this.pessoas.add(novaPessoa);
    }

    public void alterarPessoa(Pessoa pessoa, Long id){
        this.pessoas.forEach(pessoa1 -> {
            if(pessoa1.getId() == pessoa.getId()){
                pessoa1 = pessoa;
            }
        });
    }

     public void excluirPessoa(Long id){
        this.pessoas.remove(this.pessoas.forEach(pessoa -> {
            if(pessoa.getId() == id){
                return pessoa;
            }
        }));
    } */

}
