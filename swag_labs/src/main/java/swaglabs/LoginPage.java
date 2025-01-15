package swaglabs;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("lin-btton");
    private By errorMessage = By.xpath("#login_button_container h3");

    public  void setUsername(String username){
        set(usernameField, username);
    }

    public  void setPassword(String password){
        set(passwordField, password);
    }
    public Products clickButton(){
        click(loginButton);
        return new Products();

    }

    public Products logintoApplication(String username, String password ){
        setUsername(username);
        setPassword(password);
        return clickButton();
    }

    public String errorMessage(){
        return find(errorMessage).getText();
    }

}
