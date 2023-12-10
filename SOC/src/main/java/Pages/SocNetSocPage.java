package Pages;

import Utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocNetSocPage {

    private WebDriverUtils webUtils;

    public SocNetSocPage(WebDriver driver) {
        this.webUtils = new WebDriverUtils(driver);
    }

    public void pesquisaRedeSocnet(String pesquisa) {
        webUtils.digitarTexto(By.cssSelector("input#ipt-busca-credenciado-2"), pesquisa);
        webUtils.pressEnter(By.cssSelector("input#ipt-busca-credenciado-2"));
    }

    public void selecionarPerfil(Integer numero) {
        webUtils.esperarElementoVisivel(By.xpath("//div[contains(@class,'dados-empresa row')]"));
        webUtils.passarSobreElementoLista(By.xpath("//div[contains(@class,'dados-empresa row')]"), numero);
        webUtils.clicarBotaoListaJavaScript(By.cssSelector("[class='center btn-estreito']"), numero);
    }

    public void exibePerfil(){
        webUtils.esperarElementoVisivel(By.cssSelector("[class='nome-empresa']"));
    }
}
