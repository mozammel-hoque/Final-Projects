package test;

import base.CommonAPI;
import homepage.HomePage;
import homepage.Investment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestInvestment extends CommonAPI {
 //   HomePage homePage = PageFactory.initElements(driver, HomePage.class);

  //  @Test
    public void verifyAmericanFunds() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.getInvestmentButton().click();
        waitFor(1);
        investment.getAmericanFunds().click();
        waitFor(1);

    }


}
