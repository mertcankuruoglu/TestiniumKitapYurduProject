package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ProductPage {

    Methods methods;

    public ProductPage() {
        methods = new Methods();
    }
    public void scroll() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.xpath("//div[@class='product-list']//div[7]")); // 7.ürüne scroll yaptım.
        //  methods.click(By.partialLinkText("Barbie Şef Mutfak Set (01503)")); 7.ürüne tıkladım ama istenmiyor must değil.
        methods.waitBySeconds(5);
        //methods.selectByText(By.cssSelector("select#review-sort-selection"),"Oylama (Düşük > Yüksek");
        //  methods.favorilereEkle();
    }

    public void AnasayfaDonmeIslemi() {
        methods.AnaSayfaDon(By.xpath("//div[@class='lvl1catalog']"));
        methods.waitBySeconds(3);
    }

    public void puanKatalogGitmeIslemi() {
        methods.puanCatologGit(By.xpath("//a[@href='puan-katalogu']"));
        methods.waitBySeconds(3);
    }

    public void turkKatalogSecmeIslemi() {
        methods.turkKlasikSec(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
    }

    public void yuksekOylamaIslemi() {
        methods.selectByTest(By.xpath("//div[@class ='sort']/select"), "Yüksek Oylama");
        methods.waitBySeconds(5);
    }

    //kitaphobi buraya gelecek
    public void kitapHobiSecmeIslemi() {  // Tüm kitaplar > Hobi seçme işlemi
        methods.kitapHobiSecme(By.xpath("//span[@class='mn-strong common-sprite' and text()='Tüm Kitaplar']"));
        methods.waitBySeconds(4);
        methods.kitapHobiSecme(By.xpath("//a[@class='mn-icon icon-angleRight' and text()='Hobi']"));
    }

    public void secmeIslemi() { // Random Ürün Seçiyorum
        methods.selectProduct(By.xpath("//a[@class='pr-img-link']"));
        methods.waitBySeconds(3);
    }

    public void sepeteEklemeIslemi() { // Seçilen Random Ürünü Sepete ekliyorum
        methods.urunSepetEkleme(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.waitBySeconds(3);

    }
    public void listelerimFavorilereGitIslemi() {
        methods.listelerimFavorilereGit(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
        methods.waitBySeconds(3);
    }

        public void favorilerdenGitSil(){
            methods.click(By.cssSelector(".menu.top.my-list"));
            methods.waitBySeconds(3);
            methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
            methods.waitBySeconds(3);
            methods.click(By.cssSelector("div[class='product-list']>:nth-child(3)>:nth-child(2)>:nth-child(4)>:nth-child(3)"));
            methods.waitBySeconds(4);
    }
     public void sepeteGitUrunArttır(){
         methods.selectProduct(By.xpath("//a[@class='pr-img-link']"));
         methods.waitBySeconds(4);
         methods.click(By.cssSelector("a[id='button-cart']"));
         methods.waitBySeconds(5);
     }
     public void sepetUrunSatinAl(){
         methods.satinalTikla(By.cssSelector(".common-sprite.fl"));
         methods.waitBySeconds(2);
         methods.satinalTikla(By.id("js-checkout")); // js-cart
         methods.waitBySeconds(2);
     }
     public void adresBilgilerineGir(){
         methods.adresBilgileriGiris(By.xpath("//a[.='Yeni bir adres kullanmak istiyorum.']"));
         methods.sendKeys(By.id("address-firstname-companyname"), "Mertcan");
         methods.waitBySeconds(1);
         methods.sendKeys(By.id("address-lastname-title"), "Kuruoğlu");
         methods.waitBySeconds(1);
         methods.selectByText(By.cssSelector("#address-zone-id"), "Ankara");
         methods.waitBySeconds(5);
         methods.selectByText(By.xpath("//select[@id='address-county-id']"), "ETİMESGUT");
         methods.waitBySeconds(1);
         methods.sendKeys(By.cssSelector("#address-address-text"), "Yasam Sitesi");
         methods.waitBySeconds(1);
         methods.sendKeys(By.cssSelector("#address-telephone"), "3122829369");
         methods.waitBySeconds(1);
         methods.sendKeys(By.cssSelector("#address-mobile-telephone"), "5356094333");
         methods.waitBySeconds(1);
         methods.adresBilgileriGiris(By.cssSelector("#button-checkout-continue"));
         methods.waitBySeconds(3);
         methods.adresBilgileriGiris(By.cssSelector("#button-checkout-continue"));
         methods.waitBySeconds(4);
     }
     public void kartBilgileriGir(){
         methods.sendKeys(By.xpath("//input[@id='credit-card-owner']"), "Mertcan Kuruoğlu");
         methods.sendKeys(By.cssSelector(".form tr:nth-of-type(5) input:nth-of-type(1)"), "6172");
         methods.sendKeys(By.cssSelector("input:nth-of-type(2)"), "9001");
         methods.sendKeys(By.cssSelector("input:nth-of-type(3)"), "4020");
         methods.sendKeys(By.cssSelector("input:nth-of-type(4)"), "0105");
         methods.selectByText(By.cssSelector("#credit-card-expire-date-month"), "12");
         methods.waitBySeconds(3);
         methods.selectByText(By.cssSelector("#credit-card-expire-date-year"), "2024");
         methods.sendKeys(By.xpath("//input[@id='credit-card-security-code']"), "385");
         methods.waitBySeconds(3);
         WebElement basketCheckBox1 = methods.findElement(By.cssSelector("[for='credit-card-is-3ds']"));
         basketCheckBox1.click();
         methods.kartBilgileriGiris(By.xpath("//button[@id='button-checkout-continue']"));
         methods.waitBySeconds(3);
         WebElement basketCheckBox = methods.findElement(By.cssSelector("[name='agree']"));
         basketCheckBox.click();
         methods.waitBySeconds(3);
         methods.kartBilgileriGiris(By.xpath("//input[@class='button']"));
         methods.waitBySeconds(5);
         methods.kartBilgileriGiris(By.xpath("//img[@alt='kitapyurdu.com']"));
         methods.waitBySeconds(3);
     }


}