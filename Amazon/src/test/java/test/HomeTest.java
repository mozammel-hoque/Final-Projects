package test;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class HomeTest extends CommonAPI {

    @Test
    public void test1() throws InterruptedException {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.", title);
        Thread.sleep(4000);
    }
    @Test
    public void test2() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.isLogoDisplayed());
        Thread.sleep(4000);
    }
    @Test
    public void test3()  {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchItem("Gloves");
        homePage.ClickOnItem();
        homePage.SelectColorOfItem();
        homePage.ClickOnAddToCardButton();
    }
    @Test
    public void test4() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchItem("The Flash Comic");
        homePage.ClickOnTheFirstFlashComic();
    }
    @Test
    public void test5() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        List<String> itemToSearch = new ArrayList<>();
        itemToSearch.add("Laptop");
        itemToSearch.add("PS5");
        itemToSearch.add("Adidas nmd");
        itemToSearch.add("Hoodie");
        itemToSearch.add("ICE Water");

        for (String item: itemToSearch) {
            homePage.searchItem(item);
            homePage.clearSearchField();
        }
    }
    @Test
    public void test6() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        for (String option: homePage.getDropdownOptions()){
            System.out.println(option);
        }
    }
    @Test
    public void test7() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.selectDropdownElement("Audible Books & Originals");
    }
    @Test
    public void test8() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.selectDropdownElement("Alexa Skills");
    }
    @Test
    public void test9() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnAudibleOptionAtFooter();
        waitFor(2);
    }
    @Test
    public void test10() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnCartButton();
        homePage.ClickOnLearnMoreButton();
    }
    @Test
    public void test11() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnSignInButton();
        homePage.EnterUserEmail("mohammedullah27@yahoo.com");
        homePage.EnterUserPassword("Jackbox223");
    }
    @Test
    public void test12() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnAllMenuButton();
        homePage.ClickOnPrimeVideo();
        homePage.ClickOnRentOrBuy();
    }
    @Test
    public void test13() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnBestSellersButton();
        homePage.SelectBestSellerInClothing();
        homePage.SelectColorOfClothing();
    }
    @Test
    public void test14() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnAmazonBasicsButton();
    }
    @Test
    public void test15() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnCustomerServiceButton();
        homePage.ClickOnYourAccount();
        waitFor(2);
    }
    @Test
    public void test16() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnEarlyBlackFridayDeals();
        homePage.ClickOnTopBrands();
        waitFor(2);
    }
    @Test
    public void test17() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnNewReleasesButton();
        homePage.ClickOnMoversAndShakersTab();
        waitFor(2);
    }
    @Test
    public void test18() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnBooksButton();
        homePage.ClickOnTextBooksTab();
        waitFor(2);
    }
    @Test
    public void test19() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnRegistryButton();
        homePage.ClickOnWeddingRegistryButton();
        waitFor(2);
    }
    @Test
    public void test20() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnPharmacyButton();
        homePage.ClickOnShopAllTab();
        waitFor(2);
    }
    @Test
    public void test21() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ScrollToAccessibilitySection(driver);
        homePage.ClickOnCareersOptionInAccessibilitySection();
        waitFor(2);
    }
    @Test
    public void test22() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.HoverOverUSFlag(driver);
        homePage.ClickOnLearnMoreOption();
    }
    @Test
    public void test23() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.HoverOverUSFlag(driver);
        homePage.ClickOnChangeCountryOption();
        waitFor(2);
    }
    @Test
    public void test24() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnShopButton();
        homePage.ClickOnYourListTab();
        waitFor(2);
    }
    @Test
    public void test25() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnPrimeButton();
        homePage.ClickOnExploreOtherPlans();
        waitFor(2);
    }
    @Test
    public void test26() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnSelectAddressButton();
        homePage.TypeInZipcode("11218");
        homePage.ClickOnApplyButton();
        waitFor(2);
        homePage.ClickOnDoneButton();
    }
    @Test
    public void test27() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ScrollToAccessibilitySection(driver);
        waitFor(2);
        homePage.ClickOnGoBackToTopButton();
    }
    @Test
    public void test28() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ScrollToAccessibilitySection(driver);
        homePage.ClickOnBecomeAnAmazonAffiliateOption();
        homePage.ClickOnSignUpButton();
    }
    @Test
    public void test29() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ScrollToAccessibilitySection(driver);
        homePage.ClickOnShopWithPointsOption();
        homePage.SelectPrePaidCardsTab();
    }
    @Test
    public void test30() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ScrollToAccessibilitySection(driver);
        homePage.ClickOnAmazonCovid19Option();
    }
    @Test
    public void test31() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ScrollToAccessibilitySection(driver);
        homePage.ClickOnShipRatesAndPolicies();
    }
    @Test
    public void test32() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnAmazonAdvertising();
        homePage.SelectColleenAubreyLink();
        waitFor(2);
    }
    @Test
    public void test33() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnGoodReads();
        homePage.ClickOnContinueWithAmazonButton();
    }
    @Test
    public void test34() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnAmazonWarehouse();
        homePage.SelectDigitalDealsTab();
    }
    @Test
    public void test35() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnAmazonBusiness();
    }
    @Test
    public void test36() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnImdbLink();
    }
    @Test
    public void test37() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnWholeFoodsLink();
    }
    @Test
    public void test38() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnAmazonDrive();
    }
    @Test
    public void test39() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnAmazonFresh();
        homePage.SelectDealsTab();
    }
    @Test
    public void test40() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnWootLink();
    }
    @Test
    public void test41() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnAmazonSubscriptionBoxes();
        homePage.DropdownFoodAndDrinkTab(driver);
    }
    @Test
    public void test42() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnAmazonGlobal();
    }
    @Test
    public void test43() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnZapposLink();
    }
    @Test
    public void test44() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnPillPackLink();
    }
    @Test
    public void test45() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnComiXologyLink();
    }
    @Test
    public void test46() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnDPReviewLink();
    }
    @Test
    public void test47() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnRingLink();
    }
    @Test
    public void test48() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnEastDaneLink();
    }
    @Test
    public void test49() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnEeroWifiLink();
    }
    @Test
    public void test50() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToFooter(driver);
        homePage.ClickOnAmazonIgnite();
        homePage.ClickOnHelpButton();
        waitFor(2);
    }
}
