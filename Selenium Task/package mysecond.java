package mysecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class PracticeLocatorDifferent {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open Website
        driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");

        // Verify Title
        String title = driver.getTitle();
        if (title.contains("Rahul Shetty Academy")) {
            System.out.println("Correct Page Loaded");
        } else {
            System.out.println("Incorrect Page");
        }

        // We can Click Forgot Password 
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Forgot your password?']"))).click();

        // For Yuour Name
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Name']"))).sendKeys("Abhinav");

        // we can add email here 
        driver.findElement(By.xpath("//input[@placeholder='Email']"))
                .sendKeys("abhinav@gmail.com");

        // we can add phone number 
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']"))
                .sendKeys("9876543210");

        // Click Reset Login
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(),'Reset Login')]"))).click();

        // Click Go To Login
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(),'Go to Login')]"))).click();

        // Enter Username
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("inputUsername"))).sendKeys("Abhinav");

        // Enter Password
        driver.findElement(By.name("inputPassword"))
                .sendKeys("rahulshettyacademy");

        System.out.println("All Steps Executed Successfully");

        driver.quit();
    }
}