#language: pt
Funcionalidade: CRUD Usuário

  Contexto:
    Dado que o usuário esteja logado na aplicação

  @CriarUsuario
  Cenario: Criar um usuário
    Dado que o usuário clique no botão Novo Processo
    E o usuário informar o campo Vara igual a "Vara Criminal 157"
    E o usuário informar o campo Numero Processo igual a "1533"
    E o usuário informar o campo Natureza igual a "Criminal"
    E o usuário informar o campo Partes igual a "Dupla"
    E o usuário informar o campo Urgente igual a "Sim"
    E o usuário informar o campo Arbitramento igual a Sim
    E o usuário informar o campo Assistente social igual a "Joedes Da Silva"
    E o usuário informar o campo Data entrada igual a "10/05/2020"
    E o usuário informar o campo Data saída igual a "15/01/2021"
    E o usuário informar o campo Data agendamento igual a "13/09/2021"
    E o usuário informar o campo Status igual a "Encaminhado"
    E o usuário informar o campo Observação igual a "Aguardando solução do processo."
    Quando clicar no botão Salvar
    Então deve mostrar a mensagem "Processo foi criado com sucesso."