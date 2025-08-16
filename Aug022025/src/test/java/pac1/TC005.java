package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.automationpractice.pl/index.php");
        Thread.sleep(2000); 

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        Thread.sleep(2000); 

        if (driver.findElement(By.id("email_create")).isDisplayed()) {
            System.out.println("email create is displayed");

            driver.findElement(By.id("email_create")).clear();
            Thread.sleep(1000);

            driver.findElement(By.id("email_create")).sendKeys("siri@gmail.com");
            Thread.sleep(1000);

            driver.findElement(By.id("email_create")).sendKeys(Keys.TAB);
            Thread.sleep(1000);

            driver.findElement(By.id("email_create")).sendKeys(Keys.ENTER);
            Thread.sleep(2000);
        } else
        {
            System.out.println("email create is not displayed");
        }
        Thread.sleep(1000);
        driver.findElement(By.id("id_gender2")).click();
        if(driver.findElement(By.id("id_gender2")).isSelected())
        {
        	System.out.println("gender2 is selected");
        	
        }
        else
        {
        	System.out.println("gender2 is not selected");
        }

        driver.quit();
    }
}
