package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarritoTest {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;


    @BeforeEach
    public void configurar() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

        loginPage.abrir();
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test
    public void agregarProductoAumentaElCarrito() {
        inventoryPage.agregarPrimerProductoAlCarrito();
        inventoryPage.irAlCarrito();          // ← este paso te faltaba

        CartPage cartPage = new CartPage(driver);

        assertEquals(1, cartPage.cantidadDeItems());
    }

    @AfterEach
    public void limpiar() {
        driver.quit();
    }
}