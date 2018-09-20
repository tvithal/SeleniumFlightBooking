package com.sqs.cloud9A;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homeObject {

    WebDriver driver;

    private By OriginLocator = By.name("Origin");
    private By DestinationLocator = By.name("Destination");
    private By SeatLocator = By.name("seat");
    private By ClassLocator = By.name("Flightclass");

    private By homepagebuttonlocater = By.xpath("/html/body/center[3]/a");
    private By bookflightbuttonlocater = By.xpath("/html/body/div/div/div[1]/ul/li[1]/a");
    private By bookbuttonlocater = By.xpath("/html/body/div/div/div[2]/form/button");
    private By bodyTextLocator = By.tagName("body");

    private String cloud9HomeHeader = "Itinerary";
    private String bookflightSuccessful = "Flight booked successfully";

    public homeObject(WebDriver driver) {

        this.driver = driver;
    }

    public void clickhomebutton(WebDriver driver){

        //System.out.println("Click Register Button");
        driver.findElement(homepagebuttonlocater).click();
    }

    public void clickbookflight(WebDriver driver){

        //System.out.println("Click Register Button");
        driver.findElement(bookflightbuttonlocater).click();
    }

    public void clickbookbutton(WebDriver driver){

        //System.out.println("Click Register Button");
        driver.findElement(bookbuttonlocater).click();
    }


    public void asserthomepageHeader(){
        String bodyText = driver.findElement(bodyTextLocator).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(cloud9HomeHeader));
    }

    public void assertbookflightSuccessful(){
        String bodyText = driver.findElement(bodyTextLocator).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(bookflightSuccessful));
    }

    public void populatehome(String Origin, String Destination, String Seat, String Flightclass){

        clickhomebutton(driver);
        clickbookflight(driver);
        driver.findElement(OriginLocator).sendKeys(Origin);
        driver.findElement(DestinationLocator).sendKeys(Destination);
        driver.findElement(SeatLocator).sendKeys(Seat);
        driver.findElement(ClassLocator).sendKeys(Flightclass);
        clickbookbutton(driver);
        assertbookflightSuccessful();
    }
}

