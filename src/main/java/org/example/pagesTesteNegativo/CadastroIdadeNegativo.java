package org.example.pagesTesteNegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroIdadeNegativo {
    static WebDriver driver;

    public CadastroIdadeNegativo(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherIdadeNegativo() {
        WebElement dia = driver.findElement(By.id("day"));
        dia.sendKeys("05");

        WebElement mes = driver.findElement(By.id("month"));
        mes.sendKeys("Outubro");

        WebElement ano = driver.findElement(By.id("year"));
        ano.sendKeys("2025");

        WebElement genero = driver.findElement(By.id("gender"));
        genero.sendKeys("Mulher");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String MensagemDeErroIdade() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[contains(text(),'Insira uma data válida')]")));

        return driver.findElement(
                (By.xpath("//div[contains(text(),'Insira uma data válida')]"))).getText();
    }
}
