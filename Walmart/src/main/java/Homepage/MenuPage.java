package Homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends CommonAPI {

    @FindBy(xpath = "//a[@link-identifier='Services']")
    WebElement services;
    @FindBy(xpath = "//button[contains(text(),'Auto Care Center Services')]")
    WebElement autocare;
    @FindBy(xpath = "//a[normalize-space()='Auto Care Center Services']")
    WebElement autocareServiceCenter;
    @FindBy(xpath = "//div[@class='w_AZ w_Aa']//div[1]//article[1]//a[1]//img[1]")
    WebElement oil;
    @FindBy(xpath = "//a[normalize-space()='Auto Buying']")
    WebElement autoBuying;
    @FindBy(xpath = "//a[normalize-space()='Auto Buying']")
    WebElement shopNewCar;
    @FindBy(xpath = "//div[@id='cp-center-module-0']//div[2]//div[1]//a[1]")
    WebElement shopUsedCars;
    @FindBy(xpath = "//div[@id='cp-center-module-0']//div[2]//div[1]//a[1]")
    WebElement sellYourCar;
    @FindBy(xpath = "//a[normalize-space()='Find an Auto Care Center']")
    WebElement findAutoCareCenter;
    @FindBy(xpath = "//button[normalize-space()='Health Services']")
    WebElement healthService;
    @FindBy(xpath = "//a[normalize-space()='The Wellness Hub']")
    WebElement WellnessHub;
    @FindBy(xpath = "//span[normalize-space()='Immunizations and Flu Shots']")
    WebElement fluShot;
    @FindBy(xpath = "//span[normalize-space()='The Flu Shop']")
    WebElement fluShop;
    @FindBy(xpath = "//span[normalize-space()='Face Coverings & Masks']")
    WebElement faceMask;
    @FindBy(xpath = "//span[normalize-space()='Walmart health brands you love']")
    WebElement healthBrands;
    @FindBy(xpath = "//span[normalize-space()='Eat Better']")
    WebElement eatBetter;
    @FindBy(xpath = "//span[normalize-space()='Manage Weight and Exercise']")
    WebElement manageWeight;
    @FindBy(xpath = "//span[@class='SideBarMenu-title'][normalize-space()='Vision Center']")
    WebElement visionCenter;
    @FindBy(xpath = "//span[normalize-space()='Protein Powders']")
    WebElement ProteinPowders;
    @FindBy(xpath = "//span[normalize-space()='Protein Shakes']")
    WebElement ProteinShakes;
    @FindBy(xpath = "//span[normalize-space()='Protein Bars']")
    WebElement proteinBars;
    @FindBy(xpath = "//span[normalize-space()='Multivitamins']")
    WebElement multivitamins;
    @FindBy(xpath = "//span[normalize-space()='Diet Snacks']")
    WebElement dietSnacks;
    @FindBy(xpath = "//span[normalize-space()='Beauty Supplements']")
    WebElement beautySupplements;
    @FindBy(xpath = "//span[normalize-space()='Sleep Supplements']")
    WebElement sleepSupplements;
    @FindBy(xpath = "//span[normalize-space()='Pain Relievers']")
    WebElement painRelievers;
    @FindBy(xpath = "//span[normalize-space()='Quit Smoking']")
    WebElement quitSmoking;
    @FindBy(xpath = "//span[normalize-space()='Allergy']")
    WebElement allergyMedison;
    @FindBy(xpath = "//span[normalize-space()='Heating Pads']")
    WebElement heatingPads;
    @FindBy(xpath = "//span[normalize-space()='Foot Spas']")
    WebElement footSpas;
    @FindBy(xpath = "//span[normalize-space()='Essential Oils']")
    WebElement essentialOils;
    @FindBy(xpath = "//span[normalize-space()='Mindful Beauty']")
    WebElement mindfulBeauty;
    @FindBy(xpath = "//span[normalize-space()='Skin Care Tools']")
    WebElement skinCareTools;
    @FindBy(xpath = "//span[normalize-space()='High Fiber Foods']")
    WebElement heighFiberFood;
    @FindBy(xpath = "//span[normalize-space()='No Sugar Foods']")
    WebElement noSugerFood;
    @FindBy(xpath = "//span[normalize-space()='Low Calorie Foods']")
    WebElement loWCalorieFood;
    @FindBy(xpath = "//span[normalize-space()='Low Sodium Foods']")
    WebElement lowSodiumFoods;

    public WebElement getServices() { return services; }
    public WebElement getAutocare() { return autocare; }
    public WebElement getAutocareServiceCenter() { return autocareServiceCenter; }
    public WebElement getOil() { return oil; }
    public WebElement getAutoBuying() { return autoBuying; }
    public WebElement getShopNewCar() { return shopNewCar; }
    public WebElement getShopUsedCars() { return shopUsedCars; }
    public WebElement getSellYourCar() { return sellYourCar; }
    public WebElement getFindAutoCareCenter() { return findAutoCareCenter; }
    public WebElement getHealthService() {return healthService; }
    public WebElement getWellnessHub() { return WellnessHub; }
    public WebElement getFluShot() { return fluShot; }
    public WebElement getFluShop() { return fluShop; }
    public WebElement getFaceMask() { return faceMask; }
    public WebElement getHealthBrands() { return healthBrands; }
    public WebElement getEatBetter() { return eatBetter; }
    public WebElement getManageWeight() { return manageWeight; }
    public WebElement getVisionCenter() { return visionCenter; }
    public WebElement getProteinPowders() { return ProteinPowders; }
    public WebElement getProteinShakes() { return ProteinShakes; }
    public WebElement getProteinBars() { return proteinBars; }
    public WebElement getMultivitamins() { return multivitamins; }
    public WebElement getDietSnacks() { return dietSnacks; }
    public WebElement getBeautySupplements() { return beautySupplements; }
    public WebElement getSleepSupplements() { return sleepSupplements; }
    public WebElement getPainRelievers() { return painRelievers; }
    public WebElement getQuitSmoking() { return quitSmoking; }
    public WebElement getAllergyMedison() { return allergyMedison; }
    public WebElement getHeatingPads() { return heatingPads; }
    public WebElement getFootSpas() { return footSpas; }
    public WebElement getEssentialOils() { return essentialOils; }
    public WebElement getMindfulBeauty() { return mindfulBeauty; }
    public WebElement getSkinCareTools() { return skinCareTools; }
    public WebElement getHeighFiberFood() { return heighFiberFood; }
    public WebElement getNoSugerFood() {return noSugerFood; }
    public WebElement getLoWCalorieFood() { return loWCalorieFood; }
    public WebElement getLowSodiumFoods() { return lowSodiumFoods;}

    public void Services() { clickOn(getServices());}
    public void Autocare() {clickOn(getAutocare());}
    public void AutoCareServiceCenter() { clickOn(getAutocareServiceCenter());}
    public void Oil() { clickOn(getOil());}
    public void AutoBuying() { clickOn(getAutoBuying());}
    public void ShopNewCar() { clickOn(getShopNewCar());}
    public void ShopUsedCars() { clickOn(getShopUsedCars());}
    public void SellYourCar() { clickOn(getSellYourCar());}
    public void FindAutoCareCenter() { clickOn(getFindAutoCareCenter());}
    public void HealthService() { clickOn(getHealthService());}
    public void WellnessHub() { clickOn(getWellnessHub());}
    public void FluShot() { clickOn(getFluShot());}
    public void FluShop() { clickOn(getFluShop());}
    public void FaceMask() { clickOn(getFaceMask());}
    public void HealthBrands() { clickOn(getHealthBrands());}
    public void EatBetter() { clickOn(getEatBetter());}
    public void ManageWeight() { clickOn(getManageWeight());}
    public void VisionCenter() { clickOn(getVisionCenter());}
    public void ProteinPowders() { clickOn(getProteinPowders());}
    public void ProteinShakes() { clickOn(getProteinShakes());}
    public void ProteinBars() { clickOn(getProteinBars());}
    public void Multivitamins() { clickOn(getMultivitamins());}
    public void dietSnacks() { clickOn(getDietSnacks());}
    public void BeautySupplements() { clickOn(getBeautySupplements());}
    public void SleepSupplements() { clickOn(getSleepSupplements());}
    public void PainRelievers() { clickOn(getPainRelievers());}
    public void QuitSmoking() { clickOn(getQuitSmoking());}
    public void Allergy() { clickOn(getAllergyMedison());}
    public void HeatingPads() { clickOn(getHeatingPads());}
    public void FootSpas() { clickOn(getFootSpas());}
    public void EssentialOils() { clickOn(getEssentialOils());}
    public void MindfulBeauty() { clickOn(getMindfulBeauty());}
    public void SkinCareTools() { clickOn(getSkinCareTools());}
    public void HeighFiberFood() {clickOn(getHeighFiberFood());}
    public void NosugerFood() { clickOn(getNoSugerFood());}
    public void LowCaloriesFood() { clickOn(getLoWCalorieFood());}
    public void LowSodiumFood() { clickOn(getLowSodiumFoods());}


}
