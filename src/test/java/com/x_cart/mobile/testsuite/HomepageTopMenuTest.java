package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.ComingSoonPage;
import com.x_cart.mobile.pages.ContactUsPage;
import com.x_cart.mobile.pages.NewPage;
import com.x_cart.mobile.pages.ShippingPage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTopMenuTest extends TestBase {
    ShippingPage shippingPage = new ShippingPage();
    NewPage newPage = new NewPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        shippingPage.clickOnShipping();
        Assert.assertEquals("Shipping",shippingPage.getVerifyShippingText());
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        newPage.clickOnNew();
        Assert.assertEquals("New arrivals",newPage.getVerifyNewArrivalsText());
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        comingSoonPage.clickOnComingsoon();
        Assert.assertEquals("Coming soon",comingSoonPage.getVerifyComingsoonText());
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        contactUsPage.clickOnContactus();
        Assert.assertEquals("Contact us",contactUsPage.getVerifyContactusText());
    }
}
