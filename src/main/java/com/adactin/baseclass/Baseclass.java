package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;

	public static WebElement id(String id) {
		return driver.findElement(By.id(id));
	}

	public static WebElement name(String name) {
		return driver.findElement(By.name(name));
	}

	public static WebElement path(String path) {
		return driver.findElement(By.xpath(path));
	}

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("chrome")) {

		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void clickonElement(WebElement element) {
		element.click();

	}

	public static void inputvalueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	public static void isvisible(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	public static void getcurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();

	}

	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	public static void navigateback() {
		driver.navigate().back();
	}

	public static void navigateforward() {
		driver.navigate().forward();
	}

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	public static void getTitle() {
		driver.getTitle();

	}

	private void alert(String condition) {
		if (condition.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();

		} else if (condition.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();

		}

	}

	public static void action(WebElement element, String mousecondotion) {
		Actions action = new Actions(driver);
		if (mousecondotion.equalsIgnoreCase("movetoelement")) {
			action.moveToElement(element).build().perform();

		}

	}

	public static void robot(String type) throws AWTException {

		Robot robot = new Robot();
		if (type.equalsIgnoreCase("down")) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		} else if (type.equalsIgnoreCase("enter")) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

		}
	}

	private void takescreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(screenshotAs, destination);
	}

	public static void select(WebElement element, String type) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("ismultiple")) {
			boolean multiple = s.isMultiple();
			System.out.println(element);

		} else if (type.equalsIgnoreCase("getoptions")) {
			List<WebElement> options = s.getOptions();
			for (WebElement webElement : options) {
				System.out.println(webElement.getText());

			}

		}

		else if (type.equalsIgnoreCase("getfirstselected")) {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());

		} else if (type.equalsIgnoreCase("getallselected")) {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				System.out.println(webElement.getText());
			}

		}

	}

///s1\
	public static void dropdown(WebElement element, String value, String type) {
		Select s1 = new Select(element);
		if (type.equalsIgnoreCase("selectbyindex")) {
			s1.selectByIndex(Integer.parseInt(value));

		} else if (type.equalsIgnoreCase("selectbyvalue")) {
			s1.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("selectbyvisibletext")) {
			s1.selectByVisibleText(value);

		}
	}

	public static void frame(String value, String type) {
		if (type.equalsIgnoreCase("index")) {
			driver.switchTo().frame(Integer.parseInt(value));

		} else if (type.equalsIgnoreCase("id") || type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(value);

		} else if (type.equalsIgnoreCase("xpath")) {
			driver.switchTo().frame(driver.findElement(By.xpath(value)));
		} else if (type.equalsIgnoreCase("partiallinktext")) {
			driver.switchTo().frame(driver.findElement(By.partialLinkText(value)));

		}
	}

}