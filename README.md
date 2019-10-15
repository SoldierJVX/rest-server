# app-seguranca-server

Grails REST server com mysql

# Configuração Banco

user: root

password: 12345678

# Listar dados

http://localhost:8080/resposta

# Inserir dados

Para inserir os dados mandar uma requisição POST com as respostas contidas no paramento 'respostas' no body da mensagem.

# Exemplo de inserção via CURL:

curl -i -H "Content-Type:application/json" -X POST localhost:8080/resposta -d '{"respostas":"12345"}'
