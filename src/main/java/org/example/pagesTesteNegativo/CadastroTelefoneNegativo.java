package org.example.pagesTesteNegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroTelefoneNegativo {

    static WebDriver driver;

    public CadastroTelefoneNegativo(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherTelefoneNegativo() {

        WebElement telefone = driver.findElement(By.id("phoneNumberId"));
        telefone.sendKeys("aaaaaaa");

        WebElement botaoProxima = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
        botaoProxima.click();
    }

    public String MensagemErroTelefone() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[contains(text(), 'Este formato de número de telefone não é válido. Verifique o país e o número.')]")));

        return driver.findElement(
                (By.xpath("//div[contains(text(),'Este formato de número de telefone não é válido. Verifique o país e o número.')]"))).getText();
    }
}
