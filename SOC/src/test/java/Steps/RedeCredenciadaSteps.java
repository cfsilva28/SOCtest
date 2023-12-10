package Steps;

import Base.TestBase;
import Pages.HomeSocPage;
import Pages.RedeCredenciadaPage;
import Pages.SocNetSocPage;
import Utils.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;

public class RedeCredenciadaSteps extends TestBase {

    private  final WebDriver driver = inicializarDriver();

    private HomeSocPage homeSocPage;

    private  RedeCredenciadaPage redeCredenciadaPage;

    private SocNetSocPage socNetSocPage;

    private final WebDriverUtils webUtils = new WebDriverUtils(driver);

    @Given("que o usuario esteja pagina inicial do site")
    public void que_o_usuario_esteja_na_pagina_principal() {
        homeSocPage = new HomeSocPage(driver);
        webUtils.saveScreenshotPNG();
    }

    @When("clicar no menu Funcionalidades")
    public void clicar_no_menu_funcionalidades() {
        homeSocPage.clicarMenu("Funcionalidades");
        webUtils.saveScreenshotPNG();
    }

    @And("clicar na opcao Rede SOCNET")
    public void clicar_na_opcao_rede_socnet() {
        homeSocPage.clicarOpcaoMenu("Rede SOCNET");
        webUtils.saveScreenshotPNG();
    }


    @And("clicar no botao Buscar credenciados")
    public void clicar_no_botao_buscar_credenciados() {
        redeCredenciadaPage = new RedeCredenciadaPage(driver);
        redeCredenciadaPage.clicarBotaoRedeCredenciada();
        webUtils.saveScreenshotPNG();
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
    public void finalizar(){fechaDriver();}
}
