package page;

import appiumCore.basePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class formularioPage extends basePage {



    public void escreverNome(String nome) {
        escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public String obterNome() {
        return obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public void selecionarCombo(String valor) {
        selecionarCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String obterValorCombo() {
        return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void clicarCheck() {
        clicar(By.className("android.widget.CheckBox"));

    }

    public void clicarSwitch() {
        clicar(MobileBy.AccessibilityId("switch"));

    }

    public boolean isCheckedMarcado() {
        return isCheckMarcado(By.className("android.widget.CheckBox"));
    }

    public boolean isSwitchMarcado() {
        return isCheckMarcado(MobileBy.AccessibilityId("switch"));
    }

    public void btnSalvar() {
        clicarPorTexto("SALVAR");
    }
    public void btnSalvarDemorado() {
        clicarPorTexto("SALVAR DEMORADO");
    }

    public String validarNomeCadastrado() {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));

    }

    public String validarConsoleCadastrado() {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
    }

       public String validarSwitchCadastrado() {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));

    }
    public String validarCheckCadastrado() {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));

    }
}
