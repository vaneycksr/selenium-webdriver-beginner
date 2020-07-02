package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// classe criada para colocar tudo que há incomum em todas as pages
public class BasePage {

    // propriedade com o modificador protected pode ser herdada nas classes filhas
    protected WebDriver navegador;

    public BasePage (WebDriver navegador){
        this.navegador = navegador;
    }

    // como a mensagem do toast pode estar disponivel em varias partes do sistema,
    // a captura da mensagem do toast vai ficar aqui no basePage
    public String capturarTextoToast(){

        return navegador.findElement(By.id("toast-container")).getText();
    }



}
