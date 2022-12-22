package stepdefForNopCommernce;

import PagesForNopCommernce.Checkout;
import PagesForNopCommernce.ShopingCartPage;
import cucumber.api.java.en.When;
import driver.DriverManager;

public class shoppingCartSteps extends DriverManager {
    ShopingCartPage shopingCartPage = new ShopingCartPage();
    Checkout checkout=new Checkout();

    @When("^I click on shop btn$")
    public void i_click_on_shop_btn() throws Throwable {
        shopingCartPage.setShop();
    }

    @When("^I click on add to cart btn$")
    public void i_click_on_addtocart_btn() throws Throwable {
        shopingCartPage.setAddToCart();
    }
    @When("^I click on checkout$")
    public void i_click_on_checkout_btn() throws Throwable {
      shopingCartPage.clickOnCheckout();
    }
    @When("^I will validate and confirm my order$")
    public void i_will_validate_and_confirm_my_order() throws Throwable {
        shopingCartPage.setConfirmCheckout();
    }
    @When("^I will select my delivery address$")
    public void i_will_select_my_delivery_address() throws Throwable {
       shopingCartPage.setDeliveryAddress();
    }
    @When("^I will tick the terms and conditions$")
    public void i_will_tick_the_terms_and_conditions() throws Throwable {
       shopingCartPage.setAgreeTerms();
    }
    @When("^I will click on Purchase Button$")
    public void i_will_click_on_Purchase_Button() throws Throwable {
        shopingCartPage.setPurchaseBtn();
    }

    @When("^I will add all the checkout data$")
    public void i_will_add_all_the_checkout_data() throws Throwable {
       checkout.selectcountry();
       checkout.setBillingAddress1();
       checkout.setBillingAddressCity();
       checkout.setZipPostalCode();
       checkout.setPhoneNumber();
    }
    @When("^I will click on the checkout$")
    public void i_will_click_on_the_checkout() throws Throwable {
     checkout.clickOnContinue();
    }
    @When("^I will Ship the product$")
    public void i_will_Ship_the_product() throws Throwable {
       checkout.setShippingmethodButton();
    }
    @When("^I will make the payment$")
    public void i_will_make_the_payment() throws Throwable {
        checkout.setPaymentButton();
    }
    @When("^I will continue shipping$")
    public void i_will_continue_shipping() throws Throwable {
        checkout.setContinueshippingButton();
    }
    @When("^I will finally ship$")
    public void i_will_finally_ship() throws Throwable {
        checkout.setFinalshippingButton();
    }




}
