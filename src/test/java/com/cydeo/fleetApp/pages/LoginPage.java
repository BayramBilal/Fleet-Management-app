package com.cydeo.fleetApp.pages;

import com.cydeo.fleetApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id="prependedInput")
    public WebElement usernameLogin;

    @FindBy(id="prependedInput2")
    public WebElement passwordLogin;

    @FindBy(id="_submit")
    public WebElement loginBtn;

}
