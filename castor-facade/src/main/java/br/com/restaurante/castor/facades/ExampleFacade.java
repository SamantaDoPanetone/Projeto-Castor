package br.com.restaurante.castor.facades;

import br.com.restaurante.castor.dtos.PessoaDTO;
import br.com.restaurante.castor.dtos.PessoaFormDTO;

import java.util.List;

public interface ExampleFacade
{
    List<PessoaDTO> findAllPessoas();

    List<PessoaDTO> searchPessoaByName(String name);

    PessoaDTO findByName(String name);

    void save(PessoaFormDTO pessoaDTO);

    void delete(Long id);
}
