package pages;

// Importaciones necesarias
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    // Declaración de una variable estática 'driver' de tipo WebDriver
    // Esta variable va a ser compartida por todas las instancias de BasePage y sus
    // subclases
    protected static WebDriver driver;

    // Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
    // Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando
    // el 'driver' estático
    // WebDriverWait se usa para poner esperas explícitas en los elementos web
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    // Configura el WebDriver para Chrome usando WebDriverManager.
    // WebDriverManager va a estar descargando y configurando automáticamente el
    // driver del navegador
    static {
        WebDriverManager.chromedriver().setup();
        // Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        driver = new ChromeDriver();
    }

    // Este es el constructor de BasePage que acepta un objeto WebDriver como
    // argumento.
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    // Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clicElement(String locator) {
        find(locator).click();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void write(String locator, String keysToSend) {
        find(locator).clear();
        find(locator).sendKeys(keysToSend);
    }

    public void selectDropDownByValue(String locator, String value) {
        Select dropDown = new Select(find(locator));
        dropDown.selectByValue(value);
    }

    public void selectDropDownByIndex(String locator, Integer index) {
        Select dropDown = new Select(find(locator));
        dropDown.selectByIndex(index);
    }

    public int dropDownSize(String locator) {
        Select dropDown = new Select(find(locator));
        List<WebElement> dropDownOptions = dropDown.getOptions();
        return dropDownOptions.size();
    }
}
