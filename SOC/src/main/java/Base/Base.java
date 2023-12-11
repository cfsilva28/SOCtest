package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
    protected WebDriver driver;

    public WebDriver inicializarDriver() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.soc.com.br/");
        return driver;
    }

    protected void fechaDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
