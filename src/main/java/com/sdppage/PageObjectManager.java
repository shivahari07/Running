package com.sdppage;

import org.openqa.selenium.WebDriver;

import com.pommodel.EditProduct;
import com.pommodel.Login;
import com.pommodel.Tshirt;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		
	}
	
	public static Login getInstanceslogin() {
		Login lo= new Login(driver);
		return lo;
	}
	public static EditProduct getInstancesUpdate() {
		EditProduct ed= new EditProduct(driver);
		return ed;
	
	}
	
	public static Tshirt getInstancesTshirt() {
		Tshirt ts= new Tshirt(driver);
		return ts;
	}

}
