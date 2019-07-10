

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerDia  {
	WebDriver driver;
	String url="";   
	
	//Properties p = new Properties();  

	
	public PrimerDia(String url) {
		this.url=url;
		driverSet();
	}
	
	public void driverSet() {
		System.setProperty("webdriver.chrome.driver", "src//ChromeDriver//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
	}
	
	public void abrirUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("Hola");
		driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
		
	 
	}		
		public void cerrar() throws InterruptedException {
			driver.quit();
		}
	
	
	 
	
	public static void main(String[] args) throws InterruptedException, AWTException, FileNotFoundException, IOException {
	
		
		PrimerDia demo=new PrimerDia("https://login.live.com/");
		demo.abrirUrl();
		demo.cerrar();
		System.out.println("Resultado exitoso");
	}
}


