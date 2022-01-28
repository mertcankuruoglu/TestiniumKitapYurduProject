package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods; // methodlarımızı kullabilmek için nesne oluşturdum.
    public LoginPage(){ //Constructor oluşturduk.
       methods = new Methods();
    }
    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']")); // login ile ilgili aksiyon.
        methods.waitBySeconds(4); // bekleme süresi atıyorum.
        methods.sendKeys(By.id("login-email"),"mertcan95kuruoglu@gmail.com");
        methods.waitBySeconds(2); // Görebilmek adına 2 saniye attım.
        methods.sendKeys(By.id("login-password"),"617213362m");
        methods.waitBySeconds(4);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn")); // login olma butonuna tıklıyorum.
        methods.waitBySeconds(5);
    }
    public void loginMi(){ // loginpage login olup olmadığını kontrol eden metot
        methods.isElementVisible(By.xpath("//a[@class='common-sprite']"));
    }


}
