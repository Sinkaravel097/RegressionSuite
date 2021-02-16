package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount extends Base {

	public CreateNewAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement accBtn;

	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstNa;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement sureName;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password_step_input']")
	private WebElement newPass;

	@FindBy(xpath = "(//select)[1]")
	private WebElement date;

	@FindBy(xpath = "(//select)[2]")
	private WebElement month;

	@FindBy(xpath = "(//select)[3]")
	private WebElement year;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement male;

	public WebElement getFirstNa() {
		return firstNa;
	}

	public WebElement getAccBtn() {
		return accBtn;
	}

	public WebElement getSureName() {
		return sureName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNewPass() {
		return newPass;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMale() {
		return male;
	}

}
