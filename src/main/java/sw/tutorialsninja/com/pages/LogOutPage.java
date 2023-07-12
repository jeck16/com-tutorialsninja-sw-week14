package sw.tutorialsninja.com.pages;

import org.openqa.selenium.By;
import sw.tutorialsninja.com.utilities.Utility;

public class LogOutPage extends Utility {

    By logout = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnLogout() {
        clickOnElement(logout);
    }

}
