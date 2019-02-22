package AutoTest.MavenProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;



public class Sample2 {
	
	public WebDriver driver;
	
	@Test
 	public void f() {
	  
	
		driver.get("http://www.yahoo.com");
		
	System.out.println("Test method first passed");	
	  
  }
	

	@Test
 	public void MyTest() {
	  
		driver.get("http://www.freecrm.com");
		
	System.out.println("My Sample class 2 test method 2");	
	  
  }
	
	
	@Test
 	public void MySampleTest() {
	  
		
		driver.get("http://www.yatra.com");
	System.out.println("My Sample class 2 Third Test");	
	  
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
