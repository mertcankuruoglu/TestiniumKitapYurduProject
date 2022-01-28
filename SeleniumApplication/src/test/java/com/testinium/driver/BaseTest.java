package com.testinium.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
  public static WebDriver driver; // farklı folder'lar arası işlem yapıcaz. static yaparak classlardan nesne oluşturmadan driver'a doğrudan
    // erişim sağladım.
    @Before // testlerimiz run edildiğinde ilk olarak buraya gelecek. J-unit notation

    public void setUp(){ // driver'ı ayağa kaldırıyorum.
      System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe"); // windows'ta exe uzantılı olmalı
      ChromeOptions chromeOptions = new ChromeOptions(); // chrome'a ait özellik tanımlamamı sağlar.
      chromeOptions.addArguments("--disable-notifications");
      chromeOptions.addArguments("--disable-gpu");
      chromeOptions.addArguments("--no-sandbox");
      chromeOptions.addArguments("disable-infobars");
      chromeOptions.addArguments("disable-plugins");
     // chromeOptions.addArguments("disable-popup-blocking");
      chromeOptions.addArguments("disable-certificate-errors");
      chromeOptions.addArguments("disable-translate");
      chromeOptions.addArguments("disable-extensions");

      DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
      chromeOptions.merge(desiredCapabilities);

      driver = new ChromeDriver(chromeOptions);
      driver.manage().window().maximize();//tarayıcı ayağa kalktığında fullscreen açılacaktır.

      driver.get("https://www.kitapyurdu.com/"); // url'i verdim.
    }
    @After  // Süreç bittiğinde gelinecek olan nokta
    public void tearDown(){
      if(driver!=null){
        driver.close();  // sekmeyi kapatmayı sağladım.
        driver.quit();  //  tarayıcıdan çıkmayı sağlar.
      }
    }
}
