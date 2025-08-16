package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://www.opencart.com/");
        String title = driver.getTitle();
        if (title.equals("OpenCart - Open Source Shopping Cart Solution")) {
            System.out.println("Title is matched");
        } else {
            System.out.println("Title is not matched");
        }

        
        driver.navigate().to("https://www.yahoo.com/");
        Thread.sleep(2000); 
        System.out.println("URL is: " + driver.getCurrentUrl());

        
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("URL is: " + driver.getCurrentUrl());

        
        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println("URL is: " + driver.getCurrentUrl());

        
        driver.navigate().refresh();
        Thread.sleep(2000);
        System.out.println("Page source length: " + driver.getPageSource().length());

        driver.quit();
    }
}
