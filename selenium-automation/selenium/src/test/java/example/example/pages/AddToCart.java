package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage{

    @FindBy(xpath = "(//input[@name='quant[1]'])[1]")
    private WebElement kelloggsQty;

    @FindBy(xpath = "(//button[contains(text(),'ADD TO CART')])[1]")
    private WebElement addtocart;

    public AddToCart (WebDriver driver){ super(driver);}

    public AddToCart EnterQty(String qty){
        kelloggsQty.clear();
        kelloggsQty.sendKeys(String.valueOf(qty));
        return this;
    }

    public AddToCart AddToCart(){
        addtocart.click();
        return this;
    }
}
