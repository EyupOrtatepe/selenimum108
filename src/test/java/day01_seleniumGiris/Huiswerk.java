package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Huiswerk {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Using ChromeDriver, go to facebook page and verify that the title of
        //the page is "facebook", otherwise print the correct title.

        driver.get("https:www.facebook.com");
        String expectedtitle = "facebook";
        String actualTitle = driver.getTitle();
        Thread.sleep(3000);

        if(actualTitle.equals(expectedtitle)){
            System.out.println("Test1 PASSED");
        } else {
            System.out.println("Test1 FAILED. The correct titel is : "+actualTitle);
        }
        //Verify that the page URL contains the word "facebook", otherwise
        //print the "actual" URL.

        if(actualTitle.contains(expectedtitle)){
            System.out.println("Test2 PASSED");
        } else{
            System.out.println("Test2 FAILED. Actual URL is : "+driver.getCurrentUrl());
        }
        //https://www.walmart.com/
        //Go to page.

        driver.navigate().to("https://www.walmart.com/");
        Thread.sleep(3000);

        //Verify that the page title includes “Walmart.com”.

        String expectedTitleWalmart = "Walmart.com";
        String actualTitleWalmart = driver.getTitle();
        if(actualTitleWalmart.contains(expectedTitleWalmart)){
            System.out.println("Test3 PASSED");
        } else {
            System.out.println("Test3 FAILED");
        }
        //Go back to the "facebook" page
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();

        driver.close();
    }
}
