package br.com.awka.service;

import br.com.awka.dao.PessoaDAO;
import br.com.awka.dto.PessoaDTO;
import br.com.awka.entity.pessoa.Pessoa;
import br.com.awka.parser.PessoaParser;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.List;

public class PessoaService {

    @Inject
    private PessoaDAO pessoaDAO;

    @Inject
    private PessoaParser pessoaParser;

    public List<PessoaDTO> buscarPessoas(){
        List<PessoaDTO> pessoaDTOS = null;
        try {
            pessoaDTOS = pessoaParser.toDTO(pessoaDAO.list());
        } catch(Exception e){
          System.out.println("Não foi possivel realizar a consulta ".concat(e.getMessage()));
          return null;
        }
        return pessoaDTOS;
    }

    public PessoaDTO buscarPessoa(Integer id){
        PessoaDTO pessoaDTO = null;
        try {
            pessoaDTO = pessoaParser.toDTO(pessoaDAO.findById(id));
        }catch (Exception e){
            System.out.println("Não foi possivel realizar a consulta ".concat(e.getMessage()));
            return null;
        }
        return pessoaDTO;
    }

    public void cadastrar(PessoaDTO pessoaDTO) throws Exception {
        if(StringUtils.isNotEmpty(pessoaDTO.getNome()) && StringUtils.isNotEmpty(pessoaDTO.getCpf())){
            pessoaDAO.insert(pessoaParser.toEntity(pessoaDTO));
        }else{
            throw new Exception("Não foi possivel cadastrar");
        }
    }

    public PessoaDTO alterar(Integer id, PessoaDTO pessoaDTO) throws Exception {
        PessoaDTO pessoaDTOUpdate = null;
        if(StringUtils.isNotEmpty(pessoaDTO.getNome()) && StringUtils.isNotEmpty(pessoaDTO.getCpf())){
            if(StringUtils.isNotEmpty(id.toString())){
                Pessoa pessoa = pessoaDAO.findById(id);
                if(pessoa != null){
                    pessoaDTOUpdate = pessoaParser.toDTO(pessoaDAO.update(pessoaParser.toEntity(pessoaDTO)));
                }else{
                    throw new Exception("Não foi possivel alterar pessoa ");
                }
            }
            return null;
        }
        return pessoaDTOUpdate;
    }

    public void excluir(Integer id) throws Exception {
        if(StringUtils.isNotEmpty(id.toString())){
            PessoaDTO pessoa = buscarPessoa(id);
            if(pessoa != null){
                pessoaDAO.remove(pessoaParser.toEntity(pessoa));
            }else{
                throw new Exception("Não foi possivel excluir pessoa");
            }
        }
    }
}
