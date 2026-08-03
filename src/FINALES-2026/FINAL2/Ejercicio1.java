package FINAL2;

public class Ejercicio1{

    //A)
    //En una tabla hash debería recorrerse toda la estructura verificando para cada alumno si su DNI pertenece al rango solicitado.
    //El costo es O(n), ya que el hashing no mantiene las claves ordenadas. No es una solución eficiente para búsquedas por rango.
    //Para resolver este servicio eficientemente conviene utilizar una estructura ordenada,
    //como un árbol balanceado, que permita localizar el inicio del rango en O(log n)
    //y recorrer únicamente los elementos pertenecientes al mismo.

    //B)
    //Sí. Aunque el factor de carga de diseño sea menor que 1, pueden producirse colisiones que hagan que varios registros se almacenen
    //en el mismo balde,generando rebalse.El valor de rho representa un promedio de ocupación de la estructura, pero no garantiza una
    //distribución uniforme de los registros.

    //C)
    //Cuando la función hash produce muchas colisiones o todos los registros terminan almacenados en un mismo balde, la lista de rebalse puede contener
    //prácticamente todos los elementos. En ese caso la búsqueda debe recorrer toda la lista, obteniendo un costo O(n), equivalente al de una lista vinculada.


    //D)
    //La lista de factores es una estructura auxiliar utilizada en técnicas de hashing con crecimiento para registrar información sobre el estado de expansión de los baldes.
    //Se emplea para determinar cómo calcular la dirección de almacenamiento de los registros y administrar el crecimiento progresivo de la tabla, facilitando la redistribución
    //de los elementos cuando se producen divisiones de baldes.

    //Resumen rápido
    //a)	Las tablas hash no sirven para búsquedas por rango. Hay que recorrer toda la tabla (O(n)). Para hacerlo eficiente conviene usar un árbol balanceado.
    //b)	Sí puede haber rebalse aunque ρ < 1, porque el factor de carga es un promedio y pueden existir colisiones.
    //c)	Si todas las claves caen en el mismo balde (muchas colisiones), la búsqueda pasa a ser O(n), igual que una lista enlazada.
    //d)	La lista de factores es una estructura auxiliar que administra el crecimiento del hashing y ayuda a calcular correctamente dónde debe almacenarse cada registro.
}
