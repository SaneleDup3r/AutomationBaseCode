package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navigation extends BasePage{
    @FindBy(xpath = "//a[contains(text(),'Products')]")
    private WebElement productsTab;

    @FindBy(xpath = "//a[contains(text(),'Specials')]")
    private WebElement specialsTab;

    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    private WebElement contactUs;

    @FindBy(xpath = "//div[@class='cart-counter']")
    private WebElement cart;

    public Navigation (WebDriver driver){ super(driver);}

    public Navigation ClickOnProductsTab(){
        productsTab.click();
        return this;
    }

    public Navigation ClickOnSpecialsTab(){
        specialsTab.click();
        return this;
    }

    public Navigation ClickOnContactUsTab(){
        contactUs.click();
        return this;
    }

    public Navigation ClickOnCartTab(){
        cart.click();
        return this;
    }
}
