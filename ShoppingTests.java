package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class ShoppingTests extends BaseTest {

    public LoginPage loginPage;
    public HomePage homePage;
    String standardUserName = "standard_user";
    String password = "secret_sauce";
    String homePageTitle = "Products";
    int numberOfAllItems = 6;
    String expectedAboutLink = "https://saucelabs.com/";

    @Test
    public void verifySuccessfulAddToCart(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUserName, password);
        homePage.verifySuccessfulLogin(homePageTitle);
        homePage.verifyProduct1AddedToCart();
        homePage.verifyProduct2AddedToCart();

         try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void verifyNumberOfProductsHomePage(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUserName, password);
        homePage.verifySuccessfulLogin(homePageTitle);
        homePage.verifyNumberOfProducts(numberOfAllItems);

         try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void verifyAboutLink(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUserName, password);
        homePage.verifySuccessfulLogin(homePageTitle);
        homePage.clickOnMenuButton();
        homePage.verifyAboutLink(expectedAboutLink);

         try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void verifyThankYouForYourOrderButton(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUserName, password);
        homePage.verifySuccessfulLogin(homePageTitle);
        homePage.clickOnMenuButton();
        homePage.verifyThankYouForYourOrderButton(expectedAboutLink);

         try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
