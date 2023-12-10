package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Util {

    private static WebDriver driver;

    private Util() {
    }
    public static void tearDown(WebDriver driver) {
        if (Util.driver != null) {
            Util.driver.close();
            Util.driver.quit();
        }
    }
    public static void setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static void inicializeWebDriver(String url) {
        setupChromeDriver(); // Configura o driver usando WebDriverManager
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions); // Inicializa o driver
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }
}
