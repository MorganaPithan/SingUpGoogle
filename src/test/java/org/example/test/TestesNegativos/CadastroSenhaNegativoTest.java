package TestesNegativos;

import org.example.pages.CadastroEmail;
import org.example.pages.CadastroIdade;
import org.example.pages.CadastroNome;
import org.example.pagesTesteNegativo.CadastroSenhaNegativo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroSenhaNegativoTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenhaNegativo cadastroSenhaNegativo;


    @Test
    public void testCadastroSenha() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        cadastroEmail = new CadastroEmail(driver);
        cadastroSenhaNegativo = new CadastroSenhaNegativo(driver);

        cadastroNome.preencherCampo();
        cadastroIdade.preencherIdade();
        cadastroEmail.preencherEmail();
        cadastroSenhaNegativo.preencherSenhaNegativo();
        assertEquals(cadastroSenhaNegativo.MensagemDeErroSenha(),
                "Use 8 caracteres ou mais para sua senha");
    }
}
