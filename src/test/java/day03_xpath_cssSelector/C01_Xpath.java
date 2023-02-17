package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {

        /*1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

         */


        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if(deleteButton.isDisplayed()){
            System.out.println("Delete test PASSED");
        }else {
            System.out.println("delete test FAILED");
        }

        deleteButton.click();

        WebElement addRemoveelement = driver.findElement(By.xpath("//h3"));
        if(addRemoveelement.isDisplayed()){
            System.out.println("Add text test PASSED");
        }else {
            System.out.println("Add text test FAILED");
        }


        driver.close();
    }
}
