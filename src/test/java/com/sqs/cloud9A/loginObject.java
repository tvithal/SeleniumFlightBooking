package com.sqs.cloud9A;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginObject {
    WebDriver driver;

    private By emailLocator = By.name("email");
    private By passwordLocator = By.name("password");
    private By loginButtonLocator = By.xpath("/html/body/div/form/button");
    private By bodyTextLocator = By.tagName("body");
    private By homepagebuttonlocater = By.xpath("/html/body/center[3]/a");

    private String cloud9loginHeader = "Cloud9 - Sign in";
    private String loginSuccessful = "Welcome";

    public loginObject(WebDriver driver) {

        this.driver = driver;
    }

    public void clicklogin(WebDriver driver){

        //System.out.println("Click Register Button");
        driver.findElement(loginButtonLocator).click();
    }

    public void clickhomebutton(WebDriver driver){

        //System.out.println("Click Register Button");
        driver.findElement(homepagebuttonlocater).click();
    }

    public void assertloginHeader(){
        String bodyText = driver.findElement(bodyTextLocator).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(cloud9loginHeader));
    }

    public void assertloginSuccessful(){
        String bodyText = driver.findElement(bodyTextLocator).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(loginSuccessful));
    }

    public void populateLogin(String emailAddress, String password){

        assertloginHeader();
        driver.findElement(emailLocator).sendKeys(emailAddress);
        driver.findElement(passwordLocator).sendKeys(password);
        clicklogin(driver);
        assertloginSuccessful();
        clickhomebutton(driver);
    }
}
