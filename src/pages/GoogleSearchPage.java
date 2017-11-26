/**
 * 
 */
package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author QAGuru
 *
 */
public class GoogleSearchPage {
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver){
		
		this.driver = driver;
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[@id='lst-ib']")
	WebElement txtboxSearch;
	

	
	private void setSearchBox(String searchData){
		this.txtboxSearch.sendKeys(searchData+ Keys.ENTER);
	}
	
	
	
	public void searchGoogle(String searchData){
		setSearchBox(searchData);

		
	}


}
