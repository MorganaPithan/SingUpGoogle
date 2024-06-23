package org.example.pagesTesteNegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmarSenhaNegativo {

    static WebDriver driver;

    public ConfirmarSenhaNegativo(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmarSenhaNegativo() {

        WebElement senha = driver.findElement(By.name("Passwd"));
        senha.sendKeys("Morgana2006");

        WebElement confirmacao = driver.findElement(By.name("PasswdAgain"));
        confirmacao.sendKeys("Morgana");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String MensagemDeErroConfirmarSenha() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[contains(text(),'As senhas não são iguais. Tente novamente.')]")));

        return driver.findElement(
                (By.xpath("//span[contains(text(),'As senhas não são iguais. Tente novamente.')]"))).getText();
    }
}
