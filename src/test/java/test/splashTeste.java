package test;

import appiumCore.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.menuPage;
import page.splashPage;

public class splashTeste extends baseTest {

    private menuPage menu = new menuPage();
    private splashPage splash = new splashPage();

    @Test
    public void deveAguardarSplashSumir(){
        //Acessar menu splash
        menu.acessarSplash();

        //Verificar que a Splash esta sendo exibida
        splash.telaSplashVisivel();

        //Aguardar saida do Splash
        deveAguardarSplashSumir();

        //Verificar que o formulario esta aparecendo
        Assert.assertTrue(splash.validarElementoTexto("Formulário"));
    }
}
