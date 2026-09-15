package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class InventoryPage {

    private WebDriver driver;

    private By nombresProductos = By.className("inventory_item_name");
    private By preciosProductos = By.className("inventory_item_price");
    private By botonesCarrito = By.className("btn_inventory");
    private By iconoCarrito = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public int cantidadDeProductos() {
        return driver.findElements(nombresProductos).size();
    }

    public String precioDelPrimerProducto() {
        List<WebElement> precios = driver.findElements(preciosProductos);
        return precios.get(0).getText();
    }

    public void agregarPrimerProductoAlCarrito() {
        List<WebElement> botones = driver.findElements(botonesCarrito);
        botones.get(0).click();
    }

    public void irAlCarrito() {
        driver.findElement(iconoCarrito).click();
    }
}