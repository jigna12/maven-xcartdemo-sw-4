package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {
    /*1 - verifyUserShouldNavigateToShippingPageSuccessfully()
		1.1 Click on the “Shipping” link
		1.2 Verify the text “Shipping”*/

    By Shipping = By.linkText("Shipping");
    By VerifyShipping = By.xpath("//h1[@id='page-title']");

    public void clickOnShipping(){
        clickOnElement(Shipping);
    }
    public String getVerifyShippingText(){
        return getTextFromElement(VerifyShipping);
    }
}
