package org.example.pagesTesteNegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EscolhaEmailNegativo {
    static WebDriver driver;

    public EscolhaEmailNegativo(WebDriver driver) {
        this.driver = driver;
    }

    public void escolherEmailNegativo() {

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String MensagemDeErroEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[contains(text(),'Escolha um endereço do Gmail')]")));

        return driver.findElement(
                (By.xpath("//div[contains(text(),'Escolha um endereço do Gmail')]"))).getText();
    }
}

