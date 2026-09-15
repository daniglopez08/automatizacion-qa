package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.InventoryPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTest {

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
    public void precioDelPrimerProductoEsCorrecto() {
        assertEquals("$29.99", inventoryPage.precioDelPrimerProducto());
    }

    @Test
    public void hayProductosEnLaTienda() {
        assertEquals(6, inventoryPage.cantidadDeProductos());
    }

    @AfterEach
    public void limpiar() {
        driver.quit();
    }
}