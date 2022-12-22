package PagesForNopCommernce;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Checkout extends DriverManager {
    public static void main(String[] args) {

    }
    DriverManager driverManager = new DriverManager();
    @FindBy(id = "BillingNewAddress_City")
    private WebElement billingAddressCity;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
    private WebElement billingAddress1;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement zipPostalCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneNumber;
    public void selectcountry(){
        Select country=new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        country.selectByVisibleText("Iraq");
    }

    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
    private WebElement checkoutBtn;

    public void setBillingAddress1(){
        billingAddress1.sendKeys("24 alam drive");

    }
    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
    private WebElement paymentButton;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    private WebElement shippingmethodButton;

    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
    private WebElement continueshippingButton;

    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
    private WebElement finalshippingButton;

    public void setBillingAddressCity(){
        billingAddressCity.sendKeys("watford");
    }

    public void setZipPostalCode(){
        zipPostalCode.sendKeys("wd196tl");
    }

    public void setPhoneNumber(){
        phoneNumber.sendKeys("076478954624");
    }
    public void clickOnContinue(){
        checkoutBtn.click();

    }
    public void setShippingmethodButton(){
        shippingmethodButton.click();
    }
    public void setPaymentButton(){
        paymentButton.click();
    }
    public void setContinueshippingButton(){
        continueshippingButton.click();
    }
    public void setFinalshippingButton(){
        finalshippingButton.click();
    }


}
