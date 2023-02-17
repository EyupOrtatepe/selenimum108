package day2_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_AutomationExercise {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));





        /*
        1- Bir test class’i olusturun ilgili ayarlari yapin
2- https://www.automationexercise.com/ adresine gidin
3- Sayfada 147 adet link bulundugunu test edin.
4- Products linkine tiklayin
5- special offer yazisinin gorundugunu test edin
6- Sayfayi kapatin
         */

        driver.get("https://www.automationexercise.com/");

        List<WebElement> linkElementList = driver.findElements(By.tagName("a"));

        int expectedLinkSayisi = 147;
        int actualLinkSayisi = linkElementList.size();

        if(expectedLinkSayisi==actualLinkSayisi){
            System.out.println("Test Passed");
        }else {
            System.out.println("test FAILED");
        }

      // driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();

       driver.findElement(By.partialLinkText("Products")).click();

        WebElement specialOfferElement = driver.findElement(By.id("sale_image"));
        if(specialOfferElement.isDisplayed()){
            System.out.println("Speciaal offer test PASSED");
        }else {
            System.out.println("Speciaal offer test FAILED");
        }

        Thread.sleep(3000);
        driver.close();


    }
}
