#language: pt
Funcionalidade: CRUD Usuário

  Contexto:
    Dado que o usuário esteja logado na aplicação

  Cenario: Crud usuario
    Dado que o usuário esteja na página inicial
    E clique no menu lateral Usuário
    E clique no botão Novo Usuário
    E preencher os campos obrigatórios
    Quando clicar no botão Salvar
    Então deve mostrar a mensagem "Usuário foi criado com sucesso."