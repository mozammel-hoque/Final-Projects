package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsuranceBill extends CommonAPI {
    @FindBy(xpath = "//span[text()='Pay a Bill']")
    WebElement payBill;

    @FindBy(xpath = "//*[@id=\"pay-a-bill-paymentSelect\"]")
    WebElement InsuranceBillDropdown;

    @FindBy(xpath = "//*[@id=\"pay-a-bill-policyNumber\"]")
    WebElement policyNumber;

    @FindBy(xpath = "//*[@id=\"pay-a-bill-policy-zip\"]")
    WebElement payInsuranceBillZip;

    public WebElement getPayBill(){
        return payBill;
    }
    public WebElement getInsuranceBillDropdown(){
        return InsuranceBillDropdown;
    }
    public WebElement getPolicyNumber(){
        return policyNumber;
    }
    public WebElement getPayInsuranceBillZip(){
        return payInsuranceBillZip;
    }
    public void payBill(){
        clickOn(getPayBill());
    }
    public void InsuranceBillDropdown(String str){
        selectDropdownElement(getInsuranceBillDropdown(), str);
    }
    public void policyNumber(String str){
        typeEnter(getPolicyNumber(), str);
    }
    public void payInsuranceBillZip(String str){
        typeEnter(getPayInsuranceBillZip(), str);
    }
}
