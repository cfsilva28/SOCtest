package Pages;

import Utils.Util;
import Utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeSocPage extends WebDriverUtils {
    WebDriver driver;

    public HomeSocPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public HomeSocPage abiriNavegador(String url){
        Util.inicializeWebDriver(url);
        return this;
    }
    public HomeSocPage ClicarLupa() {
        click(By.cssSelector(".elementor-sticky__spacer .elementor-element-a224482"));
        return this;
    }
}
