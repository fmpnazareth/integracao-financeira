# integracao-financeira
O projeto integracao-financeira irá contar com um total de 7 microserviços.

## gateway-ms
Servidor responsável por realizar as rotas e validar autenticação.

## auth-ms
Servidor responsável por realizar a autenticação.

## servicos-mobile-ms
Servidor responsável pela API de toda interface mobile. Será ela que chamará o microserviço favorecidos-ms.

## favorecidos-ms
Servidor que receberá a chamada do microserviço servicos-mobile-ms, fará as devidas validações, buscará no banco a lista de clientes favorecidos.

## eureka-ms
Servidor que irá realizar o balanceamento de carga e failover de microserviços, além de ser um facilitador na subida de instâncias e no processo de roterização.

## micrometer-ms
O micrometer-ms será o microserviço responsável por alimentar o Grafana atravéz dos serviços http disponibilizados pelo actuator.

## Modelagem de dados

O banco de dados do projeto será de um banco de dados não relacional implementado pelo Cassadra. Pois por não existir necesidade de uma complexidade nas consultas e se exigir peformance com um crescimento horizontal. Conta com 2 documentos(tb_user e tb_favorecido) que são relacionados pelo cpf e possuem uma relação 1 para n onde, pois uma usuário possui n favorecidos.. O repositório será acesso exclusivamente pelo microserviço users-ms. 

## Observability

O projeto irá contar com um servidor apartado do Grafana que irá consumir o microserviço micrometer-ms. O Grafana irá gerar os relátorios que serão úteis para avaliar a o sistema como um todo.

## Desenho da Arquiterura do Projeto

![Desenho Projeto](https://user-images.githubusercontent.com/41656615/114124071-f4edb680-98c9-11eb-82ef-e463a3874dd4.png)


