package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductsToCartStepDefinitions {

        @Given('usuario ha agregado dos productos al carrito')
        public void userHasAddProductsToCartStepDefinitions() {

        }

        @When('el usuario visualiza el carrito')
        public void useViewsCart() {

        }

        @When('completa el formulario de compras' hen ('completa el formulario de compras')
        public void userCompletesPurchaseForm() {

        }

        @Then('laCompraFinalizaConÉxito')
        public void purchaseIsSuccessful(){

        }

        public class AddProductsToCartStepDefinitions {
                UserSteps userSteps;

                @Given("the user adds two products to the cart")
                public void userAddsTwoProductsToCart() {
                userSteps.navigateToHomePage();
                userSteps.addProductToCart("Product 1");
                userSteps.addProductToCart("Product 2");
                }
    }
