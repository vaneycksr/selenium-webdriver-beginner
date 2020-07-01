package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }
    // toda classe page tem que ter um atributo do tipo webdriver
    //private WebDriver navegador;

    // toda classe page, tem que ter um construtor passando uma instancia do webdriver
    //public LoginPage(WebDriver navegador){
    //    this.navegador = navegador;
   // }

    // clica no botao de login e eh redirecionado para o formulario,
    // por isso retorna um LoginFormPage
    public LoginFormPage clicarSign(){

        // clicar no link que possui o texto "Sign In"
        navegador.findElement(By.linkText("Sign in")).click();

        // retorna uma instancia da proxima pagina
        return new LoginFormPage(navegador);
    }
}
