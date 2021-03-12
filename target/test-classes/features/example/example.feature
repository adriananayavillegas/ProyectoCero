#Create for Adrian
#date: 11/03/2021

  Feature: validar carrito de compras
    Como un nuevo usuario
    Quiero agregar Items al carro de compras
    para realizar la compra de articulos

    @ScenarioExample @smoke
  Scenario: Validar items en carro de compras
      Given que el usuario Adrian accede hasta la pagina principal
      When el agrega item playstation 5 disco al carrito
      Then el puede realizar la compra de los articulos
