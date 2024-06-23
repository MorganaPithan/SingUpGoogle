package TestesNegativos;

import org.example.pages.CadastroNome;
import org.example.pagesTesteNegativo.CadastroIdadeNegativo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroIdadeNegativoTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdadeNegativo cadastroIdadeNegativo;


    @Test
    public void testIdade() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNome = new CadastroNome(driver);
        cadastroIdadeNegativo = new CadastroIdadeNegativo(driver);

        cadastroNome.preencherCampo();
        cadastroIdadeNegativo.preencherIdadeNegativo();
        assertEquals(cadastroIdadeNegativo.MensagemDeErroIdade(),
                "Insira uma data válida");
    }
}
