package TesteQI;

import org.example.QI.CadastroMensagem;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CadastroMensagemTest {
    static WebDriver driver;
    static CadastroMensagem cadastroMensagem;

    @Test
    public void testEmail() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qi.edu.br/ouvidoria/");
        cadastroMensagem = new CadastroMensagem(driver);

        cadastroMensagem.preencherMensagem();
    }
}
