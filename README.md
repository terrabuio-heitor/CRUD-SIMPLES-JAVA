# CRUD de Clientes em Java

Este é um projeto simples em **Java** com interface gráfica (**Swing**) que implementa as operações básicas de um CRUD (Create, Read, Update, Delete) para gerenciar clientes em um banco de dados.

## Funcionalidades

* Inserir cliente (ID e Nome)
* Consultar cliente pelo ID
* Alterar dados de um cliente existente
* Excluir cliente do banco de dados
* Listar todos os clientes
* Fechar a aplicação

## Tecnologias utilizadas

* Java SE
* Swing (interface gráfica)
* JDBC (conexão com banco de dados)
* MySQL (banco relacional)

## Pré-requisitos

* [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/)
* MySQL instalado e em execução
* Tabela `tb_cliente` criada no banco `Loja`:

```sql
CREATE DATABASE Loja;
USE Loja;

CREATE TABLE tb_cliente (
  id_cliente INT PRIMARY KEY,
  nm_cliente VARCHAR(50)
);
```

## Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/terrabuio-heitor/CRUD-SIMPLES-JAVA.git
```

2. Abra o projeto em uma IDE de sua preferência (NetBeans, Eclipse ou IntelliJ).

3. Configure a conexão JDBC no código (`ConexaoBD.java`) com suas credenciais do MySQL:

```java
String url = "jdbc:mysql://localhost:3306/Loja";
String user = "seu_usuario";
String password = "sua_senha";
```

4. Execute o projeto:

* Pela IDE: execute a classe `Cadastro.java`.
* Pelo terminal, caso já tenha gerado o `.jar` no NetBeans (*Clean and Build*):

```bash
java -jar dist/Agenda.jar
```

## Observações

* Certifique-se de que o MySQL esteja rodando antes de executar o programa.
* Se o `.jar` não funcionar, verifique se o driver JDBC está incluído no projeto.