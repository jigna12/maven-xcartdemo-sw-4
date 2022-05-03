package com.x_cart.mobile.pages;

import com.google.common.base.Verify;
import com.x_cart.mobile.utility.Utility;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Mouse;
import sun.security.util.Password;

public class ShoppingPage extends Utility {

    /*1.1 Mouse hover on the “Hot deals” link
		1.2 Mouse hover on the “Bestsellers”  link and click
		1.3 Verify the text “Bestsellers”
		1.4 Mouse hover on “Sort By” and select “Name A-Z”
		1.5 Click on “Add to cart” button of the product “Ollie - The App Controlled Robot”
1.6 Verify the message “Product has been added to your cart” display in  green bar
1.7 Click on X sign to close the message
1.8 Click on “Your cart” icon and Click on “View cart” button
1.9 Verify the text “Your shopping cart - 1 item”
1.10 Verify the Subtotal $99.00
1.11 Verify the total $106.23
1.12 Click on “Go to checkout” button
1.13 Verify the text “Log in to your account”
1.14 Enter Email address
1.15 Click on “Continue” Button
1.16 Verify the text “Secure Checkout”*/

    By Hotdeals = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By Bestsellers3 = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]");
    By VerifyBestsellersText3 = By.xpath("//h1[@id='page-title']");
    By SortBy6 = By.xpath("//span[contains(text(),'Sort by:')]");
    By priceLowtoHigh = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    By Addtocart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]");
    By OllieTheAppControlledRobot = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[4]/div[1]/div[1]/a[1]");
    By VerifyGreenBarText = By.xpath("//li[@class='info']");
    By xsignClose = By.xpath("//a[@title='Close']");
    By YourCart = By.xpath("//div[@title='Your cart']");
    By ViewCart1 = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By ViewCart2 = By.xpath("//span[contains(text(),'View cart')]");
    By VerifyShoppingcart1 = By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]");
    By VerifySubTotal = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]");
    By Verifytotal = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]");
    By GotoCheckOutButton = By.xpath("//button[contains(@class,'regular-button regular-main-button checkout')]");
    By VerifyLogintoyouraccount = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By EmailAddress = By.xpath("//input[@id='email']");
    By Continuebutton = By.xpath("//span[contains(text(),'Continue')]");
    By VerifySecureCheckoutText = By.xpath("//h1[normalize-space()='Secure Checkout']");

    public void clickOnHotdeals() {
        mouseHoverToElement(Hotdeals);
    }

    public void clickOnBestsellers3() {
        mouseHoverToElementAndClick(Bestsellers3);
    }

    public String getVerifyBestsellersText3() {
        return getTextFromElement(VerifyBestsellersText3);
    }

    public void clickOnSortBy6() {
        mouseHoverToElement(SortBy6);
    }

    public void clickOnpriceLowtoHigh() {
        mouseHoverToElementAndClick(priceLowtoHigh);
    }

    public void clickOnAddtocart() {
        mouseHoverToElement(Addtocart);
    }

    public void clickOnOllieTheAppControlledRobot() {
        mouseHoverToElementAndClick(OllieTheAppControlledRobot);
    }

    public String getVerifyGreenBarText() {
        return getTextFromElement(VerifyGreenBarText);
    }

    public void clickOnxsignClose() {
        clickOnElement(xsignClose);
    }

    public void clickOnYourCart() {
        clickOnElement(YourCart);
    }

    public void clickOnViewCart1() {
        mouseHoverToElement(ViewCart1);
    }

    public void clickOnViewCart2() {
        mouseHoverToElementAndClick(ViewCart2);
    }

    public String getVerifyShoppingcart1() {
        return getTextFromElement(VerifyShoppingcart1);
    }

    public String getVerifySubTotal() {
        return getTextFromElement(VerifySubTotal);
    }

    public String getVerifytotal() {
        return getTextFromElement(Verifytotal);
    }

    public void clickOnGotoCheckOutButton() {
        clickOnElement(GotoCheckOutButton);
    }

    public String getVerifyLogintoyouraccount() {
        return getTextFromElement(VerifyLogintoyouraccount);
    }

    public void enterEmailAddress(String email) {
        sendTextToElement(EmailAddress, email);
    }

    public void clickOnContinuebutton() {
        mouseHoverToElementAndClick(Continuebutton);
    }

    public String getVerifySecureCheckoutText() {
        return getTextFromElement(VerifySecureCheckoutText);
    }

     /* 1.17 Fill all the mandatory fields
        1.18 Check the check box “Create an account for later use”
        1.19 Enter the password
        1.20 Select the Delivery Method to “Local Shipping”
        1.21 Select Payment Method “COD”
        1.22 Verify the total $99.00
        1.23 Click on “Place Order” Button
        1.24 Verify the text “Thank you for your order”*/

    By FirstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By LastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By Street = By.xpath("//input[@id='shippingaddress-street']");
    By City = By.xpath("//input[@id='shippingaddress-city']");
    By CountryCode = By.xpath("//select[@id='shippingaddress-country-code']");
    By State = By.xpath("//input[@id='shippingaddress-custom-state']");
    By Zipcode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By PhoneNumber = By.xpath("//input[@id='shippingaddress-phone']");
    By Email = By.xpath("//input[@id='email']");
    By VerifyCheckBox = By.xpath("//input[@id='create_profile']");
    By Password = By.xpath("//input[@id='password']");
    By LocalShipping = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/ul[1]/li[2]/div[1]/label[1]");
    By PaymentMethodCOD = By.xpath("//input[@id='pmethod6']");
    By VerifyTotal1 = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]");
    By PlaceOrder = By.xpath("//span[contains(text(),'Place order: $21.77')]");
    By VerifyThankyouText = By.xpath("//h1[@id='page-title']");

    public void enterFirstName(String firstName) {
        sendTextToElement(FirstName, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(LastName, lastName);
    }

    public void enterStreet(String street) {
        sendTextToElement(Street, street);
    }

    public void enterCity(String city) {
        sendTextToElement(City, city);
    }

    public void enterCountryCode(String countryCode) {
        sendTextToElement(CountryCode, countryCode);
    }

    public void enterState(String state) {
        sendTextToElement(State, state);
    }

    public void enterZipcode(String zipcode) {
        sendTextToElement(Zipcode, zipcode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(PhoneNumber, phoneNumber);
    }

    public void enterEmail(String email) {
        sendTextToElement(Email, email);
    }

    public String getVerifyCheckBox() {
        return getTextFromElement(VerifyCheckBox);
    }

    public void enterPassword(String password) {
        sendTextToElement(Password, password);
    }

    public void clickOnLocalShipping() {
        clickOnElement(LocalShipping);
    }

    public void clickOnPaymentMethodCOD() {
        clickOnElement(PaymentMethodCOD);
    }

    public String getVerifyTotal1() {
        return getTextFromElement(VerifyTotal1);
    }

    public void clickOnPlaceOrder() {
        clickOnElement(PlaceOrder);
    }

    public String getVerifyThankyouText() {
        return getTextFromElement(VerifyThankyouText);
    }


 /*2 - verifyThatUserShouldClearShoppingCartSuccessfully()
		    1.1 Mouse hover on the “Hot deals” link
		    1.2 Mouse hover on the “Bestseller”  link and click
		    1.3 Verify the text “Bestsellers”
            1.4 Mouse hover on “Sort By” and select “Name A-Z”
            1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
            1.6 Verify the message “Product has been added to your cart” display in  green bar
            1.7 Click on X sign to close the message
            1.8 Click on “Your cart” icon and Click on “View cart” button
             1.9 Verify the text “Your shopping cart - 1 item”
            1.10 Click on “Empty your cart” link
            1.11 Verify the text “Are you sure you want to clear your cart?” on alert
            1.12 Click “Ok” on alert
            1.13 Verify the message “Item(s) deleted from your cart”
            1.15 Verify the text “Your cart is empty”*/

    By Hotdeals1 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By Bestsellers4 = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]");
    By VerifyBestsellersText4 = By.xpath("//h1[@id='page-title']");
    By SortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By NameAtoZ = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    By Addtocart1 = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[1]/a[1]/img[1]");
    By VinylIdolzGhostbusters = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]");
    By VerifyGreenbar = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By Xsignclose = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]");
    By YourCart1 = By.xpath("//div[@title='Your cart']");
    By ViewCart = (By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']"));
    By VerifyYourShopping = By.xpath("//h1[@id='page-title']");
    By Emptyyourcart = By.xpath("//a[contains(text(),'Empty your cart')]");
    By VerifyMsg = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By VerifyYourCartIsEmpty = By.linkText("Your cart is empty");

    public void clickOnHotdeals1() {
        mouseHoverToElement(Hotdeals1);
    }

    public void clickOnBestsellers4() {
        mouseHoverToElementAndClick(Bestsellers4);
    }

    public String getVerifyBestsellersText4() {
        return getTextFromElement(VerifyBestsellersText4);
    }

    public void clickOnSortBy() {
        mouseHoverToElement(SortBy);
    }

    public void clickOnNameAtoZ() {
        mouseHoverToElementAndClick(NameAtoZ);
    }

    public void clickOnAddtocart1() {
        mouseHoverToElement(Addtocart1);
        mouseHoverToElementAndClick(VinylIdolzGhostbusters);
    }

      public String getVerifyGreenBar() {
        return getTextFromElement(VerifyGreenbar);
    }

    public void clickOnXsignclose() {
        clickOnElement(Xsignclose);
    }

    public void clickOnYourCart1() {
        clickOnElement(YourCart1);
    }

    public void clickOnViewCart() {
      clickOnElement(ViewCart);
      clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
    }

    public String getVerifyYourShopping() {
        return getTextFromElement(VerifyYourShopping);
    }
    public void clickOnEmptyyourcart() {mouseHoverToElementAndClick(Emptyyourcart);}
    public void VerifyAlert(){
        String ActMsg13 = AlertgetText();
       // messageValidation("Are you sure you want to clear your cart?",ActMsg13);
        switchToAccept();
    }
    public String getVerifyMsg() {
        return getTextFromElement(VerifyMsg);
    }
    public String getVerifyYourCartIsEmpty() {
        return getTextFromElement(VerifyYourCartIsEmpty);
    }

}
