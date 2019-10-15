# app-seguranca-server

Grails server com mysql

Dados configurados para acessar o mysql do grails:

user: root

password: 12345678

Para inserir os dados mandar uma requisição POST com as respostas contidas no paramento respostas no body da mensagem.

# Exemplo de inserção via CURL:

curl -i -H "Content-Type:application/json" -X POST localhost:8080/resposta -d '{"respostas":"12345"}'
