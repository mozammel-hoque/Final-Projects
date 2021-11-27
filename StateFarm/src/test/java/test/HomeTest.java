package test;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {

        @Test
        public void titleValidation() throws InterruptedException {
            String title = driver.getTitle();
            Assert.assertEquals(title,"Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®",title);
        }

   @Test
    public void checkedIfLogoIsDisplayed() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.isLogoDisplaed());
    }

   @Test
    public void insuranceFunctionValidation() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickInsurance();
        waitFor(1);
        homePage.clickCarInsurance();
        waitFor(1);
       ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        homePage.getZipCode().sendKeys("11104");
        waitFor(1);
 //       homePage.insuranceQuote();
//        waitFor(1);


    }

    @Test
    public void motorCycleFunction() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickInsurance();
        waitFor(1);
        homePage.motorcycle();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        homePage.motoZip("11104");
        waitFor(1);
        homePage.motoAgent();
        waitFor(1);
    }



    @Test
    public void boatFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickInsurance();
        waitFor(1);
        homePage.boatInsurance();
        waitFor(1);
        homePage.boatZip("11105");
        waitFor(1);
        homePage.boatAgent();
        waitFor(1);
    }

    @Test
    public void offRoadFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickInsurance();
        waitFor(1);
        homePage.offRoad();
        waitFor(1);
        homePage.offRoadZip("11105");
        waitFor(1);
        homePage.offRoadAgent();
        waitFor(1);

    }
    @Test
    public void motorHomeFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickInsurance();
        waitFor(1);
        homePage.motorHome();
        waitFor(1);
        homePage.motorZip("11104");
        waitFor(1);
        homePage.motorAgent();

    }

    @Test
    public void roadsideFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickInsurance();
        waitFor(1);
        homePage.roadsideAssistance();
        waitFor(1);
        homePage.assistance();
        waitFor(1);
        homePage.startRequest();
        waitFor(1);

    }
      @Test
    public void checkingFunctionalityValidation() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.banking();
        waitFor(1);
        homePage.checking();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.compare();
        waitFor(1);
        homePage.checkingPopup();
        waitFor(1);
    }
    @Test
    public void savingsFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.banking();
        waitFor(1);
        homePage.saving();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.compareSaving();
        waitFor(1);
        homePage.popupSaving();
        waitFor(1);
    }

    @Test
    public void homeLoanFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.banking();
        waitFor(1);
        homePage.homeLoan();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        homePage.homeZip("11104");
//        waitFor(1);
//        homePage.homeAgent();

    }
    @Test
    public void creditCardFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.banking();
        waitFor(1);
        homePage.creditCard();
        waitFor(1);
        homePage.creditCardLearMore();
        waitFor(1);
        homePage.creditCardPopupCancel();
        waitFor(1);
        homePage.creditCardLearMore();
        waitFor(1);
        homePage.creditCardPopupContinue();
        waitFor(1);

    }
    @Test
    public void CDsFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.banking();
        waitFor(1);
        homePage.CDs();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
        waitFor(1);
        homePage.standardCd();
        waitFor(1);

    }

   @Test
    public void retirementFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.banking();
        waitFor(1);
        homePage.retirementCD();
        waitFor(1);
        homePage.lowRiskCD();
        waitFor(1);
        homePage.lowRiskCDCancel();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,5000)");
        waitFor(1);
        homePage.retirementCDSpecial();
        waitFor(1);

    }
    @Test
    public void investmentFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.investment();
        waitFor(1);
        homePage.retirementPlanning();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.startPlanning();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.retirementTool();
        waitFor(1);

    }
    @Test
    public void traditionalIRAFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.investment();
        waitFor(1);
        homePage.traditionalIRA();
        waitFor(1);
        homePage.compareTraditional();
        waitFor(1);
        navigateBack();
        waitFor(1);
        homePage.traditionalCalculator();
        waitFor(1);
    }

   @Test
    public void verifyRothIRA() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.investment();
        waitFor(1);
        homePage.rothIRA();
        waitFor(1);
        homePage.compareRoth();
        waitFor(1);
        navigateBack();
        homePage.rothCalculator();
        waitFor(1);

    }
    @Test
    public void verifyBusinessRetirement() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.investment();
        waitFor(1);
        homePage.businessRetirement();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.individual401k();
        waitFor(1);
        navigateBack();
        homePage.sepIRA();
        waitFor(1);
    }

   @Test
    public void verifyTypesOfAccount() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.investment();
        waitFor(1);
        homePage.typesOfAccount();
        waitFor(1);
        homePage.rothAccount();
        waitFor(1);
        navigateBack();
        homePage.traditionalAccount();
        waitFor(1);

    }
      @Test
    public void verifySelectingAFund() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.investment();
        waitFor(1);
        homePage.selectingAFund();
        waitFor(1);
        homePage.stateFarmAgent();
        waitFor(1);
        homePage.agentSearch();
        waitFor(1);

    }
    @Test
    public void verifyBlackRockFunds() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.investment();
        waitFor(1);
        homePage.blackRockFund();
        waitFor(1);
        ((JavascriptExecutor) driver).executeScript("scroll(0,500)");
        waitFor(1);
        homePage.targetData();
        waitFor(1);
        homePage.specialFund();
        waitFor(1);
    }
}




