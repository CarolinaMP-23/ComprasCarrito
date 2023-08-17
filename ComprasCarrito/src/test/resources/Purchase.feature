Feature: Carrito de compras
  Scenario: Completar una compra exitosa
    Given usuario ha agregado dos productos al carrito;
    When el usuario visualiza el carrito;
    Then completa el formulario de compras;
    And la compra finaliza con éxito;
