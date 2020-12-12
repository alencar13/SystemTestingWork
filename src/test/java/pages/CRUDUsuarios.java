package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import support.DriverQA;

import static org.junit.Assert.assertEquals;

public class CRUDUsuarios extends BasePage {

    public CRUDUsuarios(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void abrirPagina() {
        String url = "http://agapito-server.herokuapp.com/processos";
        driver.openURL(url);
    }

    public void clicarBotaoNovoProcesso(){
        driver.click("btn-novo");
    }

    public void clicarBotaoSalvar(){
        driver.click("btn-save");
    }

    public void preencherCampo(String value, String parName){
        driver.sendKeys(value,parName);
    }

    public void selecionarOpcaoCombo(String value, String parName){
        driver.selectByText(value,parName);
    }

    public void selecionaOpcaoSim(){
        driver.selecionaRadio("processo_arbitramento_s");
    }

    public void validaMensagemSucesso(String value) {
        String resultadoEsperado = value;
        String resultadoObtido = driver.getText("notice");

        assertEquals(resultadoEsperado, resultadoObtido);
    }
}
