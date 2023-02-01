package base;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass<TakeScreenShoot>{
	public static WebDriver driver;
	public void launchUrl(String url) {
		 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.get(url);
		   
		 }
	public void exist() {
		//driver.quit();
		
	}
	public void gpage(String url) {
		driver.get(url);
	}
	public void fpage(String url) {
		driver.get(url);
	}
	public void press(WebElement element) {
		element.click();
	}
	public void text(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void display(WebElement element) {
		element.isDisplayed();
		
	}
	public void time() throws Throwable {
		Thread.sleep(5000);
		
	}
	public void print(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		
	}
	public void condition(boolean ele) {
		assertTrue(ele);
	}
	public void screen() throws Throwable {
	TakesScreenshot t = (TakesScreenshot)driver;
	File from = t.getScreenshotAs(OutputType.FILE);
	File to = new File("*\\org.cucumber\\Cucumber\\target\\image.png");
	FileUtils.copyFile(from, to);
	
	}
	
	
	
	
	
	}



