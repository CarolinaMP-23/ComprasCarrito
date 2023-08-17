package stepdefinitions;

public class FinalizePurchase {
    import io.cucumber.java.en.When;

    @steps
    UserSteps userSteps;
    public void userPurchaseFormAndClicksPurchaseButton(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> purchaseDetails = dataTable.transpose().asMap(String.class, String.class);
        String nombre = purchaseDetails.get("Nombre");
        String pais = purchaseDetails.get("Pais");
        String ciudad = purchaseDetails.get("Ciudad");
        String tarjetaCredito = purchaseDetails.get("Tarjeta de Crédito");
        String mes = purchaseDetails.get("Mes");
        String anio = purchaseDetails.get("Año");

        userSteps.completePurchaseForm(nombre, pais, ciudad, tarjetaCredito, mes, anio);
        userSteps.clickPurchaseButton();
    }

    @When("the user finalizes the purchase")
    public void userFinalizesThePurchase() {
        userSteps.finalizePurchase();
    }

