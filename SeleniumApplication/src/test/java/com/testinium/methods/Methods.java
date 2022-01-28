package com.testinium.methods;

import com.testinium.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class Methods {
    WebDriver driver; // driver'ımı tanımladım.
    FluentWait<WebDriver> wait; // ekranda durationları görmek için FluentWait tanımladım.
    JavascriptExecutor jsdriver;

    public Methods() { // contructor'ımı oluşturdum.

        driver = BaseTest.driver; // BaseTest'ten driver'ımı çektim.
        wait = new FluentWait<WebDriver>(driver); // driver'ımı FluentWait içerisine attım.
        wait.withTimeout(Duration.ofSeconds(30))// maxiumum arama süresi oluştudum.
                .pollingEvery(Duration.ofMillis(300)) // ne kadar sürede bir arasın istediğim elementi yazdım.
                .ignoring(NoSuchElementException.class); // neleri ignore edebileceğimi yazdım.
        jsdriver = (JavascriptExecutor) driver; // Js driver'ı constructor içerisinde atadım.
    }

    // ilk testimizi gerçekleştirelim findElement ile
    public WebElement findElement(By by) { // Web elementi döndürecek
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by) { // click yapma işlemini yazıyorum.
        findElement(by).click();
    }

    public void waitBySeconds(long seconds) { // wait methodunu yazıyorum. Thread kullanıcam.
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By by) { // Aranan element var mı yok mu diye bakıyorum. Sayfaya özgü bir element bulunur.
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sendKeys(By by, String text) { // aksiyon alanı bulmam ve yazdırmam lazım o yüzden iki parametre alır.
        findElement(by).sendKeys(text); // elementi buldum ve yazdırmak istediğim stringi koydum.
    }

    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();// elementi bulmaya yönelik
    }

    public void scrollWithJavaScript(By by) {
        jsdriver.executeScript("arguments[0].scrollIntoView();", findElement(by));
    }
    // 4 tane ürün ekleme metodu başlangıç
    // 4 tane ürün ekleme metodu bitiş

    public void AnaSayfaDon(By by) {
        findElement(by).click();
    }
    public void clear(By by){
        findElement(by).clear();
    }

    public void puanCatologGit(By by) {
        findElement(by).click();
    }

    public void turkKlasikSec(By by) {
        findElement(by).click();
    }

    public Select getSelect(By by) {
        return new Select(findElement(by));
    }

    public void selectByTest(By by, String text) {
        getSelect(by).selectByVisibleText(text);
    }
    public void selectByText(By by,String text){
        getSelect(by).selectByVisibleText(text);
    }
    public List<WebElement> findElements(By by) {

        return driver.findElements(by);
    }

    public void kitapHobiSecme(By by) {
        findElement(by).click();
    }

    public void urunSepetEkleme(By by) {
        findElement(by).click();
    }

    public void listelerimFavorilereGit(By by) {
        findElement(by).click();
    }

    public void selectProduct(By by) {
        Random rnd = new Random();
        List<WebElement> products = findElements(by);
        int index = rnd.nextInt(products.size());
        products.get(index).click();
    }
    public boolean iselementToBeClickable(By by){ // Elemente Tıklayabiliyorsam
        try{
            wait.until(ExpectedConditions.elementToBeClickable(by));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void selectProducts(By by,int i){
        Random rnd = new Random(i);
        List<WebElement> favouriteButton = findElements(by);
        int index = rnd.nextInt(favouriteButton.size());
        favouriteButton.get(index).click();
    }
    public void addToProductMyFavorites(){
        for (int i=0;i<4;i++){
            selectProducts(By.xpath("//div[@id='product-table']/div//i[@class='fa fa-heart']"),i);
            waitBySeconds(3);
        }
    }
    public  void sepetimeGit(){
        click(By.cssSelector(".common-sprite.fl"));
        waitBySeconds(2);
        click(By.id("js-cart"));
        waitBySeconds(2);
        clear(By.xpath("//input[@style='width:22px']"));
        waitBySeconds(2);
        sendKeys(By.xpath("//input[@style='width:22px']"),"2");
        waitBySeconds(2);
        click(By.xpath("//i[@title='Güncelle']"));
        waitBySeconds(2);
        click(By.xpath("//div[@class='right']/a"));
        waitBySeconds(2);
    }
    public void satinalTikla(By by){
        findElement(by).click();
    }
    public void adresBilgileriGiris(By by){
        findElement(by).click();

    }
    /*
    public void logout(By by,String text) {
        selectByText(By.xpath("//a[.='Çıkış']"),"Çıkış");
        waitBySeconds(10);
    }
     */
    public void kartBilgileriGiris(By by){
        findElement(by).click();

    }



}

