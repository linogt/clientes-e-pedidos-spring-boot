# clientes-e-pedidos-spring-boot

## Sobre o projeto

O projeto consiste na criação de uma api em Java que armazena clientes, pedidos e os produtos que estão contidos nesse pedido.

## Tecnologias utilizadas

* Java
* Spring Framework
* Eclipse IDE

## Dependencias do Spring utilizadas

* Spring Data JPA
* Spring Web
* Spring DevTools
* Spring Validation
* Lombok

## Estrutura do Banco de Dados


![diagramaspring](https://user-images.githubusercontent.com/75547468/221428171-a2e34879-f0a9-4ccb-9704-39652f942881.png)

## Explicando o projeto por pacotes

### Entity

O Pacote entity é utilizado parar a criação das tabelas do banco de dados em formato Java. Nesse pacote foi utilizado o Java Persistence para as anotações 
que marcam o que cada atributo se refere no banco de dados, o Lombok para a anotação @Data que introduz os getters, setters, 
toString e construtores, e o Spring Validator para a anotação @CPF que valida o atributo CPF na estrutura dos CPF's brasileiros. 

### Repository

O Pacote repository é utilizado para fazer a ligação com o banco de dados. O pacote consiste numa interface que extende o JPA Repository e utiliza como 
argumentos a tabela que esse repósitorio armazenará e o tipo do atríbuto Id. Além dos métodos já pré-existentes no JPA Repository, nesse pacote é possível 
criar "Query Methods" utilizando condições criadas por meio da linguagem SQL.

### Controller

O Pacote controller é utilizado para fazer as requisições web, nele é implementado os métodos Get (Buscar um cliente), Put (Atualizar um cliente),
Post (Criar um cliente), Delete (Deletar um cliente). Os Id's dos métodos Get, Put e Delete são passados via URL.

### Classes DTO

As classes DTO são utilizadas quando uma tabela possui chaves estrangeiras e atríbutos de outras tabelas. Criamos essas classes como uma boa prática pois
elas são utilizadas nos métodos da classe controller da sua respectiva entidade. Por Exemplo, ao fazer o Get de um pedido o usuário, além dos atributos da 
entidade Pedido, espera que obtenha dados da tabela cliente como nome e cpf, pórem, esses atríbutos não estão na entidade pedido, assim, surge a necessidade
da criação de uma classe InformaçõesPedidoDTO() com todos os atríbutos que o usuário espera receber.

### Service

O Pacote service é utilizado para fazer a ligação entre Repository e Controller. No caso do projeto ele foi utilizado para criação das classes DTO e aleração
do Status do pedido. 

## Validation

O Pacote validation é utilizado para verificar se uma lista é vazia ou nula.

### Exception

O Pacote excpetion é utilizado para o tratamento de exceções.

### Enums

O Pacote enums é utilizado para criar o status Cancelado e Aprovado do pedido. 

### Config

O Pacote Config é utilizado para configurar as mensagems de exceções que são passadas via arquivo "messages.properties".

## Autor

Gabriel Lino Topa Garcia
