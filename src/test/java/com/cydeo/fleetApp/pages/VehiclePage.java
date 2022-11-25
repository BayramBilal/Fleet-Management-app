package com.cydeo.fleetApp.pages;

import com.cydeo.fleetApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class VehiclePage {


    public VehiclePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    //Bilal's locators
    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody//tr[1]//td[20]")
    public WebElement threeDots;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']")
    public WebElement deleteBar;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//li//li[3]")
    public WebElement deleteSign;

    @FindBy(xpath = "//div[@class='modal oro-modal-danger in']")
    public WebElement deleteConfirm;

    @FindBy(className= "modal-body")
    public WebElement deleteMessage;

    @FindBy(xpath = "//a[.='Yes, Delete']")
    public WebElement deleteYes;

    @FindBy(className ="message")
    public WebElement messageWarning;

    @FindBy(xpath = "//div[@class='flash-messages-holder']//div//div")
    public WebElement itemDeletedMessage;

    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;




}
