package br.com.restaurante.castor.exceptions;

public class PessoaNotFoundException extends RuntimeException
{
    public PessoaNotFoundException(Long id)
    {
        super("Pessoa nao encontrada, Id: " + id);
    }
}
