package starter.screenplay.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import starter.screenplay.catalog.CatalogPage;

public class AddToCart {
    public static Performable itemCalled(String itemName) {
        return Click.on(CatalogPage.addToCartButtonForItem(itemName));
    }
}
