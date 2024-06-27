package basemodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethod {
	
	public static WebDriver driver;
	
	public static WebDriver browser(String type) {
		if(type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(type.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
		
	}
	
	public static WebDriver url(String url) {
		driver.get(url);
		return driver;
	}
	
	public static void click(WebElement ele) {
		ele.click();
	}
	
	public static void sendkey(WebElement emt, String str) {
		emt.sendKeys(str);
	}
	
	public static void clear(WebElement ell) {
		ell.clear();
	}
	
	public static void select(String types, WebElement ele, String value) {
		Select se= new Select(ele);
		if(types.equalsIgnoreCase("value")) {
			se.selectByValue(value);
		}
		else if(types.equalsIgnoreCase("visible")) {
			se.selectByVisibleText(value);
		}
		else if(types.equalsIgnoreCase("index")) {
			int data = Integer.parseInt(value);
			se.selectByIndex(data);
		}
	}
		public static List<String> tap(int num) {
		Set<String> lat=driver.getWindowHandles();
		List<String> fix= new ArrayList<String>(lat);
		driver.switchTo().window(fix.get(num));
		return fix;
		}
		
		public static Set<String> seprate() {
			Set<String> nn=driver.getWindowHandles();
			for (String str : nn) {
				driver.switchTo().window(str);
			}
			return nn;
		}
	
	
	
	
	
	
	
	
}
