package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utils.WaitUtils.waitForElement;

import java.time.Duration;



public class loginUsuarioTest {
	
	
	private WebDriver driver;

	@Before
	public void definition() {
		
		// Definindo o local do chromedriver (a ser melhorado com WebDriverIO)
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver-win64/chromedriver.exe");

		// Criação de uma options que força o chrome a inicializar maximizado
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);

		// .get() é o método que chama o site a ser inicializado com o chrome
		driver.get("https://loja.sotrackboa.com/");

	}

	@Test
	public void testLogin() {

		// Criação de webElements através de xpath
		WebElement btnUserCircle = driver.findElement(By.xpath("//div[@class='minha-conta']//i[contains(@class,'circle-user')]"));
		WebElement btnMyAccount = driver.findElement(By.xpath("//div[@class='minha-conta']//a[text()='Minha conta']"));

		// Criação de uma instância de actions. Actions é utilizado para realizar ações de mouse
		Actions actions = new Actions(driver);
		// Utilizando actions para realizar a ação de mouse onde o mouse é movido para cima de um objeto
		actions.moveToElement(btnUserCircle).perform();

		//waitForElement é uma função criada na classe WaitUtils do packege utils. A função serve para esperar um elemento existir na tela
		waitForElement(driver,btnMyAccount);
		//click é utilizado para realizar um clique em um botão
		btnMyAccount.click();

		// Criação de webElements através de ID
		WebElement txtEmail = driver.findElement(By.id("id_email"));
		WebElement txtSenha = driver.findElement(By.id("id_senha"));

		
		waitForElement(driver,txtEmail);
		// sendKeys é o método utilizado para escrever em um campo de texto
		txtEmail.sendKeys("email");
		waitForElement(driver,txtSenha);
		txtSenha.sendKeys("senha");

		// fechando a instancia do driver
		driver.quit();

	}
}
