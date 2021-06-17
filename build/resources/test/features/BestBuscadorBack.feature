Feature: Buscador BestBuy Background
  Yo como usuario quiero ingresar en la barra buscadora 5 items diferentes

  Background:
    Given el usuario se encuentra en la pagina de BestBuy con la url https://www.bestbuy.com/

  Scenario: Buscar Producto en el buscador de BestBuy
      When Ingresa en la barra de busqueda un producto y da click en el boton de buscar
      |nombreProducto|
      |Beats by Dr. Dre - Solo Pro Wireless Noise Cancelling On-Ear Headphones - Black|
      Then Se redirige a la pantalla donde salen los resultados del producto en pantalla

    Scenario: Buscar Producto en el buscador de BestBuy
      When Ingresa en la barra de busqueda un producto y da click en el boton de buscar
      |nombreProducto|
      |SanDisk - Ultra PLUS 128GB microSDXC UHS-I Memory Card Mobile|
      Then Se redirige a la pantalla donde salen los resultados del producto en pantalla