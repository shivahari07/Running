package com.adactin.runner;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.properties.FileReaderManager;
import basemodel.BaseMethod;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//java//com//adactin//feature",
glue="com.adactin.stepdefinition",
plugin = {"html:Reports/Html_Report",
		"pretty",
		"json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"
		
})

public class RunnerClass extends BaseMethod {

	public static WebDriver driver;
	@BeforeClass
	public static void runner() throws IOException{
		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
		
		String brow = FileReaderManager.getInstancesall().getInstancescon().getbrow();
		
		driver=browser(brow);
	}
	@AfterClass
	public static void down() {
		//driver.close();
	} 

}
