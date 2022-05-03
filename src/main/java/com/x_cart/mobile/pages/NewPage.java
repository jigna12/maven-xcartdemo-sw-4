package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewPage extends Utility {
    /*2 - verifyUserShouldNavigateToNewPageSuccessfully()
		2.1 Click on the “New!” link
		2.2 Verify the text “New arrivals”*/

    By New = By.linkText("New!");
    By VerifyNewArrivals = By.xpath("//h1[@id='page-title']");

    public void clickOnNew(){
        clickOnElement(New);
    }
    public String getVerifyNewArrivalsText(){
        return getTextFromElement(VerifyNewArrivals);
    }
}
