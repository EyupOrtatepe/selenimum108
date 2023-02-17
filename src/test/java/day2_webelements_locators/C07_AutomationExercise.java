package day2_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_AutomationExercise {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        /*
           1- https://www.amazon.com/ sayfasına gidin.
        2- Arama kutusuna “city bike” yazip aratin
         3- Görüntülenen sonuçların sayısını yazdırın
         4- Listeden ilk urunun resmine tıklayın.
         */


        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike"+ Keys.ENTER);
        WebElement result = driver.findElement(By.className("rush-component"));
        System.out.println(result.getText());
        driver.findElement(By.className("s-image")).click();


        driver.close();
    }
}
