Feature: BuscarCredenciado
  Scenario Outline: Usuario Pesquisa Rede Credenciada no Menu
    Given que o usuario esteja pagina inicial do site
    When clicar no menu Funcionalidades
    And clicar no botao Buscar credenciados
    And pesquisar "<pesquisa>"
    And clicar no botao Saiba Mais
    Then exibe o perfil

    Examples:
    | pesquisa  |
    | Sao Paulo |