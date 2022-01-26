package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.domain.Product;
import starter.screenplay.cart.AddToCart;
import starter.screenplay.cart.CartItemList;
import starter.screenplay.navigation.Navigate;
import starter.screenplay.state.ClearApplication;

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

    @Then("{actor} cart should contain the following items:")
    public void his_cart_should_contain_the_following_items(Actor actor, List<Product> cartItems) {
        actor.attemptsTo(Navigate.toTheShoppingCart());
        Collection<Product> displayedProducts = actor.asksFor(CartItemList.CART_ITEMS);
        assertThat(displayedProducts).containsAll(cartItems);

    }

    @Given("{actor}'s shopping cart is empty")
    public void shoppingCartIsEmpty(Actor actor) {
        actor.attemptsTo(
                ClearApplication.shoppingCart()
        );
    }

    @When("{actor} adds an item to his cart")
    public void addsAnItemToHisCart(Actor actor) {
        actor.attemptsTo(AddToCart.someItem());
    }
}
