package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import pages.HomeLogin;
import runner.RunCucumberTest;

public class Login extends RunCucumberTest {

    HomeLogin homeLogin = new HomeLogin(driver);

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login(){
        homeLogin.telaLogin();
    }

    @E("^preencho meu email$")
    public void preencho_meu_email() {
        homeLogin.preenchoDados();
    }
}
