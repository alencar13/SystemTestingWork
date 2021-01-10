#language: pt
  @CRUDUsuarios
Funcionalidade: CRUD Processo

  Contexto:
    Dado que o usuário esteja logado na aplicação

  @CriaProcesso
  Cenario: Criar um processo
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
    Quando o usuário clicar no botão salvar
    Então deve mostrar a mensagem "Processo foi criado com sucesso."

  @EditaProcesso
  Cenario: Editar um processo
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
    E o usuário clicar no botão salvar
    E o usuário clica no botão voltar
    E o usuário clica no botão editar do processo cadastrado
    E o usuário preencher o campo "processo_natureza" com o valor "Natureza alterada" na tela de edição
    Quando clicar no botão Salvar na tela de edição
    Então o usuário deveria ver o valor "Natureza alterada" no campo "natureza"

  @ConsultaProcesso
  Cenario: Consulta um processo
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
    E o usuário clicar no botão salvar
    E o usuário clica no botão voltar
    Quando o usuário clica no botão consultar do processo cadastrado
    Então o usuário deveria ver o valor "Vara Criminal 157" no campo "vara"
    Então o usuário deveria ver o valor "1533" no campo "numero"
    Então o usuário deveria ver o valor "Criminal" no campo "natureza"
    Então o usuário deveria ver o valor "Dupla" no campo "partes"
    Então o usuário deveria ver o valor "S" no campo "urgente"
    Então o usuário deveria ver o valor "Joedes Da Silva" no campo "as_social"
    Então o usuário deveria ver o valor "Encaminhado" no campo "status"
    Então o usuário deveria ver o valor "Aguardando solução do processo." no campo "observacao"

  @DeletaProcesso
  Cenario: Deleta um processo
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
    E o usuário clicar no botão salvar
    E o usuário clica no botão voltar
    Quando o usuário clica no botão apagar do processo cadastrado
    E o usuário confirma a deleção
    Então o botão apagar não pode mais existir para o usuário cadastrar

  @CriarProcessoComOutline
  Esquema do Cenario: Criar um processo com Outline
    Dado que o usuário clique no botão Novo Processo
    E o usuário informar o campo Vara igual a "<Vara>"
    E o usuário informar o campo Numero Processo igual a "<Numero Processo>"
    E o usuário informar o campo Natureza igual a "<Natureza>"
    E o usuário informar o campo Partes igual a "<Partes>"
    E o usuário informar o campo Urgente igual a "<Urgente>"
    E o usuário informar o campo Arbitramento igual a Sim
    E o usuário informar o campo Assistente social igual a "<Assistente social>"
    E o usuário informar o campo Data entrada igual a "<Data entrada>"
    E o usuário informar o campo Data saída igual a "<Data saída>"
    E o usuário informar o campo Data agendamento igual a "<Data agendamento>"
    E o usuário informar o campo Status igual a "<Status>"
    E o usuário informar o campo Observação igual a "<Observação>"
    Quando o usuário clicar no botão salvar
    Então deve mostrar a mensagem "Processo foi criado com sucesso."

    Exemplos:
      | Vara        | Numero Processo | Natureza  |  Partes       | Urgente  | Assistente social | Data entrada  | Data saída | Data agendamento | Status        | Observação                            |
      | Criminal1   | 1533            | Criminal  |  LucasXJanes  | Sim      |  Joedes Da Silva  | 10/05/2020    | 15/01/2021 | 13/09/2021       | Encaminhado   | Aguardando solução do processo.       |
      | Criminal2   | 1534            | Criminal1 |  LucasXJanes  | Sim      |  Joedes Romano    | 11/07/2021    | 16/02/2022 | 14/10/2022       | Em Análise    | Aguardando solução do processo dois.  |