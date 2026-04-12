package basicpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class SimpleLoginCheck {

    public static void main(String[] args) {

        // We can launch safari browser
        WebDriver driver = new SafariDriver();

        // here we can a Open website
        driver.get("https://www.automationexercise.com/login");

        // here we can open our 
page title
        System.out.println("Page Title: " + driver.getTitle());

        // Locate email field and enter value
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("test123@gmail.com");

        // Locate password field and enter value
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Test@123");

        // Locate login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        // Check if login button is displayed and enabled
        if (loginButton.isDisplayed() && loginButton.isEnabled()) {
            System.out.println("Login button is ready to click");
        } else {
            System.out.println("Login button not ready");
        }

        // Close browser
        driver.quit();
    }
}