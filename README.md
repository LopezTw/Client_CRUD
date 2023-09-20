<h1 align="center">API REST, Estruturação de Camadas, CRUD, Exceções e Validações</h1>
</br>
<h2>📝 Descrição</h2>
<p align="center">Esse repositório tem como objetivo praticar a criação de um projeto SpringBoot contendo um CRUD completo de Web Services REST para acessar um recurso de Clientes.</p>
</br>
<p><b>Contendo as Cinco operações básicas:</b></p>
<ul>- Busca paginada de recursos</ul>
<ul>- Busca de recurso por id</ul>
<ul>- Inserir novo recurso</ul>
<ul>- Atualizar recurso</ul>
<ul>- Deletar recurso</ul>
</br>

<h2>🔧 Tecnologias utilizadas</h2>
<p>Foi utilizando o Spring Boot + Hibernate/JPA e o banco H2 </p>

<h2>🚀 Rodando o projeto</h2>
<p>No estado atual do projeto, você precisará clonar o repositório e testar no Postman as requisições.</p>
<p>Para acessar o banco h2, basta entrar pelo localhost:8080 após executar a aplicação no Spring, as informações default na tela de login do H2 já estarão pré-preenchidas por padrao, basta entrar direto.</p>
<p>Para testar as requisições, segue abaixo alguns comandos:</p>
</br>
<p><b>• Busca de cliente por ID:</b></p>
<ul>GET: /clients/1 </ul>
</br>
<p><b>• Busca paginada de clientes:</b></p>
<ul>GET: /clients?page=0&size=6&sort=name </ul>

</br>

<p><b>• Inserção de novo cliente:</b></p>
<ul>POST: /clients </ul>

<p>{
 <p>"name": "Maria Silva",</p>
 <p>"cpf": "12345678901",</p>
 <p>"income": 6500.0,</p>
 <p>"birthDate": "1994-07-20",</p>
 <p>"children": 2</p>
}</p>

</br>

<p><b>• Atualização de cliente:</b></p>
<ul>PUT: /clients/1 </ul>
<p>{
 <p>"name": "Maria Silvaaa",</p>
 <p>"cpf": "12345678901",</p>
 <p>"income": 6500.0,</p>
 <p>"birthDate": "1994-07-20",</p>
 <p>"children": 2</p>
}</p>

</br>

<p><b>• Deleção de cliente:</b></p>
<ul>DELETE: /clients/1 </ul>

</br>

<p><b>Caso queria testar as exeções personalidas, aqui vai um Checklist pra teste:</b></p>
<p>CHECKLIST:</p>
<ul>1. Busca por id retorna cliente existente</ul>
<ul>2. Busca por id retorna 404 para cliente inexistente</ul>
<ul>3. Busca paginada retorna listagem paginada corretamente</ul>
<ul>4. Inserção de cliente insere cliente com dados válidos</ul>
<ul>5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos</ul>
<ul>6. Atualização de cliente atualiza cliente com dados válidos</ul>
<ul>7. Atualização de cliente retorna 404 para cliente inexistente</ul>
<ul>8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos</ul>
<ul>9. Deleção de cliente deleta cliente existente</ul>
<ul>10. Deleção de cliente retorna 404 para cliente inexistente</ul>
</br>
<h2>🔜 Implementação futura</h2>
<p><ul> • Expansão para algo mais completo que envolva outras entidades. </ul></p>
<p><ul> • Implementação de algumas lógicas pra tratar informações mais especificas como por exemplo a validação do CPF.</ul></p>

<h2>🎯 Status do projeto</h2>
- Como se trata apenas de um projeto simples, o estado atual dele está FINALIZADO.

