package AnanayMahajan.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page{ 
WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	//web element for search bar
	@FindBy(xpath = "//div[@id = \"example_filter\"]//input[@type = \"search\"]")
	WebElement searchBar;
	
	//list of web elements of table rows
	@FindBy(xpath = "//table[@id = \"example\"]//tbody//tr")
	List<WebElement> tableRows;
	
	//web element of data table info text
	@FindBy(id = "example_info")
	WebElement dataTableInfoTextWebElement;
	
	//getter for search bar web element
	public WebElement getSearchBar() {
		return searchBar;
	}
	
	//getter for list of table rows web elements
	public List<WebElement> getTableRows(){
		return tableRows;
	}
	
	//getter for search bar web element
		public WebElement getDataTableInfoTextWebElement() {
			return dataTableInfoTextWebElement;
		}
	
	//method to enter user defined value into the search bar
	public void enterValueInSearchBar(String val) {
		getSearchBar().sendKeys(val);
	}
	
	//method to get the number of rows in the table
	public int getNumberOfRowsInTable() {
		return getTableRows().size();
	}
	
	//method to get text of data table info
	public String getDataTableInfoText() {
		return getDataTableInfoTextWebElement().getText();
	}
	
}
	