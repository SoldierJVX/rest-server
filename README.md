# REST-server

Grails REST server com h2

Deploy no Heroku - https://rest-server-grails.herokuapp.com/

# Executar servidor

<pre>grails run-app</pre>

# Listar dados

http://localhost:8080/resposta

# Inserir dados

Para inserir os dados mandar uma requisição POST com o header contendo a informação ``Content-Type:application/json`` e  as respostas contidas no paramento `respostas` no body da mensagem.

# Exemplo de inserção via CURL:

<pre>curl -i -H "Content-Type:application/json" -X POST localhost:8080/resposta -d '{"respostas":"12345"}'</pre>
