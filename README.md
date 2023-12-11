# SOCtest - Automação de Testes WEB

## Projeto de Automação de Testes

Este projeto consiste em testes de automação utilizando Selenium WebDriver e Cucumber para verificar as funcionalidades do site [SOC](https://www.soc.com.br/).

### Pré-requisitos

Certifique-se de ter o seguinte instalado em sua máquina:

- **Java Development Kit (JDK) 17**
- Maven
- Git
- Scoop

### Configuração do Ambiente

1. Clone este repositório:

    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```

2. Instale o Allure Framework usando o Scoop:

    ```bash
    scoop install allure
    ```

### Executando os Testes

Para executar os testes, abra um terminal na pasta do projeto e execute o seguinte comando:

```bash
mvn clean test

## Gerando e Visualizando Relatórios

Para gerar e visualizar o relatório do Allure, execute os seguintes comandos:

1. Gere os resultados do Allure:

    ```bash
    allure serve target/allure-results
    ```

2. Isso abrirá uma página da web local com o relatório gerado.

Lembre-se de que é necessário ter o Java configurado corretamente na sua máquina, com a variável de ambiente `JAVA_HOME` apontando para a instalação do Java.

Este projeto utiliza o Cucumber para escrever cenários de teste em linguagem natural e o Selenium WebDriver para interagir com o navegador.

### Estrutura do Projeto

- **BuscarCredenciado.feature:** Testa a funcionalidade de buscar credenciados no site.
- **BuscarNoBlog.feature:** Testa a funcionalidade de realizar pesquisas no blog do site.

Cada feature possui cenários de teste escritos em Gherkin, e os passos dos cenários são implementados em Java nos pacotes `Steps` e `Pages`.

Observação: Certifique-se de que o ChromeDriver está no PATH do sistema ou ajuste o caminho no código conforme necessário.

## Autor

Cesar Silva



