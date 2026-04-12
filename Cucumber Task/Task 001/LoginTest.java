package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LoginTest {

    WebDriver driver;

    @Given("user launches browser")
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    @And("user opens login page")
    public void openLoginPage() {
        driver.get("https://example.com/login");
    }

    @When("user enters valid login details")
    public void enterCredentials() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin123");
    }

    @And("user clicks submit button")
    public void clickLogin() {
        driver.findElement(By.id("loginBtn")).click();
    }

    @Then("user should navigate to dashboard")
    public void verifyLogin() {
        System.out.println("Login Successful");
    }
}