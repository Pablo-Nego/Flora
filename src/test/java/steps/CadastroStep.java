package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import pages.HomePage;
import runner.RunCucumberTest;


public class CadastroStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site de cadastro da FloraEnergia$")
    public void que_estou_no_site_de_cadastro_da_FloraEnergia() {
        homePage.acessarAplicacao();
    }

    @E("^preencho os dados da tela sobre voce$")
    public void preencho_dados_da_tela_sobre_voce() throws InterruptedException {
        homePage.preenchoDadosSobreVoce();
    }

    @E("^visualizo a tela de proposta e clico em avancar$")
    public void visualizo_a_tela_de_proposta() throws InterruptedException{
        homePage.visualizarTelaDeProposta();
    }

    @Quando("^na tela de assinatura preencho meu dados e assino sou direcionado para tela de login$")
    public void na_tela_de_assinatura_coloca_meu_cpf_e_clico_em_avancar() throws InterruptedException{
    homePage.telaAssinatura();

    }

}
