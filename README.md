CRUD_Play_Framework
===================

Implementação de um CRUD básico utilizando o Play Framework 2.2.3

#Introdução
A aplicação consiste em um CRUD de produtos, onde você conseguirá adicionar, editar ou excluir um produto com facilidade.
A aplicação disponibiliza ainda 2 serviços REST:

1. Você pode obter um array no formato json com todos os produtos cadastrados no sistema através da url: seu_dominio/products/all
2. Você pode obter um objeto no formato json que representa um produto de acordo com um id passado pela url: seu_dominio/get/id_do_produto

#Como utilizar

1. Faça o download ou clone a aplicação
2. Baixe o e instale Play Framework versão 2.2.3 [Veja como aqui](http://www.playframework.com/documentation/2.2.x/Installing)
3. Abra o prompt de comando do seu sistema operacional e navegue até a pasta onde você inseriu a aplicação
4. Execute a aplicação com o comando:

``` 
$ play run

```

5. Sua aplicação ficará disponível no endereço seu_dominio:9000
