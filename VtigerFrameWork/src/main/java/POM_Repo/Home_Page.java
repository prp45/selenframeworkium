package POM_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page {
	public Home_Page(WebDriver driver)
	{
		
	}
	@FindBy(linkText="Organizations")
	private WebElement OrganizationLink;
	
	@FindBy(linkText="Products")
	private WebElement ProductLink;
	@FindBy(linkText="More")
	private WebElement Morelink;
	@FindBy(linkText="Campaigns")
	private WebElement CampaignLink;
	@FindBy(xpath="//img [@src='themes/softed/images/user.PNG'])")
     private WebElement SignOutImg;		
	
	@FindBy(linkText="Sign Out")
	private WebElement SignOutLink;

	public void clickOrganization()
	{
		OrganizationLink.click();
	

}
}
