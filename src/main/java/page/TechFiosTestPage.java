package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.Helper;

public class TechFiosTestPage extends BasePage{
	
	WebDriver driver;
	public TechFiosTestPage(WebDriver driver)
	{
		 super(driver);
	}
	
	
	@FindBy(how=How.CSS,using="input[value='Add']")WebElement ADD_BUTTON;
	public void clickAddButton()
	{
		super.clickWebElement(ADD_BUTTON);
	}
	
	@FindBy(how=How.NAME,using="data")WebElement ADD_TEXT;
	public void enterValuesForList(String value)
	{
		super.enterTextInTextBox(value, ADD_TEXT);
	}

	@FindBy(how=How.NAME,using="allbox")WebElement TOGGLEALL_CHKBOX;
	public void checkToggleAll()
	{
		super.clickWebElement(TOGGLEALL_CHKBOX);
	}
	
	public void uncheckToggleAll()
	{
		super.clickWebElement(TOGGLEALL_CHKBOX);
	}
	
	public boolean checkAllCheckBoxSelected()
	{
		boolean flag=false;
		List<WebElement> l=super.getAllCheckBoxInPage();
		for(WebElement l1:l)
		{
			if(l1.isSelected())
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public void checkOneOfTheCheckBox()
	{
		List<WebElement> l= super.getAllCheckBoxInPage();
		int count = super.getCheckBoxCountInPage(l);
		int checkBoxToClick=Helper.generateRandomNumber(count);
		super.clickWebElement(l.get(checkBoxToClick));
	}
	
	@FindBy(how=How.CSS,using="input[value='Remove']")WebElement REMOVE_BUTTON;
	public void clickRemoveButton()
	{
		super.clickWebElement(REMOVE_BUTTON);
	}
}
