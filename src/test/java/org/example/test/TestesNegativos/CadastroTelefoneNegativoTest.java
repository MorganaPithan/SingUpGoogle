package TestesNegativos;

import org.example.pages.CadastroEmail;
import org.example.pages.CadastroIdade;
import org.example.pages.CadastroNome;
import org.example.pages.CadastroSenha;
import org.example.pagesTesteNegativo.CadastroTelefoneNegativo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroTelefoneNegativoTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenha cadastroSenha;
    static CadastroTelefoneNegativo cadastroTelefoneNegativo;


    @Test
    public void testConfirmarSenha() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        cadastroEmail = new CadastroEmail(driver);
        cadastroSenha = new CadastroSenha(driver);
        cadastroTelefoneNegativo = new CadastroTelefoneNegativo(driver);

        cadastroNome.preencherCampo();
        cadastroIdade.preencherIdade();
        cadastroEmail.preencherEmail();
        cadastroSenha.preencherSenha();
        cadastroTelefoneNegativo.preencherTelefoneNegativo();
        assertEquals(cadastroTelefoneNegativo.MensagemErroTelefone(),
                "Este formato de número de telefone não é válido. Verifique o país e o número.");
    }
}
