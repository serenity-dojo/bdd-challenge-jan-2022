package starter.screenplay.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ui.PageElement;

public class Navigate {
    public static Performable toTheCatalogPage() {
        return Task.where("{0} goes to the catalog page",
                Open.url("https://www.saucedemo.com/inventory.html"));
    }

    public static Performable toTheShoppingCart() {
        return Task.where("{0} opens the shopping cart",
                Click.on(PageElement.called("shopping_cart_badge"))
        );
    }
}
