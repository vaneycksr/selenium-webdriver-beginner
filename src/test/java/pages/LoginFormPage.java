package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage {

    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }

    // quando digito o login, permaneco na mesma pagina, por isso o retorno eh do tipo LoginFormPage
    public LoginFormPage digitarLogin(String login){

        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);

        // retorna a mesma pagina
        return this;
    }

    public LoginFormPage digitarPassword(String password){
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);

        return this;
    }

    // quando clicar no botao SIGN IN, vai redirecionar para a proxima pagina,
    // que aqui eh chamada de pagina secreta
    public SecretaPage clicarSignIn(){
        navegador.findElement(By.linkText("SIGN IN")).click();

        return new SecretaPage(navegador);
    }

    // modo mais funcional
    // fazer cada campo um metodo eh chamado de estruturado
    public SecretaPage fazerLogin(String login, String password){
        digitarLogin(login);
        digitarPassword(password);
        clicarSignIn();

        return new SecretaPage(navegador);
    }

}
