Feature: Buscador BestBuy Fallido-Exitoso


  Scenario: Prueba Exitosa
    Given El usuario ingresa en el sitio Web
    When Se busca en el sitio Web el articulo
      |nombreProducto|
      |BISSELL - ProHeat 2X Revolution Pro Corded Upright Deep Cleaner - Silver/purple|
    Then Se valida la prueba

  Scenario: Prueba Fallida
    Given El usuario ingresa en el sitio Web
    When Se busca en el sitio Web el articulo
      |nombreProducto|
      |lapiceros retractil|
    Then Se valida la prueba

