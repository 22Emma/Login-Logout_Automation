package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {

    LoginPage loginPage=new LoginPage();

    @When("user enters salesManager username")
    public void user_enters_sales_manager_username() {
        loginPage.goToWebPage(ConfigurationReader.getProperty("pageLink"));
        loginPage.loginUsername.sendKeys("salesmanager35@info.com");
    }
    @When("user enters salesManager password")
    public void user_enters_sales_manager_password() {
        loginPage.loginPassword.sendKeys("salesmanager");
        loginPage.loginButton.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
       String expectedTitle="Odoo";
       String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


    }

    @When("user enters posManager username")
    public void user_enters_pos_manager_username() {

    }
    @When("user enters posManager password")
    public void user_enters_pos_manager_password() {

    }



}

