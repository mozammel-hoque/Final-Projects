package Test;

import Homepage.Home;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.swing.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeTest extends CommonAPI {



    @Test
    public void test1() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        waitFor(5);
        homePage.getDepartment();
        waitFor(2);
        homePage.getRokuTv();
        waitFor(2);
    }

    @Test
    public void test2() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getToyesGames();
        homePage.getPreSchool();
        homePage.getTopRatedByKids();
        waitFor(2);
    }

    @Test
    public void test3() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        waitFor(2);
    }

    @Test
    public void test4() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getGrocery();
        homePage.getFoodGiftCandy();
        waitFor(2);
    }

    @Test
    public void test5() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getToys();
        homePage.getAddItemDisney();
        waitFor(2);
    }

    @Test
    public void test6() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getClothingShoesAccessories();
        homePage.getScootJacket();
        homePage.getAddtoList();
        waitFor(1);
    }

    @Test
    public void test7() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getClothingShoesAccessories();
        homePage.getNewArrival();
        homePage.getPufferScuffSleper();
        waitFor(1);
    }

    @Test
    public void test8() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getClothingShoesAccessories();
        homePage.getScrubs();
        homePage.getvNeckTop();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test9() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getClothingShoesAccessories();
        homePage.getFashionGift();
        homePage.getRebookHoddie();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test10() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getTechdeal();
        homePage.getSmartTv();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test11() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getTechdeal();
        homePage.getSmartTv();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test12() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getAndroidTablets();
        homePage.getTeblet();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test13() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getAppleWatch();
        homePage.getSeries7();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test14() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getRokuTv();
        homePage.getRokuSmartTv();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test15() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getLaptop();
        homePage.getHpRoseGold();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test16() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getLaptop();
        homePage.getAcerChrombook();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test17() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getLaptop();
        homePage.getChrombookIntel();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test18() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getLaptop();
        homePage.getMicrosoftPro();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test19() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getLaptop();
        homePage.getUltraslimNotebook();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test20() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getGrocery();
        homePage.getBakery();
        homePage.getAddtoCart1();
        waitFor(2);
    }

    @Test
    public void test21() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getGrocery();
        homePage.getPies();
        homePage.getVanilaDesert();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test22() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getGrocery();
        homePage.getBakingIngeidients();
        homePage.getPureSuger();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test23() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getGrocery();
        homePage.getPopcornPretzels();
        homePage.getSkinyPop();
        homePage.getAddtoCart1();
        waitFor(1);
    }

    @Test
    public void test24() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getGrocery();
        homePage.getPopcornPretzels();
        homePage.getSmartfood();
        homePage.getAddtoCart1();
        waitFor(1);
    }
    @Test
    public void test25() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getGrocery();
        homePage.getPopcornPretzels();
        homePage.getButtter();
        homePage.getAddtoCart1();
        waitFor(1);
    }
    @Test
    public void test26() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getPrinter();
        homePage.getDigitalPrinter();
        homePage.getAddtoCart1();
        waitFor(1);
    }
    @Test
    public void test27() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        WebElement electronics = homePage.getElectronics();
        homePage.getElectronics();
        homePage.getPcGaming();
        homePage.getGameMaster();
        homePage.getAddtoCart1();
        waitFor(1);
    }
    @Test
        public void test28() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getToyesGames();
        homePage.getPreSchool();
        homePage.getToys();
        waitFor(1);

    }
    @Test
    public void test29() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getScrollToCareer();
        waitFor(1);
    }
    @Test
    public void test30() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getToyesGames();
        homePage.getPreSchool();
        homePage.getShopByAge();
        waitFor(1);

    }
    @Test
    public void test31() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getToyesGames();
        homePage.getPreSchool();
        homePage.getToyCatalog();
        waitFor(1);

    }
    @Test
    public void test32() throws InterruptedException{
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartment();
        homePage.getToyesGames();
        homePage.getPreSchool();
        homePage.getDollesHouses();
        waitFor(1);

    }

}