package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroTelefone {
    static WebDriver driver;

    public CadastroTelefone(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherTelefone() {

        WebElement telefone = driver.findElement(By.id("phoneNumberId"));
        telefone.sendKeys("(51) 993341202");

        WebElement botaoProxima = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
        botaoProxima.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[contains(text(), 'Digite o código')]")));
    }
}