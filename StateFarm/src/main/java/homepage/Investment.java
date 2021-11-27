package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.FindBy;

public class Investment extends CommonAPI {



    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[3]/div/button/span")
    WebElement investmentButton;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[2]/section/ul/li[4]/a")
    WebElement AmericanFunds;

    @FindBy(xpath = "//*[@id=\"nav-tab-17-3054846-2\"]")
    WebElement portfolioSeriesFunds;

    @FindBy(xpath = "//*[@id=\"nav-tab-17-3054846-3\"]")
    WebElement targetDataFunds;

    @FindBy(xpath = "//a[text()='Saving for College']")
    WebElement savingsForCollege;

    @FindBy(xpath = "//a[text()='Learn more about the State Farm']")
    WebElement moreAboutSavingPlan;

    @FindBy(xpath = "//a[text()='  Access Your State Farm 529 Savings Plan Account']")
    WebElement accessSavingPlanAccount;

    @FindBy(xpath = "//a[text()='State Farm® 529 Savings Plan']")
    WebElement stateFarmSavingPlan;

    @FindBy(xpath = "//a[text()='  Prices and Performance']")
    WebElement pricesAndPerformance;

    @FindBy(xpath = "//*[@id=\"nav-tab-17-3044241-1\"]")
    WebElement taxes;

    @FindBy(xpath = "//*[@id=\"nav-tab-17-3044241-2\"]")
    WebElement eligibility;

    @FindBy(xpath = "//a[text()=\"Trusts\"]")
    WebElement trust;

    @FindBy(xpath = "//a[text()='irrevocable trust']")
    WebElement irrevocableTrust;

    @FindBy(xpath = "//a[text()='revocable living trust']")
    WebElement revocableLivingTrust;

    @FindBy(xpath = "//a[text()='Joint Accounts']")
    WebElement jointAccount;

    @FindBy(xpath = "//*[@id=\"0-17-3074893-8\"]")
    WebElement jointAccountZip;

    @FindBy(xpath = "//a[text()='  Mutual Funds']")
    WebElement mutualFund;

    @FindBy(xpath = "//a[text()='Life Insurance']")
    WebElement lifeInsurance;

    @FindBy(xpath = "//*[@id=\"0-17-3126495-4\"]")
    WebElement quoteForLifeInsurance;

    @FindBy(xpath = "//*[@id=\"form-81112\"]/div/div[2]/button")
    WebElement quoteLifeInsurance;

    @FindBy(xpath = "//a[text()='Federal Estate Tax']")
    WebElement federalStateTax;

    @FindBy(xpath = "//a[text()='estate planning tools']")
    WebElement estatePlanningTool;

    @FindBy(xpath = "//a[text()='life insurance']")
    WebElement estateLifeInsurance;

    @FindBy(xpath = "//a[text()='What is an Annuity?']")
    WebElement annuity;

    @FindBy(xpath = "//a[text()='Examine Guaranteed Income Now']")
    WebElement guaranteedIncome;

    @FindBy(xpath = "//*[@id=\"callout-agent-zip-code-input1\"]")
    WebElement guaranteedIncomeZip;

    @FindBy(xpath = "//a[text()='The Basics']")
    WebElement theBasic;

    @FindBy(xpath = "//*[@id=\"0-17-3060499-6129\"]")
    WebElement basicZip;

    @FindBy(xpath = "//a[text()='Policy Series Info']")
    WebElement policySeries;

    @FindBy(xpath = "//a[text()='Guaranteed Income Now']")
    WebElement guaranteedIncomeNow;

    @FindBy(xpath = "//a[text()='Policy series information']")
    WebElement guaranteedPolicySeries;

    @FindBy(xpath = "//*[@id=\"callout-agent-zip-code-input1\"]")
    WebElement guaranteedZip;

    @FindBy(xpath = "//a[text()='Guaranteed Income Later']")
    WebElement guaranteedIncomeLater;

    @FindBy(xpath = "//a[text()='Policy series information']")
    WebElement guaranteedIncomeLaterSeries;

    @FindBy(xpath = "//*[@id=\"callout-agent-zip-code-input1\"]")
    WebElement guaranteedIncomeLaterZip;

    @FindBy(xpath = "//a[text()='Future Income Plus']")
    WebElement futureIncomePlus;

