package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBankRegistration {
    public static void main(String[] args) throws InterruptedException {

        // Variables
        String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";
        String expectedTitle = "ParaBank | Welcome | Online Banking";
        String firstName = "John";
        String lastName = "Smith";
        String address = "123 Baker Street";
        String city = "London";
        String state = "England";
        String zipCode = "12345";
        String phone = "9876543210";
        String ssn = "123-45-6789";
        String username = "john" + System.currentTimeMillis();
        String password = "pass1234";

        // Setup
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        // Part 1: Launch Application
        driver.get(baseUrl);
        Thread.sleep(2000);

        // Verify Title
        if (driver.getTitle().equals(expectedTitle)) {
            System.out.println("Title verified.");
        } else {
            System.out.println("Title mismatch! Found: " + driver.getTitle());
        }
        Thread.sleep(2000);

        // Click Register
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);

        // Part 2: Fill Form
        driver.findElement(By.id("customer.firstName")).sendKeys(firstName);
        Thread.sleep(1000);
        driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.street")).sendKeys(address);
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys(city);
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.state")).sendKeys(state);
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(phone);
        Thread.sleep(1000);
        driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.id("customer.password")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.id("repeatedPassword")).sendKeys(password);
        Thread.sleep(2000);

        // Submit form
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        Thread.sleep(2000);

        // Part 3: Verify Success
        WebElement successMsg = driver.findElement(By.xpath("//h1[text()='Welcome " + username + "']"));
        if (successMsg.isDisplayed()) {
            System.out.println("Registration successful for user: " + username);
        } else {
            System.out.println("Registration failed.");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
