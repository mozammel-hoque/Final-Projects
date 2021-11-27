package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.ArrayList;
import java.util.List;

public class AllMenuTest extends CommonAPI {

    @FindBy (id = "nav-hamburger-menu")
    WebElement clickOnAllMenuButton;
    @FindBy (xpath = "//a[@href='/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2']")
    WebElement clickOnBestSellers;
    @FindBy (xpath = "//a[text()='Appliances']")
    WebElement clickOnAppliances;
    @FindBy (xpath = "//a[text()='Appliance Warranties']")
    WebElement clickOnApplianceWarranties;
    @FindBy (xpath = "//a[text()='Cooktops']")
    WebElement clickOnCookTops;
    @FindBy (xpath = "//a[text()='Apps & Games']")
    WebElement clickOnAppsAndGames;
    @FindBy (xpath = "//a[text()='Books & Comics']")
    WebElement clickOnBooksAndComics;
    @FindBy (xpath = "//a[text()='Book Info & Reviews']")
    WebElement clickOnBookInfoAndReviews;
    @FindBy (xpath = "//a[text()='Camera & Photo Products']")
    WebElement clickOnCameraAndPhotoProducts;
    @FindBy (xpath = "//a[text()='Camcorders']")
    WebElement clickOnCamcorders;
    @FindBy (xpath = "//a[text()='Video']")
    WebElement clickOnVideo;
    @FindBy (xpath = "//a[text()='Electronics']")
    WebElement clickOnElectronics;
    @FindBy (xpath = "//a[text()='Headphones']")
    WebElement clickOnHeadphones;
    @FindBy (xpath = "//a[text()='Earbud Headphones']")
    WebElement clickOnEarbudHeadphones;
    @FindBy (xpath = "//a[text()='Movies & TV']")
    WebElement clickOnMoviesAndTV;
    @FindBy (xpath = "//a[text()='Amazon Video']")
    WebElement clickOnAmazonVideo;
    @FindBy (xpath = "//a[text()='Anime']")
    WebElement clickOnAnime;
    @FindBy (xpath = "//a[@href='/Best-Sellers-Video-Games/zgbs/videogames/ref=zg_bs_nav_0']")
    WebElement clickOnVideoGames;
    @FindBy (xpath = "//a[text()='PlayStation 5']")
    WebElement clickOnPlaystation5;
    @FindBy (xpath = "//a[text()='Games']")
    WebElement clickOnGames;
    @FindBy (xpath = "//a[text()='Entertainment Collectibles']")
    WebElement clickOnEntertainmentCollectables;
    @FindBy (xpath = "//a[text()='Comic Books']")
    WebElement clickOnComicBooks;
    @FindBy (xpath = "//a[text()='Animation']")
    WebElement clickOnAnimation;
    @FindBy (xpath = "//a[text()='Digital Music']")
    WebElement clickOnDigitalMusic;
    @FindBy (xpath = "//a[text()='Albums']")
    WebElement clickOnAlbums;
    @FindBy (xpath = "//a[text()='Rock']")
    WebElement clickOnRock;
    @FindBy (xpath = "//a[text()='Handmade Products']")
    WebElement clickOnHandmadeProducts;
    @FindBy (xpath = "//a[text()='Jewelry']")
    WebElement clickOnJewelry;
    @FindBy (xpath = "//a[text()='Watches']")
    WebElement clickOnWatches;
    @FindBy (xpath = "//a[text()='Sports & Outdoors']")
    WebElement clickOnSportsAndOutdoors;
    @FindBy (xpath = "//a[text()='Exercise & Fitness']")
    WebElement clickOnExerciseAndFitness;
    @FindBy (xpath = "//a[text()='Clothing']")
    WebElement clickOnClothing;
    @FindBy (xpath = "//div[text()='Prime Video']")
    WebElement clickOnPrimeVideo;
    @FindBy (xpath = "//a[text()='Included with Prime']")
    WebElement clickOnIncludedWithPrime;
    @FindBy (xpath = "//a[text()='Categories']")
    WebElement hoverOverCategories;
    @FindBy (xpath = "//a[text()='Anime']")
    WebElement clickOnAnimeGenre;
    @FindBy (xpath = "//a[text()='Kids']")
    WebElement clickOnKids;
    @FindBy (xpath = "//a[text()='Deals']")
    WebElement clickOnDeals;
    @FindBy (xpath = "//div[text()='Amazon Music']")
    WebElement clickOnAmazonMusic;
    @FindBy (xpath = "//a[text()='Amazon Music Unlimited']")
    WebElement clickOnAmazonMusicUnlimited;
    @FindBy (xpath = "//a[@href='/music-rock-classical-pop-jazz/b/?ie=UTF8&node=5174&ref_=sv_dmusic_4']")
    WebElement hoverOverBuyMusic;
    @FindBy (xpath = "//h3[text()='CDs']")
    WebElement clickOnCDs;
    @FindBy (xpath = "//a[text()='Podcasts']")
    WebElement clickOnPodcasts;
    @FindBy (xpath = "//span[text()='Listen now']")
    WebElement clickOnListenNowButton;
    @FindBy (xpath = "//div[text()='Fire TV']")
    WebElement clickOnFireTV;
    @FindBy (xpath = "//a[text()='Learn about Fire TV']")
    WebElement clickOnLearnAboutFireTV;
    @FindBy (xpath = "//a[text()='Help Topics']")
    WebElement hoverOverHelpTopics;
    @FindBy (xpath = "//a[text()='Setup & Use']")
    WebElement clickOnSetup;
    @FindBy (xpath = "//a[text()='Fire TV Support ']")
    WebElement clickOnFireTVSupport;
    @FindBy (xpath = "//a[@href='https://amazonforum.com?ref_=hp_ss_qs_v3_dv_forum']")
    WebElement clickOnDigitalAndDeviceForum;
    @FindBy (xpath = "//div[text()='Fire TV']")
    WebElement clickOnFireTVOption;
    @FindBy (xpath = "//div[text()='Fire TV 4K']")
    WebElement clickOnFireTV4K;
    @FindBy (xpath = "//div[text()='Kindle E-readers & Books']")
    WebElement clickOnKindleEReaderAndBooks;
    @FindBy (xpath = "//a[text()='See all Kindle E-Readers']")
    WebElement clickOnAllKindleEReaders;
    @FindBy (xpath = "//span[text()='Last 30 days']")
    WebElement clickOnLast30DaysOption;
    @FindBy (xpath = "//span[text()='New']")
    WebElement clickOnNewConditionOption;
    @FindBy (xpath = "//a[@href='/b/?ie=UTF8&node=17386948011&ref_=sv_devicesubnav_5']")
    WebElement clickOnHomeSecurityTab;
    @FindBy (css = "#a-autoid-2-announce")
    WebElement clickOnBlinkButton;
    @FindBy (xpath = "//a[@href='/b/?ie=UTF8&node=21601403011&ref_=sv_devicesubnav_7']")
    WebElement clickOnDay1Editions;
    @FindBy (xpath = "//i[@class='a-icon a-icon-checkbox']")
    WebElement clickOnClimateCheckBox;
    @FindBy (xpath = "//span[text()='$100 to $200']")
    WebElement clickOn$100to$200Option;
    @FindBy (xpath = "//div[text()='Audible Books & Originals']")
    WebElement clickOnAudibleBooks;
    @FindBy (xpath =  "//a[@href='/Audible-Books-and-Originals/b/?node=18145289011&ref_=nav_em_0_2_8_3']")
    WebElement clickOnAudibleBooksOriginals;
    @FindBy (xpath = "//a[@href='/Best-Sellers-Audible-Audiobooks/zgbs/audible/?_encoding=UTF8&ref_=sv_adbl_subnav_ref1_2']")
    WebElement hoverOverTrending;
    @FindBy (xpath = "//a[text()='Most Wished For']")
    WebElement clickOnMostWishedFor;
    @FindBy (xpath = "//a[text()='New & Noteworthy']")
    WebElement clickOnNewAndNoteworthy;
    @FindBy (xpath = "//a[text()='Computers & Technology']")
    WebElement clickOnComputerAndTech;
    @FindBy (xpath = "//a[@href='/Audible-Books-and-Originals/b/?ie=UTF8&node=18145289011&ref_=sv_adbl_subnav_ref1_3']")
    WebElement hoverOverCategoriesTab;
    @FindBy (xpath = "//a[text()='Bios & Memoirs']")
    WebElement clickOnBiosAndMemoirs;
    @FindBy (xpath = "//div[text()='Appstore for Android']")
    WebElement clickOnAppStoreForAndroid;
    @FindBy (xpath = "//a[text()='Games']")
    WebElement clickOnGamesOption;
    @FindBy (xpath = "//span[text()='Last 90 days']")
    WebElement clickOnLast90Days;
    @FindBy (xpath = "//span[text()='Arcade']")
    WebElement clickOnArcadeOption;
    @FindBy (xpath = "//a[@href='/gp/product/B0096E8CQA/?ie=UTF8&ref_=sv_mas_1']")
    WebElement hoverOverAmazonCoin;
    @FindBy (xpath = "//a[text()='FAQs']")
    WebElement clickOnFAQsOption;
    @FindBy (xpath = "//div[text()='Clothing, Shoes, Jewelry & Watches']")
    WebElement clickOnClothingShoesJewelry;
    @FindBy (xpath = "//a[text()='Men']")
    WebElement clickOnMen;
    @FindBy (xpath = "//a[@href='/Luggage-Travel-Gear/b/?ie=UTF8&node=9479199011&ref_=sv_sl_4']")
    WebElement hoverOverLuggage;
    @FindBy (xpath = "//a[text()='Carry-ons']")
    WebElement clickOnCarryOn;
    @FindBy (xpath = "//a[text()='Our Brands']")
    WebElement clickOnOurBrands;
    @FindBy (id = "p_n_cpf_eligible/21512497011")
    WebElement ClickOnClimatePledgeFriendly;
    @FindBy (xpath = "//a[text()='Women']")
    WebElement clickOnWomen;
    @FindBy (xpath = "//span[text()='Accessories']")
    WebElement clickOnAccessories;
    @FindBy (xpath = "//a[@href='/luxurystores?ref_=nav_em_luxury_sbd_hamb_0_2_10_9']")
    WebElement clickOnLuxuryStores;
    @FindBy (xpath = "//a[@href='/luxurystores/designers/?_encoding=UTF8&ref_=sv__2']")
    WebElement clickOnDesigners;
    @FindBy (xpath = "//div[text()='Amazon Fresh']")
    WebElement clickOnAmazonFresh;
    @FindBy (xpath = "//a[text()='All Amazon Fresh']")
    WebElement clickOnAllAmazonFresh;
    @FindBy (xpath = "//a[@href='/alm/category?almBrandId=QW1hem9uIEZyZXNo&node=16310101&ref=uf_dsk_sn_lnk_5_Fo']")
    WebElement hoverOverFood;
    @FindBy (xpath = "//div[text()='Produce']")
    WebElement clickOnProduce;
    @FindBy (xpath = "//a[@href='/alm/category?almBrandId=QW1hem9uIEZyZXNo&node=16310231&ref=uf_dsk_sn_lnk_6_Be']")
    WebElement hoverOverBeverages;
    @FindBy (xpath = "//div[text()='Water']")
    WebElement clickOnWater;
    @FindBy (xpath = "//a[@href='/alm/category?almBrandId=QW1hem9uIEZyZXNo&node=15342811&ref=uf_dsk_sn_lnk_7_Ho']")
    WebElement hoverOverHousehold;
    @FindBy (xpath = "//div[text()='Home & Kitchen']")
    WebElement clickOnHomeAndKitchen;
    @FindBy (xpath = "//a[@href='/fmc/m/20190180/?almBrandId=QW1hem9uIEZyZXNo']")
    WebElement hoverOverMoreFromFresh;
    @FindBy (xpath = "//div[text()='Specialty Diets']")
    WebElement clickOnSpecialtyDiets;
    @FindBy (xpath = "//div[text()='Books']")
    WebElement clickOnBooks;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=4&ref_=nav_em__cbo_t3_0_2_12_3']")
    WebElement clickOnChildrenBooks;
    @FindBy (xpath = "//a[text()='K-12 Teachers']")
    WebElement clickOnK12Teachers;
    @FindBy (xpath = "//span[text()='Prime Reading Eligible']")
    WebElement clickOnPrimeReadingEligible;
    @FindBy (xpath = "//a[text()='Textbooks']")
    WebElement clickOnTextbooks;
    @FindBy (xpath = "//a[text()='eTextbooks']")
    WebElement clickOnETextbooks;
    @FindBy (xpath = "//span[text()='Kindle Unlimited Eligible']")
    WebElement clickOnKindleUnlimitedEligible;
    @FindBy (xpath = "//a[text()='Magazines']")
    WebElement clickOnMagazines;
    @FindBy (xpath = "//a[@href='/Gift-Ideas-Magazines-Subscriptions/b/?ie=UTF8&node=604934&ref_=sv_mag_4']")
    WebElement clickOnGiftIdeas;
    @FindBy (xpath = "//span[text()='Under $10']")
    WebElement clickOnUnder10$Option;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=156104011&ref_=nav_em__comicsgraphic_0_2_12_14']")
    WebElement clickOnComicsAndGraphicNovels;
    @FindBy (xpath = "//a[@href='/Manga-Kindle-sBooks/b/?ie=UTF8&node=156115011&ref_=sv_kstore_cmx_5']")
    WebElement clickOnManga;
    @FindBy (xpath = "//a[text()='Best-Selling Manga']")
    WebElement clickOnBestSellingManga;
    @FindBy (xpath = "//a[@href='/Graphics-Novel-Kindle-eBooks/b/?ie=UTF8&node=156107011&ref_=sv_kstore_cmx_6']")
    WebElement clickOnGraphicNovels;
    @FindBy (xpath = "//span[text()='Superheroes']")
    WebElement clickOnSuperheroesGenre;
    @FindBy (xpath = "//div[text()='Movies, Music & Games']")
    WebElement clickOnMoviesMusicGames;
    @FindBy (xpath = "//a[text()='Movies & TV']")
    WebElement clickOnMoviesAndTVOption;
    @FindBy (xpath = "//a[text()='TV Shows']")
    WebElement clickOnTVShowsDepartment;
    @FindBy (xpath = "//span[text()='Coming Soon']")
    WebElement clickOnComingSoon;
    @FindBy (xpath = "//a[@href='/b/?ie=UTF8&node=2921756011&ref_=sv_mov_9']")
    WebElement clickOnAllGenreTab;
    @FindBy (id = "a-autoid-2-announce")
    WebElement clickOnAnimeGenreButton;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=468642&ref_=nav_em__cvg_0_2_13_10']")
    WebElement clickOnVideoGamesOption;
    @FindBy (xpath = "//span[text()='Nintendo Switch']")
    WebElement clickOnNintendoSwitch;
    @FindBy (id = "a-autoid-0-announce")
    WebElement clickOnConsoleButton;
    @FindBy (xpath = "//span[text()='PlayStation']")
    WebElement clickOnPlaystationBrand;
    @FindBy (xpath = "//span[text()='Used']")
    WebElement clickOnUsedCondition;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=5088769011&ref_=nav_em__entcol_0_2_13_13']")
    WebElement clickOnEntertainmentCollectablesOption;
    @FindBy (id = "a-autoid-7-announce")
    WebElement clickOn2000sDecade;
    @FindBy (xpath = "//span[text()='2000 to 2020']")
    WebElement clickOn2000To2020Year;
    @FindBy (xpath = "//a[text()='PC Gaming']")
    WebElement clickOnPCGaming;
    @FindBy (xpath = "//a[@href='/computer-pc-hardware-accessories-add-ons/b/?ie=UTF8&node=541966&ref_=topnav_storetab_pc']")
    WebElement clickOnComputers;
    @FindBy (xpath = "//a[@href='/gp/browse.html?rw_useCurrentProtocol=1&node=1292115011&ref_=amb_link_BpW_pJfGS-SH8sCy2LOykw_6']")
    WebElement clickOnMonitors;
    @FindBy (id = "a-autoid-1-announce")
    WebElement clickOnGamingMonitors;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=172541&ref_=nav_em_headphones_0_2_13_9']")
    WebElement clickOnHeadPhonesOption;
    @FindBy (xpath = "//a[@href='/Headphones-Accessories-Supplies/b/?ie=UTF8&node=172541&ref_=sv_e_aht_2']")
    WebElement hoverOverHeadphones;
    @FindBy (xpath = "//div[text()='Wireless']")
    WebElement clickOnWireless;
    @FindBy (xpath = "//a[@href='/gp/browse.html?node=283155&ref_=nav_em__bo_t3_0_2_12_2']")
    WebElement clickOnBooksOption;
    @FindBy (xpath = "//a[text()='Celebrity Picks']")
    WebElement clickOnCelebrityPicks;
    @FindBy (xpath = "//a[text()='MOST RECENT']")
    WebElement clickOnMostRecent;
    @FindBy (xpath = "//a[@href='/alm/category?almBrandId=QW1hem9uIEZyZXNo&node=10787321&ref=uf_dsk_sn_lnk_9_Bb']")
    WebElement hoverOverBaby;
    @FindBy (xpath = "//div[text()='Feeding & Formula']")
    WebElement clickOnFeedingAndFormula;
    @FindBy (xpath = "//a[text()='Sales & Deals']")
    WebElement clickOnSalesAndDeals;
    @FindBy (xpath = "//a[@href='/b/?ie=UTF8&node=20939775011&ref_=sv_sl_3']")
    WebElement hoverOverKids;
    @FindBy (xpath = "//a[@href='/b/?node=3455641&ref=sv_sl_fl']")
    WebElement clickOnBoysActivewear;
    @FindBy (xpath = "//span[text()='Premium Brands']")
    WebElement clickOnPremiumBrands;
    @FindBy (xpath = "//div[text()='Pharmacy']")
    WebElement clickOnPharmacy;
    @FindBy (xpath = "//a[text()='Amazon Pharmacy']")
    WebElement clickOnAmazonPharmacy;
    @FindBy (xpath = "//a[text()='Promise']")
    WebElement clickOnPromise;
    @FindBy (xpath = "//div[text()='For Prescribers']")
    WebElement clickOnForPrescribers;
    @FindBy (xpath = "//a[text()='How It Works']")
    WebElement clickOnHowItWorks;
    @FindBy (xpath = "//div[text()='Shop']")
    WebElement clickOnShop;

