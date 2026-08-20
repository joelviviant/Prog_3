package FINAL3;

public class Ejercicio3 {

     //i) ¿Qué significa pd?
     //pd es el factor de diseño de la tabla hash.
     //Indica, aproximadamente, cuántos elementos se espera que haya en promedio en cada posición de la tabla.

    //ii) ¿Qué pasa si pd es chico o grande?
    //pd chico, por ejemplo 0,1
    //La tabla tiene muchas posiciones en relación con la cantidad de elementos.
    //Entonces:
    //Hay menos colisiones.
    //Las listas asociadas a cada posición son más cortas.
    //Las búsquedas son más rápidas.
    //Pero se utiliza más memoria porque tenemos muchas posiciones de la tabla sin utilizar.
    //En resumen:
    //Más memoria → menos colisiones → mejor desempeño.

    //pd grande, por ejemplo 3
    //Hay muchos elementos en relación con la cantidad de posiciones.
    //Entonces:
    //Hay más colisiones.
    //Las listas de cada posición son más largas.
    //Las búsquedas pueden tardar más porque hay que recorrer esas listas.
    //Se utiliza menos memoria para la tabla.
    //En resumen:
    //Menos memoria → más colisiones → peor desempeño.

    //B)
    //Elegiría un árbol AVL, utilizando como clave el número de libreta universitaria. Cada nodo almacenaría los datos de un alumno.
    //El AVL permite realizar altas y bajas manteniendo el árbol balanceado, por lo que las operaciones tienen un buen desempeño.
    //Para generar el reporte ordenado de menor a mayor número de libreta realizaría un recorrido inorden (izquierda, raíz, derecha),
    //obteniendo los alumnos directamente en el orden solicitado. Elegiría AVL sobre un ABB común porque garantiza que el árbol permanezca balanceado,
    //evitando que se degrade a una estructura similar a una lista.

}
