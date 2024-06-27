package com.pommodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt {

	public static WebDriver driver;
	@FindBy(xpath="//span[text()='Men T-shirt']")
	private static WebElement tshirt;
	@FindBy(xpath="//span[text()='Men (341)	']")
	private static WebElement men;
	
	public Tshirt(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getTshirt() {
		return tshirt;
	}

	public static void setTshirt(WebElement tshirt) {
		Tshirt.tshirt = tshirt;
	}

	public static WebElement getMen() {
		return men;
	}

	public static void setMen(WebElement men) {
		Tshirt.men = men;
	}
	
	
	
}
