package stepsdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    public LoginSteps(StepsBase stepsBase) {
        this.driver = stepsBase.driver;
    }

    @Given("navigate to login page")
    public void navigateToLoginPage() {
        //System.out.println("Login Page");
        driver.navigate().to("http://localhost:4200/Login");
    }

    @When("enter {string} and {string}")
    public void enterUsernameAndPassword(String username, String password) {
        driver.findElement(By.id("mat-input-0")).sendKeys(username);
        driver.findElement(By.id("mat-input-1")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/form/button")).click();

    }


    @Then("user is redirected to dashboard page")
    public void userIsRedirectedToDashboardPage() {
        String dashboardURL = "http://localhost:4200/Dashboard";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/mat-card/mat-card-content[1]/form/button"));
        Assert.assertEquals(dashboardURL,driver.getCurrentUrl());

    }


}