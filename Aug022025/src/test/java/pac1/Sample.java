package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        
        String baseUrl = "http://www.automationpractice.pl/index.php";
        String firstName = "Bindu";
        String lastName = "Bunny";
        String email = "user" + System.currentTimeMillis() + "@testmail.com";
        String password = "Test@123";
        String day = "10";   
        String month = "5";  
        String year = "2000";

        
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
           
            driver.get(baseUrl);
            Thread.sleep(2000);

           
            driver.findElement(By.className("login")).click();
            Thread.sleep(2000);

            
            driver.findElement(By.id("email_create")).sendKeys(email);
            Thread.sleep(1000);
            driver.findElement(By.id("SubmitCreate")).click();
            Thread.sleep(3000);

            
            WebElement heading = driver.findElement(By.xpath("//h1[text()='Create an account']"));
            if (heading.isDisplayed()) {
                System.out.println("PASS: 'Create an account' page is displayed");
            } else {
                System.out.println("FAIL: 'Create an account' page not displayed");
            }
            Thread.sleep(2000);

            
            driver.findElement(By.id("id_gender2")).click(); // Mrs.
            Thread.sleep(1000);
            driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
            Thread.sleep(1000);
            driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
            Thread.sleep(1000);

            
            String emailValue = driver.findElement(By.id("email")).getAttribute("value");
            if (emailValue.equals(email)) {
                System.out.println("PASS: Email is correct");
            }
            Thread.sleep(1000);

            
            driver.findElement(By.id("passwd")).sendKeys(password);
            Thread.sleep(1000);

            
            new Select(driver.findElement(By.id("days"))).selectByValue(day);
            Thread.sleep(1000);
            new Select(driver.findElement(By.id("months"))).selectByValue(month);
            Thread.sleep(1000);
            new Select(driver.findElement(By.id("years"))).selectByValue(year);
            Thread.sleep(2000);

           
            driver.findElement(By.id("newsletter")).click();
            Thread.sleep(1000);

            
            driver.findElement(By.id("submitAccount")).click();
            Thread.sleep(3000);

           
            if (driver.getPageSource().contains("Welcome to your account")) {
                System.out.println("PASS: Account created successfully");
            } else if (driver.getPageSource().contains("There are errors")) {
                System.out.println("FAIL: Account creation failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
