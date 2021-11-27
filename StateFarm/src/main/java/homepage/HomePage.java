package homepage;

import base.CommonAPI;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy (id = "oneX-sf-logo")
    WebElement logo;

    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[1]/div/button/span")
    WebElement Insurance;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[1]/a")
    WebElement carInsurance;

    @FindBy(xpath = "//*[@id=\"quote-main-zip-code-input\"]")
    WebElement zipCode;

    @FindBy(id = "quote-main-zip-code-button-1")
    WebElement quote;

    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[2]/div/button/span")
    WebElement banking;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[1]/a")
    WebElement checking;

    @FindBy(xpath = "//*[@id=\"content\"]/section[2]/div/div/div/p[2]/span/a")
    WebElement compare;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[2]/a")
    WebElement motorcycle;

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement motoZip;

    @FindBy(xpath = "//*[@id=\"quote-main-zip-code-button1\"]")
    WebElement findAgent;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[3]/a")
    WebElement boat;

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement boatZip;

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement boatAgent;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[4]/a")
    WebElement offRoad;

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement offRoadZip;

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement offRoadAgent;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[5]/a")
    WebElement motorHome;

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement motorZip;

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement motorAgent;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[6]/a")
    WebElement roadside;

    @FindBy(xpath = "//*[@id=\"17-3152508\"]/div/div/div/div/div/div/a")
    WebElement assistance;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[2]/a")
    WebElement savings;

    @FindBy(xpath = "//*[@id=\"savings-masthead\"]/div/div/div/p[2]/span/a")
    WebElement compareSavings;

    @FindBy(css = "#thirdPartyLinkModal-continue")
    WebElement popupSavings;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[2]/li/a")
    WebElement homeLoan;

    @FindBy(css = "#start-request")
    WebElement startRequest;

    @FindBy(xpath = "//*[@id=\"thirdPartyLinkModal-continue\"]")
    WebElement popup;

    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[3]/div/button/span")
    WebElement investment;

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement homeZip;

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement homeAgent;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[3]/a")
    WebElement creditCard;

    @FindBy(xpath = "//*[@id=\"cc-masthead\"]/div/div/div[3]/p[2]/span/a")
    WebElement creditCardLearnMore;

    @FindBy(xpath = "//*[@id=\"thirdPartyLinkModal\"]/div/div[2]/div/div[2]/button")
    WebElement creditCardPopupCancel;

    @FindBy(xpath = "//*[@id=\"thirdPartyLinkModal-continue\"]")
    WebElement creditCardPopupContinue;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[4]/a")
    WebElement CDs;

    @FindBy(css = "#standard-section > div > div > div.-oneX-col-11.-oneX-col-sm-9.-oneX-col-md-6.-oneX-offset-xl-1 > p > span > a")
    WebElement standardCD;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[5]/a")
    WebElement retirementcds;

    @FindBy(xpath = "//*[@id=\"retire-section\"]/div/div/div[2]/p/span/a")
    WebElement lowRiskCD;

    @FindBy(xpath = "//*[@id=\"thirdPartyLinkModal2\"]/div/div[2]/div/div[2]/button")
    WebElement lowRiskCDCancel;

    @FindBy(xpath = "//*[@id=\"retireSpecial-section\"]/div/div/div[2]/p/span/a")
    WebElement retirementCDSpecial;

    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[3]/div/button/span")
    WebElement investmentButton;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[1]/a")
    WebElement retirementPlanning;

    @FindBy(xpath = "//*[@id=\"17-3079251\"]/div/div/div[2]/div[2]/ul/li/a")
    WebElement startPlanning;

    @FindBy(xpath = "//*[@id=\"17-3007869\"]/div/div/div[3]/div[2]/ul/li/a")
    WebElement emergencyPlanning;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[2]/a")
    WebElement traditionalIRA;

    @FindBy(xpath = "//*[@id=\"17-3059702\"]/div/div/div/div/div/div[2]/p[2]/a[1]")
    WebElement compareTraditional;

    @FindBy(xpath = "//*[@id=\"17-3059702\"]/div/div/div/div/div/div[2]/p[2]/a[2]")
    WebElement traditionalCalculator;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[3]/a")
    WebElement rothIRA;

    @FindBy(xpath = "//*[@id=\"17-3152499\"]/div/div/div/div/div/div[2]/p[2]/a")
    WebElement compareRoth;

    @FindBy(xpath = "//*[@id=\"17-3152499\"]/div/div/div/div/div/div[2]/p[3]/a")
    WebElement rothCalculator;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[4]/a")
    WebElement businessRetirement;

    @FindBy(xpath = "//*[@id=\"nav-tabContent-17-3109868-1\"]/div/p[3]/a")
    WebElement individual401k;

    @FindBy(xpath = "//*[@id=\"nav-tabContent-17-3109868-1\"]/div/p[5]/a")
    WebElement sepIRA;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[2]/section/ul/li[1]/a")
    WebElement typesOfAccount;

    @FindBy(xpath = "//*[@id=\"17-3010985\"]/div/div/div/div/p[1]/a[1]")
    WebElement rothAccount;

    @FindBy(xpath = "//*[@id=\"17-3010985\"]/div/div/div/div/p[1]/a[2]")
    WebElement accountTraditional;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[2]/section/ul/li[2]/a")
    WebElement selectingAFund;

    @FindBy(xpath = "//*[@id=\"17-3152506\"]/div/div/div/div/div/div[2]/p[2]/a")
    WebElement stateFarmAgent;

    @FindBy(css = "#locationText")
    WebElement agentSearching;

    @FindBy(css = "#search")
    WebElement agentSearch;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[2]/section/ul/li[3]/a")
    WebElement blackRockFund;

    @FindBy(css = "#nav-tab-17-3054547-2")
    WebElement targetData;

    @FindBy(css = "#nav-tab-17-3054547-3")
    WebElement specialFund;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[1]/a")
    WebElement retirement;

    @FindBy(xpath = "//*[@id=\"17-3079251\"]/div/div/div[2]/div[2]/ul/li/a")
    WebElement planning;

    @FindBy(xpath = "//*[@id=\"17-3007869\"]/div/div/div[2]/div[2]/p/a")
    WebElement retirementTool;

    public WebElement getLogo () {
        return logo;
    }
    public WebElement getInsurance(){
        return Insurance;
    }
    public WebElement getCarInsurance(){
        return carInsurance;
    }
    public WebElement getZipCode(){
        return zipCode;
    }
    public WebElement getQuote(){
        return quote;
    }
    public WebElement getBanking(){
        return  banking;
    }
    public WebElement getChecking(){
        return checking;
    }
    public WebElement getCompare(){
        return compare;
    }
    public WebElement getMotorcycle(){
        return motorcycle;
    }
    public WebElement getMotoZip(){
        return motoZip;
    }
    public WebElement getFindAgent(){
        return findAgent;
    }
    public WebElement getBoat(){
        return boat;
    }
    public WebElement getBoatZip(){
        return boatZip;
    }
    public WebElement getBoatAgent(){
        return boatAgent;
    }
    public WebElement getOffRoad(){
        return  offRoad;
    }
    public WebElement getOffRoadZip(){
        return offRoadZip;
    }
    public WebElement getOffRoadAgent(){
        return offRoadAgent;
    }
    public WebElement getMotorHome(){
        return motorHome;
    }
    public WebElement getMotorZip(){
        return motorZip;
    }
    public WebElement getMotorAgent(){
        return motorAgent;
    }
    public WebElement getRoadside(){
        return roadside;
    }
    public WebElement getAssistance(){
        return assistance;
    }
    public WebElement getSavings(){
        return savings;
    }
    public WebElement getCompareSavings(){
        return compareSavings;
    }
    public WebElement getPopupSavings(){
        return popupSavings;
    }
    public WebElement getHomeLoan(){
        return homeLoan;
    }
    public WebElement getStartRequest(){
        return startRequest;
    }
    public WebElement getPopup(){
        return popup;
    }
    public WebElement getInvestment(){
        return investment;
    }
    public WebElement getHomeZip(){
        return homeZip;
    }
    public WebElement getHomeAgent(){
        return homeAgent;
    }
    public WebElement getCreditCard(){
        return creditCard;
    }
    public WebElement getCreditCardLearnMore(){
        return creditCardLearnMore;
    }
    public WebElement getCreditCardPopupCancel(){
        return creditCardPopupCancel;
    }
    public WebElement getCreditCardPopupContinue(){
        return creditCardPopupContinue;
    }
    public WebElement getCDs(){
        return CDs;
    }
    public WebElement getStandardCD(){
        return standardCD;
    }
    public WebElement getRetirementcds(){
        return retirementcds;
    }
    public WebElement getLowRiskCD(){
        return lowRiskCD;
    }
    public WebElement getLowRiskCDCancel(){
        return lowRiskCDCancel;
    }
    public WebElement getInvestmentButton(){
        return investmentButton;
    }
    public WebElement getRetirementCDSpecial(){
        return retirementCDSpecial;
    }
    public WebElement getRetirementPlanning(){
        return retirementPlanning;
    }
    public WebElement getStartPlanning(){
        return startPlanning;
    }
    public WebElement getEmergencyPlanning(){
        return emergencyPlanning;
    }
    public WebElement getTraditionalIRA(){
        return traditionalIRA;
    }
    public WebElement getCompareTraditional(){
        return compareTraditional;
    }
    public WebElement getTraditionalCalculator(){
        return traditionalCalculator;
    }
    public WebElement getRothIRA(){
        return rothIRA;
    }
    public WebElement getCompareRoth(){
        return compareRoth;
    }
    public WebElement getRothCalculator(){
        return rothCalculator;
    }
    public WebElement getBusinessRetirement(){
        return businessRetirement;
    }
    public WebElement getIndividual401k(){
        return individual401k;
    }
    public WebElement getSepIRA(){
        return sepIRA;
    }
    public WebElement getTypesOfAccount(){
        return typesOfAccount;
    }
    public WebElement getRothAccount(){
        return rothAccount;
    }
    public WebElement getAccountTraditional(){
        return accountTraditional;
    }
    public WebElement getSelectingAFund(){
        return selectingAFund;
    }
    public WebElement getStateFarmAgent(){
        return stateFarmAgent;
    }
    public WebElement getAgentSearch(){
        return agentSearch;
    }
    public WebElement getBlackRockFund(){
        return blackRockFund;
    }
    public WebElement getTargetData(){
        return targetData;
    }
    public WebElement getSpecialFund(){
        return specialFund;
    }
    public WebElement getRetirement(){
        return retirement;
    }
    public WebElement getPlanning(){
        return planning;
    }

    public WebElement getRetirementTool(){
        return retirementTool;
    }
    public boolean isLogoDisplaed() {
        return getLogo().isDisplayed();
    }

    public void clickInsurance(){
        clickOn(getInsurance());
    }
    public void clickCarInsurance(){
        clickOn(getCarInsurance());
    }
   public void insuranceQuote(){
        clickOn(getZipCode());
   }
   public void motorcycle(){
        clickOn(getMotorcycle());
   }
    public void motoZip(String str){
        typeEnter(getMotoZip(), str);
    }
    public void motoAgent(){
        clickOn(getFindAgent());
    }
    public void boatInsurance(){
        clickOn(getBoat());
    }
    public void boatZip(String str){
        typeInto(getBoatZip(), str);
    }

    public void boatAgent(){
        clickOn(getBoatAgent());
    }

    public void offRoad(){
        clickOn(getOffRoad());
    }
    public void offRoadZip(String str){
        typeInto(getOffRoadZip(), str);
    }

    public void offRoadAgent(){
        clickOn(getOffRoadAgent());
    }

    public void motorHome(){
        clickOn(getMotorHome());
    }
    public void motorZip(String str){
        typeEnter(getMotorZip(), str);
    }
    public void motorAgent(){
        clickOn(getMotorAgent());
    }

    public void roadsideAssistance(){
        clickOn(getRoadside());
    }
    public void assistance(){
        clickOn(getAssistance());
    }
    public void startRequest(){
        clickOn(getStartRequest());
    }

    public void banking(){
        clickOn(getBanking());
    }
    public void checking(){
        clickOn(getChecking());
    }
    public void compare(){
        clickOn(getCompare());
    }
    public void checkingPopup(){
        clickOn(getPopup());
    }

    public void saving(){
        clickOn(getSavings());
    }
    public void compareSaving(){
        clickOn(getCompareSavings());
    }
    public void popupSaving(){
        clickOn(getPopup());
    }
    public void homeLoan(){
        clickOn(getHomeLoan());
    }
    public void homeZip(String str){
        typeEnter(getHomeZip(), str);
    }
    public void homeAgent(){
        clickOn(getHomeAgent());
    }
    public void creditCard(){
        clickOn(getCreditCard());
    }
    public void creditCardLearMore(){
        clickOn(getCreditCardLearnMore());
    }
    public void creditCardPopupCancel(){
        clickOn(getCreditCardPopupCancel());
    }
    public void creditCardPopupContinue(){
        clickOn(getCreditCardPopupContinue());
    }
    public void CDs(){
        clickOn(getCDs());
    }
    public void standardCd(){
        clickOn(getStandardCD());
    }
    public void retirementCD(){
        clickOn(getRetirementcds());
    }
    public void lowRiskCD(){
        clickOn(getLowRiskCD());
    }
    public void lowRiskCDCancel(){
        clickOn(getLowRiskCDCancel());
    }
    public void retirementCDSpecial(){
        clickOn(getRetirementCDSpecial());
    }
    public void investment(){
        clickOn(getInvestment());
    }
    public void retirementPlanning(){
        clickOn(getRetirement());
    }
    public void startPlanning(){
        clickOn(getPlanning());
    }
    public void retirementTool(){
        clickOn(getRetirementTool());
    }
    public void traditionalIRA(){
        clickOn(getTraditionalIRA());
    }
    public void compareTraditional(){
        clickOn(getCompareTraditional());
    }
    public void traditionalCalculator(){
        clickOn(getTraditionalCalculator());
    }
    public void rothIRA(){
        clickOn(getRothIRA());
    }
    public void compareRoth(){
        clickOn(getCompareRoth());
    }
    public void rothCalculator(){
        clickOn(getRothCalculator());
    }
    public void businessRetirement(){
        clickOn(getBusinessRetirement());
    }
    public void individual401k(){
        clickOn(getIndividual401k());
    }
    public void sepIRA(){
        clickOn(getSepIRA());
    }
    public void typesOfAccount(){
        clickOn(getTypesOfAccount());
    }
    public void rothAccount(){
        clickOn(getRothAccount());
    }
    public void traditionalAccount(){
        clickOn(getAccountTraditional());
    }
    public void selectingAFund(){
        clickOn(getSelectingAFund());
    }
    public void stateFarmAgent(){
        clickOn(getStateFarmAgent());
    }
    public void agentSearch(){
        clickOn(getAgentSearch());
    }
    public void blackRockFund(){
        clickOn(getBlackRockFund());
    }
    public void targetData(){
        clickOn(getTargetData());
    }
    public void specialFund(){
        clickOn(getSpecialFund());
    }



}
