package com.cydeo.fleetApp.step_definitions;

import com.cydeo.fleetApp.pages.HomePage;
import com.cydeo.fleetApp.pages.LoginPage;
import com.cydeo.fleetApp.utilities.BrowserUtils;
import com.cydeo.fleetApp.utilities.ConfigurationReader;
import com.cydeo.fleetApp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Given("User on the fleet homepage")
    public void user_on_the_fleet_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginWithCredentials("user1","UserUser123");

    }
    @When("user click dropdown menu")
    public void user_click_dropdown_menu() {
        homePage.dropdownLogout.click();
        BrowserUtils.wait(2);
        homePage.logoutBtn.click();
    }
    @When("user logout from page")
    public void user_logout_from_page() {
        String expectedLogin ="Login";
        String actualPageLogin = loginPage.loginPage.getText();

        Assert.assertEquals(expectedLogin, actualPageLogin);

        Driver.closeDriver();
    }

    @Then("User click step back after logout")
    public void userClickStepBackAfterLogout() {

        Driver.getDriver().navigate().back();
        String expectedLogin ="Login";
        String actualPageLogin = loginPage.loginPage.getText();

        Assert.assertEquals(expectedLogin, actualPageLogin);
    }


    @When("user close the tab and quit the tabs")
    public void userCloseTheTabAndQuitTheTabs() {

        Driver.getDriver().quit();

    }
}
