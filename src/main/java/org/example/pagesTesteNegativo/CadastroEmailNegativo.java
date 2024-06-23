package org.example.pagesTesteNegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroEmailNegativo {
    static WebDriver driver;

    public CadastroEmailNegativo(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherEmailNegativo() {
        WebElement selecionar = driver.findElement(By.id("selectionc4"));
        selecionar.click();

        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys("Morg");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String MensagemDeErroEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[contains(text(),'Seu nome de usuário precisa ter entre 6 e 30 caracteres.')]")));

        return driver.findElement(
                (By.xpath("//div[contains(text(),'Seu nome de usuário precisa ter entre 6 e 30 caracteres.')]"))).getText();
    }
}