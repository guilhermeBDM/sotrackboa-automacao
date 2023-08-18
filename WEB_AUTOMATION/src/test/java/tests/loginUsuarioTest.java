package tests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class loginUsuarioTest 
{
	@Test
	public void testLogin() {
        
		//cria��o branch develop
		
		
		// Definindo o local do chromedriver (a ser melhorado com WebDriverIO)
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver-win64/chromedriver.exe");
		
		// Cria��o de uma options que for�a o chrome a inicializar maximizado
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
        
		// .get() � o m�todo que chama o site a ser inicializado com o chrome
        driver.get("https://loja.sotrackboa.com/");
 
        // Cria��o de webElements atrav�s de xpath
        WebElement btnUserCircle = driver.findElement(By.xpath("//div[@class='minha-conta']//i[contains(@class,'circle-user')]"));
        WebElement btnMyAccount = driver.findElement(By.xpath("//div[@class='minha-conta']//a[text()='Minha conta']"));

        // Cria��o de uma inst�ncia de actions. Actions � utilizado para realizar a��es de mouse
        Actions actions = new Actions(driver);
        
        //Utilizando actions para realizar a a��o de mouse onde o mouse � movido para cima de um objeto
        actions.moveToElement(btnUserCircle).perform();
        
        // click � utilizado para realizar um clique em um bot�o
        btnMyAccount.click();

        // Cria��o de webElements atrav�s de ID
        WebElement txtEmail = driver.findElement(By.id("id_email"));
        WebElement txtSenha = driver.findElement(By.id("id_senha"));
        
      	// sendKeys � o m�todo utilizado para escrever em um campo de texto
        txtEmail.sendKeys("email");
        txtSenha.sendKeys("senha");

        //fechando a instancia do driver
        driver.quit();
        
        
    }
}
