package suporte;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

// classe necessaria para tirar o print, e mover para uma pasta do computador
public class Screenshot {

    public static void tirarPrintDaTela(WebDriver navegador, String arquivo){

        File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);

        try {
            // copia o print para uma determinada pasta local
            FileUtils.copyFile(screenshot,new File(arquivo));
        }catch (Exception e){
            System.out.println("Houveram problemas ao copiar o arquivo para a pasta: " + e.getMessage());
        }


    }
}
