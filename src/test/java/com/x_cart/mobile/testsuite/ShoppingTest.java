package com.x_cart.mobile.testsuite;

import com.google.common.base.Verify;
import com.x_cart.mobile.pages.ShoppingPage;
import com.x_cart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    ShoppingPage shoppingPage = new ShoppingPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersFabrikationsPlush() throws InterruptedException {
        shoppingPage.clickOnHotdeals();
        shoppingPage.clickOnBestsellers3();
        Assert.assertEquals("Bestsellers", shoppingPage.getVerifyBestsellersText3());
        shoppingPage.clickOnSortBy();
        shoppingPage.clickOnNameAtoZ();
        shoppingPage.clickOnAddtocart1();
        shoppingPage.clickOnOllieTheAppControlledRobot();
        Thread.sleep(2000);
        Assert.assertEquals("Product has been added to your cart", shoppingPage.getVerifyGreenBarText());
        shoppingPage.clickOnxsignClose();
        shoppingPage.clickOnYourCart();
        shoppingPage.clickOnViewCart1();
        shoppingPage.clickOnViewCart2();
        Assert.assertEquals("Your shopping cart - 1 item", shoppingPage.getVerifyShoppingcart1());
        Assert.assertEquals("$14.99", shoppingPage.getVerifySubTotal());
        Assert.assertEquals("$20.75", shoppingPage.getVerifytotal());
        shoppingPage.clickOnGotoCheckOutButton();
        Assert.assertEquals("Log in to your account", shoppingPage.getVerifyLogintoyouraccount());
        shoppingPage.enterEmailAddress("kag37@gmail.com");
        shoppingPage.clickOnContinuebutton();
        Assert.assertEquals("Secure Checkout", shoppingPage.getVerifySecureCheckoutText());

        shoppingPage.enterFirstName("Krishna");
        shoppingPage.enterLastName("Patel");
        shoppingPage.enterStreet("150 Ealing Road");
        shoppingPage.enterCity("London");
        shoppingPage.enterCountryCode("United Kingdom");
        shoppingPage.enterState("Watford");
        shoppingPage.enterZipcode("KR12 2PA");
        shoppingPage.enterPhoneNumber("07788665544");
        shoppingPage.enterEmail("kag35@gmail.com");
        Assert.assertEquals("Create an account for later use", shoppingPage.getVerifyCheckBox());
        shoppingPage.enterPassword("abc123");
        shoppingPage.clickOnLocalShipping();
        shoppingPage.clickOnPaymentMethodCOD();
        Assert.assertEquals("$21.77", shoppingPage.getVerifyTotal1());
        shoppingPage.clickOnPlaceOrder();
        Assert.assertEquals("Thank you for your order", shoppingPage.getVerifyThankyouText());
    }
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully()throws InterruptedException{
        shoppingPage.clickOnHotdeals1();
        shoppingPage.clickOnBestsellers4();
        Assert.assertEquals("Bestsellers", shoppingPage.getVerifyBestsellersText4());
        shoppingPage.clickOnSortBy();
        shoppingPage.clickOnNameAtoZ();
        Thread.sleep(2000);
        shoppingPage.clickOnAddtocart1();
        Assert.assertEquals("Product has been added to your cart",shoppingPage.getVerifyGreenBar());
        shoppingPage.clickOnXsignclose();;
        shoppingPage.clickOnYourCart1();
        shoppingPage.clickOnViewCart();
        Assert.assertEquals("Your shopping cart - 1 item",shoppingPage.getVerifyYourShopping());
        shoppingPage.clickOnEmptyyourcart();
        shoppingPage.VerifyAlert();
        Assert.assertEquals("Item(s) deleted from your cart",shoppingPage.getVerifyMsg());
        Assert.assertEquals("Your cart is empty",shoppingPage.getVerifyYourCartIsEmpty());
    }
}