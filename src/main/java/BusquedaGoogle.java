import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusquedaGoogle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement cajaBusqueda = driver.findElement(By.name("q"));

        cajaBusqueda.sendKeys("QA automatizado");   // escribe texto en el campo
        cajaBusqueda.sendKeys(Keys.ENTER);           // simula presionar Enter

        System.out.println("Título después de buscar: " + driver.getTitle());

        driver.quit();
    }
}