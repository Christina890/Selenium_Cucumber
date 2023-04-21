package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class loginPage extends BaseClass {

    private static String userName="//input[@name='username']";
    private static String passwordTxt="//input[@name='password']";

    private static String loginButton="//button[@id='submit']";
    public static void enterUsername(String username){
        driver.findElement(By.xpath(userName)).sendKeys(username);
    }
    public static void enterPassword(String password){
        driver.findElement(By.xpath(passwordTxt)).sendKeys(password);
    }

    public static void submitLogin(){
        driver.findElement(By.xpath(loginButton)).click();
    }
}
