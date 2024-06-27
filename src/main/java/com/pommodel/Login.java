package com.pommodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Login']")
	private static WebElement login;
	@FindBy(xpath="//input[@id='LoginForm_username']")
	private static WebElement user;
	@FindBy(xpath="//input[@id='LoginForm_password']")
	private static WebElement pass;
	@FindBy(xpath="//button[@id='submit-btn']")
	private static WebElement submit;

	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getLogin() {
		return login;
	}

	public static void setLogin(WebElement login) {
		Login.login = login;
	}

	public static WebElement getUser() {
		return user;
	}

	public static void setUser(WebElement user) {
		Login.user = user;
	}

	public static WebElement getPass() {
		return pass;
	}

	public static void setPass(WebElement pass) {
		Login.pass = pass;
	}

	public static WebElement getSubmit() {
		return submit;
	}

	public static void setSubmit(WebElement submit) {
		Login.submit = submit;
	}
	
}
