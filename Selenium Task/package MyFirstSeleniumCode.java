package MyFirstSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class FacebookSafariTest {

    public static void main(String[] args) {

        // Launch Safari Browser (Mac built-in driver)
        WebDriver driver = new SafariDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Open Facebook
        driver.get("https://www.facebook.com");

        // Verify Page Title
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Facebook")) {
            System.out.println("Title Verification Passed");
        } else {
            System.out.println("Title Verification Failed");
        }

        // Verify Current URL
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("facebook.com")) {
            System.out.println("URL Verification Passed");
        } else {
            System.out.println("URL Verification Failed");
        }

        // Locate Email Field (By ID)
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test@gmail.com");

        // Locate Password Field (By Name)
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("123456");

        // Click Login Button (By CSS Selector)
        driver.findElement(By.cssSelector("button[name='login']")).click();

        // Close Browser
        driver.quit();
    }
}