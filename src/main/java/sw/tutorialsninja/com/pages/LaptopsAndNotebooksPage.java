package sw.tutorialsninja.com.pages;

import org.openqa.selenium.By;
import sw.tutorialsninja.com.utilities.Utility;

public class LaptopsAndNotebooksPage extends Utility {
    By sortOption = By.id("input-sort");
    By macbook = By.linkText("MacBook");


    public void selectSorting(String text) {
        selectByVisibleTextFromDropDown(sortOption, text);
    }

    public void clickOnMacbook() {
        clickOnElement(macbook);
    }
}
