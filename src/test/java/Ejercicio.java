import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio {
    WebDriver driver;

    @BeforeEach
    public void configurar() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");

        WebElement campoUsuario = driver.findElement(By.id("user-name"));
        WebElement campoPassword = driver.findElement(By.id("password"));
        WebElement botonLogin = driver.findElement(By.id("login-button"));

        campoUsuario.sendKeys("standard_user");
        campoPassword.sendKeys("secret_sauce");
        botonLogin.click();
    }

    @Test

    public void precioDelPrimerProductoEsCorrecto() {
        List<WebElement> precios = driver.findElements(By.className("inventory_item_price"));

        WebElement primerPrecio = precios.get(0);

        assertEquals("$29.99", primerPrecio.getText());
    }

    @AfterEach
    public void limpiar() {
        driver.quit();
    }
}
