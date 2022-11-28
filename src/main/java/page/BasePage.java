package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver)
	{
		 this.driver=driver;
	}
	
	public boolean checkIfCheckBoxIsSelected(WebElement element)
	{
		return element.isSelected();
	}
	
	public List<WebElement> getAllCheckBoxInPage()
	{
		List<WebElement> allCheckBoxes= this.driver.findElements(By.xpath("//input[@type='checkbox']"));
	    //System.out.println("Number of Check boxes : "+ Integer.toString(allCheckBoxes.size()));
	    return allCheckBoxes;
	}
	
	public int getCheckBoxCountInPage(List<WebElement> allCheckBoxes)
	{
		return allCheckBoxes.size();
	}
	
	public void clickWebElement(WebElement element)
	{
		element.click();
	}
	
	public void enterTextInTextBox(String text,WebElement element)
	{
		element.sendKeys(" ");
		element.sendKeys(text);
	}
}
