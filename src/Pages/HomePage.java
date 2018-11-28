package Pages;

import Page.MaintainWorkTypesPage;
import Page.WebElement;

public class HomePage {

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public LoginPage clickLogin() {
		WebElement loginpage = driver.findElement(loginpage);
		loginpage.click();
		return new LoginPage(driver);
	}
	
	public void searchProducts() {
	
	
	}

	public void addProducttoCart() {
		
	}
	
}
	