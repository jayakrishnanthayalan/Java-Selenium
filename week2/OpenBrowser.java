package week2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        // ✅ Set path to chromedriver.exe in your project folder
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Start the browser
        WebDriver driver = new ChromeDriver();
 
        // Go to Google
        driver.get("https://www.ixigo.com");

        // Print the title
        System.out.println("Page Title: " + driver.getTitle());

      
    }
}

