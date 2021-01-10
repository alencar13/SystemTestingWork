package pages;

import support.DriverQA;

import static org.junit.Assert.assertEquals;

public class DetalhaProcesso extends BasePage{
    public DetalhaProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void validaMensagemSucesso(String value) {
        String resultadoEsperado = value;
        String resultadoObtido = driver.getText("notice");

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    public Object getCode() {
        return driver.getText("codigo");
    }

    public String getField(String campo) {
        return driver.getText(campo);
    }

    public void clicarBotaoVoltar() {
        driver.waitElementToBeClickable(".ls-btn-primary-danger", "css");
        driver.click(".ls-btn-primary-danger", "css");
    }
    public void clicarUsuarioEditar(String code) {
        String elem = "btn-edit_" + code;
        driver.click(elem);
    }
}
