# language: es
Característica: Filtro de Demandas por Producto y Creacion de Proyecto

  Escenario: Filtrar demandas por producto
    Dado que hay una lista de demandas con un producto "ERP" version 1
    Cuando filtro la lista por producto con nombre "ERP" y version 1
    Entonces obtengo una lista de longitud 1 con esa demanda
    
  Escenario: Iniciar Proyecto a partir de Demanda
    Dado que hay una demanda
    Cuando cuando inicio un proyecto a partir de esta
    Entonces el proyecto mantiene las mismas estimaciones y producto que la demanda

