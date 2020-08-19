package test;

import appiumCore.driverFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import page.formularioPage;
import page.menuPage;


public class formularioTeste {


    private menuPage menu = new menuPage();
    private formularioPage page = new formularioPage();


    @Test(priority = 0)
    public void selecionarFormulario() {

        menu.acessarFormulario();

    }

    @Test(priority = 1)
    public void digitarText() {
        page.escreverNome("Wandz");
        Assert.assertEquals("Wandz", page.obterNome());

    }

    @Test(priority = 2)
    public void selecionarCombos() {
        page.selecionarCombo("Nintendo Switch");
        Assert.assertEquals("Nintendo Switch", page.obterValorCombo());
    }

    @Test(priority = 3)
    public void trabalharcomSwitchsCheckBox() {
        Assert.assertFalse(page.isCheckedMarcado());
        Assert.assertTrue(page.isSwitchMarcado());

        page.clicarCheck();
        page.clicarSwitch();

        Assert.assertTrue(page.isCheckedMarcado());
        Assert.assertFalse(page.isSwitchMarcado());

    }

    @Test(priority = 4)
    public void salvarCadastro() {

        page.btnSalvar();
    }

    @Test(priority = 5)
    public void validarCadastro() {

        Assert.assertEquals("Nome: Wandz", page.validarNomeCadastrado());
        Assert.assertEquals("Console: switch", page.validarConsoleCadastrado());
        Assert.assertEquals("Switch: Off", page.validarSwitchCadastrado());
        Assert.assertEquals("Checkbox: Marcado", page.validarCheckCadastrado());
    }


    @AfterClass
    public void fecharAppium() {
        driverFactory.killDriver();
    }
}


