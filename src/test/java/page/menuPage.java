package page;

import appiumCore.basePage;

public class menuPage extends basePage {


    public void acessarFormulario(){
        clicarPorIndex(1);
    }

    public void acessarSplash(){
        clicarPorTexto("Splash");
    }

    public void acessarAlerta(){
        clicarPorTexto("Alertas");
    }
    public void acessarAbas(){
        clicarPorTexto("Abas");
    }

    public void acessarAccordions(){
        clicarPorTexto("Accordion");
    }
}
