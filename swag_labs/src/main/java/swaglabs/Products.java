package swaglabs;

import org.openqa.selenium.By;

public class Products extends BasePage{

    private By productsHeader = By.xpath("//span[text()='Products']");
    public boolean isProductHeaderdisplayed(){
        return find(productsHeader).isDisplayed();
    }
}
