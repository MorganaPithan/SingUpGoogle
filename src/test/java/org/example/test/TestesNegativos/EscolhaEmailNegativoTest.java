package TestesNegativos;

import org.example.pages.CadastroIdade;
import org.example.pages.CadastroNome;
import org.example.pagesTesteNegativo.EscolhaEmailNegativo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class EscolhaEmailNegativoTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static EscolhaEmailNegativo escolhaEmailNegativo;


    @Test
    public void testEscolhaEmail() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        escolhaEmailNegativo = new EscolhaEmailNegativo(driver);

        cadastroNome.preencherCampo();
        cadastroIdade.preencherIdade();
        escolhaEmailNegativo.escolherEmailNegativo();
        assertEquals(escolhaEmailNegativo.MensagemDeErroEmail(),
                "Escolha um endereço do Gmail");
    }
}
