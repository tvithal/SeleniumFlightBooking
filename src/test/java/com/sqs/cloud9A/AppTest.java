//package com.sqs.cloud9A;
//
//import static org.junit.Assert.assertTrue;
//
//import org.junit.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class AppTest
//{
//    static WebDriver driver;
//    private String registrationsuccesful = "Registration was Successful";
//    private By bodytestlocation = By.tagName("body");
//    private String Cloud9Registerheader = "Cloud9 - Register";
//
//    @Before
//    public void testsetup() throws InterruptedException
//    {
//
////        By loginlocation = By.xpath("/html/body/div/form/center/a\"");
////        driver.findElement(loginlocation).click();
//
//        System.out.println("in testsetup ");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student01\\Downloads\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
//        String baseUrl = "http://10.9.10.39:81/sqlite/Main/login.html";
//        String expectedTitle = "Cloud9 Airlines";
//        driver.get(baseUrl);
//        String actualTitle = driver.getTitle();
//        System.out.println("Actual title is: " + actualTitle);
//        Assert.assertEquals(actualTitle, expectedTitle);
//        Thread.sleep(2000);
//
//    }
//
//    @BeforeClass
//    public static void browsersetup()
//    {
//
//
//    }
//
////    @Test
////    public void shouldRegisterNewCustomer()
////    {
////
////        driver.findElement(By.xpath("/html/body/div/form/center/a")).click();
////        driver.findElement(By.name("firstname")).sendKeys("Tivash");
////        driver.findElement(By.name("lastname")).sendKeys("Vithal");
////        driver.findElement(By.name("email")).sendKeys("tvithalllllllllll@yahoo.com");
////        driver.findElement(By.name("password")).sendKeys("Cloud9");
////        driver.findElement(By.xpath("/html/body/div/form/button")).click();
////
////        String bodytext = driver.findElement(bodytestlocation).getText();
////        Assert.assertTrue("Text not found", bodytext.contains(registrationsuccesful));
////
//
//    }
//
//
//    @Test
//    public void shouldLoginNewCustomer()
//    {
//
//        driver.findElement(By.name("email")).sendKeys("trvithal@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("Cloud9");
//        driver.findElement(By.xpath("/html/body/div/form/button")).click();
//        driver.findElement(By.xpath("/html/body/center[3]/a")).click();
//
//
//    }
//
//    @After
//    public void tearDown()
//    {
//       driver.close();
//    }
//
//
//}
//
//
