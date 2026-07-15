package ca.qaguru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopTest {
    @Test
    public void HomePageTitleTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://maplemart.store");
        String expTitle = "MapleMart";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle,expTitle,"Incorrect Title");
        WebElement btnShopProducts = driver.findElement(By.linkText("Shop Products"));
        btnShopProducts.click();
        driver.quit();
    }
}
