#language: pt
  @CRUDUsuarios
Funcionalidade: CRUD Processo

  Contexto:
    Dado que o usuário esteja logado na aplicação
    E que o usuário clique no botão Novo Processo
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

  @CriaProcesso
  Cenario: Criar um processo
    Quando o usuário clicar no botão salvar
    Então deve mostrar a mensagem "Processo foi criado com sucesso."

  @EditarUmUsuario
  Cenario: Editar um novo processo
    E o usuário clicar no botão salvar
    E o usuário clica no botão voltar
    E o usuário clica no botão editar do processo cadastrado
    E o usuário preencher o campo "processo_natureza" com o valor "Natureza alterada" na tela de edição
    Quando clicar no botão Salvar na tela de edição
    Então o usuário deveria ver o valor "Natureza alterada" no campo "natureza"