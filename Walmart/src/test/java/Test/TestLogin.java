package Test;

import Homepage.Login;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestLogin extends CommonAPI {

    @Test
    public void test64() throws InterruptedException {
        Login homePage = PageFactory.initElements(driver, Login.class);
        homePage.getSignInAccount();
        waitFor(3);}
    @Test
    public void test65() throws InterruptedException {
        Login homePage = PageFactory.initElements(driver, Login.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        waitFor(3);}
    @Test
    public void test66() throws InterruptedException {
        Login homePage = PageFactory.initElements(driver, Login.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        homePage.getCreateAnAccount();
        waitFor(3);}
    @Test
    public void test67() throws InterruptedException {
        Login homePage = PageFactory.initElements(driver, Login.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        homePage.getCreateAnAccount();
        homePage.getPurchaseHistory();
        waitFor(3);}
    @Test
    public void test68() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //creating object using pageFactory
        Login homepage = PageFactory.initElements(driver, Login.class);
        homepage.getSignInAccount();
        homepage.getSignIn();
        homepage.getCreateAnAccount();
        homepage.getPurchaseHistory();
        homepage.getEmail();
        waitFor(3);}
    @Test
    public void test69() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //creating object using pageFactory
        Login homepage = PageFactory.initElements(driver, Login.class);
        homepage.getSignInAccount();
        homepage.getSignIn();
        homepage.getCreateAnAccount();
        homepage.getPurchaseHistory();
        homepage.getEmail();
        homepage.getPassword();
        waitFor(3);}
    @Test
    public void test70() throws InterruptedException {
        Login homePage = PageFactory.initElements(driver, Login.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        homePage.getCreateAnAccount();
        homePage.getPurchaseHistory();
        homePage.getEmail();
        homePage.getPassword();
        homePage.getforgotPassword();
        waitFor(3);}
    @Test
    public void test71() throws InterruptedException {
        Login homePage = PageFactory.initElements(driver, Login.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        homePage.getCreateAnAccount();
        homePage.getPurchaseHistory();
        homePage.getEmail();
        homePage.getPassword();
        homePage.getforgotPassword();
        homePage.getshowPassword();
        waitFor(3);}
    @Test
    public void test72() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //creating object using pageFactory
        Login homepage = PageFactory.initElements(driver, Login.class);
        homepage.getSignInAccount();
        homepage.getSignIn();
        homepage.getCreateAnAccount();
        homepage.getPurchaseHistory();
        homepage.getEmail();
        homepage.getPassword();
        homepage.getforgotPassword();
        homepage.getEnterSignIn();
        waitFor(3);}


}


