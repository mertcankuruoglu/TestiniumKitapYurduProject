package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Test
    public void productTest(){ // Oyuncak aratıp 7.ürüne scroll ettim.
        Methods methods = new Methods();
        ProductPage productPage = new ProductPage();
        LoginPage loginPage = new LoginPage();
        loginPage.login();                           // Login olma işlemini yaptım.
        //loginPage.loginMi();                       // login olma işleminin kontrolünü yaptım.
        productPage.scroll();                        // Oyuncak ürününü aratıp 7.ürüne scroll yaptım.
        // methods.addToProductMyFavorites();          // 4 ürünü favorilerime eklicem.
        // productPage.favorilerdenGitSil();         // eklenen 4 ürünün kontrolünü yaptım.
        productPage.AnasayfaDonmeIslemi();           // Anasayfa Dönme İşlemi.
        productPage.puanKatalogGitmeIslemi();        // Puan kataloğuna gitme işlemi.
        productPage.turkKatalogSecmeIslemi();        // Türk klasikleri seçme işlemi.
        productPage.yuksekOylamaIslemi();            // Yüksek Oylama Olarak yapma işlemi.
        productPage.kitapHobiSecmeIslemi();          // Tüm kitaplar > hobi tıklanır.
        productPage.secmeIslemi();                   // Random ürün seçtim.
        productPage.sepeteEklemeIslemi();            //  Seçilen ürünü sepete ekledim.
        productPage.listelerimFavorilereGitIslemi(); // listelerim > favorilerime gittim.
                                                     // Favori listesinde yer alan 3.ürün silinir
        productPage.sepeteGitUrunArttır();           // Sepetime gittim ve Sepetteki ürün arttırımını yaptım.
        productPage.sepetUrunSatinAl();              // Ürünü satın al'a tıkladım.
        productPage.adresBilgilerineGir();           // Yeni adres bilgilerini kaydettim.
        productPage.kartBilgileriGir();              // Bakiyesiz kart ile ürün alımını gerçekleştirdim.
                                                     // Hata mesajı alındığı görülür.
        //  methods.logout();                        // Logout oldum.
    }







}
