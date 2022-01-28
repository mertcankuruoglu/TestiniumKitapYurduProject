package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {
    Methods methods; // Bu methodları kullanıcam burdaki page'imde.
    public HomePage(){ // Constructor oluşturdum.
        methods = new Methods();// bu sayfa içerisindeki methodlarımı kullanabilirim.
    }
    public void home(){ // home'daki bir alanın kontrolünü sağlayalım.
        methods.waitBySeconds(5); // sayfa açıldıktan sonra biraz beklesin.
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']"))); // element üzerinden sayfa kontrolü login içinde yapıcam.
    }
}
