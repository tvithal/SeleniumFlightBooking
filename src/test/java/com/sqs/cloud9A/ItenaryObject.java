package com.sqs.cloud9A;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ItenaryObject {

    WebDriver driver;

    private By OriginLocator = By.name("Origin");
    private By DestinationLocator = By.name("Destination");
    private By SeatLocator1 = By.name("seat");
    private By ClassLocator = By.name("Flightclass");


    ///html/body/div/div/div[2]/div/table/tbody/tr[2]/td[4]
    private By Itenarybuttonlocater = By.xpath("/html/body/div/div/div[1]/ul/li[2]/a");
    //private By updateflightlocater = By.xpath("/html/body/div/div/div[2]/div/table/tbody/tr[2]/td[4]");
    private By updateflightlocater = By.xpath("/html/body/div/div/div[2]/div/table/tbody/tr[2]/td[1]/a[1]");
    private By updatelocater = By.xpath("/html/body/div/div/div[2]/form/button");
    private By Itenarybuttonlocater2 = By.xpath("//html/body/div/div/div[2]/center/a");
    private By bodyTextLocator = By.tagName("body");

    private String cloud9HomeHeader = "Itinerary";
    private String updateflightSuccessful = "Flight successfully updated";



    public ItenaryObject(WebDriver driver) {

        this.driver = driver;
    }

//    public void scanBookingsAndClickUpdate(String bookingID){
//
//        // trying to click on update
//        //driver.findElement(By.linkText("Update")).click();
//
//        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
//
//        System.out.println("Number of rows is " + rows.size());
//
//        int rowNum =  rows.size();
//
//        // Get booking id for latest booking
//        List<WebElement> colVals2 = rows.get(rowNum-1).findElements(By.tagName("td"));
//        //System.out.println("What is this " + colVals2.get(3).getText());
//        String columnContents;
//        for(int i=1; i<rowNum; i++){
//            List<WebElement> colVals1 = rows.get(i).findElements(By.tagName("td"));
//            for(int j=0; j<6; j++){
//                columnContents = colVals1.get(j).getText();
//                if (columnContents.equals(bookingID)) {
//                    System.out.println("Yippeee,  found it: i=" + i + " : j = " + j);
//                    System.out.println("Column Contents = " + columnContents);
//                    //  creat the URL to navigate to the edit screen for the flightid of interest
//                    //  updateLink = colVals1.get(0);
//                }
//                System.out.println("j= " + j + " : " + colVals1.get(j).getText());
//                // If we come out of the loop and have not found the ID, then print a relevant message
//            }
//        }
//    }
//

    public void clickItenarybutton(WebDriver driver){

        //System.out.println("Click Register Button");
        driver.findElement(Itenarybuttonlocater).click();
    }

    public void clickupdateflightbutton(WebDriver driver){

        //System.out.println("Click Register Button");
        driver.findElement(updateflightlocater).click();
    }


    public void clickupdatebutton(WebDriver driver){

        //System.out.println("Click Register Button");
        driver.findElement(updatelocater).click();
    }


    public void clickItenarybutton2(WebDriver driver){

        //System.out.println("Click Register Button");
        driver.findElement(Itenarybuttonlocater2).click();
    }

    public void asserthomepageHeader(){
        String bodyText = driver.findElement(bodyTextLocator).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(cloud9HomeHeader));
    }

    public void assertupdatedflightSuccessful(){
        String bodyText = driver.findElement(bodyTextLocator).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(updateflightSuccessful));
    }

    public void populateItenary(String Origin, String Destination,String Seat1, String Flightclass){



        clickItenarybutton(driver);
        asserthomepageHeader();
//        scanBookingsAndClickUpdate(driver);
        clickupdateflightbutton(driver);
        driver.findElement(OriginLocator).sendKeys(Origin);
        driver.findElement(DestinationLocator).sendKeys(Destination);
        driver.findElement(SeatLocator1).sendKeys(Seat1);
        driver.findElement(ClassLocator).sendKeys(Flightclass);
        clickupdatebutton(driver);
        assertupdatedflightSuccessful();
        clickItenarybutton2(driver);
    }
}




//        itineraryPage.scanBookingsAndClickUpdate("310", "B24");

//        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
//
//        int rowNum =  rows.size();
//
//        List<WebElement> colVals1 = rows.get(i).findElements(By.tagName("td"));
//
//        /html/body/div/div/div[2]/div/table
//
//        To get a column value: colVals1.get(j).getText()
//
//        for ..........  {
//
//        for{
//        }
//
//        }
//

