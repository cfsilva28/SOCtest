package Utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Util {
    private Util() {
    }

    public static void setDriverByOS(WebDriver driver) {
        String driverPath = System.getenv("CHROMEDRIVER_PATH");
        if (driverPath == null) {
            driverPath = "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe";
        }
        System.setProperty("webdriver.chrome.driver", driverPath);
    }

    public static void setUp(WebDriver driver) {
        ChromeOptions chromeOpts = new ChromeOptions();
        chromeOpts.addArguments("start-maximized");
        setDriverByOS(driver);
    }
    public static void tearDown(WebDriver driver) {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }
}
