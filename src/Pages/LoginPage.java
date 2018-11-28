package Pages;


import Page.WebDriver;
import Page.WebElement;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void UserId(String id) {
		WebElement UserID = driver.findElement(txtID);
		UserID.clear();
		UserID.sendKeys(id);
	}


	public void enterPassword(String password) {
		WebElement elePassword = driver.findElement(txtPassword);
		elePassword.sendKeys(password);
	}
	
	public <T> T clickSubmitButton(T thing) {
		T t = null;
		 
		WebElement eleSubmitButton = driver.findElement(btnSubmit);
		eleSubmitButton.click();
		if(thing instanceof HomePage){
			t=(T) new HomePage(driver);
		}
		if(thing instanceof PaymentPage){
			t=(T) new PaymentPage(driver);
		}
		return (t);
	}

}


