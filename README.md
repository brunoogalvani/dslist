# DSList

![postman dslist](https://github.com/user-attachments/assets/6a0346e7-8a26-4b38-9bfb-0011e2326fb7)

Um projeto desenvolvido com Spring Boot para a criação e gerenciamento de listas de jogos. O sistema permite que os usuários organizem seus jogos favoritos em listas personalizadas através de uma API robusta e eficiente.

## Funcionalidades

* Endpoints RESTful: Fornece API para gerenciamento de listas de jogos.
* Organização de dados: Permite ordenar e personalizar listas.
* Conexão com banco de dados: Implementação com H2.

## Tecnologias Utilizadas

* Spring Boot: Framework para construção do backend.
* Java: Linguagem principal para a lógica do servidor.
* Banco de Dados: H2 (para testes).
* Ferramentas: Maven, Postman, Git.

## Estrutura do Projeto

* controllers/
> Contém os controladores responsáveis por gerenciar as requisições HTTP e definir os endpoints da API.

* dto/
> Define os objetos de transferência de dados (DTOs), usados para transportar dados entre o cliente e o servidor.

* entities/
> Representa as entidades do domínio do sistema, mapeando as tabelas do banco de dados.

* projections/
> Interfaces que projetam consultas específicas, otimizando o acesso aos dados.

* repositories/
> Interfaces responsáveis pelo acesso aos dados, seguindo o padrão Repository.

* services/
> Contém a lógica de negócios da aplicação, separando as regras de manipulação de dados dos controladores.

* DslistApplication.java
> Classe principal do projeto, responsável por inicializar a aplicação Spring Boot.

## Como Executar o Projeto

1. Abra o terminal e clone o repositório com o seguinte código:
```
git clone https://github.com/brunoogalvani/dslist.git
```
2. Inicie o projeto.

3. O servidor estará disponível em http://localhost:8080.

## Configuração do Banco de Dados

### Banco H2 (para desenvolvimento/testes)

O projeto está configurado para usar o banco de dados em memória H2 por padrão. Acesse o console pelo link: http://localhost:8080/h2-console
