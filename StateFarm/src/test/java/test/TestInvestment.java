package test;

import base.CommonAPI;
import homepage.HomePage;
import homepage.Investment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestInvestment extends CommonAPI {

    @Test
    public void verifyAmericanFunds() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.americanFunds();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        investment.portfolioFunds();
        waitFor(1);
        investment.targetData();
        waitFor(1);

    }
    @Test
    public void savingsForCollegeFunctionality() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.collegeSavings();
        waitFor(1);
        investment.moreSavingPlan();
        waitFor(1);
        investment.savingPlanningAccount();
        waitFor(1);
        navigateBack();


    }
    @Test
    public void stateFarmSavingPlanValidation() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.stateFirmSavingPlan();
        waitFor(1);
        investment.pricesAndPerformance();
        waitFor(1);
        navigateBack();
        waitFor(1);
        investment.taxes(driver);
        waitFor(1);
        investment.eligibility();
        waitFor(1);

    }
    @Test
    public void trustButtonFunctionality() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.trust();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        investment.irrevocableTrust();
        waitFor(1);
        navigateBack();
        waitFor(1);
        investment.revocableLivingTrust();
        waitFor(1);
    }
    @Test
    public void jointAccountFunctionality() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.jointAccount();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        investment.jointAccountZip("11104");
        waitFor(1);
        navigateBack();
        investment.mutualFund();
        waitFor(1);
    }
    @Test
    public void lifeInsuranceFunctionality() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.lifeInsurance();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        investment.quoteForLifeInsurance("NY");
        waitFor(1);
        investment.quoteLifeInsurance();
        waitFor(1);
    }
    @Test
    public void federalStateTaxFunctionality() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.federalStateTax();
        waitFor(1);
        investment.estatePlanningTool();
        waitFor(1);
        investment.estateLifeInsurance();
        waitFor(1);
    }
    @Test
    public void annuityValidation() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.annuity();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        waitFor(1);
        investment.guaranteedIncome();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        waitFor(1);
        investment.guaranteedIncomeZip("11104");
        waitFor(1);
    }
    @Test
    public void basicFunctionality() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.theBasic();
        waitFor(1);
        investment.basicZip("11106");
        waitFor(1);
        navigateBack();
        waitFor(2);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        waitFor(1);
        investment.policySeries();
        waitFor(1);

    }
    @Test
    public void guaranteedIncomeValidation() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.guaranteedIncomeNow();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
        waitFor(1);
        investment.guaranteedIncomeSeries();
        waitFor(1);
        navigateBack();
        waitFor(1);
        investment.guaranteedZip("11104");
        waitFor(1);
    }
    @Test
    public void guaranteedIncomeLaterValidation() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.guaranteedIncomeLater();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        waitFor(1);
        investment.guaranteedIncomeLaterSeries();
        waitFor(1);
        navigateBack();
        waitFor(2);
        ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
        waitFor(1);
        investment.guaranteedIncomeLaterZip("11106");
        waitFor(1);
    }
    @Test
    public void futureIncomePlusValidation() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.futureIncomePlus();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
        waitFor(1);
        investment.futureIncomePlusSeries();
        waitFor(1);
        navigateBack();
        waitFor(2);
        investment.futureIncomePlusZip("11105");
        waitFor(1);
    }
    @Test
    public void whyStateFarmValidation() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.whyStateFarm();
        waitFor(1);
        investment.whyStateFarmZip("11104");
        waitFor(1);
    }
    @Test
    public void changeAnAnnuityValidation() throws InterruptedException{
        Investment investment = PageFactory.initElements(driver, Investment.class);
        investment.investmentButton();
        waitFor(1);
        investment.changeAnnuity();
        waitFor(1);
        investment.changeAnnuityAgent();
        waitFor(1);
        investment.changeAnnuityAgentZip("11104");
        waitFor(1);
    }

}
