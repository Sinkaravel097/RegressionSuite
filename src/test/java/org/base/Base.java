package org.base;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Select s;
	public static JavascriptExecutor js;

	public static void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void sendTxt(WebElement element, String txt) {
		element.sendKeys(txt);
	}

	public static void clickBtn(WebElement element) {
		element.click();
	}

	public static void beDatas() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "oracle db");
			String query = "select * from employees where first_name='Ellen'";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String str = rs.getString(1);
				System.out.println(str);

				String str1 = rs.getString("first_name");
				System.out.println(str1);

				int int1 = rs.getInt("salary");
				System.out.println(int1);

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void selectIndex(WebElement element, int ind) {
		s = new Select(element);
		s.selectByIndex(ind);
	}

	public static void javaSend(WebElement element, String text) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
	}

	public static String getAttr(WebElement element) {
		String attr = element.getAttribute("value");
		return attr;
	}

	public static void quit() {
		driver.quit();
	}
	
	public static void screenShot(String ImgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("E:\\Selenium Practical\\CucumberSampleProject\\Images\\"+ImgName+".png");
		FileUtils.copyFile(ss, f);
	}
	
	

}
