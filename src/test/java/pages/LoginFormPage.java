package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage {

    private WebDriver navegador;

    public LoginFormPage(WebDriver navegador){
        this.navegador = navegador;
    }

    // quando digito o login, permaneco na mesma pagina, por isso o retorno eh do tipo LoginFormPage
    public LoginFormPage typeLogin(String login){

        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);

        // retorna a mesma pagina
        return this;
    }
}
