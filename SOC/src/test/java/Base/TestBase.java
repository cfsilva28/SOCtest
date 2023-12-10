package Base;

import Utils.Util;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
    protected WebDriver driver;

    public WebDriver inicializarDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.soc.com.br/");
        return driver;
    }

    protected void fechaDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
