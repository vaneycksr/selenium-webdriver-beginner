package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class InformacoesUsuarioPageObjectsTest {

    private WebDriver navegador;

    @Before
    public void setUp(){

        navegador = Web.creatChrome();
    }

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){

        // instancia a page que sera testada
        new LoginPage(navegador)
                .clicarSign()
                .fazerLogin("julio0001","123456")
                .clicarMe()
                .clicarAbaMoreDataAboutYou()
                .clicarBotaoAddMoreDataAboutYou();
    }

    @After
    public void tearDown(){

        navegador.quit();
    }

}
