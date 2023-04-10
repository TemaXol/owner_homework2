package homeworkpackage;

import homeworkpackage.config.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverTests {

private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testGit() {
        String title = driver.getTitle();
        Assertions.assertNotEquals("GitHub: Where the world builds software * GitHub", title);
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

}
