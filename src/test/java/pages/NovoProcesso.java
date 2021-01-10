package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import support.DriverQA;

import static org.junit.Assert.assertEquals;

public class NovoProcesso extends BasePage {

    private String userCode;

    public NovoProcesso(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void abrirPagina() {
        String url = "http://agapito-server.herokuapp.com/processos";
        driver.openURL(url);
    }

    public void clicarBotaoNovoProcesso(){
        driver.waitElementToBeClickable("btn-novo");
        driver.click("btn-novo");
    }

    public void clicarBotaoSalvarNovoProcesso(){
        driver.waitElement("btn-save");
        driver.click("btn-save");
    }

    public void preencherCampo(String value, String parName, String... parType){
        driver.sendKeys(value, parName, parType);
    }

    public void selecionarOpcaoCombo(String value, String parName){
        driver.selectByText(value,parName);
    }

    public void selecionaOpcaoSim(){
        driver.selecionaRadio("processo_arbitramento_s");
    }

    public void setCode(String code) {
        userCode = code;
    }

    public String getUserCode(){
        return userCode;
    }

    public Object getCode() {
        return driver.getText("codigo");
    }
}
