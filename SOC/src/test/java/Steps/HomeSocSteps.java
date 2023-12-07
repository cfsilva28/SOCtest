package Steps;

import Pages.HomeSocPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class HomeSocSteps {
    WebDriver driver;

    public HomeSocSteps() {
    }

    public HomeSocSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Dado("que eu estou na pagina inicial do site")
    public void abrirNavegador() {
        new HomeSocPage(driver).abrirNavegador("https://www.soc.com.br/");
        this.driver = driver;
    }

    @Quando("clicar na lupa de pesquisa")
    public void pesquisar() {
        new HomeSocPage(driver).ClicarLupa();
    }
}
