package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver ;

    @Before
    public static void openBrowser(){

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\soma\\IdeaProjects\\Udacity\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
    }

    @After
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
