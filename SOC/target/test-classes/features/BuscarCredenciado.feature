Feature: BuscarCredenciado

  Scenario Outline: Usuario Pesquisa Rede Credenciada no Menu
    Given que o usuario esta na tela de principal
    When clicar no menu Funcionalidades
    And clicar na opcao Rede SOCNET
    And clicar no botao Buscar credenciados
    And Pesquisar "<pesquisa>"
    And clicar no botao Saiba Mais
    Then exibe o perfil

    Examples:
      | pesquisa  |
      | Sao Paulo |
