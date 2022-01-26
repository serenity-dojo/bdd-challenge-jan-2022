package starter.screenplay.state;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.InTheBrowser;

public class ClearApplication {
    public static Performable shoppingCart() {
        return InTheBrowser.perform(
                browser -> {
                    browser.evaluateJavascript("window.localStorage.clear()");
                    browser.getDriver().navigate().refresh();
                }
        );
    }
}
