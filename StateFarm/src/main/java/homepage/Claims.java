package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Claims extends CommonAPI{
    @FindBy(xpath = "//span[text()='Claims']")
    WebElement claims;

    @FindBy(xpath = "//a[text()=' File a Claim ']")
    WebElement fileAClaim;

    @FindBy(xpath = "//*[@id=\"accordion1\"]/div[3]/button/label")
    WebElement auto;

    @FindBy(xpath = "//*[@id=\"glass\"]/div/div/div/div/a")
    WebElement startClaim;

    @FindBy(xpath = "//a[text()=' Track a Claim ']")
    WebElement trackClaim;

    @FindBy(xpath = "//*[@id=\"policyholder\"]/div/div/div[2]/div/div/a[1]")
    WebElement logIN;

    public WebElement getClaims(){
        return claims;
    }
    public WebElement getFileAClaim(){
        return fileAClaim;
    }
    public WebElement getAuto(){
        return auto;
    }
    public WebElement getStartClaim(){
        return startClaim;
    }
    public WebElement getTrackClaim(){
        return trackClaim;
    }
    public WebElement getLogIN(){
        return logIN;
    }
    public void claim(){
        clickOn(getClaims());
    }
    public void fileAClaim(){
        clickOn(getFileAClaim());
    }
    public void auto(){
        clickOn(getAuto());
    }
    public void startClaim(){
        clickOn(getStartClaim());
    }
    public void trackClaim(){
        clickOn(getTrackClaim());
    }
    public void logIN(){
        clickOn(getLogIN());
    }
}
