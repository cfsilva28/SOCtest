package Steps;


import Base.Base;
import Pages.HomeSocPage;
import Utils.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomeSocSteps extends Base {

    public HomeSocPage homePage;

    private  final WebDriver driver = inicializarDriver();

    private final WebDriverUtils webUtils = new WebDriverUtils(driver);

    @Given("que o usuario esteja pagina inicial do site")
    public void acessarPagina() {
        homePage = new HomeSocPage(driver);
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