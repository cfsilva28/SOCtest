package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverUtils {
    private WebDriver driver;
    private WebDriverWait wait;

    public WebDriverUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofMillis(1000L));
    }

    public void click(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void typeText(By element, String text) {
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        webElement.clear();
        webElement.sendKeys(text);
    }

    public String getText(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element)).getText();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public boolean isDisplayed(By element) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(element)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Você pode adicionar mais métodos conforme necessário
}