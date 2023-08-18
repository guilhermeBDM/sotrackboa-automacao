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
        
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver-win64/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://loja.sotrackboa.com/");
 
        
      
        WebElement userCircle = driver.findElement(By.xpath("//div[@class='minha-conta']//i[contains(@class,'circle-user')]"));
        WebElement myAccount = driver.findElement(By.xpath("//div[@class='minha-conta']//a[text()='Minha conta']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(userCircle).perform();
        myAccount.click();

        driver.quit();
        
        
    }
}
