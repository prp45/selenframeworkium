package Practice;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicXpath {

	public static void main(String[] args) {
		//String Key="webdriver.chrome.driver";
				//String Value="C:\\Users\\RAJ\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
				//System.setProperty(Key, Value);
				//WebDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
			String month=""	;
			String date="";
		driver.findElement(By.xpath("//div[text()='February 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='22']")).click();
	}
	



		
	}
	