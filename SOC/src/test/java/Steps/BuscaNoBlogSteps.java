package Steps;


import Base.Base;
import Pages.HomeSocPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuscaNoBlogSteps extends Base {

    public HomeSocPage homePage;

    @Given("que o usuario esteja pagina inicial do site")
    public void que_o_usuario_esteja_pagina_inicial_do_site() {
        homePage = new HomeSocPage(inicializarDriver());
    }

    @When("clicar na lupa de pesquisa")
    public void pesquisar() {
        new HomeSocPage(driver).ClicarLupa();
    }

    @And("informar o {string}")
    public void informar_o(String pesquisa) {
        homePage.preencherCampoPesquisa(pesquisa);
    }

    @Then("exibir o resultado da pesquisa")
    public void exibe_resultado_pesquisa() {
        homePage.verificarSePresenteNaPesquisa();
    }

    @After
    public void finalizar() {
        fechaDriver();
    }
}