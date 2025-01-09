package AnanayMahajan.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AnanayMahajan.TestComponents.BaseTest;

public class Qa_selenium_test extends BaseTest{
	
	
	@Test(priority=1)
	public void testSearchBarForNewYork() {
		SoftAssert objSoftAssert = new SoftAssert();
		try {
			int expectedNumberOfRowsForNewYork = 5;
			//entering new york into the search bar
			objPage.enterValueInSearchBar("New York");
			
			//Asserting the count of table rows after entering new york into the search bar
			objSoftAssert.assertEquals(objPage.getNumberOfRowsInTable(),expectedNumberOfRowsForNewYork);
			
			System.out.println("Test case finished and all assertions passed");
		}
		catch(Exception e) {
			System.out.println("Exception occured in method testSearchBarForNewYork with message :"+ e.getMessage());
		}
		//to close the chrome window even if exception occurs
		finally {
			if(driver != null)
				driver.quit();
			
			objSoftAssert.assertAll();
		}
	}
}