    public WebElement getClickOnAllMenuButton() {
        return clickOnAllMenuButton;
    }

    public WebElement getClickOnBestSellers() {
        return clickOnBestSellers;
    }

    public WebElement getClickOnAppliances() {
        return clickOnAppliances;
    }

    public WebElement getClickOnApplianceWarranties() {
        return clickOnApplianceWarranties;
    }

    public WebElement getClickOnCookTops() {
        return clickOnCookTops;
    }

    public WebElement getClickOnAppsAndGames() {
        return clickOnAppsAndGames;
    }

    public WebElement getClickOnBooksAndComics() {
        return clickOnBooksAndComics;
    }

    public WebElement getClickOnBookInfoAndReviews() {
        return clickOnBookInfoAndReviews;
    }

    public WebElement getClickOnCameraAndPhotoProducts() {
        return clickOnCameraAndPhotoProducts;
    }

    public WebElement getClickOnCamcorders() {
        return clickOnCamcorders;
    }

    public WebElement getClickOnVideo() {
        return clickOnVideo;
    }

    public WebElement getClickOnElectronics() {
        return clickOnElectronics;
    }

    public WebElement getClickOnHeadphones() {
        return clickOnHeadphones;
    }

    public WebElement getClickOnEarbudHeadphones() {
        return clickOnEarbudHeadphones;
    }

