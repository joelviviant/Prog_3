package FINAL4;

public class Ejercicio4 {

    //A)
    //Tipos de servicios: La estructura de hashing resuelve eficientemente consultas puntuales de búsqueda exacta
    // (por clave primaria/única), inserciones y eliminaciones, todas con una complejidad promedio de $O(1)$.
    // ¿Es posible responder la consulta propuesta?: No es adecuado ni eficiente.Justificación:
    // El hashing no mantiene los elementos ordenados ni preserva relaciones de orden.
    // Las consultas por rango (como notas mayores a 7) obligan a realizar un recorrido secuencial completo de la
    // tabla (un scan total con complejidad $O(N)$), perdiendo así la ventaja de acceso directo de la estructura.
    // Para este tipo de consultas por rango se utilizan estructuras como árboles B/B+ o Grid-files.

    //B)
    //Respuesta: Verdadera.Justificación: Ambas implementaciones conservan una complejidad temporal en el peor,
    //promedio y mejor caso de $\mathcal{O}(N \log N).
    //
    //En un array, el acceso a los elementos es directo (O(1)),pero el algoritmo requiere espacio adicional O(N)
    //para fusionar los subarrays.
    //
    //En una lista vinculada,la división a la mitad se realiza dividiendo los punteros/referencias y la fusión
    //se hace reajustando punteros in-place, por lo que no requiere memoria auxiliar extra (mathcal{O}(1)
    //en espacio adicional).
    //
    //Por ende, en ambas estructuras se mantiene la misma eficiencia temporal general.

    //C)
    //Respuesta: Falso.Justificación: La topología (forma) de un Árbol Binario de Búsqueda (ABB) estándar depende
    //estrictamente del orden de inserción de las claves. Por ejemplo, si se insertan las claves en orden ascendente
    //(1, 2, 3), el árbol degenerará en una lista vinculada hacia la derecha de altura N. Si las mismas
    //claves se insertan en otro orden como (2, 1, 3), el árbol resultará balanceado con altura \log_2 N.

    //D)
    //Respuesta: Verdadero.Justificación: Por definición de ABB, para cualquier nodo X, todos los valores de su subárbol
    //izquierdo son menores que X y todos los valores de su subárbol derecho son mayores que X. El recorrido en-orden
    //(In-Order) procesa recursivamente: Subárbol Izquierdo-> Nodo Raíz -> Subárbol Derecho. Esto garantiza que,
    //independientemente de la forma que haya adoptado el árbol debido a la secuencia de inserción, el recorrido en-orden
    //siempre devolverá los elementos en orden estrictamente creciente (ascendente).



}
