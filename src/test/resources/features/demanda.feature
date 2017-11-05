# language: es
Característica: Filtro de Demandas y Creacion de Proyecto

  Escenario: Filtrar demandas por proyecto
    Dado que hay una lista de demandas con un proyecto "ERP" version 1
    Cuando cuando filtro la lista por proyecto con nombre "ERP" y version 1
    Entonces obtengo una lista de longitud 1 con esa demanda

