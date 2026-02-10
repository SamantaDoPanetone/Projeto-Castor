# Sistema de Restaurante

## Introdução

Este projeto consiste em um **sistema de restaurante desenvolvido com foco em estudo e aprendizado**.  
Ele foi criado para explorar conceitos de arquitetura de software, desenvolvimento backend com Java/Spring e construção de aplicações web, servindo como base para experimentação, evolução e aprofundamento técnico.


### Stack Tecnológico
- Java 17
- Spring Boot 3.2.x
- Flyway
- JPA / Hibernate
- Thymeleaf

---

## Requisitos de Ambiente

### Java
- Java 17

> O projeto foi desenvolvido utilizando recursos compatíveis com Java 11+, sendo Java 17 a versão recomendada para novos desenvolvimentos.

---

### Banco de Dados

- PostgreSQL — ambiente de estudo com banco externo

A escolha do banco pode ser alterada via configuração no `application.yml` ou `application.properties`.

---

## Principais Dependências

As principais dependências utilizadas no projeto são:

- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Boot Starter Rest Client
- Spring Boot Starter Data JPA
- Banco de dados ( PostgreSQL )
- Driver JDBC ( PostgreSQL )

Gerenciamento de dependências realizado via **Spring Boot Starter Parent**.

---

## Gerenciamento de Build

- Maven
- `pom.xml` como arquivo central de configuração

---

## Compilação do Projeto

Para compilar o projeto:

```bash
cd castor (raiz do projeto)

mvn clean install -DskipTests

Nota: o uso de -DskipTests serve para pular os testes
```

Executar o projeto:

```bash
cd castor-web (acessar o modulo web)

mvn spring-boot:run
```

Executar o projeto após implantado:

```bash
java -jar target/castor-web-0.0.1.jar
```

Inicializar o Spring Boot em modo debug

```bash
MAVEN_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005" \
mvn spring-boot:run
```

Reparar flyway em caso de script com erros

```bash
mvn flyway:repair
```

Caso ocorra erros de execução parcial nas tabelas e precise limpar tudo  
Nota: Faça isso somente em DEV/QA e para PROD, fazer dump antes

```bash
mvn flyway:clean -Dflyway.cleanDisabled=false
```

## Acessar páginas

- Exemplo de acesso com parametro de pesquisa
- Sem parametro faz uma busca de todos os dados

```bash
http://localhost:8080/page?name=Maria
http://localhost:8080/page
```

- Exemplo de acesso a página de estilos Bootstrap

```bash
http://localhost:8080/style
```

# Objetivo desse projeto

Este projeto é um **sistema de restaurante desenvolvido com fins exclusivamente acadêmicos e de estudo**.  
Seu objetivo é explorar conceitos de arquitetura de software, backend com Java/Spring, persistência de dados, migrations, e construção de interfaces web.

⚠️ **Aviso importante**  
Este sistema **não foi projetado, validado ou auditado para uso em produção**.  
Qualquer utilização em ambientes reais, comerciais ou críticos deve passar por **análise técnica, validação de segurança, testes aprofundados e adequações específicas**.

Os autores **não se responsabilizam** por uso indevido, perdas de dados, falhas operacionais ou qualquer impacto decorrente do uso deste projeto fora do contexto de estudo.

Em resumo:
- 📘 Projeto acadêmico
- 🧪 Foco em aprendizado e experimentação
- 🚫 Não recomendado para produção sem avaliação formal