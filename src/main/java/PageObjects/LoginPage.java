package PageObjects;

import org.openqa.selenium.By;
import utilities.SeleniumDriver;

public class LoginPage {

    SeleniumDriver seleniumDriver = new SeleniumDriver();
    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("btnSubmit");


    public void Login(String userName, String password) throws Exception {

        seleniumDriver.OpenUrl("https://ryze-staging.formedix.com/");
        seleniumDriver.SendKeys(userNameField,userName);
        seleniumDriver.SendKeys(passwordField,password);
        seleniumDriver.Click(loginButton);
    }
}
