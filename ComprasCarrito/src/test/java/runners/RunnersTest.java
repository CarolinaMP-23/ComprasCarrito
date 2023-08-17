package runners;

import net.serenity-bdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import stepdefinitions.AddProductsToCartStepDefinitions
import stepdefinitions.ViewCartStepDefinitions
import stepdefinitions.PurchaseFormStepsDefinitions
import stepdefinitions.FinalizePurchase

@RunWith(SerenityRunner.class)
@suiteClasses({
        AddProductsToCartStepDefinitions.class
        ViewCartStepDefinitions.class
        PurchaseFormStepsDefinitions.class
        FinalizePurchase.class'

})
public class RunnersTest {
}
