import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khandekar\\Downloads\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/login.php");
	
	driver.findElement(By.xpath("//a[@href='/r.php?locale=en_GB&display=page']")).click();
	
	WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	
	Select s = new Select(month);
	
	s.selectByIndex(12);
	
	s.selectByValue("12");
	
	s.selectByVisibleText("Dec");
	
	List<WebElement> option = s.getOptions();
	
	System.out.println(option.size());
	
		
	}
	

}
