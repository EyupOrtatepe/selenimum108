package day05_assertions_dropdownMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseClass;

public class C07_JsAlerts extends TestBaseClass {

    @Test
    public void test01(){
        // Gerekli ayarlamalari yapip
        // https://the-internet.herokuapp.com/javascript_alerts  adresine gidin
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // 1.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        wait(2);
        // Alert'deki yazinin "I am a JS Alert" oldugunu test edelim
        String expectedAlertYazisi="I am a JS Alert";
        String actualAlertYazisi= driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
        // OK tusuna basip alert'i kapatalim
        driver.switchTo().alert().accept();
        wait(2);
    }
    @Test
    public void test02(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // 2.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        // cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        wait(2);
        driver.switchTo().alert().dismiss();
        wait(2);
        String expectedSonucYazisi="You clicked: Cancel";
        String actualSonucYazisi= driver
                .findElement(By.xpath("//*[@id='result']"))
                .getText();
        Assert.assertEquals(expectedSonucYazisi,actualSonucYazisi);
    }
    @Test
    public void test03(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // 3.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        // Cikan prompt ekranina "Abdullah" yazdiralim ve OK tusuna basarak alert'i kapatalim
        driver
                .switchTo()
                .alert()
                .sendKeys("Abdullah");
        wait(2);
        driver
                .switchTo()
                .alert()
                .accept();
        // Cikan sonuc yazisinin Abdullah icerdigini test edelim
        wait(2);
        String actualSonucYazisi= driver
                .findElement(By.xpath("//*[@id='result']"))
                .getText();
        String expectedIcerik="Abdullah";
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }



}
