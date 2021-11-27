package test;

import base.CommonAPI;
import homepage.GetAQuote;
import homepage.Investment;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestGetAQuote extends CommonAPI {

    @Test
    public void quoteValidation() throws InterruptedException{
        GetAQuote quote = PageFactory.initElements(driver, GetAQuote.class);
        quote.quote();
        waitFor(1);
        quote.product("Life");
        waitFor(1);
        quote.quoteState("NY");
        waitFor(1);
        quote.startQuote();
        waitFor(1);
    }

}
