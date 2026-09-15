package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        driver = new ChromeDriver();
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