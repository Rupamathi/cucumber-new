package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepository extends BaseClass{
	BaseClass b = new BaseClass();
	public ObjectRepository() {
	PageFactory.initElements(b.driver, this);	
	}
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement sigin;
	
	public WebElement getSigin() {
		return sigin;
	}
	public void setSigin(WebElement sigin) {
		this.sigin = sigin;
	}
	 @FindBy(xpath = "//input[@type='email']")
		private WebElement id;
	public WebElement getId() {
		return id;
	}
	public void setId(WebElement id) {
		this.id = id;
	}
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement next;
	public WebElement getNext() {
		return next;
	}
	public void setNext(WebElement next) {
		this.next = next;
	}
	 @FindBy(xpath = "//input[@type='password']")
		private WebElement pass;
	
	 public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	@FindBy(name = "login")
		private WebElement step;
	public WebElement getStep() {
		return step;
	}
	public void setStep(WebElement step) {
		this.step = step;
	}
	 @FindBy(xpath = "//div[text()='Compose']"  )
		private WebElement compose;
	public WebElement getCompose() {
		return compose;
	}
	public void setCompose(WebElement compose) {
		this.compose = compose;
	}
		
		
		
	}


