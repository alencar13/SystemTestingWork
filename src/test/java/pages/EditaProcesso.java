package pages;

import support.DriverQA;

public class EditaProcesso extends BasePage {

    public EditaProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void preencherCampo(String campo, String valor) {
        driver.sendKeys(valor, campo);
    }

    public void clicarBotaoSalvar() {
        driver.click("btn-save");
    }
}
