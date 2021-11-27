package Homepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends CommonAPI {


    @FindBy(xpath = "//input[@type='search']")
    WebElement searchItems;
    @FindBy(xpath = "//header/div[1]/div[1]/a[1]/i[1]")
    WebElement clickOnItem;
    @FindBy(xpath = "//button[@aria-label='Add to cart - Smart50 Sea Salt Popcorn, 5 Oz.']")
    WebElement chips;
    @FindBy(xpath = "//button[normalize-space()='Electronics']")
    WebElement electronics;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[1]/a")
    WebElement department;
    @FindBy(xpath = "//button[normalize-space()='Grocery']")
    WebElement grocery;
    @FindBy(xpath = "//a[@link-identifier='Shop All ']")
    WebElement shopAll;
    @FindBy(xpath = "//button[@aria-label='Food Gifts & Candy']")
    WebElement foodGiftCandy;
    @FindBy(xpath = "//button[normalize-space()='Savings & Featured Shops']")
    WebElement savingFeaturedShop;
    @FindBy(xpath = "//a[normalize-space()='Toys']")
    WebElement toys;
    @FindBy(xpath = "//button[@aria-label='Add to cart - Disney Princess Fold N Go Celebration Castle, Folding Dollhouse, Accessories']//span[@class='mr2'][normalize-space()='Add']")
    WebElement addItemDisney;
    @FindBy(xpath = "//button[normalize-space()='Clothing, Shoes & Accessories']")
    WebElement clothingShoesAccessories;
    @FindBy(xpath = "//a[@link-identifier='Clothing']")
    WebElement clothing;
    @FindBy(xpath = "//a[@link-identifier='634469524']")
    WebElement scootJacket;
    @FindBy(xpath = "//button[normalize-space()='Add to list']")
    WebElement addtoList;
    @FindBy(xpath = "//a[@aria-label='Careers - opens in a new window']")
    WebElement scrollToCareer;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement phar;
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement newArrival;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/a[1]")
    WebElement pufferScuffSleper;
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement AddtoCart1;
    @FindBy(xpath = "//body//div[@id='__next']//div[@class='flex']//div[@class='flex']//div[2]//li[1]//ul[1]//li[6]//a[1]")
    WebElement scrubs;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement vNeckTop;
    @FindBy(xpath = "//a[normalize-space()='Fashion Gift Guide']")
    WebElement fashionGift;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/section[1]/div[1]/ul[1]/li[1]/div[1]/a[1]")
    WebElement rebookHoddie;
    @FindBy(xpath = "//a[normalize-space()='Tech Deals']")
    WebElement techdeal;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement smartTv;
    @FindBy(xpath = "//a[normalize-space()='Smart Security']")
    WebElement smartSecurity;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement googleNestDoorBell;
    @FindBy(xpath = "//a[normalize-space()='Android Tablets']")
    WebElement AndroidTablets;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement teblet;
    @FindBy(xpath = "//a[normalize-space()='Apple Watch']")
    WebElement appleWatch;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement series7;
    @FindBy(xpath = "//a[normalize-space()='Roku TVs']")
    WebElement RokuTv;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement rokuSmartTv;
    @FindBy(xpath = "//a[normalize-space()='Laptops']")
    WebElement laptop;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement hpRoseGold;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
    WebElement acerChrombook;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/a[1]")
    WebElement chrombookIntel;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/a[1]")
    WebElement microsoftPro;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[5]/div[1]/div[1]/a[1]")
    WebElement ultraslimNotebook;
    @FindBy(xpath = "//a[normalize-space()='Thanksgiving Bakery']")
    WebElement bakery;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement dinnerRolles;
    @FindBy(xpath = "//a[normalize-space()='Tortillas']")
    WebElement tortillas;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement missionTortillas;
    @FindBy(xpath = "//a[@class='mid-gray no-underline subcategory-item-link'][normalize-space()='Pies']")
    WebElement pies;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/a[1]")
    WebElement vanilaDesert;
    @FindBy(xpath = "//a[normalize-space()='Baking Ingredients']")
    WebElement bakingIngeidients;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement pureSuger;
    @FindBy(xpath = "//a[normalize-space()='Popcorn & Pretzels']")
    WebElement popcornPretzels;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement skinyPop;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/a[1]")
    WebElement smartfood;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/a[1]")
    WebElement buttter;
    @FindBy(xpath = "//a[normalize-space()='Printers & Ink']")
    WebElement printer;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement digitalPrinter;
    @FindBy(xpath = "//a[normalize-space()='PC Gaming']")
    WebElement pcGaming;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement gameMaster;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
    WebElement desktopGame;
    @FindBy(xpath = "//button[normalize-space()='Toys & Video Games']")
    WebElement toyesGames;
    @FindBy(xpath = "//a[normalize-space()='Preschool Toys']")
    WebElement preSchool;
    @FindBy(xpath = "//button[@aria-label='Toy deals']")
    WebElement toysDeals;
    @FindBy(xpath = "//button[@aria-label='Shop by age']")
    WebElement shopByAge;
    @FindBy(xpath = "//button[@aria-label='Toy Catalog']")
    WebElement toyCatalog;
    @FindBy(xpath = "//button[@aria-label='Dolls & dollhouses']")
    WebElement dollesHouses;
    @FindBy(xpath = "//button[@aria-label='Top-Rated by Kids']")
    WebElement topRatedByKids;



    public WebElement getSearchItems() {return searchItems; }
    public WebElement getClickOnItem() { return clickOnItem; }
    public WebElement getChips() { return chips;}
    public WebElement getElectronics() {
        return electronics;
    }
    public WebElement getDepartment() { return department; }
    public WebElement getGrocery() { return grocery; }
    public WebElement getShopAll() { return shopAll; }
    public WebElement getFoodGiftCandy() { return foodGiftCandy; }
    public WebElement getSavingFeaturedShop() { return savingFeaturedShop; }
    public WebElement getToys() { return toys; }
    public WebElement getAddItemDisney() { return addItemDisney; }
    public WebElement getClothingShoesAccessories() { return clothingShoesAccessories; }
    public WebElement getClothing() { return clothing; }
    public WebElement getScootJacket() { return scootJacket; }
    public WebElement getAddtoList() { return addtoList; }
    public WebElement getScrollToCareer() { return scrollToCareer; }
    public WebElement getPhar() { return phar; }
    public WebElement getNewArrival() { return newArrival; }
    public WebElement getPufferScuffSleper() { return pufferScuffSleper; }
    public WebElement getAddtoCart1() { return AddtoCart1; }
    public WebElement getScrubs() { return scrubs; }
    public WebElement getvNeckTop() { return vNeckTop; }
    public WebElement getFashionGift() { return fashionGift; }
    public WebElement getRebookHoddie() { return rebookHoddie; }
    public WebElement getTechdeal() { return techdeal; }
    public WebElement getSmartTv() { return smartTv; }
    public WebElement getSmartSecurity() { return smartSecurity; }
    public WebElement getGoogleNestDoorBell() { return googleNestDoorBell; }
    public WebElement getAndroidTablets() { return AndroidTablets; }
    public WebElement getTeblet() { return teblet; }
    public WebElement getAppleWatch() { return appleWatch; }
    public WebElement getSeries7() { return series7; }
    public WebElement getRokuTv() { return RokuTv;}
    public WebElement getRokuSmartTv() { return rokuSmartTv; }
    public WebElement getLaptop() { return laptop; }
    public WebElement getHpRoseGold() { return hpRoseGold; }
    public WebElement getAcerChrombook() { return acerChrombook; }
    public WebElement getChrombookIntel() { return chrombookIntel; }
    public WebElement getMicrosoftPro() { return microsoftPro; }
    public WebElement getUltraslimNotebook() { return ultraslimNotebook; }
    public WebElement getBakery() { return bakery; }
    public WebElement getDinnerRolles() { return dinnerRolles;}
    public WebElement getTortillas() { return tortillas; }
    public WebElement getMissionTortillas() { return missionTortillas; }
    public WebElement getPies() { return pies; }
    public WebElement getVanilaDesert() { return vanilaDesert; }
    public WebElement getBakingIngeidients() { return bakingIngeidients; }
    public WebElement getPureSuger() { return pureSuger; }
    public WebElement getPopcornPretzels() { return popcornPretzels; }
    public WebElement getSkinyPop() { return skinyPop; }
    public WebElement getSmartfood() { return smartfood; }
    public WebElement getButtter() { return buttter; }
    public WebElement getPrinter() { return printer; }
    public WebElement getDigitalPrinter() { return digitalPrinter; }
    public WebElement getPcGaming() { return pcGaming; }
    public WebElement getGameMaster() { return gameMaster; }
    public WebElement getDesktopGame() { return desktopGame; }
    public WebElement getToyesGames() {return toyesGames;  }
    public WebElement getPreSchool() { return preSchool; }
    public WebElement getToysDeals() { return toysDeals; }

    public WebElement getShopByAge() {
        return shopByAge;
    }

    public WebElement getToyCatalog() {
        return toyCatalog;
    }

    public WebElement getDollesHouses() {
        return dollesHouses;
    }

    public WebElement getTopRatedByKids() {
        return topRatedByKids;
    }

    public void TopRatedByKids() { clickOn(getTopRatedByKids());}

    public void searchItems(String str) { typeEnter(getSearchItems(), str); }
    public void ClickOnItem() { clickOn(getClickOnItem()); }
    public void CliclonItems() { clickOn(getChips()); }
    public void Electronics() { clickOn(getElectronics()); }
    public void Derpartment() { clickOn(getDepartment());}
    public void Grocery() { clickOn(getGrocery()); }
    public void ShopAll() { clickOn(getShopAll()); }
    public void FoodGiftCandy() { clickOn(getFoodGiftCandy()); }
    public void SavingFeaturedShop() { clickOn(getSavingFeaturedShop()); }
    public void Toys() { clickOn(getToys()); }
    public void AddIthemDisney() { clickOn(getAddItemDisney()); }
    public void ClothingShoesAccessories() { clickOn(getClothingShoesAccessories());}
    public void Clothing() { clickOn(getClothing());}
    public void ScootJacket() { clickOn(getScootJacket());}
    public void AddtoList7() {clickOn(getAddtoList());}
    public void ScrollToCareer(WebDriver driver) {
        scrollToView(getScrollToCareer(), driver);
    }
    public void Career() { clickOn(getScrollToCareer());}
    public void Phar() { clickOn(getPhar());}
    public void NewArrival() { clickOn(getNewArrival());}
    public void PufferScuffSleper() { clickOn(getPufferScuffSleper());}
    public void AddtoCart1() { clickOn(getAddtoCart1());}
    public void Scrubs() { clickOn(getScrubs());}
    public void VNeckTop() { clickOn(getvNeckTop());}
    public void FashionGift() { clickOn(getFashionGift());}
    public void RebookHoddie() { clickOn(getRebookHoddie());}
    public void TechDeal() { clickOn(getTechdeal());}
    public void SmartTv() { clickOn(getSmartTv());}
    public void SmartSecurity() { clickOn(getSmartSecurity());}
    public void GoogleNestDoorBell() { clickOn(getGoogleNestDoorBell());}
    public void AndroidTablets() { clickOn(getAndroidTablets());}
    public void Teblet() { clickOn(getTeblet());}
    public void AppleWatch() { clickOn(getAppleWatch());}
    public void Series7() { clickOn(getSeries7());}
    public void RokuTv() { clickOn(getRokuTv());}
    public void RokuSmartTv() {clickOn(getSmartTv());}
    public void Laptop() { clickOn(getLaptop());}
    public void HpRoseGold() { clickOn(getHpRoseGold());}
    public void AcerChromBook() { clickOn(getAcerChrombook());}
    public void ChromBookIntel() { clickOn(getChrombookIntel());}
    public void MicroSoftpro() { clickOn(getMicrosoftPro());}
    public void UlteaSlimNoteBook() { clickOn(getUltraslimNotebook());}
    public void Bakery() { clickOn(getBakery());}
    public void DinnerRolles() {clickOn(getDinnerRolles());}
    public void Tortillas() { clickOn(getTortillas());}
    public void MissionTortillas() { clickOn(getMissionTortillas());}
    public void Pies() { clickOn(getPies());}
    public void VanilaDesert() { getVanilaDesert(); }
    public void BakingIngridients() { clickOn(getBakingIngeidients());}
    public void PureSuger() { clickOn(getPureSuger());}
    public void Popcorn() { clickOn(getPopcornPretzels());}
    public void SkinyPop() { clickOn(getSkinyPop());}
    public void Smartfood() { clickOn(getSmartfood());}
    public void Butter() { clickOn(getButtter());}
    public void Printer() { clickOn(getDigitalPrinter());}
    public void DigitalPrinter() { clickOn(getDigitalPrinter());}
    public void PcGaming() { clickOn(getPcGaming());}
    public void GameMaster() { clickOn(getGameMaster());}
    public void DesktopGame() { clickOn(getDesktopGame());}
    public void ToyesGames() { clickOn(getToyesGames());}
    public void preSchool() { clickOn(getPreSchool());}
    public void ToysDeals() { clickOn(getToysDeals());}
    public void ShopByAge() { clickOn(getShopByAge());}
    public void ToyCatalog() { clickOn(getToyCatalog());}
    public void dolleHouses() { clickOn(getDollesHouses());}

    //public void hoverOverDepartment(WebDriver driver) { hoverOver(driver, getDepartment());}
  //  Actions action = new Actions(driver);

    //public void hoverOverPrime(WebDriver driver){
       // hoverOver(driver, getPrimeLinkMenu()); }
    //public void clickOnTryPrime(){clickOn(getTryPrimeElement());}

}





