package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();

        System.out.println("maximize size"+driver.manage().window().getSize());
        System.out.println("maximize position"+driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println("full position"+driver.manage().window().getSize());
        System.out.println("full position"+driver.manage().window().getPosition());

        driver.close();

    }
}
