package starter.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.assertj.core.api.Assertions;
import starter.domain.Product;
import starter.domain.SwagUser;
import starter.screenplay.authentication.Login;
import starter.screenplay.catalog.ProductItemList;
import starter.screenplay.navigation.Navigate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CatalogStepDefinitions {

    @Given("{actor} has logged onto the application")
    public void logged_onto_the_application(Actor actor) {
        SwagUser swagUser = SwagUser.valueOf(actor.getName());
        actor.attemptsTo(Login.as(swagUser));
    }

    @When("{actor} is browsing the product catalog")
    public void colin_is_browsing_the_product_catalog(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheCatalogPage()
        );
    }

    @Then("{actor} should be presented with {int} top-selling products")
    public void he_should_be_presented_with_top_selling_products(Actor actor, Integer productCount) {
        actor.attemptsTo(
                Ensure.thatTheListOf(ProductItemList.INVENTORY_ITEM_NAME).hasSize(productCount)
        );
    }

    @DataTableType
    public Product product(Map<String, String> productData) {
        return new Product(productData.get("Title"), productData.get("Price"));
    }

    @Then("{actor} should be presented with the following products:")
    public void heShouldBePresentedWithTheFollowingProducts(Actor actor, List<Product> expectedProducts) {
        Collection<Product> displayedProducts = actor.asksFor(ProductItemList.INVENTORY_ITEMS);
        assertThat(displayedProducts).containsAll(expectedProducts);
    }
}
