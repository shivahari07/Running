package com.pommodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProduct {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Iphone 5s']")
	private static WebElement product;
	@FindBy(xpath="//a[text()='Details']")
	private static WebElement details;
	@FindBy(xpath="//a[text()='Comments']")
	private static WebElement comment;
	@FindBy(xpath="//textarea[@id='comment']")
	private static WebElement message;
	@FindBy(xpath="//a[text()='Post Comment']")
	private static WebElement post;
	@FindBy(xpath="//span[text()='Edit Profile']")
	private static WebElement edit;
	
	public EditProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getProduct() {
		return product;
	}

	public static void setProduct(WebElement product) {
		EditProduct.product = product;
	}

	public static WebElement getDetails() {
		return details;
	}

	public static void setDetails(WebElement details) {
		EditProduct.details = details;
	}

	public static WebElement getComment() {
		return comment;
	}

	public static void setComment(WebElement comment) {
		EditProduct.comment = comment;
	}

	public static WebElement getMessage() {
		return message;
	}

	public static void setMessage(WebElement message) {
		EditProduct.message = message;
	}

	public static WebElement getPost() {
		return post;
	}

	public static void setPost(WebElement post) {
		EditProduct.post = post;
	}

	public static WebElement getEdit() {
		return edit;
	}

	public static void setEdit(WebElement edit) {
		EditProduct.edit = edit;
	}

	
	
	

}