    public WebElement getClickOnMoviesAndTV() {
        return clickOnMoviesAndTV;
    }

    public WebElement getClickOnAmazonVideo() {
        return clickOnAmazonVideo;
    }

    public WebElement getClickOnAnime() {
        return clickOnAnime;
    }

    public WebElement getClickOnVideoGames() {
        return clickOnVideoGames;
    }

    public WebElement getClickOnPlaystation5() {
        return clickOnPlaystation5;
    }

    public WebElement getClickOnGames() {
        return clickOnGames;
    }

    public WebElement getClickOnEntertainmentCollectables() {
        return clickOnEntertainmentCollectables;
    }

    public WebElement getClickOnComicBooks() {
        return clickOnComicBooks;
    }

    public WebElement getClickOnAnimation() {
        return clickOnAnimation;
    }

    public WebElement getClickOnDigitalMusic() {
        return clickOnDigitalMusic;
    }

    public WebElement getClickOnAlbums() {
        return clickOnAlbums;
    }

    public WebElement getClickOnRock() {
        return clickOnRock;
    }

    public WebElement getClickOnHandmadeProducts() {
        return clickOnHandmadeProducts;
    }

    public WebElement getClickOnJewelry() {
        return clickOnJewelry;
    }

    public WebElement getClickOnWatches() {
        return clickOnWatches;
    }

