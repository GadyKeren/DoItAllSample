package VisualInspections;

import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.RectangleSize;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Gady on 9/14/2016.
 */
public class VisualInspectionSample {

    WebDriver driver;
    Eyes eyes;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        eyes = new Eyes();
        // This is your api key, make sure you use it in all your tests.
        eyes.setApiKey("ZEdZCu103x105Vz4Qu45Gv3rej8tbWWkIQ6isdq8Xf2DPjA110");
        // Start visual testing with browser viewport set to 1024x768.
        // Make sure to use the returned driver from this point on.
        eyes.open(driver, "Applitools", "Test Web Page", new RectangleSize(1024, 768));
    }

    @After
    public void cleanUp(){
        // Abort test in case of an unexpected error.
        //eyes.abortIfNotClosed();
        driver.close();
        driver.quit();
    }

    @Test
    public void visualizationExample(){

        driver.get("http://gadysconsulting.wixsite.com/index");

        // Visual validation point #1
        eyes.checkWindow("Gadys Home Page");

        //driver.findElement(By.cssSelector(".features>a")).click();
        driver.findElement(By.id("comp-igqaaw38label")).click();

        // Visual validation point #2
        eyes.checkWindow("Features page");

        // End visual testing. Validate visual correctness.
        eyes.close();

    }



}

