package com.vytrack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (xpath = "//input[@id='prependedInput']")
    public WebElement usernameBox;

    @FindBy (xpath = "//input[@id='prependedInput2']")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[@id='_submit']")
    public WebElement loginButton;


    public void login(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    /*
    We can also make it private but then must create getters

    @FindBy (xpath = "//input[@id='prependedInput']")
    private WebElement usernameBox;

    @FindBy (xpath = "//input[@id='prependedInput2']")
    private WebElement passwordBox;

    @FindBy (xpath = "//button[@id='_submit']")
    private WebElement loginButton;

    public WebElement getUsernameBox() {
        return usernameBox;
    }

    public WebElement getPasswordBox() {
        return passwordBox;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
     */

}
