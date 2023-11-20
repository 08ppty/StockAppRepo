package com.app.ListenerDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ItestListenerClass.class)
public class TestDemoListener {

	
	@Test(priority=1)
	public void method1() {
		
		
		System.out.println("Executing method1");
	}
	
	@Test (priority=2)
	public void method2() {
		
		System.out.println("Exceuting method2");
        Assert.assertTrue(false);	
	}
	
	
	
}
