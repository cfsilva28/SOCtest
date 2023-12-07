package Pages;


import Utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomeSocPage extends WebDriverUtils {
    WebDriver driver;

    public HomeSocPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void abrirNavegador(String url) {
        navigateTo(url);
        driver.manage().window().maximize();
    }
    public HomeSocPage ClicarLupa() {
        click(By.cssSelector(".elementor-sticky__spacer .elementor-element-a224482"));
        return this;
    }
}
