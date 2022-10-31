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

import java.util.List;
import java.util.Map;

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


    @When("user enters below valid credentials as a driver")
    public void userEntersBelowValidCredentialsAsADriver(Map<String, String> userInfo) {
        loginPage.loginWithCredentials(userInfo.get("username"), userInfo.get("password"));
    }

    @When("user enters below valid credentials as a sales manager")
    public void userEntersBelowValidCredentialsAsASalesManager(Map<String, String> userInfo) {
        loginPage.loginWithCredentials(userInfo.get("username"), userInfo.get("password"));
    }

    @When("user enters below valid credentials as a storemanager")
    public void userEntersBelowValidCredentialsAsAStoremanager(Map<String, String> userInfo) {
        loginPage.loginWithCredentials(userInfo.get("username"), userInfo.get("password"));
    }

    @When("user enters valid credentials as a driver")
    public void userEntersValidCredentialsAsADriver(List<String> credentials) {
        String username = credentials.get(0);
        String password = credentials.get(1);
        loginPage.loginWithCredentials(username,password);
    }

    @When("user enters valid credentials as a sales manager")
    public void userEntersValidCredentialsAsASalesManager(List<String> credentials) {
        String username = credentials.get(0);
        String password = credentials.get(1);
        loginPage.loginWithCredentials(username,password);
    }

    @And("user enters valid credentials as a storemanager")
    public void userEntersValidCredentialsAsAStoremanager(List<String> credentials) {
            String username = credentials.get(0);
            String password = credentials.get(1);
            loginPage.loginWithCredentials(username,password);
}


    @When("{string} enters {string} and {string}")
    public void entersAnd(String userType, String username, String password) {

        if(userType.equalsIgnoreCase("Driver")){
            loginPage.loginWithCredentials(username, password);
        }else if (userType.equalsIgnoreCase("SalesManager")){
            loginPage.loginWithCredentials(username, password);
        }else{
            loginPage.loginWithCredentials(username, password);
        }
    }
    @Then("User on the {string} page")
    public void userOnThePage(String expectedText) {
             String userType = "";
        if(userType.equalsIgnoreCase("Driver"))   {

           String actualText = homePage.pageName.getText();
           Assert.assertEquals(expectedText, actualText);

       }else {
               BrowserUtils.wait(3);
               String actualText = homePage.pageNameDashboard.getText();
               Assert.assertEquals(expectedText, actualText);
            Driver.closeDriver();
      }

    }

    @Then("the user sees the warning message on the page")
    public void theUserSeesTheWarningMessageOnThePage() {
        BrowserUtils.wait(2);
        String expectedWarnMsg = "Invalid user name or password.";
        String actualWarnMsg = loginPage.warningMsg.getText();
        Assert.assertEquals(expectedWarnMsg, actualWarnMsg);
        Driver.closeDriver();

    }

    @Then("User sees the validation message")
    public void userSeesTheValidationMessage() {

        String expectedValidationMsg = "Lütfen bu alanı doldurun.";

        if(loginPage.usernameLogin.isSelected()){
            String actualValidationMsg1 = loginPage.usernameLogin.getAttribute("validationMessage");
            Assert.assertEquals(expectedValidationMsg, actualValidationMsg1);

        }else if (loginPage.passwordLogin.isSelected()) {
            String actualValidationMsg2 = loginPage.usernameLogin.getAttribute("validationMessage");
            Assert.assertEquals(expectedValidationMsg, actualValidationMsg2);

        }
        Driver.closeDriver();
    }
}



