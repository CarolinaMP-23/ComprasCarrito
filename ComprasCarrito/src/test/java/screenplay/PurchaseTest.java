package screenplay;

import net.serenitybdd.screenplay.Actor;
import net.serenity-bdd.screenplay.GivenWhenThen;
import net.serenity-bdd.screenplay.abilities.BrowseTheWeb;
import net.serenity-bdd.screenplay.questions.Text;
import stepdefinitions.AddProductsToCartStepDefinitions;-bdd.screenplay.targets.Target;

import static net.serenity-bdd.screenplay.GivenWhenThen.seeThat;

public class PurchaseTest {
    WebDriver driver;

    private Actor user = Actor.named("User");

    public void givenTheUser() {
        user.can(BrowseTheWeb.with(driver));
    }

    public void whenTheUserCompletesPurchase() {
        user.attemptsTo(AddProductsToCartStepDefinitions.PurchaseFormStepDefinitions());
            }
    public void thenThePurchaseIsSuccessful() {
        user.should(seeThat(Text.of(Target.the("mensaje de confirmación"))));
    }
}
