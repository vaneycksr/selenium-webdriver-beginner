package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    // cria e retorna a instancia do navegador
    public static WebDriver creatChrome(){

        // definindo que vai usar o webdriver, e onde ele esta
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

        // apenas abre o navegador
        WebDriver navegador = new ChromeDriver();

        // definir tempo de espera do navegador
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // abrindo uma pagina no browser
        navegador.get("http://www.juliodelima.com.br/taskit");

        return navegador;

    }
}
