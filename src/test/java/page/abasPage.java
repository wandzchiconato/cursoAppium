package page;

import appiumCore.basePage;

public class abasPage extends basePage {

    public boolean validarAba1() {
        return validarElementoTexto("Este é o conteúdo da Aba 1");
    }

    public boolean validarAba2() {
       return validarElementoTexto("Este é o conteúdo da Aba 2");
    }

    public void clicarAba2(){
        clicarPorTexto("ABA 2");
    }
}
