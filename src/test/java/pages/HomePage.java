package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

public class HomePage extends Utils {
    WebDriverWait wait;
    WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void acessarAplicacao() {

        driver.get("https://staging.floraenergia.com.br/economize");
        Assert.assertEquals("Acessou a aplicação com sucesso!", true, driver.findElement(By.id("fullName")).isDisplayed());
    }

    public void preenchoDadosSobreVoce() throws InterruptedException{

        esperaElementoFicarVisivel(By.id("fullName"),10);
        driver.findElement(By.id("fullName")).click();
        driver.findElement(By.id("fullName")).sendKeys("Pablo Moreira De Souza");

        esperaElementoFicarVisivel(By.id("phone"),10);
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).sendKeys("13997226232");

        esperaElementoFicarVisivel(By.id("email"),10);
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("pablo.moreira12@outlook.com");

        esperaElementoFicarVisivel(By.xpath("//label[text()= 'Não possuo a conta de luz em PDF.']"),10);
        driver.findElement(By.xpath("//label[text()= 'Não possuo a conta de luz em PDF.']")).click();

        esperaElementoFicarVisivel(By.xpath("//input[@inputmode = 'numeric']"),10);
        driver.findElement(By.xpath("//input[@inputmode = 'numeric']")).click();
        driver.findElement(By.xpath("//input[@inputmode = 'numeric']")).sendKeys("200,00");

        esperaElementoFicarVisivel(By.xpath("//input[@id = 'postal_code']"),10);
        driver.findElement(By.xpath("//input[@id = 'postal_code']")).click();
        driver.findElement(By.xpath("//input[@id = 'postal_code']")).sendKeys("13221251");

        esperaElementoFicarVisivel(By.xpath("//input[@id= 'number']"),10);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id= 'number']")).click();
        driver.findElement(By.xpath("//input[@id= 'number']")).sendKeys("30");

        esperaElementoFicarVisivel(By.id("complement"),10);
        driver.findElement(By.id("complement")).click();
        driver.findElement(By.id("complement")).sendKeys("Casa");

        Thread.sleep(1000);
        WebElement element = driver.findElement(By.id("accept-terms"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();

        driver.findElement(By.xpath("//button[text()='Avançar']")).click();

        Thread.sleep(2000);
    }

    public void visualizarTelaDeProposta() throws InterruptedException{
        Thread.sleep(2000);
    }

    public void telaAssinatura()throws InterruptedException{

        driver.findElement(By.xpath("//input[@id='cpf_or_cnpj_holder']")).click();
        driver.findElement(By.xpath("//input[@id='cpf_or_cnpj_holder']")).sendKeys("220.997.640-50");
        driver.findElement(By.id("sms")).click();

    }



}
