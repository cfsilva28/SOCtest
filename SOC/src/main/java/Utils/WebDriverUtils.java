package Utils;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebDriverUtils {
    private WebDriver driver;
    private WebDriverWait wait;

    public WebDriverUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver,Duration.ofSeconds(20));
    }
    public void clicar(By by) {
        esperarElementoVisivel(by);
        driver.findElement(by).click();
    }
    public void digitarTexto(By by, String texto){
        esperarElementoVisivel(by);
        driver.findElement(by).sendKeys(texto);
    }
    public void pressEnter(By by){
        esperarWebElementoLocated(by);
        driver.findElement(by).sendKeys(Keys.ENTER);
    }
    public void esperarElementoVisivel(By by){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (TimeoutException e){
            Assert.fail("Elemento não encontrado dentro do tempo esperado " + by + ", erro: " + e);
        }
    }
    public void clicarListaDeElementos(By by, Integer numeroDaLista){
        List<WebElement> elements = driver.findElements(by);
        WebElement element = elements.get(numeroDaLista);
        esperarWebElementoClicavel(element);
        element.click();
    }
    public void esperarWebElementoClicavel(WebElement element){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException e) {
            Assert.fail("Elemento não encontrado dentro do tempo esperado: " + element + ", erro: " + e);
        }
    }

    public void esperarWebElementoLocated(By by){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (TimeoutException e) {
            Assert.fail(" Elementos não foram encontrados dentro do tempo esperado: " + by + ", erro: " + e);
        }
    }
    public void passarSobreElementoLista(By by, Integer numeroLista){
        List<WebElement> elements = driver.findElements(by);
        WebElement element = elements.get(numeroLista);
        Actions action = new Actions(driver);
        action.moveToElement(element).moveToElement(element).click().build().perform();
    }
}