package selenium.org.myself;

import org.myself.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaRegistrationPage extends Base {
	public DemoqaRegistrationPage() {
		// TODO Auto-generated constructor stub
		WebDriver driver = getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstName() {
		return firstName;
	}

	//public WebElement getLastName() {
	//	return lastName;
	//}

	@FindBy(xpath="//input[@ng-model='FirstName']")
	private WebElement firstName;
	
	//@FindBy(id="name_3_lastname")
	//private WebElement lastName;
}
