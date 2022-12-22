package PagesForNopCommernce;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopingCartPage  extends DriverManager
{
    @FindBy(xpath = "/html/body/app-root/app-navbar/div/nav/ul/li[2]/a")
    private WebElement shop;

    @FindBy(css = ".cart-label")
    private WebElement shoppingCart;

    @FindBy(id = "termsofservice")
    private WebElement termsOfCondition;

    @FindBy(id = "checkout")
    private WebElement checkout;

    @FindBy(xpath = "//*[@id=\"navbarResponsive\"]/ul/li/a")
    private WebElement ClickonCheckout;


@FindBy(xpath = "/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[1]/div/div[2]/button")
private WebElement addToCart;
    public void clickOnCheckout() {
     ClickonCheckout.click();
    }
    public void setAddToCart() {
        addToCart.click();
    }

    public void setShop() {
        shop.click();
    }
    @FindBy(xpath = "/html/body/app-root/app-shop/div/div/div/table/tbody/tr[3]/td[5]/button")
    private WebElement confirmCheckout;
    public void setConfirmCheckout(){
        confirmCheckout.click();
    }
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement DeliveryAddress;
    public void setDeliveryAddress() throws InterruptedException {
        DeliveryAddress.sendKeys("india");
        IndiaBtn.click();
      //  Thread.sleep(2000);
    }
    @FindBy(xpath = "/html/body/app-root/app-shop/div/app-checkout/div/div[2]/ul/li/a")
    private WebElement IndiaBtn;

    @FindBy(xpath = "/html/body/app-root/app-shop/div/app-checkout/div/div[2]")
    private WebElement AgreeTerms;
    public void setAgreeTerms(){
        AgreeTerms.click();
    }
    @FindBy(xpath = "/html/body/app-root/app-shop/div/app-checkout/div[1]/form/input")
    private WebElement PurchaseBtn;
    public void setPurchaseBtn(){
        PurchaseBtn.click();
    }

}


