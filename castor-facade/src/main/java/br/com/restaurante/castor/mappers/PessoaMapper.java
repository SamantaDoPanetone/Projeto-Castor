package br.com.restaurante.castor.mappers;

import br.com.restaurante.castor.domain.Pessoa;
import br.com.restaurante.castor.dtos.PessoaDTO;
import br.com.restaurante.castor.dtos.PessoaFormDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PessoaMapper
{
    PessoaDTO pessoaToDTO(Pessoa pessoa);

    List<PessoaDTO> pessoasToDTOList(List<Pessoa> pessoas);

    Pessoa dtoToPessoa(PessoaFormDTO pessoaDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    void updatePessoaFromDto(PessoaFormDTO pessoaDTO,  @MappingTarget Pessoa pessoa);
}
