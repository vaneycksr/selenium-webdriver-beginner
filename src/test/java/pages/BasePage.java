package pages;

import org.openqa.selenium.WebDriver;

// classe criada para colocar tudo que há incomum em todas as pages
public class BasePage {

    // propriedade com o modificador protected pode ser herdada nas classes filhas
    protected WebDriver navegador;

    public BasePage (WebDriver navegador){
        this.navegador = navegador;
    }

}
