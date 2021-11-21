package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.logging.XMLFormatter;

public class HomePage extends CommonAPI {
    @FindBy (id = "oneX-sf-logo")
    WebElement logo;

    public WebElement getLogo () {
        return logo;
    }

    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[1]/div/button/span")
    WebElement Insurance;

    public WebElement getInsurance(){
        return Insurance;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[1]/a")
    WebElement carInsurance;

    public WebElement getCarInsurance(){
        return carInsurance;
    }

    @FindBy(xpath = "//*[@id=\"quote-main-zip-code-input-1\"]")
    WebElement zipCode;

    public WebElement getZipCode(){
        return zipCode;
    }

    @FindBy(id = "quote-main-zip-code-button-1")
    WebElement quote;

    public WebElement getQuote(){
        return quote;
    }

    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[2]/div/button/span")
    WebElement banking;

    public WebElement getBanking(){
        return  banking;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[1]/a")
    WebElement checking;

    public WebElement getChecking(){
        return checking;
    }

    @FindBy(xpath = "//*[@id=\"content\"]/section[2]/div/div/div/p[2]/span/a")
    WebElement compare;

    public WebElement getCompare(){
        return compare;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[2]/a")
    WebElement motorcycle;

    public WebElement getMotorcycle(){
        return motorcycle;
    }

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement motoZip;

    public WebElement getMotoZip(){
        return motoZip;
    }

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement findAgent;

    public WebElement getFindAgent(){
        return findAgent;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[3]/a")
    WebElement boat;

    public WebElement getBoat(){
        return boat;
    }

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement boatZip;

    public WebElement getBoatZip(){
        return boatZip;
    }

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement boatAgent;

    public WebElement getBoatAgent(){
        return boatAgent;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[4]/a")
    WebElement offRoad;

    public WebElement getOffRoad(){
        return  offRoad;
    }

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement offRoadZip;

    public WebElement getOffRoadZip(){
        return offRoadZip;
    }

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement offRoadAgent;

    public WebElement getOffRoadAgent(){
        return offRoadAgent;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[5]/a")
    WebElement motorHome;

    public WebElement getMotorHome(){
        return motorHome;
    }

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement motorZip;

    public WebElement getMotorZip(){
        return motorZip;
    }

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement motorAgent;

    public WebElement getMotorAgent(){
        return motorAgent;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-insurance\"]/div/div/div[1]/section/ul/li[6]/a")
    WebElement roadside;

    public WebElement getRoadside(){
        return roadside;
    }

    @FindBy(xpath = "//*[@id=\"17-3152508\"]/div/div/div/div/div/div/a")
    WebElement assistance;

    public WebElement getAssistance(){
        return assistance;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[2]/a")
    WebElement savings;

    public WebElement getSavings(){
        return savings;
    }

    @FindBy(xpath = "//*[@id=\"savings-masthead\"]/div/div/div/p[2]/span/a")
    WebElement compareSavings;

    public WebElement getCompareSavings(){
        return compareSavings;
    }

    @FindBy(css = "#thirdPartyLinkModal-continue")
    WebElement popupSavings;

    public WebElement getPopupSavings(){
        return popupSavings;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[2]/li/a")
    WebElement homeLoan;

    public WebElement getHomeLoan(){
        return homeLoan;
    }


    @FindBy(css = "#start-request")
    WebElement startRequest;

    public WebElement getStartRequest(){
        return startRequest;
    }

    @FindBy(xpath = "//*[@id=\"thirdPartyLinkModal-continue\"]")
    WebElement popup;

    public WebElement getPopup(){
        return popup;
    }

    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[3]/div/button/span")
    WebElement investment;

    public WebElement getInvestment(){
        return investment;
    }

    @FindBy(css = "#callout-agent-zip-code-input1")
    WebElement homeZip;

    public WebElement getHomeZip(){
        return homeZip;
    }

    @FindBy(css = "#quote-main-zip-code-button1")
    WebElement homeAgent;

    public WebElement getHomeAgent(){
        return homeAgent;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[3]/a")
    WebElement creditCard;

    public WebElement getCreditCard(){
        return creditCard;
    }

    @FindBy(xpath = "//*[@id=\"cc-masthead\"]/div/div/div[3]/p[2]/span/a")
    WebElement creditCardLearnMore;

    public WebElement getCreditCardLearnMore(){
        return creditCardLearnMore;
    }

    @FindBy(xpath = "//*[@id=\"thirdPartyLinkModal\"]/div/div[2]/div/div[2]/button")
    WebElement creditCardPopupCancel;

    public WebElement getCreditCardPopupCancel(){
        return creditCardPopupCancel;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[4]/a")
    WebElement CDs;

    public WebElement getCDs(){
        return CDs;
    }

    @FindBy(css = "#standard-section > div > div > div.-oneX-col-11.-oneX-col-sm-9.-oneX-col-md-6.-oneX-offset-xl-1 > p > span > a")
    WebElement standardCD;

    public WebElement getStandardCD(){
        return standardCD;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[5]/a")
    WebElement retirementcds;

    public WebElement getRetirementcds(){
        return retirementcds;
    }

    @FindBy(xpath = "//*[@id=\"retire-section\"]/div/div/div[2]/p/span/a")
    WebElement lowRiskCD;

    public WebElement getLowRiskCD(){
        return lowRiskCD;
    }

    @FindBy(xpath = "//*[@id=\"thirdPartyLinkModal2\"]/div/div[2]/div/div[2]/button")
    WebElement lowRiskCDCancel;

    public WebElement getLowRiskCDCancel(){
        return lowRiskCDCancel;
    }

    @FindBy(xpath = "//*[@id=\"retireSpecial-section\"]/div/div/div[2]/p/span/a")
    WebElement retirementCDSpecial;

    public WebElement getRetirementCDSpecial(){
        return retirementCDSpecial;
    }

    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[3]/div/button/span")
    WebElement investmentButton;

    public WebElement getInvestmentButton(){
        return investmentButton;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[1]/a")
    WebElement retirementPlanning;

    public WebElement getRetirementPlanning(){
        return retirementPlanning;
    }

    @FindBy(xpath = "//*[@id=\"17-3079251\"]/div/div/div[2]/div[2]/ul/li/a")
    WebElement startPlanning;

    public WebElement getStartPlanning(){
        return startPlanning;
    }
    
    @FindBy(xpath = "//*[@id=\"17-3007869\"]/div/div/div[3]/div[2]/ul/li/a")
    WebElement emergencyPlanning;

    public WebElement getEmergencyPlanning(){
        return emergencyPlanning;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[2]/a")
    WebElement traditionalIRA;

    public WebElement getTraditionalIRA(){
        return traditionalIRA;
    }

    @FindBy(xpath = "//*[@id=\"17-3059702\"]/div/div/div/div/div/div[2]/p[2]/a[1]")
    WebElement compareTraditional;

    public WebElement getCompareTraditional(){
        return compareTraditional;
    }

    @FindBy(xpath = "//*[@id=\"17-3059702\"]/div/div/div/div/div/div[2]/p[2]/a[2]")
    WebElement traditionalCalculator;

    public WebElement getTraditionalCalculator(){
        return traditionalCalculator;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[3]/a")
    WebElement rothIRA;

    public WebElement getRothIRA(){
        return rothIRA;
    }

    @FindBy(xpath = "//*[@id=\"17-3152499\"]/div/div/div/div/div/div[2]/p[2]/a")
    WebElement compareRoth;

    public WebElement getCompareRoth(){
        return compareRoth;
    }

    @FindBy(xpath = "//*[@id=\"17-3152499\"]/div/div/div/div/div/div[2]/p[3]/a")
    WebElement rothCalculator;

    public WebElement getRothCalculator(){
        return rothCalculator;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[4]/a")
    WebElement businessRetirement;

    public WebElement getBusinessRetirement(){
        return businessRetirement;
    }

    @FindBy(xpath = "//*[@id=\"nav-tabContent-17-3109868-1\"]/div/p[3]/a")
    WebElement individual401k;

    public WebElement getIndividual401k(){
        return individual401k;
    }

    @FindBy(xpath = "//*[@id=\"nav-tabContent-17-3109868-1\"]/div/p[5]/a")
    WebElement sepIRA;

    public WebElement getSepIRA(){
        return sepIRA;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[2]/section/ul/li[1]/a")
    WebElement typesOfAccount;

    public WebElement getTypesOfAccount(){
        return typesOfAccount;
    }

    @FindBy(xpath = "//*[@id=\"17-3010985\"]/div/div/div/div/p[1]/a[1]")
    WebElement rothAccount;

    public WebElement getRothAccount(){
        return rothAccount;
    }

    @FindBy(xpath = "//*[@id=\"17-3010985\"]/div/div/div/div/p[1]/a[2]")
    WebElement accountTraditional;

    public WebElement getAccountTraditional(){
        return accountTraditional;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[2]/section/ul/li[2]/a")
    WebElement selectingAFund;

    public WebElement getSelectingAFund(){
        return selectingAFund;
    }

    @FindBy(xpath = "//*[@id=\"17-3152506\"]/div/div/div/div/div/div[2]/p[2]/a")
    WebElement stateFarmAgent;

    public WebElement getStateFarmAgent(){
        return stateFarmAgent;
    }

    @FindBy(css = "#locationText")
    WebElement agentSearching;

    @FindBy(css = "#search")
    WebElement agentSearch;

    public WebElement getAgentSearch(){
        return agentSearch;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[2]/section/ul/li[3]/a")
    WebElement blackRockFund;

    public WebElement getBlackRockFund(){
        return blackRockFund;
    }

    @FindBy(css = "#nav-tab-17-3054547-2")
    WebElement targetData;

    public WebElement getTargetData(){
        return targetData;
    }

    @FindBy(css = "#nav-tab-17-3054547-3")
    WebElement specialFund;

    public WebElement getSpecialFund(){
        return specialFund;
    }

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[1]/section/ul/li[1]/a")
    WebElement retirement;

    public WebElement getRetirement(){
        return retirement;
    }

    @FindBy(xpath = "//*[@id=\"17-3079251\"]/div/div/div[2]/div[2]/ul/li/a")
    WebElement planning;

    public WebElement getPlanning(){
        return planning;
    }

    @FindBy(xpath = "//*[@id=\"17-3007869\"]/div/div/div[2]/div[2]/p/a")
    WebElement retirementTool;

    public WebElement getRetirementTool(){
        return retirementTool;
    }
    public boolean isLogoDisplaed() {
        return getLogo().isDisplayed();
    }

    public void clickInsurance(){
        clickOn(getInsurance());
    }




}
