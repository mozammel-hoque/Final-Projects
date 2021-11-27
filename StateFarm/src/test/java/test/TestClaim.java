package test;

import base.CommonAPI;
import homepage.Claims;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestClaim extends CommonAPI{

    @Test
    public void claimValidation() throws InterruptedException{
        Claims claims = PageFactory.initElements(driver, Claims.class);
        claims.claim();
        waitFor(1);
        claims.fileAClaim();
        waitFor(1);
        claims.auto();
        waitFor(1);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        waitFor(1);
        claims.startClaim();
        waitFor(1);
    }
    @Test
    public void trackClaimValidation() throws InterruptedException{
        Claims claims = PageFactory.initElements(driver, Claims.class);
        claims.claim();
        waitFor(1);
        claims.trackClaim();
        waitFor(1);
        claims.logIN();
        waitFor(1);
    }

}
