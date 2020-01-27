#Bitacora de cambios
- En la clase GildedRose, se refactoriza la estructura de control **for** para que tome en cuenta la totalidad de los elementos del array **items** y no solo una longitud estatica
- En la clase item, se cambia el modificador de acceso, de los atributos, de **public** a **private** de la clase Item
- En la clase GildedRose, se ha refactorizado el metodo **decreasItemeSellIn**, que reduce el atriburo sellIn de cada item. Desde el punto de vista de responsabilidad unica a nivel de metodo
- En la clase GildeRose, se ha refactorizado los if's para agruparlos por tipo
- En la clase GildeRose, se han creado dos metodos **incremetQuality** y **decrementQuality** para eliminar codigo repetido
