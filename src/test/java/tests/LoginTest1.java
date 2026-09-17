package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import pages.LoginPage1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest1 {
    WebDriver driver;
    LoginPage1 loginPage;


    @BeforeEach
    public void configurar() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
        loginPage = new LoginPage1(driver);
        loginPage.abrir();

    }

    @Test
    public void loginExitosoConUsuarioValido (){
        loginPage.login("standard_user","secret_sauce");


        String urlEsperada = "https://www.saucedemo.com/inventory.html";
        assertEquals(urlEsperada, driver.getCurrentUrl());
    }

    @Test
    public void loginFallaConUsuarioBloqueado(){
        loginPage.login("locked_out_user","secret_sauce");

        String mensajeEsperado = "Epic sadface: Sorry, this user has been locked out.";
        assertEquals(mensajeEsperado, loginPage.obtenerMensajeError());
    }

    @Test
    public void loginFallaConPasswordIncorrecta(){
        loginPage.login("standard_user", "clave_incorrecta");

        String mensajeEsperado = "Epic sadface: Username and password do not match any user in this service";
        assertEquals(mensajeEsperado, loginPage.obtenerMensajeError());
    }

    @Test
    public void loginFallaConCamposVacios(){
        loginPage.login("", "");

        String mensajeEsperado = "Epic sadface: Username is required";
        assertEquals(mensajeEsperado, loginPage.obtenerMensajeError());
    }

    @AfterEach
    public void limpiar() {
        driver.quit();
    }
}
