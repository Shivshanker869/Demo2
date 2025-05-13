package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example {
	public static void main(String[] args) {
		// Create a new instance of ChromeDriver (or any other driver)
        WebDriver driver = new ChromeDriver();
     // Open a site
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	    
	    
	}

}
