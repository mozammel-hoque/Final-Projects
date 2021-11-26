package Homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Login extends CommonAPI {



    @FindBy(xpath = "//header/div[1]/div[4]/a[1]/i[1]")
    WebElement signInAccount;
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signIn;
    @FindBy(xpath = "//button[contains(text(),'Create an account')]")
    WebElement createAnAccount;
    @FindBy(xpath = "//header/div[1]/div[4]/div[1]/div[1]/a[2]")
    WebElement purchaseHistory;
    @FindBy(id = "//input[@id='email']")
    WebElement email;
    @FindBy(id = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/button[1]")
    WebElement forgotPassword;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
    WebElement showPassword;
    @FindBy(id = "//body/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")
    WebElement enterSignIn;

    public WebElement getSignInAccount() {return signInAccount;}
    public WebElement getSignIn() {return signIn;}
    public WebElement getCreateAnAccount() {return createAnAccount;}
    public WebElement getPurchaseHistory() {return purchaseHistory;}
    public WebElement getEmail() { return email; }
    public WebElement getPassword() { return password; }
    public WebElement getforgotPassword() {return forgotPassword;}
    public WebElement getshowPassword() {return showPassword;}
    public WebElement getenterSignIn() {return enterSignIn;}
    public WebElement getEnterSignIn() {return enterSignIn;}

    public void SignInAccount() {clickOn(getSignInAccount());}
    public void SignIn() {clickOn((getSignIn()));}
    public void CreateAnAccount() {clickOn(getCreateAnAccount());}
    public void PurchaseHistory() {clickOn(getPurchaseHistory());}
    public void setEmail(WebElement email) {
        this.email = email;
    }
    public void enterEmail() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        getEmail().sendKeys("Jaspreet@com");}

    public void setPassword(WebElement password) {
        this.password = password;
    }
    public void enterPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getPassword().sendKeys("abc123");}
    public void forgotPassword() {clickOn(getforgotPassword());}
    public void showPassword() {clickOn(getshowPassword());}
    public void enterSignIn(WebElement enterSignIn) {this.enterSignIn = enterSignIn;}



}








        /*//Test 17:
        @FindBy(xpath = "//button[contains(text(),'Household Essentials')]")
        WebElement householdEssentials;
        public WebElement getHouseholdEssentials() {return householdEssentials;}
        public void householdEssentials() {clickOn(getHouseholdEssentials());}*/



