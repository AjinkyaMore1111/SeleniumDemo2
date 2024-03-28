package mavenTest.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	
	WebDriver driver;
	  @Test
	  public void LoginTest() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Automation_Driver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.navigate().to("https://spark-frontend.pivotroots.com/");
		    Thread.sleep(6000);
	  
	  }


}
