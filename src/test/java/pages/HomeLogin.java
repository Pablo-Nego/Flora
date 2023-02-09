package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

public class HomeLogin extends Utils {

    WebDriverWait wait;
    WebDriver driver;


    public HomeLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void telaLogin(){
        driver.get("https://staging.floraenergia.com.br/economize/login");
        Assert.assertEquals("Acessou a aplicação com sucesso!", true, driver.findElement(By.xpath("//label[text()='E-mail']")).isDisplayed());
    }

    public void preenchoDados() {
        driver.findElement(By.xpath("//label[text()='E-mail']")).click();
        driver.findElement(By.xpath("//label[text()='E-mail']")).sendKeys("pablo.moreira12@outlook.com");

        driver.findElement(By.xpath("//button[text()='Avançar']")).click();
    }
}
