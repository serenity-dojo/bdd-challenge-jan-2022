package starter.screenplay.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import starter.screenplay.catalog.CatalogPage;
import starter.screenplay.catalog.ProductItemList;

import java.util.Collection;
import java.util.List;
import java.util.Random;

public class AddToCart {
    public static Performable itemCalled(String itemName) {
        return Click.on(CatalogPage.addToCartButtonForItem(itemName));
    }

    public static Performable someItem() {
        return Task.where("{0} adds an item to the cart",
                actor -> {
                    Random rand = new Random();
                    Collection<String> itemTitles = actor.asksFor(ProductItemList.INVENTORY_ITEM_NAMES);
                    String itemTitle = itemTitles.stream().toList().get(rand.nextInt(itemTitles.size()));

                    actor.attemptsTo(AddToCart.itemCalled(itemTitle));



                }
        );
    }
}
