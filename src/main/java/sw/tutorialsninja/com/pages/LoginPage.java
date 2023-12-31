package sw.tutorialsninja.com.pages;

import org.openqa.selenium.By;
import sw.tutorialsninja.com.utilities.Utility;

public class LoginPage extends Utility {
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public void enterEmail(String text) {
        sendTextToElement(email, text);
    }

    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }
}