    public WebElement getClickOnSportsAndOutdoors() {
        return clickOnSportsAndOutdoors;
    }

    public WebElement getClickOnExerciseAndFitness() {
        return clickOnExerciseAndFitness;
    }

    public WebElement getClickOnClothing() {
        return clickOnClothing;
    }

    public WebElement getClickOnPrimeVideo() {
        return clickOnPrimeVideo;
    }

    public WebElement getClickOnIncludedWithPrime() {
        return clickOnIncludedWithPrime;
    }

    public WebElement getHoverOverCategories() {
        return hoverOverCategories;
    }

    public WebElement getClickOnAnimeGenre() {
        return clickOnAnimeGenre;
    }

    public WebElement getClickOnKids() {
        return clickOnKids;
    }

    public WebElement getClickOnDeals() {
        return clickOnDeals;
    }

    public WebElement getClickOnAmazonMusic() {
        return clickOnAmazonMusic;
    }

    public WebElement getClickOnAmazonMusicUnlimited() {
        return clickOnAmazonMusicUnlimited;
    }

    public WebElement getHoverOverBuyMusic() {
        return hoverOverBuyMusic;
    }

    public WebElement getClickOnCDs() {
        return clickOnCDs;
    }

    public WebElement getClickOnPodcasts() {
        return clickOnPodcasts;
    }

    public WebElement getClickOnListenNowButton() {
        return clickOnListenNowButton;
    }

    public WebElement getClickOnFireTV() {
        return clickOnFireTV;
    }

    public WebElement getClickOnLearnAboutFireTV() {
        return clickOnLearnAboutFireTV;
    }

    public WebElement getHoverOverHelpTopics() {
        return hoverOverHelpTopics;
    }

    public WebElement getClickOnSetup() {
        return clickOnSetup;
    }

    public WebElement getClickOnFireTVSupport() {
        return clickOnFireTVSupport;
    }

    public WebElement getClickOnDigitalAndDeviceForum() {
        return clickOnDigitalAndDeviceForum;
    }

    public WebElement getClickOnFireTVOption() {
        return clickOnFireTVOption;
    }

    public WebElement getClickOnFireTV4K() {
        return clickOnFireTV4K;
    }

    public WebElement getClickOnKindleEReaderAndBooks() {
        return clickOnKindleEReaderAndBooks;
    }

    public WebElement getClickOnAllKindleEReaders() {
        return clickOnAllKindleEReaders;
    }

