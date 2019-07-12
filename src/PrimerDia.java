
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerDia {

	WebDriver driver;
	String url= "";
	JavascriptExecutor js;
	
	public PrimerDia (String url) {
		this.url=url;
		driverSet();
		  
	
		
	}

	public void driverSet() {
	 System.setProperty("webdriver.chrome.driver","src//chromedriver//chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	 
	}
	
public void abrirurl() throws InterruptedException {
    js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.xpath("//*[@id=\"quicktabs-tab-comidas-7\"]")).click();
	//Thread.sleep(7000);
	js.executeScript("window.scrollBy(0,1000)");
	driver.findElement(By.xpath("/html/body/div[1]/div/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"edit-nombres-apellidos\"]")).sendKeys("pepito perez");
	driver.findElement(By.xpath("//*[@id=\"edit-email\"]")).sendKeys("pepitoperez,12@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"edit-telefono\"]")).sendKeys("2846571");
	driver.findElement(By.xpath("//*[@id=\"edit-celular\"]")).sendKeys("3002849127");
	driver.findElement(By.xpath("//*[@id=\"edit-ciudad-contacto\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"edit-ciudad-contacto\"]/option[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"edit-cap-requerida\"]")).sendKeys("5");
	driver.findElement(By.xpath("//*[@id=\"edit-ciudad-evento\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"edit-ciudad-evento\"]/option[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"edit-multiplex-wrapper\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"edit-multiplex-wrapper\"]/option[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"edit-fecha-evento-datepicker-popup-0\"]")).sendKeys("12-08-2019");
	driver.findElement(By.xpath("//*[@id=\"edit-hora-inicio\"]")).sendKeys("7:30");
	driver.findElement(By.xpath("//*[@id=\"edit-cantidad-ninos\"]")).sendKeys("28");
	driver.findElement(By.xpath("//*[@id=\"edit-comentarios\"]")).sendKeys("agradezco su colabaracion");
	
	
	
	
	

}


public static void main(String[]args) throws InterruptedException {
	PrimerDia vigas= new PrimerDia("https://www.cinecolombia.com/bogota/comidas");
	vigas.abrirurl();
}
	
	
	
			
	
}
	


