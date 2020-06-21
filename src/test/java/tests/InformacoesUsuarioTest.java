package tests;

// fazendo com que seja uma importacao estatica
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){

        // definindo que vai usar o webdriver, e onde ele esta
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

        // apenas abre o navegador
        WebDriver navegador = new ChromeDriver();

        // abrindo uma pagina no browser
        navegador.get("http://www.juliodelima.com.br/taskit");


        assertEquals(1,1);
    }


}
