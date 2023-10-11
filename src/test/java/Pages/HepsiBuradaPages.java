package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HepsiBuradaPages {

     By clkAcSym= MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/account_menu_button\")");
     By girisYapBtn=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Giriş yap\")");
     By chckGirisBtnLogin=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"btnLogin\")");
     By chckEmailText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"txtUserName\")");
     By errEmailMessage=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Geçerli bir e-posta adresi girmelisiniz.\")");
     By errPhoneMessage=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Geçerli bir cep telefonu girmelisiniz\")");
     By password=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Şifre\")");
     By girisYapPasswordPage=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"btnEmailSelect\")");
     By errorLoginMessage=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Girdiğiniz şifre eksik veya hatalı.\")");
    AppiumDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;


    public HepsiBuradaPages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.elementHelper = new ElementHelper(driver);

    }

    public  void clkAccSymbol() {
        driver.findElement(clkAcSym).click();

    }

    public  void clkGirisYapBtn() {
        driver.findElement(girisYapBtn).click();
    }

    public  void chckGirisYapBtn() {
        elementHelper.checkVisible(chckGirisBtnLogin);
    }

    public  void chckEmailBox() {
        elementHelper.checkVisible(chckEmailText);
    }

    public  void writeFalseEmail() {
        elementHelper.checkVisible(chckEmailText);
        driver.findElement(chckEmailText).click();
        elementHelper.sendKeys(chckEmailText, "yhcfs");
        driver.findElement(chckGirisBtnLogin).click();

    }

    public   void chckMessage(String errorEmailMessage) {
        elementHelper.checkVisible(errEmailMessage);

    }

    public  void writeFalsePhone(String falseNumber)  {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(chckEmailText).click();
        elementHelper.sendKeys(chckEmailText, "78963425");
        driver.findElement(chckGirisBtnLogin).click();
    }

    public  void chckMessagePhone(String errorPhoneMessage) {
        elementHelper.checkVisible(errPhoneMessage);

    }

    public  void writeCorrectEmail() {
        elementHelper.checkVisible(chckEmailText);
        driver.findElement(chckEmailText).click();
        elementHelper.sendKeys(chckEmailText, "xyz@gmail.com");
        driver.findElement(chckGirisBtnLogin).click();
    }

    public  void writeFalsePassword() {

        driver.findElement(girisYapPasswordPage).click();
        elementHelper.sendKeys(password, "thispassword");
        driver.findElement(girisYapPasswordPage).click();
    }

    public  void chckMessageLogin(String errorMessageLogin) {
        elementHelper.checkVisible(errorLoginMessage);

    }
}