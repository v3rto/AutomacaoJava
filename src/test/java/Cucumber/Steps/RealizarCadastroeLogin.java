package Cucumber.Steps;

import org.json.simple.JSONObject;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

import Constante.ChamadaMassa;
import Constante.Utils;
import Cucumber.PageObjects.Desafio1Steps;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class RealizarCadastroeLogin {

	ChamadaMassa massaDados = new ChamadaMassa();
	
	private WebDriver driver;
	Desafio1Steps run = new Desafio1Steps(driver);
	Desafio1Steps cadastro = new Desafio1Steps(driver);
	
	
	@Dado("^que estou navegando no site$")
	public void acessarSite(){
		cadastro.SetUp();
	}

	@Quando("^clico em Login$")
	public void clicarLogin(){
		cadastro.clicarLogin();
	}

	@Quando("^informo meu email$") 
	public void informarEmail(){
		try {
			JSONObject obj = massaDados.dadosJson();
			cadastro.informarEmail((String) obj.get("email"));
			}catch(Exception e){
				
			}
	}

	@Quando("^clico em Create Account$")
	public void createAccount(){
		cadastro.clicarCreateanAccount();
	}

	@Então("^o site deve ser direcionado até a tela de cadastro$")
	public void telaCadastro(){
		cadastro.telaDeCadastro();
	}

	@Dado("^que preencho os dados obrigatórios$") 
	public void tittleSelect(){
		cadastro.clicarTittleMr();
		try {
			JSONObject obj = massaDados.dadosJson();
		cadastro.enterFirstName((String) obj.get("nome"));
		cadastro.enterLastName((String) obj.get("sobrenome"));
		cadastro.enterPassword((String) obj.get("senha"));
		cadastro.enterAddress((String) obj.get("endereco"));
		cadastro.enterCity((String) obj.get("cidade"));
		cadastro.selectState();
		cadastro.selectStateOption();
		cadastro.enterPostalCode((String) obj.get("postalcode"));
		cadastro.enterMobilePhone((String) obj.get("celular"));
		
		}catch(Exception e){
		}
	}
	@Quando("^clico em Register$")
	public void registerButton(){
		cadastro.clicarRegister();
	}

	@Então("^sou direcionado para My Account$")
	 public void myAccount(){
		cadastro.myAccount();
	}

	@Dado("^que clico em Sign out para sair da conta$")
	public void signOut(){
	    cadastro.clicarSignOut();
	}

	@Dado("^sou direcionado para tela de login$")
	public void login(){
		cadastro.telaDeLogin();
	}

	@Quando("^informo email e senha$")
	public void email(){
		try {
		JSONObject obj = massaDados.dadosJson();
		cadastro.enterEmail((String) obj.get("email"));
		cadastro.enterSenha((String) obj.get("senha"));
		}catch(Exception e){
		}
	}

	@Quando("^clico em Sign in$")
	public void signIn() throws InterruptedException{
		cadastro.clicarSignIn();
		Utils.WaitElement();
		cadastro.validacao();
	}
	
	@AfterClass
	public void fechar(){
		cadastro.fechar();
	}
	
}