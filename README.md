# rest-server

Grails REST server com h2

# Configuração Banco

user: sa

password:

database: jdbc:h2:mem:devDB

# Listar dados

http://localhost:8080/resposta

# Inserir dados

Para inserir os dados mandar uma requisição POST com o header contendo a informação ``Content-Type:application/json`` e  as respostas contidas no paramento `respostas` no body da mensagem.

# Exemplo de inserção via CURL:

curl -i -H "Content-Type:application/json" -X POST localhost:8080/resposta -d '{"respostas":"12345"}'
