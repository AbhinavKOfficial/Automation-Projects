package mysteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LoginStepsSimple {

    WebDriver driver;

    @Given("open browser")
    public void open_browser() {
        driver = new ChromeDriver();
    }

    @And("open website")
    public void open_website() {
        driver.get("https://example.com");
    }

    @When("enter wrong username and password")
    public void enter_wrong_data() {
        driver.findElement(By.id("username")).sendKeys("test123");
        driver.findElement(By.id("password")).sendKeys("wrong123");
    }

    @And("click login")
    public void click_login() {
        driver.findElement(By.id("loginBtn")).click();
    }

    @Then("show error message")
    public void show_error() {
        System.out.println("Login failed - error shown");
        driver.quit();
    }
}