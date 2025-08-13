package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
private By usernameField = By.id("user-name");
private By passwordField = By.id("password");
private By loginbtn = By.id("login-button");
private By errorMessage = By.xpath("#login_button_container h3");

public void setUserName(String userName)
{
    set(usernameField, userName);
}
public void setPassword(String password)
{
    set(passwordField, password);
}
public ProductsPage clickLoginBtn()
{
    click(loginbtn);
    return new ProductsPage();

}
public ProductsPage logIntoApp(String userName, String password)
{
    setUserName(userName);
    setPassword(password);
    return clickLoginBtn();
}
public String getErrorMessage()
{
    return find(errorMessage).getText();
}


}
