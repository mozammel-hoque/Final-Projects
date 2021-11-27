package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Investment extends CommonAPI {



    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[3]/div/button/span")
    WebElement investmentButton;

    @FindBy(xpath = "//*[@id=\"oneX-submenu-investments\"]/div/div/div[2]/section/ul/li[4]/a")
    WebElement AmericanFunds;

    public WebElement getInvestmentButton(){
        return investmentButton;
    }

    public WebElement getAmericanFunds(){
        return AmericanFunds;
    }







}
