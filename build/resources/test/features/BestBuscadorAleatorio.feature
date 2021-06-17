Feature: Buscador BestBuy Aleatorio
  Yo como usuario quiero ingresar en la pagina principal y seleccione un producto aleatorio

  Scenario Outline: <Escenario>
    Given el usuario se encuentra en la pagina de BestBuy con la url <Url>
    When Busca un prodcuto aleatorio en la pagina
    Then Podre ver el producto seleccionado en pantalla

    Examples:
      | Escenario                                         | Url                     |
      | Buscar Producto aleatorio en la pagina de BestBuy |https://www.bestbuy.com/ |
