package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverNavigateMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.drive","Drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.amazon.com");

        driver.navigate().to("https:www.wisequarter.com");

        driver.navigate().back();
        driver.navigate().to("https:www.youtube.com");
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.close();
        driver.quit();

    }
}
