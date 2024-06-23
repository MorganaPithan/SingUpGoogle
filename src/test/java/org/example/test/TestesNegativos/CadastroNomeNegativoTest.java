package TestesNegativos;

import org.example.pagesTesteNegativo.CadastroNomeNegativo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroNomeNegativoTest {
    static WebDriver driver;
    static CadastroNomeNegativo cadastroNomeNegativo;


    @Test
    public void testNome() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNomeNegativo = new CadastroNomeNegativo(driver);

        cadastroNomeNegativo.preeencherNomeNegativo();
        assertEquals(cadastroNomeNegativo.MensagemDeErroNome(),
                "Tem certeza de que inseriu seu nome corretamente?");
    }
}
