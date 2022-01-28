package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){ //login olma ve kontrol işlemi
        LoginPage loginPage = new LoginPage();// loginPage instance oluşturdum.
        loginPage.login();//nesne üzerinden login methodunu getirdim.
        loginPage.loginMi(); // login olduğumuzun kontrolünü yaptım. Başarılı.
    }


}
