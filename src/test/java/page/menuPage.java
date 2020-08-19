package page;

import appiumCore.DSL;

public class menuPage {

    private DSL dsl =new DSL();

    public void acessarFormulario(){
        dsl.clicarPorIndex(1);
    }
}
