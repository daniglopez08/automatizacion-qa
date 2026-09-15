package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    private By items = By.className("cart_item");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int cantidadDeItems() {
        return driver.findElements(items).size();
    }
}
