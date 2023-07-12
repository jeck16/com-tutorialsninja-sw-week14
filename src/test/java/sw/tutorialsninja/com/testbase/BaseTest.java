package sw.tutorialsninja.com.testbase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sw.tutorialsninja.com.propertyreader.PropertyReader;
import sw.tutorialsninja.com.utilities.Utility;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

    public void verifyTwoStrings(String expected, By by){
        String expectedText = expected;
        String actualText = getTextFromElement(by);
        Assert.assertEquals(actualText,expectedText);
    }
}
