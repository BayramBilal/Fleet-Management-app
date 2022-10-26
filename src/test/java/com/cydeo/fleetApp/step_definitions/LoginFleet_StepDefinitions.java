package com.cydeo.fleetApp.step_definitions;

import com.cydeo.fleetApp.pages.HomePage;
import com.cydeo.fleetApp.pages.LoginPage;

import com.cydeo.fleetApp.utilities.BrowserUtils;
import com.cydeo.fleetApp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginFleet_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("User on the fleet login page")
    public void user_on_the_fleet_login_page() {
      Driver.getDriver().get("https://qa.navfort.com/");
    }

    @When("user enters driver username")
    public void user_enters_driver_username() {
        loginPage.usernameLogin.sendKeys("user1");
    }
    @When("user enters driver password")
    public void user_enters_driver_password() {
        loginPage.passwordLogin.sendKeys("UserUser123");
        loginPage.loginBtn.click();
    }
    @Then("User on the Quick Launchpad page")
    public void user_on_the_quick_launchpad_page() {

        String expectedText = "Quick Launchpad";
        String actualText = homePage.pageName.getText();
        Assert.assertEquals(expectedText, actualText);


        Driver.closeDriver();
    }


    @When("user enters sales manager username")
    public void user_enters_sales_manager_username() {

        loginPage.usernameLogin.sendKeys("salesmanager101");
    }
    @When("user enters sales manager password")
    public void user_enters_sales_manager_password() {
        loginPage.passwordLogin.sendKeys("UserUser123");
        loginPage.loginBtn.click();
    }

    @When("user enters store manager username")
    public void user_enters_store_manager_username() {
        loginPage.usernameLogin.sendKeys("storemanager85");
    }

    @When("user enters store manager password")
    public void user_enters_store_manager_password() {
        loginPage.passwordLogin.sendKeys("UserUser123");
        loginPage.loginBtn.click();
    }
    @Then("User on the Dashboard page")
    public void user_on_the_dashboard_page() {


        String expectedText = "Dashboard";
        String actualText = homePage.pageNameDashboard.getText();
        Assert.assertEquals(expectedText, actualText);

        Driver.closeDriver();
    }

    @When("user enters driver username as {string}")
    public void userEntersDriverUsernameAs(String driverUsername) {
        loginPage.usernameLogin.sendKeys(driverUsername);
    }

    @And("user enters driver password as {string}")
    public void userEntersDriverPasswordAs(String driverPassword) {
        loginPage.passwordLogin.sendKeys(driverPassword);
        loginPage.loginBtn.click();
    }


    @When("user enters sales manager username as {string}")
    public void userEntersSalesManagerUsernameAs(String managerUsername) {
        loginPage.usernameLogin.sendKeys(managerUsername);

    }

    @And("user enters sales manager password as {string}")
    public void userEntersSalesManagerPasswordAs(String managerPassword) {
        loginPage.passwordLogin.sendKeys(managerPassword);
        loginPage.loginBtn.click();

    }

    @When("user enters store manager username as {string}")
    public void userEntersStoreManagerUsernameAs(String storemanagerUsername) {

        loginPage.usernameLogin.sendKeys(storemanagerUsername);
    }

    @And("user enters store manager password as {string}")
    public void userEntersStoreManagerPasswordAs(String storemanagerPassword) {
        loginPage.passwordLogin.sendKeys(storemanagerPassword);
        BrowserUtils.wait(3);
        loginPage.loginBtn.click();

        Driver.closeDriver();
    }
    }







