package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.*;

import page.TechFiosTestPage;
import util.BrowserFactory;

public class TechFiosPageTest {
	
	WebDriver driver;
	
	/*
	 * TC1: Validate when the toggle all check box is CHECKED, all check boxes for list items 
	 * are also CHECKED ON.
	 */
	@org.junit.Test()
	public void TC1()
	{
		driver=BrowserFactory.init();
		TechFiosTestPage tp = PageFactory.initElements(driver, TechFiosTestPage.class);
		
		tp.enterValuesForList("RashmiList1");
		tp.clickAddButton();
		tp.enterValuesForList("RashmiList2");
		tp.clickAddButton();
		tp.checkToggleAll();
		Assert.assertEquals(true,tp.checkAllCheckBoxSelected());
		BrowserFactory.tearDown();
	}
	
	/*
	 * TC2: Validate that a single list item could be removed using the remove 
	 * button when a single checkbox is selected.
	 */
	@org.junit.Test()
	public void TC2()
	{
		driver=BrowserFactory.init();
		TechFiosTestPage tp = PageFactory.initElements(driver, TechFiosTestPage.class);
		tp.uncheckToggleAll();
		tp.checkOneOfTheCheckBox();
		tp.clickRemoveButton();
		BrowserFactory.tearDown();
	}
	
	/*
	 * TC3: Validate that all list item could be removed using the remove button and 
	 * when "Toggle All" functionality is on.
	 */
	@org.junit.Test()
	public void TC3()
	{
		driver=BrowserFactory.init();
		TechFiosTestPage tp = PageFactory.initElements(driver, TechFiosTestPage.class);
		tp.checkToggleAll();
		tp.clickRemoveButton();
		//System.out.println("cnt"+tp.getCheckBoxCountInPage(tp.getAllCheckBoxInPage()));
		Assert.assertEquals(1,tp.getCheckBoxCountInPage(tp.getAllCheckBoxInPage()));
		BrowserFactory.tearDown();
	}
}
