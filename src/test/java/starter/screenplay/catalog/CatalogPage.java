package starter.screenplay.catalog;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;

public class CatalogPage {
    public static Target addToCartButtonForItem(String itemName) {
        return Button.called("Add to cart")
                     .inside(PageElement.called("inventory_item").containingText(itemName));
    }
}
