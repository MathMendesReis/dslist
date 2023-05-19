# Backend Java - Lista de Jogos
Este é um backend desenvolvido em Java usando o framework Spring Boot para fornecer uma API para gerenciar uma lista de jogos. Ele possui três endpoints principais para acessar os dados dos jogos.

# Documentação

[Postman](https://documenter.getpostman.com/view/24880324/2s93m1a4xk)

## Endpoints
* GET /api/games

Este endpoint retorna todos os jogos disponíveis na lista.

* GET /api/games/{id}

Este endpoint retorna um jogo específico com base no seu ID. O parâmetro {id} deve ser substituído pelo ID do jogo desejado.

- GET /api/games?type={type}

Este endpoint retorna uma lista de jogos com base no tipo especificado. O parâmetro {type} deve ser substituído pelo tipo desejado.

## Configuração
O projeto foi desenvolvido usando o Spring Boot, portanto, você pode executá-lo como um aplicativo Java padrão. Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

Clone este repositório em sua máquina local.

Navegue até o diretório do projeto e abra-o em sua IDE preferida.

Certifique-se de que as dependências do projeto sejam baixadas e configuradas corretamente.

Execute o aplicativo Java e verifique o console para ver a porta em que o servidor está sendo executado.