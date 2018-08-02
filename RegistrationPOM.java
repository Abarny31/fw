package selenium.org.myself;

import org.myself.BaseOfDemoQa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM extends BaseOfDemoQa {
	//public static void main( String[] args ) {
    public RegistrationPOM(WebDriver driver){
    //WebDriver driver = getDriver("http://demo.automationtesting.in/Register.html");
	 PageFactory.initElements(driver, this);
   }
	@FindBy(xpath="//input[@ng-model='FirstName']")
			private WebElement firstname;
	@FindBy(xpath="//input[@ng-model='LastName']")
			private WebElement lastname;
	@FindBy(xpath="//textarea[@ng-model='Adress']")
			private WebElement adress;
	@FindBy(xpath="//input[@ng-model='Phone']")
			private WebElement phone;
	@FindBy(xpath="//input[@ng-model='EmailAdress']")
			private WebElement eadress;
	@FindBy(xpath="//input[@value='FeMale']")
			private WebElement female;
	@FindBy(xpath="//input[@value='Male']")
			private WebElement male;
	@FindBy(xpath="//input[@value='Cricket']")
			private WebElement Cricket;
	@FindBy(xpath="//input[@value='Hockey']")
			private WebElement hockey;
    @FindBy(xpath="//input[@value='Movies']")
    		private WebElement movies;
    @FindBy(id="msdd")
    		private WebElement coL;
    @FindBy(xpath="//a[contains(text(),'English')]")
    		private WebElement language;
    @FindBy(id="Skills")
    		private WebElement skills;
    @FindBy(id="countries")
    		private WebElement country;
    @FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
    		private WebElement clickforcountry;
    @FindBy(xpath="//li[contains(text(),'India')]")
    		private WebElement scountry;
    @FindBy(id="yearbox")
    		private WebElement year;
    @FindBy(xpath="//select[@ng-model='monthbox']")
    		private WebElement month;
    @FindBy(id="daybox")
    		private WebElement day;
    @FindBy(xpath="//input[@ng-model='Password']")
    		private WebElement password;
    @FindBy(xpath="//input[@ng-model='CPassword']")
    		private WebElement cpassword;
    @FindBy(name="signup")
    		private WebElement signup;
	public WebElement getFirstname() {
		System.out.println(firstname);
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAdress() {
		return adress;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getEadress() {
		return eadress;
	}
	public WebElement getFemale() {
		return female;
	}
	public WebElement getMale() {
		return male;
	}
	public WebElement getCricket() {
		return Cricket;
	}
	public WebElement getHockey() {
		return hockey;
	}
	public WebElement getMovies() {
		return movies;
	}
	public WebElement getCoL() {
		return coL;
	}
	public WebElement getLanguage() {
		return language;
	}
	public WebElement getSkills() {
		return skills;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getClickforcountry() {
		return clickforcountry;
	}
	public WebElement getScountry() {
		return scountry;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getCpassword() {
		return cpassword;
	}
	public WebElement getSignup() {
		return signup;
	}
}

