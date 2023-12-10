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
        webUtils.clicar(By.cssSelector(".elementor-sticky__spacer .elementor-element-a224482"));
        return this;
    }
    public void verificarSePresenteNaPesquisa(){
        webUtils.esperarElementoVisivel(By.cssSelector("h2.elementor-heading-title.elementor-size-default"));
    }

    public void preencherCampoPesquisa(String pesquisa){
        webUtils.digitarTexto(By.cssSelector("input.elementor-search-form__input[type='search']"),pesquisa);
        webUtils.pressEnter(By.cssSelector("input.elementor-search-form__input[type='search']"));
    }

    public void clicarMenu(String opcao){
        switch (opcao){
            case "Funcionalidades":
                webUtils.clicarListaDeElementos(By.cssSelector("a.elementor-item.has-submenu"),1);
        }
    }
    public void clicarOpcaoMenu(String opcao){
        switch (opcao){
            case "Rede SOCNET":
                webUtils.clicarListaDeElementos(By.cssSelector("a[href='https://www.soc.com.br/rede-credenciada-socnet/"),1);
        }
    }
}
