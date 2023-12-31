package sw.tutorialsninja.com.pages;

import org.openqa.selenium.By;
import sw.tutorialsninja.com.utilities.Utility;

public class DesktopsPage extends Utility {
    By sortProducts = By.id("input-sort");
    By hp = By.xpath("//a[contains(text(),'HP LP3065')]");

    public void selectSorting(String text){
        selectByVisibleTextFromDropDown(sortProducts, text);
    }
    public void clickOnHP(){
        clickOnElement(hp);
    }
}
