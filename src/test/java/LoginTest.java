import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    WebDriver driver;

    @BeforeEach
    public void configurar() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void loginExitoso() {
        WebElement campoUsuario = driver.findElement(By.id("user-name"));
        WebElement campoPassword = driver.findElement(By.id("password"));
        WebElement botonLogin = driver.findElement(By.id("login-button"));

        campoUsuario.sendKeys("standard_user");
        campoPassword.sendKeys("secret_sauce");
        botonLogin.click();

        String tituloEsperado = "Swag Labs";
        assertEquals(tituloEsperado, driver.getTitle());
    }

    @AfterEach
    public void limpiar() {
        driver.quit();
    }
}