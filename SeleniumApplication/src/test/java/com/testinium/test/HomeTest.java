package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest { // test edebilmemiz için test sınıfımızı oluşturdum. Home Testini yapıyorum.
    // ilk run edildiğide Base Test ayağa kalkar o yüzden extend etmem gerekiyor.

    @Test
    public void homeTest(){ // HomePage sayfası açıldı.
        HomePage homePage = new HomePage(); // Homepage'i kullanabilmem için nesne üretmem gerekiyor.
        homePage.home();
    }

}
