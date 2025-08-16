package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class TC006 {
    
    // ✅ Custom pause method (slows down every step)
    public static void pause() {
        try {
            Thread.sleep(4000); // 4 seconds pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String baseUrl = "https://tutorialsninja.com/demo/"; 
        String email = "abbu@gmail.com"; 
        String password = "abbusai@1";   

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get(baseUrl);
        System.out.println("✅ Step 1: Opened website: " + baseUrl);
        pause();

        // Login
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        pause();

        if (driver.getPageSource().contains("Warning: No match for E-Mail Address and/or Password.")) {
            System.out.println(" Invalid credentials. Please register first.");
            driver.quit();
            return;
        } else {
            System.out.println("Step 2: Logged in successfully");
        }

        // Go to Components → Monitors
        driver.findElement(By.linkText("Components")).click();
        driver.findElement(By.linkText("Monitors (2)")).click();
        System.out.println("Step 3: Navigated to Monitors page");
        pause();

        // Select 25 from dropdown
        new Select(driver.findElement(By.id("input-limit"))).selectByVisibleText("25");
        System.out.println("Step 4: Selected '25' from Show dropdown");
        pause();

        // Add first product to cart
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]")).click();
        System.out.println("Step 5: Added first Monitor to cart");
        pause();

        // Open Apple Cinema product page
        driver.findElement(By.linkText("Apple Cinema 30\"")).click();
        System.out.println("Step 6: Opened Apple Cinema 30\" product page");
        pause();

        // Specification tab
        driver.findElement(By.xpath("//a[text()='Specification']")).click();
        System.out.println("Step 7: Clicked Specification tab");
        pause();

        // Add to wishlist
        driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
        System.out.println("Step 8: Added Apple Cinema 30\" to Wishlist");
        pause();

        // Search for Mobile
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.clear();
        searchBox.sendKeys("Mobile");
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
        System.out.println("Step 9: Entered 'Mobile' in search and clicked Search");
        pause();

        // Search in descriptions
        driver.findElement(By.id("description")).click();
        driver.findElement(By.id("button-search")).click();
        System.out.println("Step 10: Enabled 'Search in product descriptions'");
        pause();

        // HTC Touch HD
        driver.findElement(By.linkText("HTC Touch HD")).click();
        System.out.println("Step 11: Opened HTC Touch HD product page");
        pause();

        WebElement qty = driver.findElement(By.id("input-quantity"));
        qty.clear();
        qty.sendKeys("3");
        driver.findElement(By.id("button-cart")).click();
        System.out.println("Step 12: Updated quantity to 3 and added HTC Touch HD to cart");
        pause();

        // View Cart
        driver.findElement(By.id("cart")).click();
        pause();
        driver.findElement(By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart']")).click();
        System.out.println("Step 13: Clicked View Cart");
        pause();

        if (driver.getPageSource().contains("HTC Touch HD")) {
            System.out.println("Step 14: Verified HTC Touch HD is present in cart");
        }

        // Checkout
        driver.findElement(By.linkText("Checkout")).click();
        System.out.println("Step 15: Clicked Checkout button");
        pause();

        // Logout
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Logout")).click();
        pause();

        if (driver.getPageSource().contains("Account Logout")) {
            System.out.println("Step 16: Successfully logged out");
        }

        driver.findElement(By.linkText("Continue")).click();
        driver.quit();
        System.out.println("Step 17: Browser closed. Test finished.");
    }
}
