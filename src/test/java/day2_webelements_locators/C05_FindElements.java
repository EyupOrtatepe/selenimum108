package day2_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_FindElements {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("java");
        searchBox.submit();

        List<WebElement> searchResults = driver.findElements(By.className("sg-col-inner"));
        System.out.println(searchResults.size());

        System.out.println(searchResults);
        int elementNo=1;
        for (WebElement searchResult : searchResults) {
            System.out.println(elementNo +"---"+ searchResult.getText());
            elementNo++;

        }


        driver.close();
    }
}
