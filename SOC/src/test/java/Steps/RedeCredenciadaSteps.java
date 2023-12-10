package Steps;

import Base.TestBase;
import Pages.HomeSocPage;
import Pages.RedeCredenciadaPage;
import Utils.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RedeCredenciadaSteps extends TestBase {

    private WebDriver driver = inicializarDriver();

    private HomeSocPage homeSocPage;

    private RedeCredenciadaPage redeCredenciadaPage;

    private WebDriverUtils webUtils = new WebDriverUtils(driver);

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

    @And("clicar no botao Buscar credenciados")
    public void clicar_no_botao_buscar_credenciados() {
        redeCredenciadaPage = new RedeCredenciadaPage(driver);
        redeCredenciadaPage.clicarBotaoRedeCredenciada();
        webUtils.saveScreenshotPNG();
    }
}
