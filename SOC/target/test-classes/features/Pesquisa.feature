Feature: Pesquisa
  Scenario Outline: Usuario realiza pesquisa no blog
    Given que o usuario esteja pagina inicial do site
    When clicar na lupa de pesquisa
    And informar o "<pesquisa>"
    Then exibir o resultado da pesquisa

    Examples:
    | pesquisa  |
    | São Paulo |