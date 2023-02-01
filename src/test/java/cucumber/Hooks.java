package cucumber;

import base.BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks<TakeScreenShoot> {
	BaseClass b = new BaseClass();
	
	@Before
	public void launchUrl() throws Throwable {
		b.launchUrl("https:/www.google.com");

		   
		 }
	@After
	public void exist() throws Throwable {
		b.screen();
		b.exist();
	}

}
