package Base;

import Utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
    protected WebDriver driver;

    public WebDriver inicializarDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.soc.com.br/");
        Util.setupChromeDriver();
        return driver;
    }

    protected void fechaDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
