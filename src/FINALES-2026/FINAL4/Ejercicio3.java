package FINAL4;

public class Ejercicio3 {
    //COLA= A;
    //VISITADOS= ;

    //SACO A
    //VISITADOS=A;
    //COLA = E , D , B

    //SACO = E
    //VISITADOS= A,E;
    //COLA = D , B

    //SACO =D
    //VISITADOS=A,E,D;
    //COLA = B,C

    //SACO B
    //VISITADOS =A,E,D,B;
    //COLA= C;

    //SACO =C
    //VISITADOS =A,E,D,B,C;


    //B
    //b) ¿Es posible o no aplicar el algoritmo de Dijkstra desde el nodo B?Justifique.
    //        Respuesta: Sí, es posible.Justificación:Condición de aplicabilidad:
    //        La restricción principal para aplicar Dijkstra es que el grafo no posea aristas
    //        con pesos negativos ni ciclos negativos. En este grafo, todos los pesos son estrictamente
    //        positivos ($1, 2, 6, 10$).Desconexión del nodo F: Que un nodo sea inalcanzable (como F)
    //        no invalida el algoritmo. Dijkstra simplemente finalizará asignándole una distancia infinita ($\infty$) a F,
    //        mientras calcula correctamente el camino mínimo hacia todos los nodos alcanzables desde B (como A, D, E y C).

    //C
    //Utilidad del algoritmo de Dijkstra:
    //Sirve para encontrar el camino mínimo desde un nodo origen hacia todos los demás nodos de un grafo ponderado
    //con pesos no negativos.
    //
    //Clase de algoritmos a la que pertenece:Pertenece a la clase de algoritmos ávidos (Greedy).

    //Caracteristicas:
    //Toma de decisiones locales.
    //Sin retroceso.
    //Eficiencia.
    //Optimalidad.

    //D
}
