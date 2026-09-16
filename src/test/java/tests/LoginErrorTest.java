package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginErrorTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach
    public void configurar() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
        loginPage = new LoginPage(driver);
        loginPage.abrir();
    }

    @Test
    public void loginConDatosIncorrectosMuestraError() {
        loginPage.login("usuario_invalido", "clave_incorrecta");

        String mensaje = loginPage.obtenerMensajeError();

        assertEquals("Epic sadface: Username and password do not match any user in this service", mensaje);
    }

    @AfterEach
    public void limpiar() {
        driver.quit();
    }
}