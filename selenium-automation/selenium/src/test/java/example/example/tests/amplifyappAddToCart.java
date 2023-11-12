package example.example.tests;

import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.AddToCart;
import example.example.pages.Navigation;
import example.example.pages.ClearCart;

@Test(testName = "amplifyappAddToCart", description = "amplifyapp Add To Cart")
public class amplifyappAddToCart extends BaseTest{

    @Test
    public void AddToCart() {

        //Login
        String username = "CANDIDATE_003";
        String password = "qa_assessment";

        String URL = "https://" +username +":" +password +"@"+ "master.d2thsy9okxnekb.amplifyapp.com/";
        driver.get(URL);

        //Adding items to Cart
        AddToCart addtocart = PageinstancesFactory.getInstance(AddToCart.class);
        addtocart.EnterQty(String.valueOf(2));
        addtocart.AddToCart();

        //Navigating to Cart
        Navigation navigation = PageinstancesFactory.getInstance(Navigation.class);
        navigation.ClickOnCartTab();

        //Clear Cart
        ClearCart clearCart = PageinstancesFactory.getInstance(ClearCart.class);
        clearCart.ClearCart();
    }
}
