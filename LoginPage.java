package org.Testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//create class name as Login Page
public class LoginPage
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver(); //Contructor call for chromeDriver
        driver.get("https://www.saucedemo.com/v1/"); // Navigate to the SauceDemo Site
        driver.findElement(By.id("user-name")).sendKeys("standard_user"); // Pass the value of UserName 
        driver.findElement(By.id("password")).sendKeys("secret_sauce"); //Pass the value of password
        driver.findElement(By.id("login-button")).click(); // button is clicked
    }
}
