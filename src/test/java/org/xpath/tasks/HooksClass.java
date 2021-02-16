package org.xpath.tasks;

import java.io.IOException;

import org.base.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends Base {

	@Before
	public void beforeExecution() {
		browser();
		maxWindow();
		deleteCookies();
		implicitWait();
	}

	@After
	public void afterExecution(Scenario s) throws IOException {

		quit();
	}

}
