package sw.tutorialsninja.com.pages;

import org.openqa.selenium.By;
import sw.tutorialsninja.com.utilities.Utility;

public class AccountPage extends Utility {
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnContinue(){
        clickOnElement(continueButton);
    }

}
