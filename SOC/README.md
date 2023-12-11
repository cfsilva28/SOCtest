**Projeto de Automação de Testes**



Este projeto consiste em testes de automação utilizando Selenium WebDriver e Cucumber para testar as funcionalidades do site https://www.soc.com.br/.

Pré-requisitos
Certifique-se de ter o seguinte instalado em sua máquina:

Java
Maven
Git
Scoop
**Configuração do Ambiente**

1. Clone este repositório: git clone https://github.com/seu-usuario/nome-do-repositorio.git
2. Instale o Allure Framework usando o Scoop: scoop install allure

**Executando os Testes**

Para executar os testes, abra um terminal na pasta do projeto e execute o seguinte comando: mvn clean test

Isso irá baixar as dependências, compilar o código e executar os testes. Os resultados dos testes serão gerados no formato do Allure.




**Projeto de Automação de Testes**

Este projeto consiste em testes de automação utilizando Selenium WebDriver e Cucumber para testar as funcionalidades do site https://www.soc.com.br/.

**Pré-requisitos**

Certifique-se de ter o seguinte instalado em sua máquina:

Java
Maven
Git
Scoop
Configuração do Ambiente

**Clone este repositório**:git clone https://github.com/seu-usuario/nome-do-repositorio.git

**Instale o Allure Framework usando o Scoop:** _scoop install allure_

**Executando os Testes**

Para executar os testes, abra um terminal na pasta do projeto e execute o seguinte comando: _mvn clean test_

Isso irá baixar as dependências, compilar o código e executar os testes. Os resultados dos testes serão gerados no formato do Allure.

**Gerando e Visualizando Relatórios**

Para gerar e visualizar o relatório do Allure, execute os seguintes comandos: 

1. Gere os resultados do Allure: _allure serve_ **ou** _allure serve target/allure-results_
2. Isso abrirá uma página da web local com o relatório gerado.

Lembre-se de que é necessário ter o Java configurado corretamente na sua máquina e a variável de ambiente **JAVA_HOME** apontando para a instalação do Java.

Este projeto utiliza o Cucumber para escrever cenários de teste em linguagem natural e o Selenium WebDriver para interagir com o navegador.

Os testes estão organizados em duas features:

1. **BuscarCredenciado.feature**: Testa a funcionalidade de buscar credenciados no site.
2. **BuscarNoBlog.feature:** Testa a funcionalidade de realizar pesquisas no blog do site.

Cada feature possui cenários de teste escritos em Gherkin, e os passos dos cenários são implementados em Java nos pacotes **Steps** e **Pages**.

Observação: Certifique-se de que o ChromeDriver está no PATH do sistema ou ajuste o caminho no código conforme necessário.


## Autor

_Cesar Silva_