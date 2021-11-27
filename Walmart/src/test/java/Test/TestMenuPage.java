package Test;

import Homepage.Home;
import Homepage.MenuPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMenuPage extends CommonAPI {

    @Test
    public void test33() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getAutocare();
        menuPage.getAutocareServiceCenter();
        menuPage.getOil();
        waitFor(1);
    }
    @Test
    public void test34() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getAutocare();
        menuPage.getAutoBuying();
        menuPage.getShopNewCar();
        waitFor(2);
    }
    @Test
    public void test35() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getAutocare();
        menuPage.getAutoBuying();
        menuPage.getShopUsedCars();
        waitFor(2);
    }
    @Test
    public void test36() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getAutocare();
        menuPage.getAutoBuying();
        menuPage.getSellYourCar();
        waitFor(2);
    }
    @Test
    public void test37() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getAutocare();
        menuPage.getAutocareServiceCenter();
        waitFor(2);
    }
    @Test
    public void test38() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        waitFor(1);
    }
    @Test
    public void test39() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getFluShot();
        waitFor(2);
    }
    @Test
    public void test40() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getHeighFiberFood();
        waitFor(2);
    }
    @Test
    public void test41() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getFaceMask();
        waitFor(2);
    }
    @Test
    public void test42() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getHealthBrands();
        waitFor(2);
    }
    @Test
    public void test43() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getEatBetter();
        waitFor(2);
    }
    @Test
    public void test44() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getManageWeight();
        waitFor(2);
    }
    @Test
    public void test45() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getVisionCenter();
        waitFor(2);
    }
    @Test
    public void test46() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getProteinPowders();
        waitFor(2);
    }
    @Test
    public void test47() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getProteinShakes();
        waitFor(2);
    }
    @Test
    public void test48() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getProteinBars();
        waitFor(2);
    }
    @Test
    public void test49() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getMultivitamins();
        waitFor(2);
    }
    @Test
    public void test50() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getDietSnacks();
        waitFor(2);
    }
    @Test
    public void test51() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getBeautySupplements();
        waitFor(2);
    }
    @Test
    public void test52() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getSleepSupplements();
        waitFor(2);
    }
    @Test
    public void test53() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getPainRelievers();
        waitFor(2);
    }
    @Test
    public void test54() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getQuitSmoking();
        waitFor(2);
    }
    @Test
    public void test55() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getAllergyMedison();
        waitFor(2);
    }
    @Test
    public void test56() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getHeatingPads();
        waitFor(2);
    }
    @Test
    public void test57() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getFootSpas();
        waitFor(2);
    }
    @Test
    public void test58() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getEssentialOils();
        waitFor(2);
    }
    @Test
    public void test59() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getMindfulBeauty();
        waitFor(2);
    }
    @Test
    public void test60() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getSkinCareTools();
        waitFor(2);
    }
    @Test
    public void test61() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getNoSugerFood();
        waitFor(2);
    }
    @Test
    public void test62() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getLoWCalorieFood();
        waitFor(2);
    }
    @Test
    public void test63() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.getServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getLowSodiumFoods();
        waitFor(2);
    }

}
