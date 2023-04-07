package pompages;

import org.openqa.selenium.WebDriver;
/*
 * 
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Homepage {
	//Declaration 
@FindBy(xpath="//img[@alt='SkillRary']")
  private WebElement Logo;

@FindBy(xpath="//a[text()='Gear']")
private WebElement gearsTab;


@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/li[7]/a")
private WebElement skillraryDemoAppLink;

//Initialization
public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//Utilization
/*
 * this method return the skillrary logo
 * @return 
 */

public WebElement getLogo() {
return Logo;	
}
/*
 * *
 *  this method is used to click on Gears Tab
 */

public void clickGearsTab()
{
	gearsTab.click();
	}
/**
 * This method is used to click on skillrary demo app link
 * 
 */
public void clickskillraryDemoApp()
{
	skillraryDemoAppLink.click();
}
}
