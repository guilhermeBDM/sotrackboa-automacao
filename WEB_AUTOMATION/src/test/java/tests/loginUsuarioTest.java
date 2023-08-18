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
        
		//criação branch develop
		
		
		// Definindo o local do chromedriver (a ser melhorado com WebDriverIO)
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver-win64/chromedriver.exe");
		
		// Criação de uma options que força o chrome a inicializar maximizado
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
        
		// .get() é o método que chama o site a ser inicializado com o chrome
        driver.get("https://loja.sotrackboa.com/");
 
        // Criação de webElements através de xpath
        WebElement btnUserCircle = driver.findElement(By.xpath("//div[@class='minha-conta']//i[contains(@class,'circle-user')]"));
        WebElement btnMyAccount = driver.findElement(By.xpath("//div[@class='minha-conta']//a[text()='Minha conta']"));

        // Criação de uma instância de actions. Actions é utilizado para realizar ações de mouse
        Actions actions = new Actions(driver);
        
        //Utilizando actions para realizar a ação de mouse onde o mouse é movido para cima de um objeto
        actions.moveToElement(btnUserCircle).perform();
        
        // click é utilizado para realizar um clique em um botão
        btnMyAccount.click();

        // Criação de webElements através de ID
        WebElement txtEmail = driver.findElement(By.id("id_email"));
        WebElement txtSenha = driver.findElement(By.id("id_senha"));
        
      	// sendKeys é o método utilizado para escrever em um campo de texto
        txtEmail.sendKeys("email");
        txtSenha.sendKeys("senha");

        //fechando a instancia do driver
        driver.quit();
        
        
    }
}
