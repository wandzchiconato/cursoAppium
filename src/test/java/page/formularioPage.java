package page;

import appiumCore.DSL;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class formularioPage<Public> {

    private DSL dsl = new DSL();

    public void escreverNome(String nome) {
        dsl.escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public String obterNome() {
        return dsl.obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public void selecionarCombo(String valor) {
        dsl.selecionarCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String obterValorCombo() {
        return dsl.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void clicarCheck() {
        dsl.clicar(By.className("android.widget.CheckBox"));

    }

    public void clicarSwitch() {
        dsl.clicar(MobileBy.AccessibilityId("switch"));

    }

    public boolean isCheckedMarcado() {
        return dsl.isCheckMarcado(By.className("android.widget.CheckBox"));
    }

    public boolean isSwitchMarcado() {
        return dsl.isCheckMarcado(MobileBy.AccessibilityId("switch"));
    }

    public void btnSalvar() {
        dsl.clicarPorTexto("SALVAR");
    }

    public String validarNomeCadastrado() {
        return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));

    }

    public String validarConsoleCadastrado() {
        return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
    }

       public String validarSwitchCadastrado() {
        return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));

    }
    public String validarCheckCadastrado() {
        return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));

    }
}
