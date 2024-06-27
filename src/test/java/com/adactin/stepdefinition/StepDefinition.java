package com.adactin.stepdefinition;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;
import com.properties.FileReaderManager;
import com.sdppage.PageObjectManager;

import basemodel.BaseMethod;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseMethod {

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User Launch The Joysale Web Application$")
	public void user_Launch_The_Joysale_Web_Application() throws Throwable {
		String urr = FileReaderManager.getInstancesall().getInstancescon().geturls();
		url(urr);
	}

	@When("^User Click The Login$")
	public void user_Click_The_Login() throws Throwable {
		click(pom.getInstanceslogin().getLogin());
	}

	@When("^User Enter The Username In Username Field\\.$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		clear(pom.getInstanceslogin().getUser());
		sendkey(pom.getInstanceslogin().getUser(), "demo@joysale.com");
	}

	@When("^User Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		clear(pom.getInstanceslogin().getPass());
		sendkey(pom.getInstanceslogin().getPass(), "123456");
	}

	@Then("^User Click The submit Button$")
	public void user_Click_The_submit_Button() throws Throwable {
		click(pom.getInstanceslogin().getSubmit());
	}

	@Given("^User Click Iphone Product$")
	public void user_Click_Iphone_Product() throws Throwable {
		Thread.sleep(2000);
		JavascriptExecutor ja = (JavascriptExecutor) driver;
		ja.executeScript("window.scrollBy(0,2500)");
		click(pom.getInstancesUpdate().getProduct());
	}

	@When("^User Click The Edit Item Button$")
	public void user_Click_The_Edit_Item_Button() throws Throwable {
		Thread.sleep(2000);
		//click(pom.getInstancesUpdate().getEdit());
	}

	@When("^User Click The Details Section$")
	public void user_Click_The_Details_Section() throws Throwable {
		click(pom.getInstancesUpdate().getDetails());
	}

	@When("^User Click The Comments Section$")
	public void user_Click_The_Comments_Section() throws Throwable {
		click(pom.getInstancesUpdate().getComment());
	}

	@When("^User Updating The Message in Message Box$")
	public void user_Updating_The_Message_in_Message_Box() throws Throwable {
		sendkey(pom.getInstancesUpdate().getMessage(), "Super Product is Good");
	}

	@When("^User Click The Comment Button$")
	public void user_Click_The_Comment_Button() throws Throwable {
		click(pom.getInstancesUpdate().getPost());
	}

	@Then("^User Click The Edit Profile Button$")
	public void user_Click_The_Edit_Profile_Button() throws Throwable {
		Thread.sleep(2000);
		click(pom.getInstancesUpdate().getEdit());
	}

	@Given("^User Launch The Dacathlon Application$")
	public void user_Launch_The_Dacathlon_Application() throws Throwable {
		
       String urll= FileReaderManager.getInstancesall().getInstancescon().getdecurl();
       url(urll);
	}

	@When("^User Click The Tshirt Product$")
	public void user_Click_The_Tshirt_Product() throws Throwable {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
      click(pom.getInstancesTshirt().getTshirt());
	}

	@When("^User Click The Men Filter Option$")
	public void user_Click_The_Men_Filter_Option() throws Throwable {
		driver.navigate().refresh();
		Thread.sleep(1000);
     click(pom.getInstancesTshirt().getMen());
	}

}
