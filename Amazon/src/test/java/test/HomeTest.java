package test;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllMenuTest;
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
        homePage.ClickOnAddToCardButton();
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
        homePage.EnterUserPassword("Maxbox223");
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
    @Test
    public void test51() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnAppliances();
        allMenuTest.ClickOnAppliancesWarranties();
        allMenuTest.ClickOnCookTops();
    }
    @Test
    public void test52() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnAppsAndGames();
        allMenuTest.ClickOnBooksAndComics();
        allMenuTest.ClickOnBookInfoAndReviews();
    }
    @Test
    public void test53() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnCameraAndPhotoProducts();
        allMenuTest.ClickOnCamcorders();
        allMenuTest.ClickOnVideo();
    }
    @Test
    public void test54() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnElectronics();
        allMenuTest.ClickOnHeadphones();
        allMenuTest.ClickOnEarbudHeadphones();
    }
    @Test
    public void test55() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnMoviesAndTV();
        allMenuTest.ClickOnAmazonVideo();
        allMenuTest.ClickOnAnime();
    }
    @Test
    public void test56() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnVideoGames();
        allMenuTest.ClickOnPlaystation5();
        allMenuTest.ClickOnGames();
    }
    @Test
    public void test57() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnEntertainmentCollectables();
        allMenuTest.ClickOnComicBooks();
        allMenuTest.ClickOnAnimation();
    }
    @Test
    public void test58() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnDigitalMusic();
        allMenuTest.ClickOnAlbums();
        allMenuTest.ClickOnRock();
    }
    @Test
    public void test59() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnHandmadeProducts();
        allMenuTest.ClickOnJewelry();
        allMenuTest.ClickOnWatches();
    }
    @Test
    public void test60() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBestSellers();
        allMenuTest.ClickOnSportsAndOutdoors();
        allMenuTest.ClickOnExerciseAndFitness();
        allMenuTest.ClickOnClothing();
    }
    @Test
    public void test61() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnPrimeVideo();
        allMenuTest.ClickOnIncludedWithPrime();
        allMenuTest.HoverOverCategories(driver);
        allMenuTest.ClickOnAnimeGenre();
    }
    @Test
    public void test62() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnPrimeVideo();
        allMenuTest.ClickOnKids();
        allMenuTest.ClickOnDeals();
    }
    @Test
    public void test63() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAmazonMusic();
        allMenuTest.ClickOnAmazonMusicUnlimited();
        allMenuTest.HoverOverBuyMusic(driver);
        allMenuTest.ClickOnCDs();
    }
    @Test
    public void test64() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAmazonMusic();
        allMenuTest.ClickOnPodcasts();
        allMenuTest.ClickOnListenNowButton();
        waitFor(2);
    }
    @Test
    public void test65() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnFireTV();
        allMenuTest.ClickOnLearnAboutFireTV();
        allMenuTest.HoverOverHelpTopics(driver);
        allMenuTest.ClickOnSetup();
    }
    @Test
    public void test66() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnFireTV();
        allMenuTest.ClickOnFireTVSupport();
        allMenuTest.ClickOnDigitalAndDeviceForum();
        allMenuTest.ClickOnFireTVOption();
        allMenuTest.ClickOnFireTV4K();
    }
    @Test
    public void test67() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnKindleEReaderAndBooks();
        allMenuTest.ClickOnAllKindleEReaders();
        allMenuTest.ClickOnLast30DaysOption();
        allMenuTest.ClickOnNewConditionOption();
    }
    @Test
    public void test68() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnKindleEReaderAndBooks();
        allMenuTest.ClickOnAllKindleEReaders();
        allMenuTest.ClickOnHomeSecurityTab();
        allMenuTest.ClickOnBlinkButton();
    }
    @Test
    public void test69() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnKindleEReaderAndBooks();
        allMenuTest.ClickOnAllKindleEReaders();
        allMenuTest.ClickOnDay1Editions();
    }
    @Test
    public void test70() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnKindleEReaderAndBooks();
        allMenuTest.ClickOnAllKindleEReaders();
        allMenuTest.ClickOnClimateCheckBox();
        allMenuTest.ClickOn$100to$200Option();
    }
    @Test
    public void test71() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAudibleBooks();
        allMenuTest.ClickOnAudibleBooksOriginals();
        allMenuTest.HoverOverTrending(driver);
        allMenuTest.ClickOnMostWishedFor();
    }
    @Test
    public void test72() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAudibleBooks();
        allMenuTest.ClickOnAudibleBooksOriginals();
        allMenuTest.ClickOnNewAndNoteworthy();
        allMenuTest.ClickOnComputerAndTech();
    }
    @Test
    public void test73() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAudibleBooks();
        allMenuTest.ClickOnAudibleBooksOriginals();
        allMenuTest.HoverOverCategoriesTab(driver);
        allMenuTest.ClickOnBiosAndMemoirs();
    }
    @Test
    public void test74() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAppStoreForAndroid();
        allMenuTest.ClickOnGamesOption();
        allMenuTest.ClickOnLast90Days();
        allMenuTest.ClickOnArcadeOption();
    }
    @Test
    public void test75() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAppStoreForAndroid();
        allMenuTest.ClickOnGamesOption();
        allMenuTest.HoverOverAmazonCoins(driver);
        allMenuTest.ClickOnFAQsOption();
    }
    @Test
    public void test76() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnClothingShoesJewelry();
        allMenuTest.ClickOnMen();
        allMenuTest.HoverOverLuggage(driver);
        waitFor(2);
        allMenuTest.ClickOnCarryOn();
    }
    @Test
    public void test77() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnClothingShoesJewelry();
        allMenuTest.ClickOnMen();
        allMenuTest.ClickOnOurBrands();
        waitFor(2);
        allMenuTest.ClickOnClimatePledgeFriendly();
    }
    @Test
    public void test78() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnClothingShoesJewelry();
        allMenuTest.ClickOnWomen();
        allMenuTest.ClickOnOurBrands();
        allMenuTest.ClickOnAccessories();
    }
    @Test
    public void test79() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnClothingShoesJewelry();
        allMenuTest.ClickOnLuxuryStores();
        allMenuTest.ClickOnDesigners();
    }
    @Test
    public void test80() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAmazonFresh();
        allMenuTest.ClickOnAllAmazonFresh();
        allMenuTest.HoverOverFood(driver);
        allMenuTest.ClickOnProduce();
    }
    @Test
    public void test81() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAmazonFresh();
        allMenuTest.ClickOnAllAmazonFresh();
        allMenuTest.HoverOverBeverages(driver);
        allMenuTest.ClickOnWater();
    }
    @Test
    public void test82() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAmazonFresh();
        allMenuTest.ClickOnAllAmazonFresh();
        allMenuTest.HoverOverHousehold(driver);
        allMenuTest.ClickOnHomeAndKitchen();
    }
    @Test
    public void test83() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAmazonFresh();
        allMenuTest.ClickOnAllAmazonFresh();
        allMenuTest.HoverOverMoreFromFresh(driver);
        allMenuTest.ClickOnSpecialtyDiets();
    }
    @Test
    public void test84() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBooks();
        allMenuTest.ClickOnChildrenBooks();
        allMenuTest.ClickOnK12Teachers();
        allMenuTest.ClickOnPrimeReadingEligible();
    }
    @Test
    public void test85() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBooks();
        allMenuTest.ClickOnTextbooks();
        allMenuTest.ClickOnETextbooks();
        allMenuTest.ClickOnKindleUnlimitedEligible();
    }
    @Test
    public void test86() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBooks();
        allMenuTest.ClickOnMagazines();
        allMenuTest.ClickOnGiftIdeas();
        allMenuTest.ClickOnUnder10$Option();
    }
    @Test
    public void test87() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBooks();
        allMenuTest.ClickOnComicsAndGraphicNovels();
        allMenuTest.ClickOnManga();
        allMenuTest.ClickOnBestSellingManga();
    }
    @Test
    public void test88() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBooks();
        allMenuTest.ClickOnComicsAndGraphicNovels();
        allMenuTest.ClickOnGraphicNovels();
        allMenuTest.ClickOnSuperheroesGenre();
    }
    @Test
    public void test89() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnMoviesMusicGames();
        allMenuTest.ClickOnMoviesAndTVOption();
        allMenuTest.ClickOnTVShowsDepartment();
        allMenuTest.ClickOnComingSoon();
    }
    @Test
    public void test90() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnMoviesMusicGames();
        allMenuTest.ClickOnMoviesAndTVOption();
        allMenuTest.ClickOnAllGenreTab();
        allMenuTest.ClickOnAnimeGenreButton();
    }
    @Test
    public void test91() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnMoviesMusicGames();
        allMenuTest.ClickOnVideoGamesOption();
        allMenuTest.ClickOnNintendoSwitch();
        allMenuTest.ClickOnConsoleButton();
    }
    @Test
    public void test92() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnMoviesMusicGames();
        allMenuTest.ClickOnVideoGamesOption();
        allMenuTest.ClickOnPlaystationBrand();
        allMenuTest.ClickOnUsedCondition();
    }
    @Test
    public void test93() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnMoviesMusicGames();
        allMenuTest.ClickOnEntertainmentCollectablesOption();
        allMenuTest.ClickOn2000sDecade();
        allMenuTest.ClickOn2000To2020Year();
    }
    @Test
    public void test94() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnMoviesMusicGames();
        allMenuTest.ClickOnPCGaming();
        allMenuTest.ClickOnComputers();
        allMenuTest.ClickOnMonitors();
        allMenuTest.ClickOnGamingMonitors();
    }
    @Test
    public void test95() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnMoviesMusicGames();
        allMenuTest.ClickOnHeadphonesOption();
        allMenuTest.HoverOverHeadphones(driver);
        allMenuTest.ClickOnWireless();
    }
    @Test
    public void test96() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnBooks();
        allMenuTest.ClickOnBooksOption();
        allMenuTest.ClickOnCelebrityPicks();
        allMenuTest.ClickOnMostRecent();
    }
    @Test
    public void test97() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnAmazonFresh();
        allMenuTest.ClickOnAllAmazonFresh();
        allMenuTest.HoverOverBaby(driver);
        allMenuTest.ClickOnFeedingAndFormulas();
    }
    @Test
    public void test98() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnClothingShoesJewelry();
        allMenuTest.ClickOnSalesAndDeals();
        allMenuTest.HoverOverKids(driver);
        allMenuTest.ClickOnBoysActivewear();
        allMenuTest.ClickOnPremiumBrands();
    }
    @Test
    public void test99() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnPharmacy();
        allMenuTest.ClickOnAmazonPharmacy();
        allMenuTest.ClickOnPromise();
        allMenuTest.ClickOnForPrescribers();
    }
    @Test
    public void test100() {
        AllMenuTest allMenuTest = PageFactory.initElements(driver, AllMenuTest.class);
        allMenuTest.ClickOnAllMenuButton();
        allMenuTest.ClickOnPharmacy();
        allMenuTest.ClickOnAmazonPharmacy();
        allMenuTest.ClickOnHowItWorks();
        allMenuTest.ClickOnShop();
    }
}