    public WebElement getClickOnLast30DaysOption() {
        return clickOnLast30DaysOption;
    }

    public WebElement getClickOnNewConditionOption() {
        return clickOnNewConditionOption;
    }

    public WebElement getClickOnHomeSecurityTab() {
        return clickOnHomeSecurityTab;
    }

    public WebElement getClickOnBlinkButton() {
        return clickOnBlinkButton;
    }

    public WebElement getClickOnDay1Editions() {
        return clickOnDay1Editions;
    }

    public WebElement getClickOnClimateCheckBox() {
        return clickOnClimateCheckBox;
    }

    public WebElement getClickOn$100to$200Option() {
        return clickOn$100to$200Option;
    }

    public WebElement getClickOnAudibleBooks() {
        return clickOnAudibleBooks;
    }

    public WebElement getClickOnAudibleBooksOriginals() {
        return clickOnAudibleBooksOriginals;
    }

    public WebElement getHoverOverTrending() {
        return hoverOverTrending;
    }

    public WebElement getClickOnMostWishedFor() {
        return clickOnMostWishedFor;
    }

    public WebElement getClickOnNewAndNoteworthy() {
        return clickOnNewAndNoteworthy;
    }

    public WebElement getClickOnComputerAndTech() {
        return clickOnComputerAndTech;
    }

    public WebElement getHoverOverCategoriesTab() {
        return hoverOverCategoriesTab;
    }

    public WebElement getClickOnBiosAndMemoirs() {
        return clickOnBiosAndMemoirs;
    }

    public WebElement getClickOnAppStoreForAndroid() {
        return clickOnAppStoreForAndroid;
    }

    public WebElement getClickOnGamesOption() {
        return clickOnGamesOption;
    }

    public WebElement getClickOnLast90Days() {
        return clickOnLast90Days;
    }

    public WebElement getClickOnArcadeOption() {
        return clickOnArcadeOption;
    }

    public WebElement getHoverOverAmazonCoin() {
        return hoverOverAmazonCoin;
    }

    public WebElement getClickOnFAQsOption() {
        return clickOnFAQsOption;
    }

    public WebElement getClickOnClothingShoesJewelry() {
        return clickOnClothingShoesJewelry;
    }

    public WebElement getClickOnMen() {
        return clickOnMen;
    }

    public WebElement getHoverOverLuggage() {
        return hoverOverLuggage;
    }

    public WebElement getClickOnCarryOn() {
        return clickOnCarryOn;
    }

    public WebElement getClickOnOurBrands() {
        return clickOnOurBrands;
    }

    public WebElement getClickOnClimatePledgeFriendly() {
        return ClickOnClimatePledgeFriendly;
    }

    public WebElement getClickOnWomen() {
        return clickOnWomen;
    }

    public WebElement getClickOnAccessories() {
        return clickOnAccessories;
    }

    public WebElement getClickOnLuxuryStores() {
        return clickOnLuxuryStores;
    }

    public WebElement getClickOnDesigners() {
        return clickOnDesigners;
    }

    public WebElement getClickOnAmazonFresh() {
        return clickOnAmazonFresh;
    }

    public WebElement getClickOnAllAmazonFresh() {
        return clickOnAllAmazonFresh;
    }

    public WebElement getHoverOverFood() {
        return hoverOverFood;
    }

    public WebElement getClickOnProduce() {
        return clickOnProduce;
    }

    public WebElement getHoverOverBeverages() {
        return hoverOverBeverages;
    }

    public WebElement getClickOnWater() {
        return clickOnWater;
    }

    public WebElement getHoverOverHousehold() {
        return hoverOverHousehold;
    }

    public WebElement getClickOnHomeAndKitchen() {
        return clickOnHomeAndKitchen;
    }

    public WebElement getHoverOverMoreFromFresh() {
        return hoverOverMoreFromFresh;
    }

    public WebElement getClickOnSpecialtyDiets() {
        return clickOnSpecialtyDiets;
    }

    public WebElement getClickOnBooks() {
        return clickOnBooks;
    }

    public WebElement getClickOnChildrenBooks() {
        return clickOnChildrenBooks;
    }

    public WebElement getClickOnK12Teachers() {
        return clickOnK12Teachers;
    }

    public WebElement getClickOnPrimeReadingEligible() {
        return clickOnPrimeReadingEligible;
    }

    public WebElement getClickOnTextbooks() {
        return clickOnTextbooks;
    }

    public WebElement getClickOnETextbooks() {
        return clickOnETextbooks;
    }

    public WebElement getClickOnKindleUnlimitedEligible() {
        return clickOnKindleUnlimitedEligible;
    }

    public WebElement getClickOnMagazines() {
        return clickOnMagazines;
    }

    public WebElement getClickOnGiftIdeas() {
        return clickOnGiftIdeas;
    }

    public WebElement getClickOnUnder10$Option() {
        return clickOnUnder10$Option;
    }

    public WebElement getClickOnComicsAndGraphicNovels() {
        return clickOnComicsAndGraphicNovels;
    }

    public WebElement getClickOnManga() {
        return clickOnManga;
    }

    public WebElement getClickOnBestSellingManga() {
        return clickOnBestSellingManga;
    }

    public WebElement getClickOnGraphicNovels() {
        return clickOnGraphicNovels;
    }

    public WebElement getClickOnSuperheroesGenre() {
        return clickOnSuperheroesGenre;
    }

    public WebElement getClickOnMoviesMusicGames() {
        return clickOnMoviesMusicGames;
    }

    public WebElement getClickOnMoviesAndTVOption() {
        return clickOnMoviesAndTVOption;
    }

    public WebElement getClickOnTVShowsDepartment() {
        return clickOnTVShowsDepartment;
    }

    public WebElement getClickOnComingSoon() {
        return clickOnComingSoon;
    }

    public WebElement getClickOnAllGenreTab() {
        return clickOnAllGenreTab;
    }

