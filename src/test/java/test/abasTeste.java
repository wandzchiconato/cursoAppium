package test;

import appiumCore.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.abasPage;
import page.menuPage;

public class abasTeste extends baseTest {
    private menuPage menu = new menuPage();
    private abasPage abas = new abasPage();

    @Test
    public void interacaoComAbas() {

        //Acessar menu Aba
        menu.acessarAbas();
        //Verificar que esta na aba 1
       Assert.assertFalse(abas.validarAba1());

        //Acessar Aba  2
        abas.clicarAba2();
        Assert.assertFalse(abas.validarAba2());
        //Verificar o que esta na aba 2
    }
}
