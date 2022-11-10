package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IntroducereSelenium {

	public static void main(String[] args) {

		//Invoking Browser
		//chromedriver.exe ->Brave Browser
		
		System.setProperty("webdriver.chrome.driver", "F:\\WebDrivers\\Chrome Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver1=new EdgeDriver();
				
		driver.get("https://myelectrica.ro/index.php?pagina=login");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("myelectrica_utilizator")).sendKeys("mail@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"myelectrica_pass\"]")).sendKeys("parola1234");
		driver.findElement(By.xpath("//*[@id=\"myelectrica_login_btn\"]")).click();
		//driver.close();
	}
}
