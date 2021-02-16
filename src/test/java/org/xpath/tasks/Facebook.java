package org.xpath.tasks;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.base.Base;
import org.junit.Assert;
import org.junit.Ignore;
import org.pojo.FacebookPojo;
import org.pojomanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook extends Base {
	PageObjectManager pageObjectManager;
	FacebookPojo facebookPojo;

	@Given("user has to launch the chrome browser and hit the url of facebook")
	public void user_has_to_launch_the_chrome_browser_and_hit_the_url_of_facebook() {
		launchUrl("https://www.facebook.com/");
	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable dt) {

		pageObjectManager = PageObjectManager.getPageObjectManager();
		facebookPojo = pageObjectManager.getFacebookPojo();

		facebookPojo.loginEnterUserNamePassword("greens123@gmail.com", "greens@123");

	}

	@When("click the login button")
	public void click_the_login_button() throws IOException, InterruptedException {

		facebookPojo.loginButtonClick();

		Thread.sleep(7000);
		screenShot("scenario1");
	}

}
