package Pages;

import Utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeSocPage{
    private WebDriverUtils webUtils;

    public HomeSocPage(WebDriver driver) {
        this.webUtils = new WebDriverUtils(driver);
    }
    public HomeSocPage ClicarLupa() {
        webUtils.clicar(By.cssSelector("form.elementor-search-form .elementor-search-form__toggle"));
        webUtils.saveScreenshotPNG();
        return this;
    }
    public void preencherCampoPesquisa(String pesquisa){
        webUtils.digitarTexto(By.cssSelector("input.elementor-search-form__input[type='search']"),pesquisa);
        webUtils.pressEnter(By.cssSelector("input.elementor-search-form__input[type='search']"));
        webUtils.saveScreenshotPNG();
    }
    public void verificarSePresenteNaPesquisa(){
        webUtils.esperarElementoVisivel(By.cssSelector("h2.elementor-heading-title.elementor-size-default"));
        webUtils.saveScreenshotPNG();
    }
    public void clicarMenu(String opcao){
        switch (opcao){
            case "Funcionalidades":
                webUtils.clicarListaDeElementos(By.cssSelector("a.elementor-item.has-submenu"),1);
                webUtils.saveScreenshotPNG();
        }
    }
    public void clicarOpcaoMenu(String opcao){
        switch (opcao){
            case "Rede SOCNET":
                webUtils.clicarListaDeElementos(By.cssSelector("a[href='https://www.soc.com.br/rede-credenciada-socnet/"),0);
                webUtils.saveScreenshotPNG();
        }
    }
}
