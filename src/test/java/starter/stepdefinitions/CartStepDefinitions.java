package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.domain.Product;
import starter.screenplay.cart.AddToCart;
import starter.screenplay.cart.CartItemList;
import starter.screenplay.catalog.ProductItemList;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CartStepDefinitions {

    @When("{actor} adds {string} to the cart")
    public void colin_adds_to_the_cart(Actor actor, String itemName) {
        actor.attemptsTo(
                AddToCart.itemCalled(itemName)
        );
    }

    @Then("his cart should contain the following items:")
    public void his_cart_should_contain_the_following_items(List<Product> cartItems) {
        Actor actor = OnStage.theActorInTheSpotlight();
        Collection<Product> displayedProducts = actor.asksFor(CartItemList.CART_ITEMS);
        assertThat(displayedProducts).containsAll(cartItems);

    }

}
