package com.sqs.cloud9A;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AppTestA
{
    static WebDriver driver;

//    private String registrationsuccesful = "Registration was Successful";
//    private By bodytestlocation = By.tagName("body");
//    private String Cloud9Registerheader = "Cloud9 - Register";

    @Before
    public void testsetup() throws InterruptedException
    {

//        By loginlocation = By.xpath("/html/body/div/form/center/a\"");
//        driver.findElement(loginlocation).click();

        System.out.println("in testsetup ");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student01\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        String baseUrl = "http://10.9.10.39:81/sqlite/Main/login.html";
        String expectedTitle = "Cloud9 Airlines";
        driver.get(baseUrl);
        String actualTitle = driver.getTitle();
        System.out.println("Actual title is: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(2000);
    }

    @BeforeClass
    public static void browsersetup()
    {


    }

//    @Test
//    public void shouldRegisterNewCustomer()
//    {
//
//        driver.findElement(By.linkText("Register")).click();
//
//        registrationObject registrationpage;
//        registrationpage = new registrationObject(driver);"Cloud9");
//        registrationpage.populateRegistration("Tivash","Vithal","tvithaaddaygfdgdfgjal@yahoo.com",
//
//
//    }


//    @Test
//    public void shouldLoginNewCustomer()
//    {
//
//
//        loginObject loginnpage;
//        loginnpage = new loginObject(driver);
//        loginnpage.populateLogin("trvithal@gmail.com","Cloud9");
//
//
//    }

    @Test
    public void shouldfillinhome()
    {

        loginObject loginnpage;
        loginnpage = new loginObject(driver);
        loginnpage.populateLogin("trvithal@gmail.com","Cloud9");
//
//        homeObject homepage;
//        homepage = new homeObject(driver);
//        homepage.populatehome("C","D","A","E");

        ItenaryObject Itenary;
        Itenary = new ItenaryObject(driver);
        Itenary.populateItenary("C","J","\bC", "E");


    }


    @After
    public void tearDown()
    {
        driver.close();
    }


}


