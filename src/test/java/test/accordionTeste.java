package test;

import appiumCore.basePage;
import appiumCore.baseTest;
import appiumCore.driverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.accordionPage;
import page.menuPage;

import java.util.concurrent.TimeUnit;

public class accordionTeste extends baseTest {
    private menuPage menu = new menuPage();
    private basePage base = new basePage();
    private accordionPage accordion = new accordionPage();

    @Test
    public void interagirAccordion() {
        //Acessar Menu
        menu.acessarAccordions();
        //Clicar Opção1
        accordion.clicarOpcao1();
        //Verificar texto op1
        esperar(3000);
        Assert.assertEquals("Esta é a descrição da opção 1", accordion.obterValor1());

    }
}
