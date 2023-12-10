package Pages;

import Utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RedeCredenciadaPage{

    private WebDriverUtils webUtils;

    public RedeCredenciadaPage(WebDriver driver ){ this.webUtils = new WebDriverUtils(driver);}

    public void clicarBotaoRedeCredenciada(){
        webUtils.clicar(By.cssSelector("a[href='https://socnet.soc.com.br/'"));
    }
}
