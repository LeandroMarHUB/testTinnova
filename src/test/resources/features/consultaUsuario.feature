# language: pt

  Funcionalidade: Consulta de usuario
     Eu como gerente quero acessar o site e consultar um usuario

    Cenario: Consultar usuario
       Dado que eu estou no site da Timnova
       Quando aceeso a aplicação e procuro o usuario Luiz Souza
       E clico no botão de mais
       Então o sistema me permite acessar as informaçoes do usuario



    Cenario: Editar Usuario
      Dado que eu ja tenha acessado o site
      E procuro o usuario que eu quero editar
      Quando eu clico no botão editar
      E edito o Email do usuario
      Entao o sistema permite que eu edite o email do usuario


    Cenario: Deletar Usuario
      Dado que eu ja tenha acessado o site
      Quando encontro o usuario que sera deletado
      E clico no botão deletar
      Entao o usuario foi deletado com sucesso

