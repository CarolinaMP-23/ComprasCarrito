package stepdefinitions;

import io.cucumber.java.en.Then;

public class ViewCartStepDefinitions {

    @Then("el usuario visualiza el carrito;")
    Public void theusuarioviewthecart(){

        userSteps.openCartPage();
        userSteps.verifyProductInCart("Product 1"); // Verificar el primer producto
        userSteps.verifyProductInCart("Product 2");
    }
}
