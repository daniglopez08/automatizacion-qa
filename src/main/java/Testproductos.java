import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class Testproductos {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.saucedemo.com/");

            WebElement campoUsuario = driver.findElement(By.id("user-name"));
            WebElement campoPassword = driver.findElement(By.id("password"));
            WebElement botonLogin = driver.findElement(By.id("login-button"));

            campoUsuario.sendKeys("standard_user");
            campoPassword.sendKeys("secret_sauce");
            botonLogin.click();

            List<WebElement> productos = driver.findElements(By.className("inventory_item_name"));

            System.out.println("Se encontraron:" + productos.size() + "productos");

            for (WebElement producto : productos){
                System.out.println(producto.getText());
            }

        } catch (Exception e) {
            System.out.println("El test falló: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}