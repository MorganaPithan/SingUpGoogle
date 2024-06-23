package org.example.pagesTesteNegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroSenhaNegativo {

    static WebDriver driver;

    public CadastroSenhaNegativo(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherSenhaNegativo() {

        WebElement senha = driver.findElement(By.name("Passwd"));
        senha.sendKeys("Morgana");

        WebElement confirmacao = driver.findElement(By.name("PasswdAgain"));
        confirmacao.sendKeys("Morgana");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String MensagemDeErroSenha() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[contains(text(),'Use 8 caracteres ou mais para sua senha')]")));

        return driver.findElement(
                (By.xpath("//span[contains(text(),'Use 8 caracteres ou mais para sua senha')]"))).getText();
    }
}