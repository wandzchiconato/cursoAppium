package test;

import appiumCore.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.alertaPage;
import page.menuPage;

public class alertTeste extends baseTest {

    private menuPage menu = new menuPage();
    private alertaPage alertPage =new alertaPage();
    @Test
    public void validarAlerta(){

        menu.acessarAlerta();

        alertPage.clicarAlertConfirm();

        Assert.assertEquals("Info",alertPage.validarTituloAlerta());
        //Assert.assertEquals("Confirma a operação?",alertPage.validarMensagemAlerta());

        alertPage.confirmarAlerta();
        //verificar nova mensagem
        Assert.assertEquals("Confirmado",alertPage.validarMensagemAlerta());
        // sair
        alertPage.sair();

    }
}
