package com.cydeo.fleetApp.pages;

import com.cydeo.fleetApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

   @FindBy(xpath = "//h1[.='Quick Launchpad']")
   public WebElement pageName;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement pageNameDashboard;

    @FindBy(xpath = "//li[@id='user-menu']")
    public WebElement dropdownLogout;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutBtn;
    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]//span[@class='title title-level-1']")
    public WebElement fleet;


    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicles;




}
