package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClearCart extends BasePage{
    @FindBy(xpath = "//button[contains(text(),'REMOVE')]")
    private WebElement clearCart;

    public ClearCart (WebDriver driver){ super(driver);}

    public ClearCart ClearCart(){
        clearCart.click();
        return this;
    }
}
