# integracao-financeira

## Modelagem de dados

O banco de dados do projeto será de um banco de dados não relacional implementado pelo Cassadra. Pois por não existir necesidade de uma complexidade nas consultas e se exigir peformance com um crescimento horizontal. Conta com 2 documentos(tb_user e tb_favorecido) que são relacionados pelo cpf e possuem uma relação 1 para n onde, pois uma usuário possui n favorecidos.. O repositório será acesso exclusivamente pelo microserviço users-ms. 

## Observability

O micrometer-ms será o microserviço responsável por alimentar o grafana atravéz dos serviços http disponibilizados pelo actuator.

## Desenho da Arquiterura do Projeto

![Desenho Projeto](https://user-images.githubusercontent.com/41656615/114122429-9d9a1700-98c6-11eb-87ed-19076ffb5874.png)

