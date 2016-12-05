package testSample1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.Matchers.is;

/**
 * Created by Gady on 9/20/2016.
 */
public class MyFirstTest {

        @Test
        public void startWebDriver() {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://www.google.com");

            Assert.assertThat("Titles do not match", driver.getTitle(), is("Google"));

            driver.close();
            driver.quit();
        }
}
