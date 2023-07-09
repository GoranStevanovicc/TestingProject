package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

     public HomePage(WebDriver driver){
        super(driver);
    }

    By homePageTitleBy = By.className("title");
    By addToCartButton1By = By.id("add-to-cart-sauce-labs-backpack");
    By addToCartButton2By = By.id("add-to-cart-sauce-labs-bike-light");
    By addToCartButton3By = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By addToCartButton4By = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By addToCartButton5By = By.id("add-to-cart-sauce-labs-onesie");
    By addToCartButton6By = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By shoppingCartBadgeBy = By.className("shopping_cart_badge");
    By numberOfItems = By.className("inventory_item");
    By menuButtonBy = By.id("react-burger-menu-btn");
    By aboutButtonBy = By.id("about_sidebar_link");
    By thankYouForYourOrderButtonBy = By.xpath("//*[@id=\'checkout_complete_container\']/h2");
    
 
    public HomePage verifySuccessfulLogin(String expectedText){
        String actualText = readText(homePageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public HomePage verifyProduct1AddedToCart (){
        click(addToCartButton1By);
        waitVisability(shoppingCartBadgeBy);
        return this;
    }

     public HomePage verifyProduct2AddedToCart (){
        click(addToCartButton2By);
        waitVisability(shoppingCartBadgeBy);
        return this;
    }

    public HomePage verifyNumberOfProducts (int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(numberOfItems);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }

    public HomePage clickOnMenuButton(){
        click(menuButtonBy);
        return this;
    }

    public HomePage verifyAboutLink(String expectedLink){
        String actualLink = readLink(aboutButtonBy);
        assertTextEquals(expectedLink, actualLink);
        return this;
    }

    public HomePage verifyThankYouForYourOrderButton(String expectedText){
        String actualText = readText(thankYouForYourOrderButtonBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    
               
    
}

