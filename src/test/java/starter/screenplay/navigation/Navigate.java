package starter.screenplay.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheCatalogPage() {
        return Task.where("{0} goes to the catalog page",
                Open.url("https://www.saucedemo.com/inventory.html"));
    }
}
