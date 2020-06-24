package tests;

// fazendo com que seja uma importacao estatica
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {

    private WebDriver navegador;


    @Before
    public void setUp(){
        // definindo que vai usar o webdriver, e onde ele esta
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

        // apenas abre o navegador
        navegador = new ChromeDriver();

        // definir tempo de espera do navegador
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // abrindo uma pagina no browser
        navegador.get("http://www.juliodelima.com.br/taskit");
    }

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){

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

        // clicar em um link que possui a class "me"
        navegador.findElement(By.className("me")).click();

        // clicar em um link que possui o texto "MORE DATA ABOUT YOU"
        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

        // clicar no botao atraves do seu xpath //button[@data-target="addmoredata"]
        //navegador.findElement(By.cssSelector("button[data-target='addmoredata']")).click(); // usando cssSelector
        navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

        // identificar o popup onde esta o formulario de id "addmoredata"
        WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));

        // na combo de name "type" escolhe a opcao "Phone" (pelo nome da opcao)
        WebElement campoType = popupAddMoreData.findElement(By.name("type")); // capturei o combobox
        new Select(campoType).selectByVisibleText("Phone");

        // no campo de name "contact" digitar "+55839999912"
        popupAddMoreData.findElement(By.name("contact")).sendKeys("+55839999912");

        // clicar no link de text "SAVE" que esta na popup
        popupAddMoreData.findElement(By.linkText("SAVE")).click();

        // na mensagem de id "toast-container" validar que o texto eh "Your contact has been added!"
        WebElement mensagemPop = navegador.findElement(By.id("toast-container")); // capturei o toast
        String mensagem = mensagemPop.getText();
        assertEquals("Your contact has been added!", mensagem);


    }

    @After
    public void tearDown(){
        // fechar o navegador
        navegador.quit();
    }

}
