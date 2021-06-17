Feature: Buscador BestBuy 5
  Yo como usuario quiero ingresar en la barra buscadora 5 items diferentes

  Background:
    Given el usuario se encuentra en la pagina de BestBuy con la url <Url>

  Scenario Outline: <Escenario> <Producto>
    When Ingresa en la barra de busqueda el <Producto> y da click en el boton de buscar
    Then Se debe redirigir a la pantalla donde salen los resultados del <Producto> en pantalla

    Examples:
      | Escenario                                 | Producto                                                                                      | Url                      |
      | Buscar Producto en el buscador de BestBuy | Beats by Dr. Dre - Solo Pro Wireless Noise Cancelling On-Ear Headphones - Black               | https://www.bestbuy.com/ |
      | Buscar Producto en el buscador de BestBuy | SanDisk - Ultra PLUS 128GB microSDXC UHS-I Memory Card Mobile                                 | https://www.bestbuy.com/ |
      | Buscar Producto en el buscador de BestBuy | Samsung - 5.2 Cu. Ft. High Efficiency Top Load Washer with Activewash - Black stainless steel | https://www.bestbuy.com/ |
      | Buscar Producto en el buscador de BestBuy | GoPro - HERO8 Black 4K Waterproof Action Camera - Black                                       | https://www.bestbuy.com/ |
      | Buscar Producto en el buscador de BestBuy | Apple Watch Series 6 (GPS) 44mm Space Gray Aluminum Case with Black Sport Band - Space Gray   | https://www.bestbuy.com/ |

