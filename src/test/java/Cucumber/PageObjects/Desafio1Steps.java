package Cucumber.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constante.ScreenShotCapture;
import Constante.Utils;

public class Desafio1Steps {
	
private WebDriver driver;

public Desafio1Steps (WebDriver driver) {
    this.driver = driver;
}

	
public Desafio1Steps SetUp() {
		System.setProperty("webdriver.chrome.driver", "./win_chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ScreenShotCapture.screenShot();
		return this;
	}
	
	public Desafio1Steps clicarLogin() {
		driver.findElement(By.className("login")).click();
		ScreenShotCapture.screenShot();
		return this;
	}

	public Desafio1Steps informarEmail(String email) {
		driver.findElement(By.id("email_create")).sendKeys(email);
		return this;
	}

	public Desafio1Steps clicarCreateanAccount() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//form[@id='create-account_form']//span")).click();
		return this;
	}
	
	public Desafio1Steps telaDeCadastro(){
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//h1[@class='page-heading']")).getText()
		.equals("CREATE AN ACCOUNT");
		return this;
	}

	public Desafio1Steps clicarTittleMr() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("id_gender1")).click();
		return this;
	}

	public Desafio1Steps enterFirstName(String nome) {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("customer_firstname")).sendKeys(nome);
		return this;
	}

	public Desafio1Steps enterLastName(String sobrenome) {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("customer_lastname")).sendKeys(sobrenome);
		return this;
	}

	public Desafio1Steps enterPassword(String senha) {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("passwd")).sendKeys(senha);
		return this;
	}

	public Desafio1Steps enterAddress(String endereco) {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("address1")).sendKeys(endereco);
		return this;
	}
	
	public Desafio1Steps enterCity(String cidade){
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("city")).sendKeys(cidade);
		return this;
	}

	public Desafio1Steps selectState() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("id_state")).click();
		return this;
	}

	public Desafio1Steps selectStateOption() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//option[contains(text(),'Alabama')]")).click();
		return this;
	}

	public Desafio1Steps enterPostalCode(String postalcode) {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("postcode")).sendKeys(postalcode);
		return this;
	}

	public Desafio1Steps enterMobilePhone(String celular) {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("phone_mobile")).sendKeys(celular);
		return this;
	}

	public Desafio1Steps clicarRegister() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		return this;
	}

	public Desafio1Steps myAccount() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//p[@class='info-account']")).getText()
				.equals("Welcome to your account. Here you can manage all of your personal information and orders.");
		return this;
	}

	public Desafio1Steps clicarSignOut() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		return this;
	}
	
	public Desafio1Steps telaDeLogin(){
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//h3[contains(text(),'Already registered?')]")).getText()
				.equals("ALREADY REGISTERED?");
		return this;
	}

	public Desafio1Steps enterEmail(String email) {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("email")).sendKeys(email);
		return this;
	}

	public Desafio1Steps enterSenha(String senha) {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("passwd")).sendKeys(senha);
		return this;
	}

	public Desafio1Steps clicarSignIn() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//p[@class='submit']//span")).click();
		return this;
	}

	public Desafio1Steps validacao() throws InterruptedException {
		ScreenShotCapture.screenShot();
		Utils.WaitElement();
		driver.findElement(By.xpath("//p[@class='info-account']")).getText()
				.equals("Welcome to your account. Here you can manage all of your personal information and orders.");
		return this;
	}

	public Desafio1Steps Evidencias() throws Exception {
		ScreenShotCapture.screenShot();
		ScreenShotCapture.arquivosDir();
		return this;
	}
	
	public Desafio1Steps fechar(){
		driver.quit();
	return this;
	}
	
}
