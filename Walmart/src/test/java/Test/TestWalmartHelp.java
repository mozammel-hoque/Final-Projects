package Test;

import Homepage.Login;
import Homepage.WalmartHelp;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestWalmartHelp extends CommonAPI {

    @Test
    public void test73() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.ScrollToHelp(driver);
        walmartHelp.getTrackOrder();
        waitFor(2);

    }

    @Test
    public void test74() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.AllDepartment();
        walmartHelp.getWomenDepartment();
        walmartHelp.getLeggings();
        waitFor(2);
    }
    @Test
    public void test75() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        waitFor(2);
    }
    @Test
    public void test76() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getRegistryChecklist();
        waitFor(2);
    }
    @Test
    public void test77() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getCreateRegistry();
        waitFor(2);
    }
    @Test
    public void test78() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getStrollerBuyingGuide();
        waitFor(2);
    }
    @Test
    public void test79() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getCarSeatBuyingGuide();
        waitFor(2);
    }
    @Test
    public void test80() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getNurseryChecklist();
        walmartHelp.getCarSeatBuyingGuide();
        waitFor(2);
    }
    @Test
    public void test81() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBabyFeedingbasics();
        waitFor(2);
    }
    @Test
    public void test82() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getHospitalChecklist();
        waitFor(2);
    }
    @Test
    public void test83() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getNewParentsChecklist();
        waitFor(2);
    }
    @Test
    public void test84() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getEntertainment();
        waitFor(2);
    }
    @Test
    public void test85() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getShopByBrand();
        waitFor(2);
    }
    @Test
    public void test86() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandHuggle();
        waitFor(2);
    }
    @Test
    public void test87() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandChicco();
        waitFor(2);
    }
    @Test
    public void test88() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandOwlet();
        waitFor(2);
    }
    @Test
    public void test89() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandDisneyBaby();
        waitFor(2);
    }
    @Test
    public void test90() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandOxoTot();
        waitFor(2);
    }
    @Test
    public void test91() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandNanoBebe();
        waitFor(2);
    }
    @Test
    public void test92() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandForMoms();
        waitFor(2);
    }
    @Test
    public void test93() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandFridaBaby();
        waitFor(2);
    }
    @Test
    public void test94() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandLittleStarOrganic();
        waitFor(2);
    }
    @Test
    public void test95() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getPickToday();
        waitFor(2);
    }
    @Test
    public void test96() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getChristmasGift();
        waitFor(2);
    }
    @Test
    public void test97() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getPhotoBook();
        waitFor(2);
    }
    @Test
    public void test98() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getWallArt();
        waitFor(2);
    }
    @Test
    public void test99() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getPosters();
        waitFor(2);
    }
    @Test
    public void test100() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getGifts();
        waitFor(2);
    }


}
