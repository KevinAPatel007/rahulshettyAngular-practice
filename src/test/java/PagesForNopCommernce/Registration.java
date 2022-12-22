package PagesForNopCommernce;

import driver.DriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(id = "gender-male")
    private WebElement maleCheckBox;

    @FindBy(id = "gender-female")
    private WebElement femaleCheckBox;

    @FindBy(id = "register-button")
    private WebElement registrationButton;

    @FindBy(xpath = "/html/body/app-root/form-comp/div/form/div[1]/input")
    private WebElement firstNameInputBox;

    @FindBy(id = "LastName")
    private WebElement lastNameInputBox;

    @FindBy(xpath = "/html/body/app-root/form-comp/div/form/div[2]/input")
    private WebElement emailInputBox;

    @FindBy(xpath = "//*[@id=\"exampleInputPassword1\"]")
    private WebElement passwordInputBox;

    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPasswordInputBox;

    @FindBy(css = "div[class='result']")
    private WebElement registrationSuccessText;

    @FindBy(xpath = "/html/body/app-root/form-comp/div/form/input")
    private WebElement submitBtn;

    public void selectMale(){
        maleCheckBox.click();
    }

    public void selectFemale(){
        femaleCheckBox.click();
    }

    public void clickOnRegistrationButton() {
        registrationButton.click();
    }

    public String getTextFromRegistrationResult() {
        return registrationSuccessText.getText();
    }
    public void firstname() {
        firstNameInputBox.sendKeys("kevin");
    }
    public void email() {
        emailInputBox.sendKeys("sweetmegs6204@gmail.com");
    }
    public void password() {
        passwordInputBox.sendKeys("123456789");
    }

    public void setSubmitBtn(){
        submitBtn.click();
    }
    public void enterRegistrationDetails(String firstName, String lastName, String email, String password, String confirmPassword) {
      firstNameInputBox.clear();
      firstNameInputBox.sendKeys(firstName);
      lastNameInputBox.clear();
      lastNameInputBox.sendKeys(lastName);
      emailInputBox.clear();
      int myRandomNumber = driverManager.generateRandomNumber();
      emailInputBox.sendKeys(myRandomNumber+email);
      passwordInputBox.clear();
      passwordInputBox.sendKeys(password);
      confirmPasswordInputBox.clear();
      confirmPasswordInputBox.sendKeys(confirmPassword);
    }


}