    @FindBy(xpath = "//a[text()='Policy series information']")
    WebElement futureIncomePlusSeries;

    @FindBy(xpath = "//*[@id=\"callout-agent-zip-code-input1\"]")
    WebElement futureIncomePlusZip;

    @FindBy(xpath = "//a[text()='Why State Farm?']")
    WebElement whyStateFarm;

    @FindBy(xpath = "//*[@id=\"0-17-3060499-4628\"]")
    WebElement whyStateFarmZip;

    @FindBy(xpath = "//a[text()='Change an Annuity']")
    WebElement changeAnnuity;

    @FindBy(xpath = "//a[text()='State Farm agent']")
    WebElement changeAnnuityAgent;

    @FindBy(xpath = "//*[@id=\"locationText\"]")
    WebElement changeAnnuityAgentZip;

    public WebElement getInvestmentButton(){
        return investmentButton;
    }

    public WebElement getAmericanFunds(){
        return AmericanFunds;
    }

    public WebElement getPortfolioSeriesFunds(){
        return portfolioSeriesFunds;
    }
    public WebElement getTargetDataFunds(){
        return targetDataFunds;
    }
    public WebElement getSavingsForCollege(){
        return savingsForCollege;
    }
    public WebElement getMoreAboutSavingPlan(){
        return moreAboutSavingPlan;
    }
    public WebElement getAccessSavingPlanAccount(){
        return accessSavingPlanAccount;
    }
    public WebElement getStateFarmSavingPlan(){
        return stateFarmSavingPlan;
    }
    public WebElement getPricesAndPerformance(){
        return pricesAndPerformance;
    }
    public WebElement getTaxes(){
        return taxes;
    }
    public WebElement getEligibility(){
        return eligibility;
    }

    public WebElement getTrust(){
        return trust;
    }

    public WebElement getIrrevocableTrust(){
        return irrevocableTrust;
    }
    public WebElement getRevocableLivingTrust(){
        return revocableLivingTrust;
    }
    public WebElement getJointAccount(){
        return jointAccount;
    }
    public WebElement getJointAccountZip(){
        return jointAccountZip;
    }
    public WebElement getMutualFund(){
        return mutualFund;
    }
    public WebElement getLifeInsurance(){
        return lifeInsurance;
    }
    public WebElement getQuoteForLifeInsurance(){
        return quoteForLifeInsurance;
    }
    public WebElement getQuoteLifeInsurance(){
        return quoteLifeInsurance;
    }
    public WebElement getFederalStateTax(){
        return federalStateTax;
    }
    public WebElement getEstatePlanningTool(){
        return estatePlanningTool;
    }
    public WebElement getEstateLifeInsurance(){
        return estateLifeInsurance;
    }
    public WebElement getAnnuity(){
        return annuity;
    }
    public WebElement getGuaranteedIncome(){
        return guaranteedIncome;
    }
    public WebElement getGuaranteedIncomeZip(){
        return guaranteedIncomeZip;
    }
    public WebElement getTheBasic(){
        return theBasic;
    }
    public WebElement getBasicZip(){
        return basicZip;
    }
    public WebElement getPolicySeries(){
        return policySeries;
    }
    public WebElement getGuaranteedIncomeNow(){
        return guaranteedIncomeNow;
    }
    public WebElement getGuaranteedPolicySeries(){
        return guaranteedPolicySeries;
    }
    public WebElement getGuaranteedZip(){
        return guaranteedZip;
    }
    public WebElement getGuaranteedIncomeLater(){
        return guaranteedIncomeLater;
    }
    public WebElement getGuaranteedIncomeLaterSeries(){
        return guaranteedIncomeLaterSeries;
    }
    public WebElement getGuaranteedIncomeLaterZip(){
        return guaranteedIncomeLaterZip;
    }
    public WebElement getFutureIncomePlus(){
        return futureIncomePlus;
    }
    public WebElement getFutureIncomePlusSeries(){
        return futureIncomePlusSeries;
    }
    public WebElement getFutureIncomePlusZip(){
        return futureIncomePlusZip;
    }
    public WebElement getWhyStateFarm(){
        return whyStateFarm;
    }
    public WebElement getWhyStateFarmZip(){
        return whyStateFarmZip;
    }
    public WebElement getChangeAnnuity(){
        return changeAnnuity;
    }
    public WebElement getChangeAnnuityAgent(){
        return changeAnnuityAgent;
    }
    public WebElement getChangeAnnuityAgentZip(){
        return changeAnnuityAgentZip;
    }

