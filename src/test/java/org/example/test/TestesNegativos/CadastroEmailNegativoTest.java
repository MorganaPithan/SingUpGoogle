package TestesNegativos;

import org.example.pages.CadastroIdade;
import org.example.pages.CadastroNome;
import org.example.pagesTesteNegativo.CadastroEmailNegativo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroEmailNegativoTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmailNegativo cadastroEmailNegativo;


    @Test
    public void testEmail() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        cadastroEmailNegativo = new CadastroEmailNegativo(driver);

        cadastroNome.preencherCampo();
        cadastroIdade.preencherIdade();
        cadastroEmailNegativo.preencherEmailNegativo();
        assertEquals(cadastroEmailNegativo.MensagemDeErroEmail(), "Seu nome de usuário precisa ter entre 6 e 30 caracteres.");
    }
}
