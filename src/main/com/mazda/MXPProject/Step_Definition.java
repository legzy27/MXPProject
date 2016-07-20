package com.mazda.MXPProject;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;
//import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.mazda.MXPProject.pageObject.GoHomePage;
import com.mazda.MXPProject.util.webUtil;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Step_Definition {
	private static final String TimeSpan = null;

	WebDriver driver = new FirefoxDriver();




	@Before
	@Given("^Its my first time on the mazda website$")
	public void its_my_first_time_on_the_mazda_website() throws Throwable {
		GoHomePage gohomePage = webUtil.goHomePage(driver);
		//	driver.get("http://www.mazda.ca");	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(2000);



	}

	public void openBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"D:/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}



		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		// perform operations on popup

		driver.switchTo().window(parentWindowHandler);  // switch back to parent window

	/*	ProfilesIni profile = new ProfilesIni();
		FirefoxProfile ffprofile = profile.getProfile("default");
		WebDriver driver = new FirefoxDriver(ffprofile);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		
		
		FirefoxProfile fp = new FirefoxProfile();

		// disabling firefox add-on signing requirement through FirefoxProfile
	
		fp.setPreference("xpinstall.signatures.required", false);

		// instantiating FirefoxDriver instance with set FirefoxProfile instance
		WebDriver driver = new FirefoxDriver(fp);

		driver.get("http://www.mazda.ca");

		driver.quit(); */

		FirefoxProfile profile = new FirefoxProfile();

		// setting home page of browser when startup
		profile.setPreference("browser.startup.homepage", "http://google.com");

		// setting download directory of firefox browser
		profile.setPreference("browser.download.folderList", 2);

		// setting download directory path
		profile.setPreference("browser.download.dir", "pathToDirectory");

		// setting download manager startup status
		profile.setPreference("browser.download.manager.showWhenStarting",false);

		// instantiating firefox driver with defined FirefoxProfile

		WebDriver driver = new FirefoxDriver(profile);

	}
		  public static final String USERNAME = "alex4237";
		  public static final String AUTOMATE_KEY = "7CyyS2RZjzpm5Z9BPPC5";
		  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		  public static void main(String[] args) throws Exception {

		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "IE");
		    caps.setCapability("browser_version", "11.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1024x768");
		    caps.setCapability("browserstack.debug", "true");
		 

		  }

	@When("^click on 'Mazda Home'$")
	public void click_on_the_My_Mazda() throws Throwable {
		GoHomePage.gohomePageLink(driver,"Home");

		//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//	driver.findElement(By.linkText("Home")).click();
		//	driver.navigate().refresh();
		
			
		 }



	@Then("^I go to 'Find a Dealer'$")
	public void i_go_to_Find_a_Dealer() throws Throwable {
		GoHomePage.goFindaDealer(driver, "Find a Dealer");
		//	driver.findElement(By.linkText("Find a Dealer")).click();
		//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//	WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
	
	}

	@Then("^I click on search by location i see the names of all the dealer$")
	public void i_click_on_search_by_location_i_see_the_names_of_all_the_dealer() throws Throwable {
		GoHomePage.goSearchbylocation(driver, "Search by location");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().deleteAllCookies();
		//	driver.findElement(By.linkText("Search by location")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}

	@Then("^I click on search by postal code i enter postcode$")
	public void i_click_on_search_by_postal_code_i_enter_postcode() throws Throwable {
		GoHomePage.goSearchbyPostalCode(driver, "Search by postal code");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//	driver.findElement(By.linkText("Search by postal code")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,2500)");

	}

	@Then("^I enter correct postal code M(\\d+)P (\\d+)N(\\d+)$")
	public void i_enter_correct_postal_code_M_P_N(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		GoHomePage.goFindDealer(driver, "Find a Dealer");
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//	driver.findElement(By.linkText("Find a Dealer")).click();
	//	driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/div/input")).click();
	//	driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/div/input")).sendKeys("M5P2N7");
	//	driver.findElement(By.cssSelector("button.search")).click();


		WebElement element = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//scroll down the page
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Then("^I enter incorrect postal code E(\\d+) (\\d+)LP$")
	public void i_enter_incorrect_postal_code_E_LP(int arg1, int arg2) throws Throwable {
		GoHomePage.goFindDealer1(driver, "Find a Dealer");
	//	WebDriverWait wait = new WebDriverWait(driver, 30);
	//	driver.findElement(By.linkText("Find a Dealer")).click();	
	//	driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/div/input")).click();
	//	driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/div/input")).sendKeys("E33LP");
	//	driver.findElement(By.cssSelector("button.search")).click();

		WebElement element = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[2]/li[2]/form/fieldset/div/div/div[2]/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");


	}

	@Then("^I get an error message$")
	public void i_get_an_error_message() throws Throwable {
		System.out.print("No results could be found for this postal code E3 3LP.Please try again.");
	}

	@Then("^I search by dealer name$")
	public void i_search_by_dealer_name() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.linkText("Search by dealer name")).click(); 
		//driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[1]/li[3]/a")).click();
		//driver.findElement(By.linkText("Search by dealer name")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div/div/div/ul[1]/li[3]/a")).click();



		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		 FirefoxProfile profile = new FirefoxProfile();
		// Turn off updates
		 profile.setPreference("app.update.enabled", false);
		WebDriver driver1 = new FirefoxDriver(profile);
		 profile.setPreference("browser.startup.homepage","http://www.mazda.ca");
		 driver = new FirefoxDriver(profile);   
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.close();
       
        
	
	

       }

        
     
	
	
	@Given("^I want to test drive a car$")
	public void i_want_to_test_drive_a_car() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("http://www.mazda.ca");       
	}



	@When("^I click Book a Test Drive$")
	public void i_click_Book_a_Test_Drive() throws Throwable {		
		driver.findElement(By.xpath("html/body/header/div/div/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Then("^I see collection of vehicles$")
	public void i_see_collection_of_vehicles() throws Throwable {
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^I select one vehicle$")
	public void i_select_one_vehicle() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		 
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/ul/li/div/div/ul[2]/li/div[2]/div[1]/a/div[1]/div/img")).click();	 

	}

	@Then("^I select a dealer$")
	public void i_select_a_dealer() throws Throwable {  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		// new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/div[3]/div/div/div/section/div/ul/li[2]/div/a"))).click(); 			  
		// driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/section/div/ul/li[2]/div/a")).click();
		// driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/section/div/ul/li[2]/div/a")).click();
		// driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/section/div/ul/li[2]/ul/li/div/ul[2]/li[1]/form/div[3]/div[1]/article[1]/div[1]/a")).click();
		driver.findElement(By.linkText("Select a Dealer")).click();
		driver.findElement(By.name("postcode")).clear();
		driver.findElement(By.name("postcode")).sendKeys("M5P2N7");
		driver.findElement(By.cssSelector("button.search")).click();
		// driver.findElement(By.xpath("html/body/div[1]/div[3]/div")).click();
		driver.findElement(By.linkText("YORKDALE DUFFERIN MAZDA")).click();

	}

	@Then("^I select a date and time$")
	public void i_select_a_date_and_time() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Select date & time")).click();



		//	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/form/div[1]/div[1]/fieldset/div/div/div[1]/div/div/div[1]/table/tbody/tr[3]/td[6]")).click();
		// driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/form/div[1]/div[1]/fieldset/div/div/div[1]/div/div/div[1]/table/tbody/tr[3]/td[7]")).click();
		// driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/form/div[1]/div[1]/fieldset/div/div/div[1]/div/div/div[1]/table/tbody/tr[3]/td[8]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/form/div[1]/div[1]/fieldset/div/div/div[1]/div/div/div[1]/table/tbody/tr[3]/td[9]")).click();
		// driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/form/div[1]/div[1]/fieldset/div/div/div[1]/div/div/div[1]/table/tbody/tr[4]/td[3]")).click();


		driver.findElement(By.xpath("//div[3]/div/div/div/table/tbody/tr[3]/td[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/form/div[2]/div[1]/fieldset/div/div/div[3]/div/div[2]/div/table/tbody/tr/td[1]")).click();


		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/div/a")).click();


	}

	@Then("^I enter contact details$")
	public void i_enter_contact_details() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Enter contact details")).click();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Miklos");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Lantra");
		driver.findElement(By.cssSelector("ul.helper-accordion.level-2 > li > form > fieldset > div.field-row > div.field > div.subrow > div.res-1024-cols-5 > div.field-input.postcode > input[name=\"postcode\"]")).clear();
		driver.findElement(By.cssSelector("ul.helper-accordion.level-2 > li > form > fieldset > div.field-row > div.field > div.subrow > div.res-1024-cols-5 > div.field-input.postcode > input[name=\"postcode\"]")).sendKeys("M5P2N7");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("alex.oyedele@syzygy.co.uk");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/section/div/ul/li[4]/ul/li/form/fieldset/div[6]/div/div/div[2]/label[2]"));
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/section/div/ul/li[4]/ul/li/form/fieldset/div[9]/div/div/div[1]/label")).click();
		driver.findElement(By.linkText("Save Details")).click();

	}
	@Then("^I request a Test Drive$")
	public void i_request_a_Test_Drive() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/section/fieldset/div/div/div/a")).click();	 

	}

	@Then("^I will see Thank You!$")
	public void i_will_see_Thank_You() throws Throwable {
		assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/h3"))); 

	}

	private void assertTrue(WebElement findElement) {
		

	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	 

	}

	@After
	public void kill()
	{

		driver.close();

	}

	@Given("^I am shopping Tools page$")
	public void i_am_shopping_Tools_page() throws Throwable {
		driver.get("http://www.mazda.ca");
		driver.findElement(By.xpath("/html/body/header/div/div/nav/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div/nav/ul[2]/li[5]/a")).click();
	}

	@When("^I select vehicle$")
	public void i_select_vehicle() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/ul/li/div/div/ul[2]/li/div[2]/div[1]/a/div[1]/div/img"));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/ul/li/div/div/ul[2]/li/div[2]/div[2]/a/div[1]/div/img"));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/ul/li/div/div/ul[2]/li/div[2]/div[3]/a/div[1]/div/img"));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/ul/li/div/div/ul[2]/li/div[2]/div[4]/a/div[1]/div/img"));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/ul/li/div/div/ul[2]/li/div[2]/div[5]/a/div[1]/div/img"));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/ul/li/div/div/ul[2]/li/div[2]/div[6]/a/div[1]/div/img"));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/ul/li/div/div/ul[2]/li/div[2]/div[7]/a/div[1]/div/img"));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[1]/ul/li/div/div/ul[2]/li/div[2]/div[8]/a/div[1]/div/img")).click();


	}


	@Then("^I see list of <mazda vehicle>$")
	public void i_see_list_of_mazda_vehicle() throws Throwable {

	}

	@Then("^I select one mazda vehicle$")
	public void i_select_one_mazda_vehicle() throws Throwable {


	}

	@Then("^I see list of (\\d+) MAZDA(\\d+)$")
	public void i_see_list_of_MAZDA(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I see list of (\\d+) MAZDA(\\d+) SPORT$")
	public void i_see_list_of_MAZDA_SPORT(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I see list of (\\d+) CX(\\d+)$")
	public void i_see_list_of_CX(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}


	@Then("^I see list of (\\d+)\\.(\\d+) CX (\\d+)$")
	public void i_see_list_of_CX(int arg1, int arg2, int arg3) throws Throwable {
		// Write code here that turns the phrase above into concrete actions


	}


	@Then("^I see list of (\\d+) MX-(\\d+)$")
	public void i_see_list_of_MX(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}


	@Then("^I Enter contact details$")
	public void i_Enter_contact_details() throws Throwable {


	}

	@Then("^I change Province$")
	public void i_change_Province() throws Throwable {


	}

	@Then("^I request quote$")
	public void i_request_quote() throws Throwable {


	}


}




