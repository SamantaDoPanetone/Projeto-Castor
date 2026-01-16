# Projeto-Castor
wrapperVersion=3.3.4
distributionType=only-script
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.12/apache-maven-3.9.12-bin.zip

package br.com.restaurante.castor.daos;

import br.com.restaurante.castor.domain.Pessoa;

import java.util.List;

public interface ExamplePessoaDao
{
    List<Pessoa> searchPessoaByName(String nome);
}
