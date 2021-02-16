package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPassPojo extends Base {
	
	public ForgottenPassPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotPass;
	
	@FindBy(xpath="//input[@id='identify_email']")
	private WebElement mobileNum;
	
	@FindBy(xpath="//button[@id='did_submit']")
	private WebElement searchBtn;

	public WebElement getForgotPass() {
		return forgotPass;
	}

	public WebElement getMobileNum() {
		return mobileNum;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

}
