package sw.tutorialsninja.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sw.tutorialsninja.com.utilities.Utility;

public class ShoppingCartPage extends Utility {
    By quantity = By.xpath("//input[contains(@name, 'quantity')]");
    By update = By.xpath("//button[contains(@data-original-title, 'Update')]");

    public void changeQuantity(String text) {
        WebElement qty = getElement(quantity);
        qty.clear();
        sendTextToElement(quantity, text);
    }

    public void clickOnUpdate() {
        clickOnElement(update);
    }

}
