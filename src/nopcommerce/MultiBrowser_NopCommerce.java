package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_NopCommerce
{
    static String browser = "Firefox";
    static WebDriver driver;
    static String baseUrl = "https://demo.nopcommerce.com/login";

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();

        }
        else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Browser name");
        }

        //Open the URL into Browser
        driver.get(baseUrl);

        //Maximise the Browser
        driver.manage().window().maximize();

        //We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the title of page
        System.out.println("Title of page \t\t : " + driver.getTitle());

        //Get the current URL
        System.out.println("Current URL \t\t : " + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page Source \t\t : " +driver.getPageSource());

        //Find the email field element
        driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");

        //Find the password element
        driver.findElement(By.id("Password")).sendKeys("A123@");

         //close browser
        driver.close();
    }
}
