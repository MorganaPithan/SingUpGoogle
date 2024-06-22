package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroEmail {
    static WebDriver driver;

    public CadastroEmail(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherEmail(){
        WebElement selecionar = driver.findElement(By.id("selectionc4"));
        selecionar.click();

        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys("Morganalalalalla");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[contains(text(),'Crie uma senha forte')]")));
    }
}
