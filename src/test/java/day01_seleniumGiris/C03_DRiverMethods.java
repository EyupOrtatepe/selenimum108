package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DRiverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.amazon.com");

        System.out.println("Titel : "+driver.getTitle());
        System.out.println("URL : "+driver.getCurrentUrl());

        String expectedUrl ="https://www.amazon.com/";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.close();


    }
}
