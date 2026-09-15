import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscarElemento {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement cajaBusqueda = driver.findElement(By.name("q"));

        System.out.println("Elemento encontrado: " + cajaBusqueda.getTagName());

        driver.quit();
    }
}