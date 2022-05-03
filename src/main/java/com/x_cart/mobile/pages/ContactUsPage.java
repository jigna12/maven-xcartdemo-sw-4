package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsPage extends Utility {
    /*4 - verifyUserShouldNavigateToContactUsPageSuccessfully()
		4.1 Click on the “Contact us” link
		4.2 Verify the text “Contact us”*/

    By Contactus = By.linkText("Contact us");
    By VerifyContactusText = By.id("page-title");

    public void clickOnContactus(){
        clickOnElement(Contactus);
    }
    public String getVerifyContactusText(){
        return getTextFromElement(VerifyContactusText);
    }

}
