package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroIdade {

    static WebDriver driver;

    public CadastroIdade(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherIdade(){

        WebElement dia = driver.findElement(By.id("day"));
        dia.sendKeys("05");

        WebElement mes = driver.findElement(By.id("month"));
        mes.sendKeys("Outubro");

        WebElement ano = driver.findElement(By.id("year"));
        ano.sendKeys("2006");

        WebElement genero = driver.findElement(By.id("gender"));
        genero.sendKeys("Mulher");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[contains(text(),'Escolha seu endereço do Gmail')]")));
    }
}
