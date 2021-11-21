package test;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {

     //   @Test
        public void titleValidation() throws InterruptedException {
            String title = driver.getTitle();
            Assert.assertEquals(title,"Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®",title);
        }

 //  @Test
    public void checkedIfLogoIsDisplayed() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.isLogoDisplaed());
    }

 //  @Test
    public void insuranceFunctionValidation() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOn(homePage.getInsurance());
        waitFor(2);
        homePage.getCarInsurance().click();
        waitFor(2);
        homePage.getZipCode().sendKeys("11104");
        waitFor(2);
        homePage.getQuote().click();
        waitFor(2);


    }

 //   @Test
    public void motorCycleFunction() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInsurance().click();
        waitFor(1);
        homePage.getMotorcycle().click();
        waitFor(1);
        homePage.getMotoZip().sendKeys("11104");
        waitFor(1);
        homePage.getFindAgent().click();
        waitFor(1);


    }

    @Test
    public void investmentFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInvestment().click();
        waitFor(1);
        homePage.getRetirement().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.getPlanning().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.getRetirementTool().click();
        waitFor(1);

    }

  //  @Test
    public void boatFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInsurance().click();
        waitFor(1);
        homePage.getBoat().click();
        waitFor(1);
        homePage.getMotoZip().sendKeys("11104");
        waitFor(1);
        homePage.getBoatAgent().click();
        waitFor(1);
    }

  //  @Test
    public void offRoadFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInsurance().click();
        waitFor(1);
        homePage.getOffRoad().click();
        waitFor(1);
        homePage.getOffRoadZip().sendKeys("11104");
        waitFor(1);
        homePage.getOffRoadAgent().click();
        waitFor(1);

    }
   // @Test
    public void motorHomeFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInsurance().click();
        waitFor(1);
        homePage.getMotorHome().click();
        waitFor(1);
        homePage.getMotorZip().sendKeys("11104");
        waitFor(1);
        homePage.getMotorAgent().click();

    }

  //  @Test
    public void roadsideFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInsurance().click();
        waitFor(1);
        homePage.getRoadside().click();
        waitFor(1);
        homePage.getAssistance().click();
        waitFor(1);
        homePage.getStartRequest().click();
        waitFor(1);

    }
    //  @Test
    public void checkingFunctionalityValidation() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getBanking().click();
        waitFor(1);
        homePage.getChecking().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.getCompare().click();
        waitFor(1);
        homePage.getPopup().click();
        waitFor(1);
    }
  //  @Test
    public void savingsFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getBanking().click();
        waitFor(1);
        homePage.getSavings().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        homePage.getCompareSavings().click();
        waitFor(1);
        homePage.getPopupSavings().click();
        waitFor(1);
    }

  //  @Test
    public void homeLoanFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getBanking().click();
        waitFor(1);
        homePage.getHomeLoan().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        homePage.getHomeZip().sendKeys("11104");
        waitFor(1);
        homePage.getHomeAgent().click();

    }

 //   @Test
    public void creditCardFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getBanking().click();
        waitFor(1);
        homePage.getCreditCard().click();
        waitFor(1);
        homePage.getCreditCardLearnMore().click();
        waitFor(1);
        homePage.getCreditCardPopupCancel().click();
        waitFor(1);
        homePage.getCreditCardLearnMore().click();
        waitFor(1);
    }
   // @Test
    public void CDsFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getBanking().click();
        waitFor(1);
        homePage.getCDs().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        homePage.getStandardCD().click();
        waitFor(1);

    }

 //   @Test
    public void retirementFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getBanking().click();
        waitFor(1);
        homePage.getRetirementcds().click();
        waitFor(1);
        homePage.getLowRiskCD().click();
        waitFor(1);
        homePage.getLowRiskCDCancel().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,5000)");
        homePage.getRetirementCDSpecial().click();
        waitFor(1);

    }
 //   @Test
   public void retirementPlanningFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInvestmentButton().click();
        waitFor(1);
        homePage.getRetirementPlanning().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.getStartPlanning().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,900)");
        waitFor(1);
        homePage.getEmergencyPlanning().click();
        waitFor(1);
    }
  //  @Test
    public void traditionalIRAFunctionality() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInvestmentButton().click();
        waitFor(1);
        homePage.getTraditionalIRA().click();
        waitFor(1);
        homePage.getCompareTraditional().click();
        waitFor(1);
        navigateBack();
        waitFor(1);
        homePage.getTraditionalCalculator().click();
        waitFor(1);
    }

 //   @Test
    public void verifyRothIRA() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInvestmentButton().click();
        waitFor(1);
        homePage.getRothIRA().click();
        waitFor(1);
        homePage.getCompareRoth().click();
        waitFor(1);
        navigateBack();
        homePage.getRothCalculator().click();
        waitFor(1);

    }
  //  @Test
    public void verifyBusinessRetirement() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInvestmentButton().click();
        waitFor(1);
        homePage.getBusinessRetirement().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        homePage.getIndividual401k().click();
        waitFor(1);
        navigateBack();
        homePage.getSepIRA().click();
        waitFor(1);
    }

 //   @Test
    public void verifyTypesOfAccount() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInvestmentButton().click();
        waitFor(1);
        homePage.getTypesOfAccount().click();
        waitFor(1);
        homePage.getRothAccount().click();
        waitFor(1);
        navigateBack();
        homePage.getAccountTraditional().click();
        waitFor(1);

    }
 //   @Test
    public void verifySelectingAFund() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInvestmentButton().click();
        waitFor(1);
        homePage.getSelectingAFund().click();
        waitFor(1);
        homePage.getStateFarmAgent().click();
        waitFor(1);
        homePage.getAgentSearch().click();
        waitFor(1);

    }
 //   @Test
    public void verifyBlackRockFunds() throws InterruptedException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getInvestmentButton().click();
        waitFor(1);
        homePage.getBlackRockFund().click();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
        waitFor(1);
        homePage.getTargetData().click();
        waitFor(1);
        homePage.getSpecialFund().click();
        waitFor(1);

    }




        }




