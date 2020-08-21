package page;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class accordionPage extends basePage {

    public void clicarOpcao1(){
        clicarPorTexto( "Opção 1");

    }

    public String obterValor1(){
        return obterTexto(By.xpath("//*[@text='Opção 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView*"));
    }
}
