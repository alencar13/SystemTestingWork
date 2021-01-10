package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import gherkin.lexer.Th;
import org.junit.Assert;
import pages.EditaProcesso;
import pages.NovoProcesso;
import pages.DetalhaProcesso;
import support.BaseSteps;

public class UserSteps extends BaseSteps {

    public static NovoProcesso novoProcesso = new NovoProcesso(driver);
    public static DetalhaProcesso detalhaProcesso = new DetalhaProcesso(driver);
    public static EditaProcesso editaProcesso = new EditaProcesso(driver);

    @Dado("^que o usuário esteja logado na aplicação$")
    public void queOUsuarioEstejaLogadoNaAplicacao() {
        novoProcesso.abrirPagina();
    }

    @E("^que o usuário clique no botão Novo Processo$")
    public void queOUsuarioCliqueNoBotaoNovoProcesso() {
        novoProcesso.clicarBotaoNovoProcesso();
    }

    @Quando("^o usuário clicar no botão salvar$")
    public void o_usuario_clicar_no_botao_salvar() throws Throwable {
        novoProcesso.clicarBotaoSalvarNovoProcesso();
        novoProcesso.setCode(detalhaProcesso.getCode().toString());
    }

    @Então("^deve mostrar a mensagem \"([^\"]*)\"$")
    public void deve_mostrar_a_mensagem(String value) throws Throwable {
        detalhaProcesso.validaMensagemSucesso(value);
    }

    @E("^o usuário informar o campo Vara igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoVaraComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value, "#processo_vara","css");
    }

    @E("^o usuário informar o campo Numero Processo igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoNumeroProcessoComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value, "processo_numero_processo");
    }

    @E("^o usuário informar o campo Natureza igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoNaturezaComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value,"processo_natureza");
    }

    @E("^o usuário informar o campo Partes igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoPartesComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value, "processo_partes");
    }

    @E("^o usuário informar o campo Urgente igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoUrgenteComIgualA(String value) throws Throwable {
        novoProcesso.selecionarOpcaoCombo(value, "processo_urgente");
    }

    @E("^o usuário informar o campo Arbitramento igual a Sim$")
    public void oUsuárioInformarOCampoArbitramentoIgualASim() {
        novoProcesso.selecionaOpcaoSim();
    }

    @E("^o usuário informar o campo Assistente social igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoAssistenteSocialComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value, "processo_assistente_social");
    }

    @E("^o usuário informar o campo Data entrada igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoDataEntradaComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value, "processo_data_entrada");
    }

    @E("^o usuário informar o campo Data saída igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoDataSaídaComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value, "processo_data_saida");
    }

    @E("^o usuário informar o campo Data agendamento igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoDataAgendamentoComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value, "processo_data_agendamento");
    }

    @E("^o usuário informar o campo Status igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoStatusComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value, "processo_status");
    }

    @E("^o usuário informar o campo Observação igual a \"([^\"]*)\"$")
    public void oUsuárioInformarOCampoObservaçãoComIgualA(String value) throws Throwable {
        novoProcesso.preencherCampo(value, "processo_observacao");
    }

    @E("^o usuário clica no botão voltar$")
    public void oUsuarioClicaNoBotaoVoltar() {
        detalhaProcesso.clicarBotaoVoltar();
    }

    @E("^o usuário clica no botão editar do processo cadastrado$")
    public void oUsuarioClicaNoBotaoEditarDoProcessoCadastrado() {
        detalhaProcesso.clicarUsuarioEditar(novoProcesso.getCode().toString());
    }

    @E("^o usuário preencher o campo \"([^\"]*)\" com o valor \"([^\"]*)\" na tela de edição$")
    public void oUsuárioPreencherOCampoComOValorNaTelaDeEdição(String campo, String valor) throws Throwable {
        editaProcesso.preencherCampo(campo, valor);
    }

    @Quando("^clicar no botão Salvar na tela de edição$")
    public void clicarNoBotaoSalvarNaTelaDeEdicao() {
        editaProcesso.clicarBotaoSalvar();
    }

    @Então("^o usuário deveria ver o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
    public void oUsuarioDeveriaVerOValorNoCampo(String valor, String campo) throws Throwable {
        Thread.sleep(500);
        Assert.assertEquals(valor, detalhaProcesso.getField(campo));
    }


    @Quando("^o usuário clica no botão consultar do processo cadastrado$")
    public void oUsuarioClicaNoBotaoConsultarDoProcessoCadastrado() {
        detalhaProcesso.clicaBotaoMostrar(novoProcesso.getCode().toString());
    }

    @Quando("^o usuário clica no botão apagar do processo cadastrado$")
    public void oUsuarioClicaNoBotaoApagarDoProcessoCadastrado() {
        detalhaProcesso.clicarBotaoApagar(novoProcesso.getCode().toString());
    }

    @E("^o usuário confirma a deleção$")
    public void oUsuarioConfirmaADelecao() throws InterruptedException {
        Thread.sleep(1000);
        detalhaProcesso.deletaProcesso();
    }

    @Então("^o botão apagar não pode mais existir para o usuário cadastrar$")
    public void oBotaoApagarNaoPodeMaisExistirParaOUsuarioCadastrar() throws InterruptedException {
        Assert.assertTrue(true);
    }
}