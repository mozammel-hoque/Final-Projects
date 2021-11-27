package test;

import base.CommonAPI;
import homepage.GetAQuote;
import homepage.InsuranceBill;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestInsuranceBill extends CommonAPI {
    @Test
    public void payBillValidation() throws InterruptedException{
        InsuranceBill insuranceBill = PageFactory.initElements(driver, InsuranceBill.class);
        insuranceBill.payBill();
        waitFor(1);
        insuranceBill.InsuranceBillDropdown("Policy Number");
        waitFor(1);
        insuranceBill.policyNumber("000111");
        waitFor(1);
        insuranceBill.payInsuranceBillZip("11105");
        waitFor(1);
    }
}
