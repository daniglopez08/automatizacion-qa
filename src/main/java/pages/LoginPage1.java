package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage1 extends BasePage {
    private By campoUsuario = By.id("user-name");
    private By campoPassword = By.id("password");
    private By botonLogin = By.id("login-button");

    private By mensajeError = By.cssSelector("h3[data-test='error']");

    public LoginPage1(WebDriver driver) {
        super(driver);
    }

    public void abrir() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login(String usuario, String password) {
        driver.findElement(campoUsuario).sendKeys(usuario);
        driver.findElement(campoPassword).sendKeys(password);
        driver.findElement(botonLogin).click();
    }

    public String obtenerMensajeError() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(mensajeError));
        return error.getText();
    }

}
