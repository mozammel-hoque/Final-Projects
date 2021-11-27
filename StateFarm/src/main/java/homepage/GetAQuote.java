package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetAQuote extends CommonAPI {
    @FindBy(xpath = "//span[text()='Get a Quote']")
    WebElement getAQuote;

    @FindBy(xpath = "//*[@id=\"getaquote-select-product\"]")
    WebElement product;

    @FindBy(xpath = "//*[@id=\"getaquote-state-select\"]")
    WebElement quoteState;

    @FindBy(xpath = "//*[@id=\"getaQuoteButton\"]")
    WebElement startQuote;

    public WebElement getGetAQuote(){
        return getAQuote;
    }
    public WebElement getProduct(){
        return product;
    }
    public WebElement getQuoteState(){
        return quoteState;
    }
    public WebElement getStartQuote(){
        return startQuote;
    }
    public void quote(){
        clickOn(getAQuote);
    }
    public void product(String str){
        selectDropdownElement(getProduct(), str);
    }
    public void quoteState(String str){
        selectDropdownElement(getQuoteState(), str);
    }
    public void startQuote(){
        clickOn(getStartQuote());
    }

}
