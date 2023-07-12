package sw.tutorialsninja.com.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sw.tutorialsninja.com.pages.*;
import sw.tutorialsninja.com.testbase.BaseTest;

public class MyAccountsTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ProductPage productPage = new ProductPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    RegisterPage registerPage = new RegisterPage();
    AccountPage accountPage = new AccountPage();
    LogOutPage logOutPage = new LogOutPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Register");
        verifyTwoStrings("Register Account", By.xpath("//h1[contains(text(),'Register Account')]"));
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Login");
        verifyTwoStrings("Returning Customer", By.xpath("//h2[contains(text(),'Returning Customer')]"));
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Register");
        registerPage.enterFirstName("Ankur");
        registerPage.enterLastName("Modi");
        registerPage.enterEmail("Rathod");
        registerPage.enterTelephone("08128008020");
        registerPage.enterPassword("Prime$123");
        registerPage.enterConfirmPassword("Prime$123");
        registerPage.clickOnSubscribe();
        registerPage.clickOnPolicy();
        registerPage.clickOnContinueButton();
        verifyTwoStrings("Your Account Has Been Created!", By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"));
        accountPage.clickOnContinue();
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Logout");
        verifyTwoStrings("Account Logout", By.xpath("//h1[contains(text(),'Account Logout')]"));
        logOutPage.clickOnLogout();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Login");
        loginPage.enterEmail("prime1344@gmail.com");
        loginPage.enterPassword("test888");
        loginPage.clickOnLogin();
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Logout");
        verifyTwoStrings("Account Logout", By.xpath("//h1[contains(text(),'Account Logout')]"));
        logOutPage.clickOnLogout();
    }

}
