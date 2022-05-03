package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellerPage;
import com.x_cart.mobile.pages.SalePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
    SalePage salePage = new SalePage();
    BestSellerPage bestSellerPage = new BestSellerPage();

    @Test
    public void verifySaleProductsArrangeAlphabetically(){
        salePage.clickOnHotdeals();
        salePage.clickOnSale();
        Assert.assertEquals("Sale",salePage.getVerifySaleText());
        salePage.clickOnSortBy();
        salePage.clickOnNameAtoZ();
        Assert.assertEquals("Name A - Z",salePage.getVerifyAlphabeticallyText());
    }
   @Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
        salePage.clickOnHotdeals1();
        salePage.clickOnSale1();
        Assert.assertEquals("Sale",salePage.getVerifySaleText1());
        salePage.clickOnSortBy1();
        salePage.clickOnPriceLowToHigh();
        Assert.assertEquals("Price Low - High",salePage.getVerifyLowToHighText());
   }
   @Test
    public void verifySaleProductsArrangeByRates(){
       salePage.clickOnHotdeals2();
       salePage.clickOnSale2();
       Assert.assertEquals("Sale",salePage.getVerifySaleText2());
       salePage.clickOnSortBy2();
       salePage.clickOnRates();
       Assert.assertEquals("Rates",salePage.getVerifyRatesText());
   }
   @Test
    public void verifyBestSellersProductsArrangeByZToA(){
        bestSellerPage.clickOnHotdeals3();;
        bestSellerPage.clickOnBestsellers();
        Assert.assertEquals("Bestsellers",bestSellerPage.getVerifyBestsellersText());
        bestSellerPage.clickOnSortBy3();
        bestSellerPage.clickOnNameZtoA();
        Assert.assertEquals("Name Z - A",bestSellerPage.getVerifyNameZtoAText());
   }
   @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow(){
       bestSellerPage.clickOnHotdeals4();;
       bestSellerPage.clickOnBestsellers1();
       Assert.assertEquals("Bestsellers",bestSellerPage.getVerifyBestsellersText1());
       bestSellerPage.clickOnSortBy4();
       bestSellerPage.clickOnPriceHightoLow();
       Assert.assertEquals("Price High - Low",bestSellerPage.getVerifyPriceHightoLowText());
   }
   @Test
    public void verifyBestSellersProductsArrangeByRates(){
       bestSellerPage.clickOnHotdeals5();;
       bestSellerPage.clickOnBestsellers2();
       Assert.assertEquals("Bestsellers",bestSellerPage.getVerifyBestsellersText2());
       bestSellerPage.clickOnSortBy5();
       bestSellerPage.clickOnRates();
       Assert.assertEquals("Rates",bestSellerPage.getVerifyRatesText());
   }
   }



