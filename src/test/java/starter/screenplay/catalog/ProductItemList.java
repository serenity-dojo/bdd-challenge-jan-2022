package starter.screenplay.catalog;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import starter.domain.Product;

import java.util.Collection;

public class ProductItemList {
    public static final Target INVENTORY_ITEM_NAME = PageElement.called("inventory_item_name");
    public static final Target INVENTORY_ITEM = PageElement.locatedBy(".inventory_item").describedAs("inventory item");

    public static final Question<Collection<Product>> INVENTORY_ITEMS = INVENTORY_ITEM.mapAll(
                    element -> new Product(
                            element.findBy(".inventory_item_name").getText(),
                            element.findBy(".inventory_item_price").getText()
                    )
            );
}
