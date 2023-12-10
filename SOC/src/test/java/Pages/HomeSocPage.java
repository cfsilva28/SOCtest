package Pages;

import Utils.Util;
import Utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeSocPage{
    private WebDriverUtils webUtils;

    public HomeSocPage(WebDriver driver) {
        this.webUtils = new WebDriverUtils(driver);
    }
    public HomeSocPage abiriNavegador(String url){
        Util.inicializeWebDriver(url);
        return this;
    }
    public HomeSocPage ClicarLupa() {
        webUtils.clicar(By.cssSelector(".elementor-sticky__spacer .elementor-element-a224482"));
        return this;
    }
}
