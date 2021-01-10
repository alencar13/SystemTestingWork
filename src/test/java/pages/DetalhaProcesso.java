package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

    public void clicaBotaoMostrar(String code) {
        driver.click("btn-show_" + code);
    }

    public void clicarBotaoApagar(String code) {
        driver.waitElementToBeClickable("btn-delete_" + code);
        driver.click("btn-delete_" + code);
    }

    public void deletaProcesso() {
        driver.ChooseOkOnNextConfirmation();
    }

    public boolean existeBotaoApagar(String code) {
        String elem = "btn-delete_" + code;
        boolean res = true;
        try {
            driver.getDriver().findElement(By.id(elem)).isDisplayed();
        }catch (Exception E){
            res = false;
        }
        return res;
    }
}
