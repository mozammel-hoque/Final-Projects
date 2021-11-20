package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy (id = "nav-logo-sprites")
    WebElement test2;
    @FindBy (id = "twotabsearchtextbox")
    WebElement searchItem;
    @FindBy (xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/span/a/div/img")
    WebElement clickOnItem;
    @FindBy (xpath = "//*[@id=\"a-autoid-10-announce\"]/div/div[1]/img")
    WebElement selectColorOfItem;
    @FindBy (id = "add-to-cart-button")
    WebElement clickAddToCartButton;
    @FindBy (xpath = "//*[@id=\"searchDropdownBox\"]")
    List<WebElement> test6;
    @FindBy (xpath = "//*[@id=\"searchDropdownBox\"]")
    WebElement test7;
    @FindBy (xpath = "//*[@id=\"searchDropdownBox\"]")
    WebElement test8;
    @FindBy (id = "navFooter")
    WebElement test9;
    @FindBy (id = "nav-cart")
    WebElement test10;
    @FindBy (id = "a-autoid-0-announce")
    WebElement clickOnLearnMoreButton;
    @FindBy (id = "nav-link-accountList-nav-line-1")
    WebElement test11;
    @FindBy (id = "ap_email")
    WebElement enterUserEmail;
    @FindBy (id = "ap_password")
    WebElement enterUserPassword;
    @FindBy (id = "nav-item-signout")
    WebElement clickOnSignOutButton;
    @FindBy (id = "nav-hamburger-menu")
    WebElement clickOnAllMenuButton;
    @FindBy (xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")
    WebElement clickOnPrimeVideo;
    @FindBy (xpath = "//*[@id=\"hmenu-content\"]/ul[2]/li[6]/a")
    WebElement clickOnRentOrBuy;
    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement clickOnBestSellersButton;
    @FindBy (xpath = "//*[@id=\"anonCarousel2\"]/ol/li[1]/div[2]/div/a[1]/div/img")
    WebElement selectBestSellerInClothing;
    @FindBy (xpath = "//img[@src='https://m.media-amazon.com/images/I/31-5w+JEr-L._SX38_SY50_CR,0,0,38,50_.jpg']")
    WebElement selectColorOfClothing;
    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[2]")
    WebElement clickOnAmazonBasicsButton;
    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[3]")
    WebElement clickOnCustomerServiceButton;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div[4]/div/div[1]/div[3]/div[1]/a/div/div/div/div[2]/ul/li/span")
    WebElement clickOnYourAccount;
    @FindBy (xpath = "//*[@id=\"nav-xshop\"]/a[5]")
    WebElement clickOnEarlyBlackFridayDeals;
    @FindBy (xpath = "//img[@src='https://m.media-amazon.com/images/G/01/US-hq/2021/img/Events/Holiday/BFCM/LandingPage/BFCM21_category-bubble_sobe_320x320_TopBrands_SB.png']")
    WebElement clickOnTopBrands;
    @FindBy (xpath = "//a[@href='/gp/new-releases/?ref_=nav_cs_newreleases_cc44487baebb4b838886572fa6d70c76']")
    WebElement clickOnNewReleasesButton;
    @FindBy (xpath = "//a[@href='/gp/movers-and-shakers/ref=zg_bsnr_tab']")
    WebElement clickOnMoversAndShakersTab;
    @FindBy (xpath = "//a[@href='/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books_2ed85a0fb54a4598ba909c22690d166e']")
    WebElement clickOnBooksButton;
    @FindBy (xpath = "//a[@href='/New-Used-Textbooks-Books/b/?ie=UTF8&node=465600&ref_=sv_b_5']")
    WebElement clickOnTextbooksTab;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=16115931011&ref_=nav_cs_registry_93b1f2f95895470fabc376fd50b3cce8']")
    WebElement clickOnRegistryButton;
    @FindBy (xpath = "//a[@href='/wedding?ref_=registries_subnav']")
    WebElement clickOnWeddingRegistryTab;
    @FindBy (xpath = "//a[@href='https://pharmacy.amazon.com/?ref_=nav_cs_pharmacy_641fc8228c0a4254ba0c834bf1a0429c']")
    WebElement clickOnPharmacyButton;
    @FindBy (xpath = "//a[@href='https://www.amazon.com/s?i=amazon-pharmacy&s=price-asc-rank']")
    WebElement clickOnShopAllTab;
    @FindBy (xpath = "//*[@href='https://www.audible.com']")
    WebElement clickOnAudibleOptionAtFooter;
    @FindBy (xpath = "//*[@class='navFooterVerticalColumn navAccessibility']")
    WebElement scrollToAccessibilitySection;
    @FindBy (xpath = "//a[@href='https://www.amazon.jobs']")
    WebElement clickOnCareersOptionInAccessibilitySection;
    @FindBy (xpath = "//img[@src='https://m.media-amazon.com/images/I/91tVDADj+dL._AC_UL320_.jpg']")
    WebElement clickOnTheFirstFlashComic;
    @FindBy (xpath = "//*[@class='icp-nav-flag icp-nav-flag-us']")
    WebElement hoverOverUSFlag;
    @FindBy (xpath = "//*[@class='icp-helplink']")
    WebElement clickOnLearnMoreOption;
    @FindBy (xpath = "//*[@class='icp-mkt-change-lnk']")
    WebElement clickOnChangeCountryOption;
    @FindBy (id = "swm-link")
    WebElement clickOnShopButton;
    @FindBy (xpath = "//a[@href='/hz/wishlist/ls/?_encoding=UTF8&ref_=sv_cm_gft_1']")
    WebElement clickOnYourListTab;
    @FindBy (id = "nav-link-prime")
    WebElement clickOnPrimeButton;
    @FindBy (xpath = "//a[@href='#PricingModuleAnchor']")
    WebElement clickOnExploreOtherPlans;
    @FindBy (id = "glow-ingress-block")
    WebElement clickOnSelectAddressButton;
    @FindBy (id = "GLUXZipUpdateInput")
    WebElement typeInZipcode;
    @FindBy (id = "GLUXZipUpdate")
    WebElement clickOnApplyButton;
    @FindBy (xpath = "//*[@id=\"a-popover-1\"]/div/div[2]/span/span/span/button")
    WebElement clickOnDoneButton;
    @FindBy (xpath = "//*[@class='navFooterBackToTopText']")
    WebElement clickOnGoBackToTopButton;
    @FindBy (xpath = "//a[@href='https://affiliate-program.amazon.com/']")
    WebElement clickOnBecomeAnAmazonAffiliateOption;
    @FindBy (id = "a-autoid-0-announce")
    WebElement clickOnSignUpButton;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=16218619011&ref_=footer_swp']")
    WebElement clickOnShopWithPointsOption;
    @FindBy (xpath = "//a[@href='/prepaid-payment-cards/b/?ie=UTF8&node=5652908011&ref_=sv_fp_5']")
    WebElement selectPrePaidCardsTab;
    @FindBy (xpath = "//a[@href='/gp/help/customer/display.html?nodeId=GDFU3JS5AL6SYHRD&ref_=footer_covid']")
    WebElement clickOnAmazonCovid19Option;
    @FindBy (xpath = "//a[@href='/gp/help/customer/display.html?nodeId=468520&ref_=footer_shiprates']")
    WebElement clickOnShipRatesAndPolicies;
    @FindBy (xpath = "//a[@href='https://advertising.amazon.com/?ref=footer_advtsing_amzn_com']")
    WebElement clickOnAmazonAdvertising;
    @FindBy (xpath = "//a[@href='https://advertising.amazon.com/blog/brand-measurement?ref_=a20m_us_gw_evnts_msrmnt']")
    WebElement selectColleenAubreyLink;
    @FindBy (xpath = "//a[@href='https://www.goodreads.com']")
    WebElement clickOnGoodReads;
    @FindBy (xpath = "//a[@href='https://www.goodreads.com/amazon/login/redirect_to_amazon_login_url?inpopup=false']")
    WebElement clickOnContinueWithAmazonButton;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=10158976011&ref_=footer_wrhsdls']")
    WebElement clickOnAmazonWarehouse;
    @FindBy (xpath = "//a[@href='/b/?ie=UTF8&node=3059207011&ref_=sv_gb_5']")
    WebElement selectDigitalDealsTab;
    @FindBy (xpath = "//a[@href='/business?ref_=footer_retail_b2b']")
    WebElement clickOnAmazonBusiness;
    @FindBy (xpath = "//a[@href='https://www.imdb.com']")
    WebElement clickOnImdbLink;
    @FindBy (xpath = "//a[@href='https://www.wholefoodsmarket.com']")
    WebElement clickOnWholeFoodsLink;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=15547130011&ref_=_us_footer_drive']")
    WebElement clickOnAmazonDrive;
    @FindBy (xpath = "//a[@href='/alm/storefront?almBrandId=QW1hem9uIEZyZXNo&ref_=footer_aff_fresh']")
    WebElement clickOnAmazonFresh;
    @FindBy (xpath = "//a[@href='/fmc/deals?almBrandId=QW1hem9uIEZyZXNo&ref=uf_dsk_sn_lnk_3_FD']")
    WebElement selectDealsTab;
    @FindBy (xpath = "//a[@href='https://www.woot.com/']")
    WebElement clickOnWootLink;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=14498690011&ref_=amzn_nav_ftr_swa']")
    WebElement clickOnAmazonSubscriptionBoxes;
    @FindBy (xpath = "//a[@href='/tea-coffee-snacks-candy-subscription-boxes/b/?ie=UTF8&node=17795802011&ref_=sv_subscribe-with-amazon_2']")
    WebElement dropdownFoodAndDrinkTab;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=230659011&ref_=footer_amazonglobal']")
    WebElement clickOnAmazonGlobal;
    @FindBy (xpath = "//a[@href='https://www.zappos.com']")
    WebElement clickOnZapposLink;
    @FindBy (xpath = "//a[@href='https://www.pillpack.com']")
    WebElement clickOnPillPackLink;
    @FindBy (xpath = "//a[@href='https://www.comixology.com']")
    WebElement clickOnComiXologyLink;
    @FindBy (xpath = "//a[@href='https://www.dpreview.com']")
    WebElement clickOnDPReviewLink;
    @FindBy (xpath = "//a[@href='https://ring.com']")
    WebElement clickOnRingLink;
    @FindBy (xpath = "//a[@href='https://www.eastdane.com/welcome']")
    WebElement clickOnEastDaneLink;
    @FindBy (xpath = "//a[@href='https://eero.com/']")
    WebElement clickOnEeroWifiLink;
    @FindBy (xpath = "//a[@href='https://ignite.amazon.com/?ref=amazon_footer_ignite']")
    WebElement clickOnAmazonIgnite;
    @FindBy (xpath = "//a[@href='#/help']")
    WebElement clickOnHelpButton;

    public WebElement getTest2() {
        return test2;
    }

    public WebElement getSearchItem() {
        return searchItem;
    }

    public WebElement getClickOnItem() {
        return clickOnItem;
    }

    public WebElement getSelectColorOfItem() {
        return selectColorOfItem;
    }

    public WebElement getClickAddToCartButton() {
        return clickAddToCartButton;
    }

    public List<WebElement> getTest6() {
        return test6;
    }

    public WebElement getTest7() {
        return test7;
    }

    public WebElement getTest8() {
        return test8;
    }

    public WebElement getTest9() {
        return test9;
    }

    public WebElement getTest10() {
        return test10;
    }

    public WebElement getClickOnLearnMoreButton() {
        return clickOnLearnMoreButton;
    }

    public WebElement getTest11() {
        return test11;
    }

    public WebElement getEnterUserEmail() {
        return enterUserEmail;
    }

    public WebElement getEnterUserPassword() {
        return enterUserPassword;
    }

    public WebElement getClickOnAllMenuButton() {
        return clickOnAllMenuButton;
    }

    public WebElement getClickOnPrimeVideo() {
        return clickOnPrimeVideo;
    }

    public WebElement getClickOnRentOrBuy() {
        return clickOnRentOrBuy;
    }

    public WebElement getClickOnBestSellersButton() {
        return clickOnBestSellersButton;
    }

    public WebElement getSelectBestSellerInClothing() {
        return selectBestSellerInClothing;
    }

    public WebElement getSelectColorOfClothing() {
        return selectColorOfClothing;
    }

    public WebElement getClickOnAmazonBasicsButton() {
        return clickOnAmazonBasicsButton;
    }

    public WebElement getClickOnCustomerServiceButton() {
        return clickOnCustomerServiceButton;
    }

    public WebElement getClickOnYourAccount() {
        return clickOnYourAccount;
    }

    public WebElement getClickOnEarlyBlackFridayDeals() {
        return clickOnEarlyBlackFridayDeals;
    }

    public WebElement getClickOnTopBrands() {
        return clickOnTopBrands;
    }

    public WebElement getClickOnNewReleasesButton() {
        return clickOnNewReleasesButton;
    }

    public WebElement getClickOnMoversAndShakersTab() {
        return clickOnMoversAndShakersTab;
    }

    public WebElement getClickOnBooksButton() {
        return clickOnBooksButton;
    }

    public WebElement getClickOnTextbooksTab() {
        return clickOnTextbooksTab;
    }

    public WebElement getClickOnRegistryButton() {
        return clickOnRegistryButton;
    }

    public WebElement getClickOnWeddingRegistryTab() {
        return clickOnWeddingRegistryTab;
    }

    public WebElement getClickOnPharmacyButton() {
        return clickOnPharmacyButton;
    }

    public WebElement getClickOnShopAllTab() {
        return clickOnShopAllTab;
    }

    public WebElement getClickOnAudibleOptionAtFooter() {
        return clickOnAudibleOptionAtFooter;
    }

    public WebElement getScrollToAccessibilitySection() {
        return scrollToAccessibilitySection;
    }

    public WebElement getClickOnCareersOptionInAccessibilitySection() {
        return clickOnCareersOptionInAccessibilitySection;
    }

    public WebElement getClickOnTheFirstFlashComic() {
        return clickOnTheFirstFlashComic;
    }

    public WebElement getHoverOverUSFlag() {
        return hoverOverUSFlag;
    }

    public WebElement getClickOnLearnMoreOption() {
        return clickOnLearnMoreOption;
    }

    public WebElement getClickOnChangeCountryOption() {
        return clickOnChangeCountryOption;
    }

    public WebElement getClickOnShopButton() {
        return clickOnShopButton;
    }

    public WebElement getClickOnYourListTab() {
        return clickOnYourListTab;
    }

    public WebElement getClickOnPrimeButton() {
        return clickOnPrimeButton;
    }

    public WebElement getClickOnExploreOtherPlans() {
        return clickOnExploreOtherPlans;
    }

    public WebElement getClickOnSelectAddressButton() {
        return clickOnSelectAddressButton;
    }

    public WebElement getTypeInZipcode() {
        return typeInZipcode;
    }

    public WebElement getClickOnApplyButton() {
        return clickOnApplyButton;
    }

    public WebElement getClickOnDoneButton() {
        return clickOnDoneButton;
    }

    public WebElement getClickOnGoBackToTopButton() {
        return clickOnGoBackToTopButton;
    }

    public WebElement getClickOnBecomeAnAmazonAffiliateOption() {
        return clickOnBecomeAnAmazonAffiliateOption;
    }

    public WebElement getClickOnSignUpButton() {
        return clickOnSignUpButton;
    }

    public WebElement getClickOnShopWithPointsOption() {
        return clickOnShopWithPointsOption;
    }

    public WebElement getSelectPrePaidCardsTab() {
        return selectPrePaidCardsTab;
    }

    public WebElement getClickOnAmazonCovid19Option() {
        return clickOnAmazonCovid19Option;
    }

    public WebElement getClickOnShipRatesAndPolicies() {
        return clickOnShipRatesAndPolicies;
    }

    public WebElement getClickOnAmazonAdvertising() {
        return clickOnAmazonAdvertising;
    }

    public WebElement getSelectColleenAubreyLink() {
        return selectColleenAubreyLink;
    }

    public WebElement getClickOnGoodReads() {
        return clickOnGoodReads;
    }

    public WebElement getClickOnContinueWithAmazonButton() {
        return clickOnContinueWithAmazonButton;
    }

    public WebElement getClickOnAmazonWarehouse() {
        return clickOnAmazonWarehouse;
    }

    public WebElement getSelectDigitalDealsTab() {
        return selectDigitalDealsTab;
    }

    public WebElement getClickOnAmazonBusiness() {
        return clickOnAmazonBusiness;
    }

    public WebElement getClickOnImdbLink() {
        return clickOnImdbLink;
    }

    public WebElement getClickOnWholeFoodsLink() {
        return clickOnWholeFoodsLink;
    }

    public WebElement getClickOnAmazonDrive() {
        return clickOnAmazonDrive;
    }

    public WebElement getClickOnAmazonFresh() {
        return clickOnAmazonFresh;
    }

    public WebElement getSelectDealsTab() {
        return selectDealsTab;
    }

    public WebElement getClickOnWootLink() {
        return clickOnWootLink;
    }

    public WebElement getClickOnAmazonSubscriptionBoxes() {
        return clickOnAmazonSubscriptionBoxes;
    }

    public WebElement getDropdownFoodAndDrinkTab() {
        return dropdownFoodAndDrinkTab;
    }

    public WebElement getClickOnAmazonGlobal() {
        return clickOnAmazonGlobal;
    }

    public WebElement getClickOnZapposLink() {
        return clickOnZapposLink;
    }

    public WebElement getClickOnPillPackLink() {
        return clickOnPillPackLink;
    }

    public WebElement getClickOnComiXologyLink() {
        return clickOnComiXologyLink;
    }

    public WebElement getClickOnDPReviewLink() {
        return clickOnDPReviewLink;
    }

    public WebElement getClickOnRingLink() {
        return clickOnRingLink;
    }

    public WebElement getClickOnEastDaneLink() {
        return clickOnEastDaneLink;
    }

    public WebElement getClickOnEeroWifiLink() {
        return clickOnEeroWifiLink;
    }

    public WebElement getClickOnAmazonIgnite() {
        return clickOnAmazonIgnite;
    }

    public WebElement getClickOnHelpButton() {
        return clickOnHelpButton;
    }

    public boolean isLogoDisplayed() {
        return getTest2().isDisplayed();
    }

    public void searchItem(String str) {
        typeEnter(getSearchItem(), str);
    }

    public void ClickOnItem() {
        clickOn(getClickOnItem());
    }

    public void SelectColorOfItem() {
        clickOn(getSelectColorOfItem());
    }

    public void ClickOnAddToCardButton() {
        clickOn(getClickAddToCartButton());
    }

    public void selectDropdownElement(String str){
        selectDropdownElement(getTest7(), str);
    }

    public List<String> getDropdownOptions() {
        List<String> list = new ArrayList<>();
        List<WebElement> elements = getTest6();
        for (WebElement element : elements) {
            list.add(element.getText());
        }
        return list;
    }

    public void clearSearchField() {
        clearTextField(getSearchItem());
    }

    public void scrollToFooter(WebDriver driver) {
        scrollToView(getTest9(), driver);
    }

    public void ClickOnCartButton() {
        clickOn(getTest10());
    }

    public void ClickOnLearnMoreButton() {
        clickOn(getClickOnLearnMoreButton());
    }

    public void ClickOnSignInButton() {
        clickOn(getTest11());
    }

    public void EnterUserEmail(String str) {
        typeEnter(getEnterUserEmail(), str);
    }

    public void EnterUserPassword(String str) {
        typeEnter(getEnterUserPassword(), str);
    }

    public void ClickOnAllMenuButton() {
        clickOn(getClickOnAllMenuButton());
    }

    public void ClickOnPrimeVideo() {
        clickOn(getClickOnPrimeVideo());
    }

    public void ClickOnRentOrBuy() {
        clickOn(getClickOnRentOrBuy());
    }

    public void ClickOnBestSellersButton() {
        clickOn(getClickOnBestSellersButton());
    }

    public void SelectBestSellerInClothing() {
        clickOn(getSelectBestSellerInClothing());
    }

    public void SelectColorOfClothing() {
        clickOn(getSelectColorOfClothing());
    }

    public void ClickOnAmazonBasicsButton() {
        clickOn(getClickOnAmazonBasicsButton());
    }

    public void ClickOnCustomerServiceButton() {
        clickOn(getClickOnCustomerServiceButton());
    }

    public void ClickOnYourAccount() {
        clickOn(getClickOnYourAccount());
    }

    public void ClickOnEarlyBlackFridayDeals() {
        clickOn(getClickOnEarlyBlackFridayDeals());
    }

    public void ClickOnTopBrands() {
        clickOn(getClickOnTopBrands());
    }

    public void ClickOnNewReleasesButton() {
        clickOn(getClickOnNewReleasesButton());
    }

    public void ClickOnMoversAndShakersTab() {
        clickOn(getClickOnMoversAndShakersTab());
    }

    public void ClickOnBooksButton() {
        clickOn(getClickOnBooksButton());
    }

    public void ClickOnTextBooksTab() {
        clickOn(getClickOnTextbooksTab());
    }

    public void ClickOnRegistryButton() {
        clickOn(getClickOnRegistryButton());
    }

    public void ClickOnWeddingRegistryButton() {
        clickOn(getClickOnWeddingRegistryTab());
    }

    public void ClickOnPharmacyButton() {
        clickOn(getClickOnPharmacyButton());
    }

    public void ClickOnShopAllTab() {
        clickOn(getClickOnShopAllTab());
    }

    public void ClickOnAudibleOptionAtFooter() {
        clickOn(getClickOnAudibleOptionAtFooter());
    }

    public void ScrollToAccessibilitySection(WebDriver driver) {
        scrollToView(getScrollToAccessibilitySection(), driver);
    }

    public void ClickOnCareersOptionInAccessibilitySection() {
        clickOn(getClickOnCareersOptionInAccessibilitySection());
    }

    public void ClickOnTheFirstFlashComic() {
        clickOn(getClickOnTheFirstFlashComic());
    }

    public void HoverOverUSFlag(WebDriver driver) {
        hoverOver(driver, getHoverOverUSFlag());
    }

    public void ClickOnLearnMoreOption() {
        clickOn(getClickOnLearnMoreOption());
    }

    public void ClickOnChangeCountryOption() {
        clickOn(getClickOnChangeCountryOption());
    }

    public void ClickOnShopButton() {
        clickOn(getClickOnShopButton());
    }

    public void ClickOnYourListTab() {
        clickOn(getClickOnYourListTab());
    }

    public void ClickOnPrimeButton() {
        clickOn(getClickOnPrimeButton());
    }

    public void ClickOnExploreOtherPlans() {
        clickOn(getClickOnExploreOtherPlans());
    }

    public void ClickOnSelectAddressButton() {
        clickOn(getClickOnSelectAddressButton());
    }

    public void TypeInZipcode(String str) {
        typeInto(getTypeInZipcode(), str);
    }

    public void ClickOnApplyButton() {
        clickOn(getClickOnApplyButton());
    }

    public void ClickOnDoneButton() {
        clickOn(getClickOnDoneButton());
    }

    public void ClickOnGoBackToTopButton() {
        clickOn(getClickOnGoBackToTopButton());
    }

    public void ClickOnBecomeAnAmazonAffiliateOption() {
        clickOn(getClickOnBecomeAnAmazonAffiliateOption());
    }

    public void ClickOnSignUpButton() {
        clickOn(getClickOnSignUpButton());
    }

    public void ClickOnShopWithPointsOption() {
        clickOn(getClickOnShopWithPointsOption());
    }

    public void SelectPrePaidCardsTab() {
        clickOn(getSelectPrePaidCardsTab());
    }

    public void ClickOnAmazonCovid19Option() {
        clickOn(getClickOnAmazonCovid19Option());
    }

    public void ClickOnShipRatesAndPolicies() {
        clickOn(getClickOnShipRatesAndPolicies());
    }

    public void ClickOnAmazonAdvertising() {
        clickOn(getClickOnAmazonAdvertising());
    }

    public void SelectColleenAubreyLink() {
        clickOn(getSelectColleenAubreyLink());
    }

    public void ClickOnGoodReads() {
        clickOn(getClickOnGoodReads());
    }

    public void ClickOnContinueWithAmazonButton() {
        clickOn(getClickOnContinueWithAmazonButton());
    }

    public void ClickOnAmazonWarehouse() {
        clickOn(getClickOnAmazonWarehouse());
    }

    public void SelectDigitalDealsTab() {
        clickOn(getSelectDigitalDealsTab());
    }

    public void ClickOnAmazonBusiness() {
        clickOn(getClickOnAmazonBusiness());
    }

    public void ClickOnImdbLink() {
        clickOn(getClickOnImdbLink());
    }

    public void ClickOnWholeFoodsLink() {
        clickOn(getClickOnWholeFoodsLink());
    }

    public void ClickOnAmazonDrive() {
        clickOn(getClickOnAmazonDrive());
    }

    public void ClickOnAmazonFresh() {
        clickOn(getClickOnAmazonFresh());
    }

    public void SelectDealsTab() {
        clickOn(getSelectDealsTab());
    }

    public void ClickOnWootLink() {
        clickOn(getClickOnWootLink());
    }

    public void ClickOnAmazonSubscriptionBoxes() {
        clickOn(getClickOnAmazonSubscriptionBoxes());
    }

    public void DropdownFoodAndDrinkTab(WebDriver driver) {
        hoverOver(driver, getDropdownFoodAndDrinkTab());
    }

    public void ClickOnAmazonGlobal() {
        clickOn(getClickOnAmazonGlobal());
    }

    public void ClickOnZapposLink() {
        clickOn(getClickOnZapposLink());
    }

    public void ClickOnPillPackLink() {
        clickOn(getClickOnPillPackLink());
    }

    public void ClickOnComiXologyLink() {
        clickOn(getClickOnComiXologyLink());
    }

    public void ClickOnDPReviewLink() {
        clickOn(getClickOnDPReviewLink());
    }

    public void ClickOnRingLink() {
        clickOn(getClickOnRingLink());
    }

    public void ClickOnEastDaneLink() {
        clickOn(getClickOnEastDaneLink());
    }

    public void ClickOnEeroWifiLink() {
        clickOn(getClickOnEeroWifiLink());
    }

    public void ClickOnAmazonIgnite() {
        clickOn(getClickOnAmazonIgnite());
    }

    public void ClickOnHelpButton() {
        clickOn(getClickOnHelpButton());
    }

}
