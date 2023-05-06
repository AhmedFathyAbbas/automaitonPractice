package TestCases;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PurchaseFullCycle extends BaseTest {
    HomePage hp = new HomePage (baseTestDriver);
    RegisterPage rp = new RegisterPage (baseTestDriver );
    LoginPage lp = new LoginPage (baseTestDriver);
    Books bk = new Books (baseTestDriver);
    ShoppingCartPage sc = new ShoppingCartPage (baseTestDriver);
    CheckoutPages cp = new CheckoutPages (baseTestDriver);
    SuccsesPage sp = new SuccsesPage (baseTestDriver);

    @Test
    public void checkoutFullValidTestCase() {
        //Registration test Steps
        hp.clickOnRegisterLink ();
        rp.chooseYourGender ();
        rp.enterFirstName ();
        rp.enterLastName ();
        rp.selectDay ();
        rp.selectMonth ();
        rp.selectyear ();
        rp.enterEmail ();
        rp.enterCompanyName ();
        rp.enterPassword ();
        rp.confirmPassword ();
        rp.clickOnRegister ();
        // Login Test Steps
        hp.clickOnLoginLink ();
        lp.enterEmail ();
        lp.enterPassword ();
        lp.clickOnRememberMe ();
        lp.clickOnLoginBtn ();
        //choose the selected product and Proceed to order
        hp.clickOnBooksLink ();
        bk.filterByPrice ();
        try {
            bk.addSecondItemToCart ();
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }
        hp.clickOnShoppingCartLink ();
        sc.acceptTermsAndConditions ();
        sc.clickOnCheckout ();
        cp.selectCountry ();
        cp.selectState ();
        cp.enterCity ();
        cp.enterAddress1 ();
        cp.enterAddress2 ();
        cp.enterPostalCode ();
        cp.enterPhoneNumber ();
        cp.enterFaxNumber ();
        cp.clickContinueForBilling ();
        cp.clickOnShippingOption();
        cp.continueForShipping ();
        cp.clickContinueForPayment ();
        cp.clickContinueForPaymentInfo();
        cp.clickOnConfirmBtn ();

        Assert.assertEquals ( sp.getSuccessMsg () , "Your order has been successfully processed!" );



    }
    }