    public WebElement getClickOnAnimeGenreButton() {
        return clickOnAnimeGenreButton;
    }

    public WebElement getClickOnVideoGamesOption() {
        return clickOnVideoGamesOption;
    }

    public WebElement getClickOnNintendoSwitch() {
        return clickOnNintendoSwitch;
    }

    public WebElement getClickOnConsoleButton() {
        return clickOnConsoleButton;
    }

    public WebElement getClickOnPlaystationBrand() {
        return clickOnPlaystationBrand;
    }

    public WebElement getClickOnUsedCondition() {
        return clickOnUsedCondition;
    }

    public WebElement getClickOnEntertainmentCollectablesOption() {
        return clickOnEntertainmentCollectablesOption;
    }

    public WebElement getClickOn2000sDecade() {
        return clickOn2000sDecade;
    }

    public WebElement getClickOn2000To2020Year() {
        return clickOn2000To2020Year;
    }

    public WebElement getClickOnPCGaming() {
        return clickOnPCGaming;
    }

    public WebElement getClickOnComputers() {
        return clickOnComputers;
    }

    public WebElement getClickOnMonitors() {
        return clickOnMonitors;
    }

    public WebElement getClickOnGamingMonitors() {
        return clickOnGamingMonitors;
    }

    public WebElement getClickOnHeadPhonesOption() {
        return clickOnHeadPhonesOption;
    }

    public WebElement getHoverOverHeadphones() {
        return hoverOverHeadphones;
    }

    public WebElement getClickOnWireless() {
        return clickOnWireless;
    }

    public WebElement getClickOnBooksOption() {
        return clickOnBooksOption;
    }

    public WebElement getClickOnCelebrityPicks() {
        return clickOnCelebrityPicks;
    }

    public WebElement getClickOnMostRecent() {
        return clickOnMostRecent;
    }

    public WebElement getHoverOverBaby() {
        return hoverOverBaby;
    }

    public WebElement getClickOnFeedingAndFormula() {
        return clickOnFeedingAndFormula;
    }

    public WebElement getClickOnSalesAndDeals() {
        return clickOnSalesAndDeals;
    }

    public WebElement getHoverOverKids() {
        return hoverOverKids;
    }

    public WebElement getClickOnBoysActivewear() {
        return clickOnBoysActivewear;
    }

    public WebElement getClickOnPremiumBrands() {
        return clickOnPremiumBrands;
    }

    public WebElement getClickOnPharmacy() {
        return clickOnPharmacy;
    }

    public WebElement getClickOnAmazonPharmacy() {
        return clickOnAmazonPharmacy;
    }

    public WebElement getClickOnPromise() {
        return clickOnPromise;
    }

    public WebElement getClickOnForPrescribers() {
        return clickOnForPrescribers;
    }

    public WebElement getClickOnHowItWorks() {
        return clickOnHowItWorks;
    }

    public WebElement getClickOnShop() {
        return clickOnShop;
    }

    public void ClickOnAllMenuButton() {
        clickOn(getClickOnAllMenuButton());
    }

    public void ClickOnBestSellers() {
        clickOn(getClickOnBestSellers());
    }

    public void ClickOnAppliances() {
        clickOn(getClickOnAppliances());
    }

    public void ClickOnAppliancesWarranties() {
        clickOn(getClickOnApplianceWarranties());
    }

    public void ClickOnCookTops() {
        clickOn(getClickOnCookTops());
    }

    public void ClickOnAppsAndGames() {
        clickOn(getClickOnAppsAndGames());
    }

    public void ClickOnBooksAndComics() {
        clickOn(getClickOnBooksAndComics());
    }

    public void ClickOnBookInfoAndReviews() {
        clickOn(getClickOnBookInfoAndReviews());
    }

    public void ClickOnCameraAndPhotoProducts() {
        clickOn(getClickOnCameraAndPhotoProducts());
    }

    public void ClickOnCamcorders() {
        clickOn(getClickOnCamcorders());
    }

    public void ClickOnVideo() {
        clickOn(getClickOnVideo());
    }

    public void ClickOnElectronics() {
        clickOn(getClickOnElectronics());
    }

    public void ClickOnHeadphones() {
        clickOn(getClickOnHeadphones());
    }

    public void ClickOnEarbudHeadphones() {
        clickOn(getClickOnEarbudHeadphones());
    }

    public void ClickOnMoviesAndTV() {
        clickOn(getClickOnMoviesAndTV());
    }

    public void ClickOnAmazonVideo() {
        clickOn(getClickOnAmazonVideo());
    }

    public void ClickOnAnime() {
        clickOn(getClickOnAnime());
    }

    public void ClickOnVideoGames() {
        clickOn(getClickOnVideoGames());
    }

    public void ClickOnPlaystation5() {
        clickOn(getClickOnPlaystation5());
    }

    public void ClickOnGames() {
        clickOn(getClickOnGames());
    }

    public void ClickOnEntertainmentCollectables() {
        clickOn(getClickOnEntertainmentCollectables());
    }

    public void ClickOnComicBooks() {
        clickOn(getClickOnComicBooks());
    }

    public void ClickOnAnimation() {
        clickOn(getClickOnAnimation());
    }

    public void ClickOnDigitalMusic() {
        clickOn(getClickOnDigitalMusic());
    }

    public void ClickOnAlbums() {
        clickOn(getClickOnAlbums());
    }

    public void ClickOnRock() {
        clickOn(getClickOnRock());
    }

    public void ClickOnHandmadeProducts() {
        clickOn(getClickOnHandmadeProducts());
    }

    public void ClickOnJewelry() {
        clickOn(getClickOnJewelry());
    }

    public void ClickOnWatches() {
        clickOn(getClickOnWatches());
    }

    public void ClickOnSportsAndOutdoors() {
        clickOn(getClickOnSportsAndOutdoors());
    }

    public void ClickOnExerciseAndFitness() {
        clickOn(getClickOnExerciseAndFitness());
    }

