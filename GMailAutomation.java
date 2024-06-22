package org.example;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GMailAutomation {

    public static void main(String[] args) {
        // Path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Gmail
            driver.get("https://mail.google.com");

            // Create a WebDriverWait object
            WebDriverWait wait = new WebDriverWait(driver, 30);

            // Enter the email address
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
            emailField.sendKeys("YourGmailAddress@gmail.com");

            // Click on the 'Next' button
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='identifierNext']/div/button/span")));
            nextButton.click();

            // Enter the password
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
            passwordField.sendKeys("YourPassword");

            // Click on the 'Next' button
            WebElement passwordNextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='passwordNext']/div/button/span")));
            passwordNextButton.click();

            // Add additional automation steps here if necessary

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after a delay to observe the result (optional)
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}
