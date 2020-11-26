
# API Bancos - Teste Revgas
## Introdução

API feita em Spring Boot para o Teste de desenvolvedor back-end

## Descrição

Essa API é conectada com um banco de dados com uma única tabela chamada **Bancos** que possui o **Código de compensação** e o **Nome do banco**.
Possui duas funcionalidades como o que foi requisitado:

GET /bancos: Listagem de todos os bancos
GET /bancos/{código de compensação}: Consultar um banco baseado em seu código

## Utilização

- Execute o arquivo **create_table.sql** para criar a tabela na base de dados e em seguida o arquivo **inserts.sql** para povoar a base de dados
- No terminal dentro da pasta raiz execute o seguinte comando para iniciar a aplicação
```
mvnw spring-boot:run
```
- A API estará recebendo requisições na URL **localhost:8080/bancos**
