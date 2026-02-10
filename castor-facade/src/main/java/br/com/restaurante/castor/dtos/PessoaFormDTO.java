package br.com.restaurante.castor.dtos;

public class PessoaFormDTO
{
    private Long id;
    private String name;

    public PessoaFormDTO()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
