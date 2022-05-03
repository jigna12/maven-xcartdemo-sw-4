package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoonPage extends Utility {
    /*3 - verifyUserShouldNavigateToComingsoonPageSuccessfully()
		3.1 Click on the “Coming soon” link
		3.2 Verify the text “Coming soon”*/
    By Comingsoon = By.linkText("Coming soon");
    By VerifyComingsoon = By.id("page-title");

    public void clickOnComingsoon(){
        clickOnElement(Comingsoon);
    }
    public String getVerifyComingsoonText(){
        return getTextFromElement(VerifyComingsoon);
    }

}
