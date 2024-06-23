package org.example.QI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroMensagem {
    static WebDriver driver;

    public CadastroMensagem(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherMensagem() {
        WebElement nome = driver.findElement(By.name("form_fields[nome]"));
        nome.sendKeys("Morgana");

        WebElement email = driver.findElement(By.name("form_fields[email]"));
        email.sendKeys("morgana.dpithan@gmail.com");

        WebElement cidade = driver.findElement(By.name("form_fields[cidade]"));
        cidade.sendKeys("Porto Alegre");

        WebElement mensagem = driver.findElement(By.name("form_fields[mensagem]"));
        mensagem.sendKeys("Teste");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Pronto, quero enviar a mensagem')]"));
        botaoAvancar.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[contains(text(),'Pronto! Recebemos sua mensagem e logo entraremos em contato.')]")));
    }
}
