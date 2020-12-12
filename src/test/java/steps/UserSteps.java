package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.CRUDUsuarios;
import support.BaseSteps;

public class UserSteps extends BaseSteps {

    private static CRUDUsuarios crudUsuarios = new CRUDUsuarios(driver);

    @Dado("^que o usuário esteja logado na aplicação$")
    public void queOUsuarioEstejaLogadoNaAplicacao() {
        crudUsuarios.abrirPagina();
    }

    @Dado("^que o usuário clique no botão Novo Processo$")
    public void queOUsuarioCliqueNoBotaoNovoProcesso() {
        crudUsuarios.clicarBotaoNovoProcesso();
    }

    @Quando("^clicar no botão Salvar$")
    public void clicar_no_botao_Salvar() throws Throwable {
        crudUsuarios.clicarBotaoSalvar();
    }

    @Então("^deve mostrar a mensagem \"([^\"]*)\"$")
    public void deve_mostrar_a_mensagem(String value) throws Throwable {
        crudUsuarios.validaMensagemSucesso(value);
    }

    @E("^o usuário informar o campo Vara igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoVaraComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_vara");
    }

    @E("^o usuário informar o campo Numero Processo igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoNumeroProcessoComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_numero_processo");
    }

    @E("^o usuário informar o campo Natureza igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoNaturezaComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_natureza");
    }

    @E("^o usuário informar o campo Partes igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoPartesComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_partes");
    }

    @E("^o usuário informar o campo Urgente igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoUrgenteComIgualA(String value) throws Throwable {
        crudUsuarios.selecionarOpcaoCombo(value, "processo_urgente");
    }

    @E("^o usuário informar o campo Arbitramento igual a Sim$")
    public void oUsuárioInformarOCampoArbitramentoIgualASim() {
        crudUsuarios.selecionaOpcaoSim();
    }

    @E("^o usuário informar o campo Assistente social igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoAssistenteSocialComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_assistente_social");
    }

    @E("^o usuário informar o campo Data entrada igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoDataEntradaComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_data_entrada");
    }

    @E("^o usuário informar o campo Data saída igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoDataSaídaComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_data_saida");
    }

    @E("^o usuário informar o campo Data agendamento igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoDataAgendamentoComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_data_agendamento");
    }

    @E("^o usuário informar o campo Status igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoStatusComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_status");
    }

    @E("^o usuário informar o campo Observação igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoObservaçãoComIgualA(String value) throws Throwable {
        crudUsuarios.preencherCampo(value, "processo_observacao");
    }

}
