package tests;

// fazendo com que seja uma importacao estatica
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){

        // definindo que vai usar o webdriver, e onde ele esta
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

        // apenas abre o navegador
        WebDriver navegador = new ChromeDriver();

        // definir tempo de espera do navegador
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // abrindo uma pagina no browser
        navegador.get("http://www.juliodelima.com.br/taskit");


        // clicar no link que possui o texto "Sign In"
        navegador.findElement(By.linkText("Sign in")).click();

        // identificar o formulario de login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        // digitar no campo com nome "login" que esta dentro do formulario de id "signinbox" o texto "julio0001"
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");

        // digitar no campo com nome "password" que esta dentro do formulario de id "signinbox" o texto "123456"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        // clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        // Validar que dentro do elemento com class "me" esta o texto "Hi, Julio"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, Julio",textoNoElementoMe);

        // fechar o navegador
        navegador.quit();


    }


}
