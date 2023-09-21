package suits;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.net.MalformedURLException;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.*;
import static sun.net.NetProperties.get;


public abstract class AbstractTest {


    @BeforeSuite
    public void setUpBrowser() {
        String driverPath = Paths.get("").toAbsolutePath() + "/chromedriver.exe";
        System.out.println("driverPath = " + driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);
        Configuration.browser = "chrome";
        Configuration.browserSize = "1600x1020";
        Configuration.timeout = 10000;
    }

    public void open() {
        Selenide.open("https://trix-dashboard3.pages.dev/login");
    }
}