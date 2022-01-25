package starter.screenplay.cart;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import starter.domain.Product;

import java.util.Collection;

public class CartItemList {
    public static final Target CART_ITEM = PageElement.locatedBy(".cart_item").describedAs("cart item");

    public static final Question<Collection<Product>> CART_ITEMS = CART_ITEM.mapAll(
            element -> new Product(
                    element.findBy(".inventory_item_name").getText(),
                    element.findBy(".inventory_item_price").getText()
            )
    );

}