    public void ClickOnClothing() {
        clickOn(getClickOnClothing());
    }

    public void ClickOnPrimeVideo() {
        clickOn(getClickOnPrimeVideo());
    }

    public void ClickOnIncludedWithPrime() {
        clickOn(getClickOnIncludedWithPrime());
    }

    public void HoverOverCategories(WebDriver driver) {
        hoverOver(driver, getHoverOverCategories());
    }

    public void ClickOnAnimeGenre() {
        clickOn(getClickOnAnimeGenre());
    }

    public void ClickOnKids() {
        clickOn(getClickOnKids());
    }

    public void ClickOnDeals() {
        clickOn(getClickOnDeals());
    }

    public void ClickOnAmazonMusic() {
        clickOn(getClickOnAmazonMusic());
    }

    public void ClickOnAmazonMusicUnlimited() {
        clickOn(getClickOnAmazonMusicUnlimited());
    }

    public void HoverOverBuyMusic(WebDriver driver) {
        hoverOver(driver ,getHoverOverBuyMusic());
    }

    public void ClickOnCDs() {
        clickOn(getClickOnCDs());
    }

    public void ClickOnPodcasts() {
        clickOn(getClickOnPodcasts());
    }

    public void ClickOnListenNowButton() {
        clickOn(getClickOnListenNowButton());
    }

    public void ClickOnFireTV() {
        clickOn(getClickOnFireTV());
    }

    public void ClickOnLearnAboutFireTV() {
        clickOn(getClickOnLearnAboutFireTV());
    }

    public void HoverOverHelpTopics(WebDriver driver) {
        hoverOver(driver, getHoverOverHelpTopics());
    }

    public void ClickOnSetup() {
        clickOn(getClickOnSetup());
    }

    public void ClickOnFireTVSupport() {
        clickOn(getClickOnFireTVSupport());
    }

    public void ClickOnDigitalAndDeviceForum() {
        clickOn(getClickOnDigitalAndDeviceForum());
    }

    public void ClickOnFireTVOption() {
        clickOn(getClickOnFireTVOption());
    }

    public void ClickOnFireTV4K() {
        clickOn(getClickOnFireTV4K());
    }

    public void ClickOnKindleEReaderAndBooks() {
        clickOn(getClickOnKindleEReaderAndBooks());
    }

    public void ClickOnAllKindleEReaders() {
        clickOn(getClickOnAllKindleEReaders());
    }

    public void ClickOnLast30DaysOption() {
        clickOn(getClickOnLast30DaysOption());
    }

    public void ClickOnNewConditionOption() {
        clickOn(getClickOnNewConditionOption());
    }

    public void ClickOnHomeSecurityTab() {
        clickOn(getClickOnHomeSecurityTab());
    }

    public void ClickOnBlinkButton() {
        clickOn(getClickOnBlinkButton());
    }

    public void ClickOnDay1Editions() {
        clickOn(getClickOnDay1Editions());
    }

    public void ClickOnClimateCheckBox() {
        clickOn(getClickOnClimateCheckBox());
    }

    public void ClickOn$100to$200Option() {
        clickOn(getClickOn$100to$200Option());
    }

    public void ClickOnAudibleBooks() {
        clickOn(getClickOnAudibleBooks());
    }

    public void ClickOnAudibleBooksOriginals() {
        clickOn(getClickOnAudibleBooksOriginals());
    }

    public void HoverOverTrending(WebDriver driver) {
        hoverOver(driver, getHoverOverTrending());
    }

    public void ClickOnMostWishedFor() {
        clickOn(getClickOnMostWishedFor());
    }

    public void ClickOnNewAndNoteworthy() {
        clickOn(getClickOnNewAndNoteworthy());
    }

    public void ClickOnComputerAndTech() {
        clickOn(getClickOnComputerAndTech());
    }

    public void HoverOverCategoriesTab(WebDriver driver) {
        hoverOver(driver, getHoverOverCategoriesTab());
    }

    public void ClickOnBiosAndMemoirs() {
        clickOn(getClickOnBiosAndMemoirs());
    }

    public void ClickOnAppStoreForAndroid() {
        clickOn(getClickOnAppStoreForAndroid());
    }

    public void ClickOnGamesOption() {
        clickOn(getClickOnGamesOption());
    }

    public void ClickOnLast90Days() {
        clickOn(getClickOnLast90Days());
    }

    public void ClickOnArcadeOption() {
        clickOn(getClickOnArcadeOption());
    }

    public void HoverOverAmazonCoins(WebDriver driver) {
        hoverOver(driver, getHoverOverAmazonCoin());
    }

    public void ClickOnFAQsOption() {
        clickOn(getClickOnFAQsOption());
    }

    public void ClickOnClothingShoesJewelry() {
        clickOn(getClickOnClothingShoesJewelry());
    }

    public void ClickOnMen() {
        clickOn(getClickOnMen());
    }

    public void HoverOverLuggage(WebDriver driver) {
        hoverOver(driver, getHoverOverLuggage());
    }

    public void ClickOnCarryOn() {
        clickOn(getClickOnCarryOn());
    }

    public void ClickOnOurBrands () {
        clickOn(getClickOnOurBrands());
    }

    public void ClickOnClimatePledgeFriendly() {
        clickOn(getClickOnClimatePledgeFriendly());
    }

    public void ClickOnWomen() {
        clickOn(getClickOnWomen());
    }

    public void ClickOnAccessories() {
        clickOn(getClickOnAccessories());
    }

    public void ClickOnLuxuryStores() {
        clickOn(getClickOnLuxuryStores());
    }

    public void ClickOnDesigners() {
        clickOn(getClickOnDesigners());
    }

    public void ClickOnAmazonFresh() {
        clickOn(getClickOnAmazonFresh());
    }

    public void ClickOnAllAmazonFresh() {
        clickOn(getClickOnAllAmazonFresh());
    }

    public void HoverOverFood(WebDriver driver) {
        hoverOver(driver, getHoverOverFood());
    }

