package nopcommerce;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        driver.get("https://demo.nopcommerce.com/");
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        WebElement welcomeText = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        Assert.assertTrue(welcomeText.isDisplayed());
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Implement your test steps for this scenario
    }

    @Test
    public void verifyTheErrorMessage() {
        // Implement your test steps for this scenario
    }
}
