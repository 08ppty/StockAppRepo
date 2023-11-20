package com.Ecommerce.qa.TestPages;

 

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.qa.Base.TestBase;
import com.Ecommerce.qa.pages.stockPage;
import com.app.ListenerDemo.ItestListenerClass;

 

@Listeners(ItestListenerClass.class)
public class stockApp extends TestBase {

	stockPage hp;

	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		hp = new  stockPage(driver);
	}

	@Test(priority = '1')
	public void clickOnRegisterPage() throws InterruptedException {

	 
		Thread.sleep(2000);

	}

	@Test(priority = '2')
	public void clickOnLogin() throws InterruptedException {

		Thread.sleep(2000);
	 
		  

	}

	@AfterClass
	public void CloseApp() {

		driver.quit();
	}

}
