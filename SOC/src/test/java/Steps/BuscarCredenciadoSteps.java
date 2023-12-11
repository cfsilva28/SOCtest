package Steps;

import Base.Base;
import Pages.HomeSocPage;
import Pages.RedeCredenciadaPage;
import Pages.SocNetSocPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuscarCredenciadoSteps extends Base {

    private HomeSocPage homeSocPage;

    private RedeCredenciadaPage redeCredenciadaPage;

    private SocNetSocPage socNetSocPage;

    @Given("que o usuario esta na tela de principal")
    public void que_o_usuario_esteja_na_pagina_principal() {
        homeSocPage = new HomeSocPage(inicializarDriver());
    }

    @When("clicar no menu Funcionalidades")
    public void clicar_no_menu_funcionalidades() {
        homeSocPage.clicarMenu("Funcionalidades");
    }

    @And("clicar na opcao Rede SOCNET")
    public void clicar_na_opcao_rede_socnet() {
        homeSocPage.clicarOpcaoMenu("Rede SOCNET");
    }


    @And("clicar no botao Buscar credenciados")
    public void clicar_no_botao_buscar_credenciados() {
        redeCredenciadaPage = new RedeCredenciadaPage(driver);
        redeCredenciadaPage.clicarBotaoRedeCredenciada();
    }

    @And("Pesquisar {string}")
    public void pesquisar(String pesquisa) {
        socNetSocPage = new SocNetSocPage(driver);
        socNetSocPage.pesquisaRedeSocnet(pesquisa);
    }

    @And("clicar no botao Saiba Mais")
    public void clicar_no_botao_saiba_mais() {
        socNetSocPage.selecionarPerfil(0);
    }

    @Then("exibe o perfil")
    public void exibe_o_perfil() {
        socNetSocPage.exibePerfil();
    }

    @After
    public void finalizar() {
        fechaDriver();
    }
}
