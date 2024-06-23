package org.example.pagesTesteNegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNomeNegativo {
    static WebDriver driver;

    public CadastroNomeNegativo(WebDriver driver) {
        this.driver = driver;
    }

    public void preeencherNomeNegativo() {
        WebElement nome = driver.findElement(By.id("firstName"));
        nome.sendKeys("12345678 ");

        WebElement sobrenome = driver.findElement(By.id("lastName"));
        sobrenome.sendKeys("Pithan");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String MensagemDeErroNome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[contains(text(),'Tem certeza de que inseriu seu nome corretamente?')]")));

        return driver.findElement(
                (By.xpath("//span[contains(text(),'Tem certeza de que inseriu seu nome corretamente?')]"))).getText();
    }
}
