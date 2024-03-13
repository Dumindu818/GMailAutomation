package org.example;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GMailAutomation {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Path of Chrome Driver");


        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("identifierId")).sendKeys("Your Gmail Address");
        driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Password");
        driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
    }}