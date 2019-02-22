package AutoTest.MavenProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Sample1 {
  
	public WebDriver driver;
	
	
	@Test
 	public void f() {
	  
		 driver.get("http://www.gmail.com");
	  
  }
	

	@Test
 	public void Second2() {
	  
		 driver.get("http://www.google.com");
		 
		 
		System.out.println("Test method Second passed");	
	  }

	@Test
 	public void Second3() {
	  
	 driver.get("http://www.yahoo.com");
	 
	System.out.println("Test method Third passed");	
	  }
	
	
	
	
	
	
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		
	  
  }

  
  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
