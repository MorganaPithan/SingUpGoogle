package TesteFeliz;

import org.example.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroEmailTest {

    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenha cadastroSenha;
    static CadastroTelefone cadastroTelefone;

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        cadastroEmail = new CadastroEmail(driver);
        cadastroSenha = new CadastroSenha(driver);
        cadastroTelefone = new CadastroTelefone(driver);

        cadastroNome.preencherCampo();
        cadastroIdade.preencherIdade();
        cadastroEmail.preencherEmail();
        cadastroSenha.preencherSenha();
        cadastroTelefone.preencherTelefone();
    }
}
