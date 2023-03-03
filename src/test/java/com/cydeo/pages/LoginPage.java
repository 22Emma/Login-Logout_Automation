package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "login")
    public WebElement loginUsername;


    @FindBy(name = "password")
    public WebElement loginPassword;


    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    public void goToWebPage(String webLink){
        Driver.getDriver().get(webLink);
    }


}