    public void investmentButton(){
        clickOn(getInvestmentButton());
    }
    public void americanFunds(){
        clickOn(getAmericanFunds());
    }
    public void portfolioFunds(){
        clickOn(getPortfolioSeriesFunds());
    }
    public void targetData(){
        clickOn(getTargetDataFunds());
    }
    public void collegeSavings(){
        clickOn(getSavingsForCollege());
    }
    public void moreSavingPlan(){
        clickOn(getMoreAboutSavingPlan());
    }
    public void savingPlanningAccount(){
        clickOn(getAccessSavingPlanAccount());
    }
    public void stateFirmSavingPlan(){
        clickOn(getStateFarmSavingPlan());
    }
    public void pricesAndPerformance(){
        clickOn(getPricesAndPerformance());
    }
    public void taxes(WebDriver driver){
        scrollToView(getTaxes(), driver);
    }
    public void eligibility(){
        clickOn(getEligibility());
    }
    public void trust(){
        clickOn(getTrust());
    }
    public void irrevocableTrust(){
        clickOn(getIrrevocableTrust());
    }
    public void revocableLivingTrust(){
        clickOn(getRevocableLivingTrust());
    }
    public void jointAccount(){
        clickOn(getJointAccount());
    }
    public void jointAccountZip(String str){
        typeEnter(getJointAccountZip(), str);
    }
    public void mutualFund(){
        clickOn(getMutualFund());
    }
    public void lifeInsurance(){
        clickOn(getLifeInsurance());
    }
    public void quoteForLifeInsurance(String str){
        selectDropdownElement(getQuoteForLifeInsurance(), str);
    }
    public void quoteLifeInsurance(){
        clickOn(getQuoteLifeInsurance());
    }
    public void federalStateTax(){
        clickOn(getFederalStateTax());
    }
    public void estatePlanningTool(){
        clickOn(getEstatePlanningTool());
    }
    public void estateLifeInsurance(){
        clickOn(getEstateLifeInsurance());
    }
    public void annuity(){
        clickOn(getAnnuity());
    }
    public void guaranteedIncome(){
        clickOn(getGuaranteedIncome());
    }
    public void guaranteedIncomeZip(String str){
        typeEnter(getGuaranteedIncomeZip(), str);
    }
    public void theBasic(){
        clickOn(getTheBasic());
    }
    public void basicZip(String str){
        typeEnter(getBasicZip(), str);
    }
    public void policySeries(){
        clickOn(getPolicySeries());
    }
    public void guaranteedIncomeNow(){
        clickOn(getGuaranteedIncomeNow());
    }
    public void guaranteedIncomeSeries(){
        clickOn(getGuaranteedPolicySeries());
    }
    public void guaranteedZip(String str){
        typeEnter(getGuaranteedZip(), str);
    }
    public void guaranteedIncomeLater(){
        clickOn(getGuaranteedIncomeLater());
    }
    public void guaranteedIncomeLaterSeries(){
        clickOn(getGuaranteedIncomeLaterSeries());
    }
    public void guaranteedIncomeLaterZip(String str){
        typeEnter(getGuaranteedIncomeZip(), str);
    }
    public void futureIncomePlus(){
        clickOn(getFutureIncomePlus());
    }
    public void futureIncomePlusSeries(){
        clickOn(getFutureIncomePlusSeries());
    }
    public void futureIncomePlusZip(String str){
        typeEnter(getFutureIncomePlusZip(), str);
    }
    public void whyStateFarm(){
        clickOn(getWhyStateFarm());
    }
    public void whyStateFarmZip(String str){
        typeEnter(getWhyStateFarmZip(), str);

    }
    public void changeAnnuity(){
        clickOn(getChangeAnnuity());
    }
    public void changeAnnuityAgent(){
        clickOn(getChangeAnnuityAgent());
    }
    public void changeAnnuityAgentZip(String str){
        typeEnter(getChangeAnnuityAgentZip(), str);
    }

}
