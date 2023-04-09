package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_NopCommerce
{
    public static void main(String[] args)
    {
        String baseUrl = "https://demo.nopcommerce.com/login";

        //launch  the chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into browser
        driver.get(baseUrl);

        //Maximise the browser
        driver.manage().window().maximize();

        //We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        System.out.println("Title of Page \t\t : " + driver.getTitle());

        //Get the current URL
        System.out.println("Current URL \t\t : " + driver.getCurrentUrl());

        //Get page Source
        System.out.println("Page Source \t\t : " + driver.getPageSource());

        //Find the Email field element
        WebElement emailField =  driver.findElement(By.id("Email"));
        emailField.sendKeys("abc@gmail.com");

        //Find the password field element
        driver.findElement(By.id("Password")).sendKeys("ak123@");

        //Close the Browser
        driver.close();
    }

}