    public void ClickOnProduce() {
        clickOn(getClickOnProduce());
    }

    public void HoverOverBeverages(WebDriver driver) {
        hoverOver(driver, getHoverOverBeverages());
    }

    public void ClickOnWater() {
        clickOn(getClickOnWater());
    }

    public void HoverOverHousehold(WebDriver driver) {
        hoverOver(driver, getHoverOverHousehold());
    }

    public void ClickOnHomeAndKitchen() {
        clickOn(getClickOnHomeAndKitchen());
    }

    public void HoverOverMoreFromFresh(WebDriver driver) {
        hoverOver(driver, getHoverOverMoreFromFresh());
    }

    public void ClickOnSpecialtyDiets() {
        clickOn(getClickOnSpecialtyDiets());
    }

    public void ClickOnBooks() {
        clickOn(getClickOnBooks());
    }

    public void ClickOnChildrenBooks() {
        clickOn(getClickOnChildrenBooks());
    }

    public void ClickOnK12Teachers() {
        clickOn(getClickOnK12Teachers());
    }

    public void ClickOnPrimeReadingEligible() {
        clickOn(getClickOnPrimeReadingEligible());
    }

    public void ClickOnTextbooks() {
        clickOn(getClickOnTextbooks());
    }

    public void ClickOnETextbooks() {
        clickOn(getClickOnETextbooks());
    }

    public void ClickOnKindleUnlimitedEligible() {
        clickOn(getClickOnKindleUnlimitedEligible());
    }

    public void ClickOnMagazines() {
        clickOn(getClickOnMagazines());
    }

    public void ClickOnGiftIdeas() {
        clickOn(getClickOnGiftIdeas());
    }

    public void ClickOnUnder10$Option() {
        clickOn(getClickOnUnder10$Option());
    }

    public void ClickOnComicsAndGraphicNovels() {
        clickOn(getClickOnComicsAndGraphicNovels());
    }

    public void ClickOnManga() {
        clickOn(getClickOnManga());
    }

    public void ClickOnBestSellingManga() {
        clickOn(getClickOnBestSellingManga());
    }

    public void ClickOnGraphicNovels() {
        clickOn(getClickOnGraphicNovels());
    }

    public void ClickOnSuperheroesGenre() {
        clickOn(getClickOnSuperheroesGenre());
    }

    public void ClickOnMoviesMusicGames() {
        clickOn(getClickOnMoviesMusicGames());
    }

    public void ClickOnMoviesAndTVOption() {
        clickOn(getClickOnMoviesAndTVOption());
    }

    public void ClickOnTVShowsDepartment() {
        clickOn(getClickOnTVShowsDepartment());
    }

    public void ClickOnComingSoon() {
        clickOn(getClickOnComingSoon());
    }

    public void ClickOnAllGenreTab() {
        clickOn(getClickOnAllGenreTab());
    }

    public void ClickOnAnimeGenreButton() {
        clickOn(getClickOnAnimeGenreButton());
    }

    public void ClickOnVideoGamesOption() {
        clickOn(getClickOnVideoGamesOption());
    }

    public void ClickOnNintendoSwitch() {
        clickOn(getClickOnNintendoSwitch());
    }

    public void ClickOnConsoleButton() {
        clickOn(getClickOnConsoleButton());
    }

    public void ClickOnPlaystationBrand() {
        clickOn(getClickOnPlaystationBrand());
    }

    public void ClickOnUsedCondition() {
        clickOn(getClickOnUsedCondition());
    }

    public void ClickOnEntertainmentCollectablesOption() {
        clickOn(getClickOnEntertainmentCollectablesOption());
    }

    public void ClickOn2000sDecade() {
        clickOn(getClickOn2000sDecade());
    }

    public void ClickOn2000To2020Year() {
        clickOn(getClickOn2000To2020Year());
    }

    public void ClickOnPCGaming() {
        clickOn(getClickOnPCGaming());
    }

    public void ClickOnComputers() {
        clickOn(getClickOnComputers());
    }

    public void ClickOnMonitors() {
        clickOn(getClickOnMonitors());
    }

    public void ClickOnGamingMonitors() {
        clickOn(getClickOnGamingMonitors());
    }

    public void ClickOnHeadphonesOption() {
        clickOn(getClickOnHeadPhonesOption());
    }

    public void HoverOverHeadphones(WebDriver driver) {
        hoverOver(driver, getHoverOverHeadphones());
    }

    public void ClickOnWireless() {
        clickOn(getClickOnWireless());
    }

    public void ClickOnBooksOption() {
        clickOn(getClickOnBooksOption());
    }

    public void ClickOnCelebrityPicks() {
        clickOn(getClickOnCelebrityPicks());
    }

    public void ClickOnMostRecent() {
        clickOn(getClickOnMostRecent());
    }

    public void HoverOverBaby(WebDriver driver) {
        hoverOver(driver, getHoverOverBaby());
    }

    public void ClickOnFeedingAndFormulas() {
        clickOn(getClickOnFeedingAndFormula());
    }

    public void ClickOnSalesAndDeals() {
        clickOn(getClickOnSalesAndDeals());
    }

    public void HoverOverKids(WebDriver driver) {
        hoverOver(driver, getHoverOverKids());
    }

    public void ClickOnBoysActivewear() {
        clickOn(getClickOnBoysActivewear());
    }

    public void ClickOnPremiumBrands() {
        clickOn(getClickOnPremiumBrands());
    }

    public void ClickOnPharmacy() {
        clickOn(getClickOnPharmacy());
    }

    public void ClickOnAmazonPharmacy() {
        clickOn(getClickOnAmazonPharmacy());
    }

    public void ClickOnPromise() {
        clickOn(getClickOnPromise());
    }

    public void ClickOnForPrescribers() {
        clickOn(getClickOnForPrescribers());
    }

    public void ClickOnHowItWorks() {
        clickOn(getClickOnHowItWorks());
    }

    public void ClickOnShop() {
        clickOn(getClickOnShop());
    }
}
