package com.Ecommerce.qa.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Ecommerce.qa.Base.TestBase;
import com.Ecommerce.qa.Utilities.Xls_DataProvider;

public class stockPage extends TestBase {

	stockPage hp;
	

	public stockPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void openApplication() {

		openBrowser("Chrome");

		hp = new stockPage(driver);
		 
	}

	@Test(priority = '1', dataProvider = "testdata")
	public void stockPagee(String productname, String productdetail, String quantity) {

		 
		hp.stockPagee(productname, productdetail , quantity);

	}

	@DataProvider(name = "testdata")
	public Object[][] datasupplier() throws IOException {

		Object[][] input = Xls_DataProvider.getTestData("Sheet1");
		return input;
	}

}
