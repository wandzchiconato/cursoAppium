package page;

import appiumCore.basePage;
import org.openqa.selenium.By;

public class alertaPage extends basePage {

    public void clicarAlertConfirm(){
        clicarPorTexto("ALERTA CONFIRM");
    }

    public String validarTituloAlerta(){
        return obterTexto(By.id("android:id/alertTitle"));
    }
    public String validarMensagemAlerta(){
        return obterTexto(By.id("android:id/message"));
    }
    public void confirmarAlerta(){
        clicarPorTexto("CONFIRMAR");
    }

    public void sair(){
        clicarPorTexto("SAIR");
    }
}
